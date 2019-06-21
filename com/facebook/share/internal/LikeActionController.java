package com.facebook.share.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.content.d;
import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequestBatch;
import com.facebook.GraphRequestBatch.Callback;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.BundleJSONConverter;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.FileLruCache;
import com.facebook.internal.FileLruCache.Limits;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.WorkQueue;
import com.facebook.share.widget.LikeView.ObjectType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class LikeActionController
{

  @Deprecated
  public static final String ACTION_LIKE_ACTION_CONTROLLER_DID_ERROR = "com.facebook.sdk.LikeActionController.DID_ERROR";

  @Deprecated
  public static final String ACTION_LIKE_ACTION_CONTROLLER_DID_RESET = "com.facebook.sdk.LikeActionController.DID_RESET";

  @Deprecated
  public static final String ACTION_LIKE_ACTION_CONTROLLER_UPDATED = "com.facebook.sdk.LikeActionController.UPDATED";

  @Deprecated
  public static final String ACTION_OBJECT_ID_KEY = "com.facebook.sdk.LikeActionController.OBJECT_ID";
  private static final int ERROR_CODE_OBJECT_ALREADY_LIKED = 3501;

  @Deprecated
  public static final String ERROR_INVALID_OBJECT_ID = "Invalid Object Id";

  @Deprecated
  public static final String ERROR_PUBLISH_ERROR = "Unable to publish the like/unlike action";
  private static final String JSON_BOOL_IS_OBJECT_LIKED_KEY = "is_object_liked";
  private static final String JSON_BUNDLE_FACEBOOK_DIALOG_ANALYTICS_BUNDLE = "facebook_dialog_analytics_bundle";
  private static final String JSON_INT_OBJECT_TYPE_KEY = "object_type";
  private static final String JSON_INT_VERSION_KEY = "com.facebook.share.internal.LikeActionController.version";
  private static final String JSON_STRING_LIKE_COUNT_WITHOUT_LIKE_KEY = "like_count_string_without_like";
  private static final String JSON_STRING_LIKE_COUNT_WITH_LIKE_KEY = "like_count_string_with_like";
  private static final String JSON_STRING_OBJECT_ID_KEY = "object_id";
  private static final String JSON_STRING_SOCIAL_SENTENCE_WITHOUT_LIKE_KEY = "social_sentence_without_like";
  private static final String JSON_STRING_SOCIAL_SENTENCE_WITH_LIKE_KEY = "social_sentence_with_like";
  private static final String JSON_STRING_UNLIKE_TOKEN_KEY = "unlike_token";
  private static final String LIKE_ACTION_CONTROLLER_STORE = "com.facebook.LikeActionController.CONTROLLER_STORE_KEY";
  private static final String LIKE_ACTION_CONTROLLER_STORE_OBJECT_SUFFIX_KEY = "OBJECT_SUFFIX";
  private static final String LIKE_ACTION_CONTROLLER_STORE_PENDING_OBJECT_ID_KEY = "PENDING_CONTROLLER_KEY";
  private static final int LIKE_ACTION_CONTROLLER_VERSION = 3;
  private static final String LIKE_DIALOG_RESPONSE_LIKE_COUNT_STRING_KEY = "like_count_string";
  private static final String LIKE_DIALOG_RESPONSE_OBJECT_IS_LIKED_KEY = "object_is_liked";
  private static final String LIKE_DIALOG_RESPONSE_SOCIAL_SENTENCE_KEY = "social_sentence";
  private static final String LIKE_DIALOG_RESPONSE_UNLIKE_TOKEN_KEY = "unlike_token";
  private static final int MAX_CACHE_SIZE = 128;
  private static final int MAX_OBJECT_SUFFIX = 1000;
  private static final String TAG;
  private static AccessTokenTracker accessTokenTracker;
  private static final ConcurrentHashMap<String, LikeActionController> cache;
  private static FileLruCache controllerDiskCache;
  private static WorkQueue diskIOWorkQueue;
  private static Handler handler;
  private static boolean isInitialized;
  private static WorkQueue mruCacheWorkQueue;
  private static String objectIdForPendingController;
  private static volatile int objectSuffix;
  private AppEventsLogger appEventsLogger;
  private Bundle facebookDialogAnalyticsBundle;
  private boolean isObjectLiked;
  private boolean isObjectLikedOnServer;
  private boolean isPendingLikeOrUnlike;
  private String likeCountStringWithLike;
  private String likeCountStringWithoutLike;
  private String objectId;
  private boolean objectIsPage;
  private LikeView.ObjectType objectType;
  private String socialSentenceWithLike;
  private String socialSentenceWithoutLike;
  private String unlikeToken;
  private String verifiedObjectId;

  static
  {
    AppMethodBeat.i(97071);
    TAG = LikeActionController.class.getSimpleName();
    cache = new ConcurrentHashMap();
    mruCacheWorkQueue = new WorkQueue(1);
    diskIOWorkQueue = new WorkQueue(1);
    AppMethodBeat.o(97071);
  }

  private LikeActionController(String paramString, LikeView.ObjectType paramObjectType)
  {
    this.objectId = paramString;
    this.objectType = paramObjectType;
  }

  private static void broadcastAction(LikeActionController paramLikeActionController, String paramString)
  {
    AppMethodBeat.i(97036);
    broadcastAction(paramLikeActionController, paramString, null);
    AppMethodBeat.o(97036);
  }

  private static void broadcastAction(LikeActionController paramLikeActionController, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(97037);
    Intent localIntent = new Intent(paramString);
    paramString = paramBundle;
    if (paramLikeActionController != null)
    {
      paramString = paramBundle;
      if (paramBundle == null)
        paramString = new Bundle();
      paramString.putString("com.facebook.sdk.LikeActionController.OBJECT_ID", paramLikeActionController.getObjectId());
    }
    if (paramString != null)
      localIntent.putExtras(paramString);
    d.S(FacebookSdk.getApplicationContext()).c(localIntent);
    AppMethodBeat.o(97037);
  }

  private boolean canUseOGPublish()
  {
    AppMethodBeat.i(97050);
    AccessToken localAccessToken = AccessToken.getCurrentAccessToken();
    boolean bool;
    if ((!this.objectIsPage) && (this.verifiedObjectId != null) && (AccessToken.isCurrentAccessTokenActive()) && (localAccessToken.getPermissions() != null) && (localAccessToken.getPermissions().contains("publish_actions")))
    {
      bool = true;
      AppMethodBeat.o(97050);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(97050);
    }
  }

  private void clearState()
  {
    AppMethodBeat.i(97048);
    this.facebookDialogAnalyticsBundle = null;
    storeObjectIdForPendingController(null);
    AppMethodBeat.o(97048);
  }

  private static void createControllerForObjectIdAndType(String paramString, LikeView.ObjectType paramObjectType, LikeActionController.CreationCallback paramCreationCallback)
  {
    AppMethodBeat.i(97024);
    Object localObject = getControllerFromInMemoryCache(paramString);
    if (localObject != null)
    {
      verifyControllerAndInvokeCallback((LikeActionController)localObject, paramObjectType, paramCreationCallback);
      AppMethodBeat.o(97024);
    }
    while (true)
    {
      return;
      LikeActionController localLikeActionController = deserializeFromDiskSynchronously(paramString);
      localObject = localLikeActionController;
      if (localLikeActionController == null)
      {
        localObject = new LikeActionController(paramString, paramObjectType);
        serializeToDiskAsync((LikeActionController)localObject);
      }
      putControllerInMemoryCache(paramString, (LikeActionController)localObject);
      handler.post(new LikeActionController.2((LikeActionController)localObject));
      invokeCallbackWithController(paramCreationCallback, (LikeActionController)localObject, null);
      AppMethodBeat.o(97024);
    }
  }

  // ERROR //
  private static LikeActionController deserializeFromDiskSynchronously(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc_w 432
    //   7: invokestatic 164	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: invokestatic 436	com/facebook/share/internal/LikeActionController:getCacheKeyForObjectId	(Ljava/lang/String;)Ljava/lang/String;
    //   14: astore_0
    //   15: getstatic 311	com/facebook/share/internal/LikeActionController:controllerDiskCache	Lcom/facebook/internal/FileLruCache;
    //   18: aload_0
    //   19: invokevirtual 442	com/facebook/internal/FileLruCache:get	(Ljava/lang/String;)Ljava/io/InputStream;
    //   22: astore_0
    //   23: aload_2
    //   24: astore_3
    //   25: aload_0
    //   26: ifnull +25 -> 51
    //   29: aload_0
    //   30: invokestatic 448	com/facebook/internal/Utility:readStreamToString	(Ljava/io/InputStream;)Ljava/lang/String;
    //   33: astore 4
    //   35: aload_2
    //   36: astore_3
    //   37: aload 4
    //   39: invokestatic 452	com/facebook/internal/Utility:isNullOrEmpty	(Ljava/lang/String;)Z
    //   42: ifne +9 -> 51
    //   45: aload 4
    //   47: invokestatic 455	com/facebook/share/internal/LikeActionController:deserializeFromJson	(Ljava/lang/String;)Lcom/facebook/share/internal/LikeActionController;
    //   50: astore_3
    //   51: aload_3
    //   52: astore_2
    //   53: aload_0
    //   54: ifnull +9 -> 63
    //   57: aload_0
    //   58: invokestatic 459	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   61: aload_3
    //   62: astore_2
    //   63: ldc_w 432
    //   66: invokestatic 190	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   69: aload_2
    //   70: areturn
    //   71: astore_0
    //   72: aconst_null
    //   73: astore_0
    //   74: aload_1
    //   75: astore_2
    //   76: aload_0
    //   77: ifnull -14 -> 63
    //   80: aload_0
    //   81: invokestatic 459	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   84: aload_1
    //   85: astore_2
    //   86: goto -23 -> 63
    //   89: astore_0
    //   90: aconst_null
    //   91: astore_3
    //   92: aload_0
    //   93: astore_2
    //   94: aload_3
    //   95: ifnull +7 -> 102
    //   98: aload_3
    //   99: invokestatic 459	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   102: ldc_w 432
    //   105: invokestatic 190	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   108: aload_2
    //   109: athrow
    //   110: astore_3
    //   111: aload_3
    //   112: astore_2
    //   113: aload_0
    //   114: astore_3
    //   115: goto -21 -> 94
    //   118: astore_3
    //   119: goto -45 -> 74
    //
    // Exception table:
    //   from	to	target	type
    //   10	23	71	java/io/IOException
    //   10	23	89	finally
    //   29	35	110	finally
    //   37	51	110	finally
    //   29	35	118	java/io/IOException
    //   37	51	118	java/io/IOException
  }

  private static LikeActionController deserializeFromJson(String paramString)
  {
    LikeActionController localLikeActionController = null;
    AppMethodBeat.i(97033);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      int i = localJSONObject.optInt("com.facebook.share.internal.LikeActionController.version", -1);
      if (i != 3)
      {
        AppMethodBeat.o(97033);
        paramString = localLikeActionController;
      }
      while (true)
      {
        return paramString;
        paramString = localJSONObject.getString("object_id");
        i = localJSONObject.optInt("object_type", LikeView.ObjectType.UNKNOWN.getValue());
        localLikeActionController = new com/facebook/share/internal/LikeActionController;
        localLikeActionController.<init>(paramString, LikeView.ObjectType.fromInt(i));
        localLikeActionController.likeCountStringWithLike = localJSONObject.optString("like_count_string_with_like", null);
        localLikeActionController.likeCountStringWithoutLike = localJSONObject.optString("like_count_string_without_like", null);
        localLikeActionController.socialSentenceWithLike = localJSONObject.optString("social_sentence_with_like", null);
        localLikeActionController.socialSentenceWithoutLike = localJSONObject.optString("social_sentence_without_like", null);
        localLikeActionController.isObjectLiked = localJSONObject.optBoolean("is_object_liked");
        localLikeActionController.unlikeToken = localJSONObject.optString("unlike_token", null);
        localJSONObject = localJSONObject.optJSONObject("facebook_dialog_analytics_bundle");
        paramString = localLikeActionController;
        if (localJSONObject != null)
        {
          localLikeActionController.facebookDialogAnalyticsBundle = BundleJSONConverter.convertToBundle(localJSONObject);
          paramString = localLikeActionController;
        }
        AppMethodBeat.o(97033);
      }
    }
    catch (JSONException paramString)
    {
      while (true)
        paramString = null;
    }
  }

  private void fetchVerifiedObjectId(final LikeActionController.RequestCompletionCallback paramRequestCompletionCallback)
  {
    AppMethodBeat.i(97056);
    if (!Utility.isNullOrEmpty(this.verifiedObjectId))
    {
      if (paramRequestCompletionCallback != null)
        paramRequestCompletionCallback.onComplete();
      AppMethodBeat.o(97056);
    }
    while (true)
    {
      return;
      final LikeActionController.GetOGObjectIdRequestWrapper localGetOGObjectIdRequestWrapper = new LikeActionController.GetOGObjectIdRequestWrapper(this, this.objectId, this.objectType);
      final GetPageIdRequestWrapper localGetPageIdRequestWrapper = new GetPageIdRequestWrapper(this.objectId, this.objectType);
      GraphRequestBatch localGraphRequestBatch = new GraphRequestBatch();
      localGetOGObjectIdRequestWrapper.addToBatch(localGraphRequestBatch);
      localGetPageIdRequestWrapper.addToBatch(localGraphRequestBatch);
      localGraphRequestBatch.addCallback(new GraphRequestBatch.Callback()
      {
        public void onBatchCompleted(GraphRequestBatch paramAnonymousGraphRequestBatch)
        {
          AppMethodBeat.i(96982);
          LikeActionController.access$1602(LikeActionController.this, localGetOGObjectIdRequestWrapper.verifiedObjectId);
          if (Utility.isNullOrEmpty(LikeActionController.this.verifiedObjectId))
          {
            LikeActionController.access$1602(LikeActionController.this, localGetPageIdRequestWrapper.verifiedObjectId);
            LikeActionController.access$2302(LikeActionController.this, localGetPageIdRequestWrapper.objectIsPage);
          }
          LikeActionController localLikeActionController;
          if (Utility.isNullOrEmpty(LikeActionController.this.verifiedObjectId))
          {
            Logger.log(LoggingBehavior.DEVELOPER_ERRORS, LikeActionController.TAG, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", new Object[] { LikeActionController.this.objectId });
            localLikeActionController = LikeActionController.this;
            if (localGetPageIdRequestWrapper.getError() == null)
              break label153;
          }
          label153: for (paramAnonymousGraphRequestBatch = localGetPageIdRequestWrapper.getError(); ; paramAnonymousGraphRequestBatch = localGetOGObjectIdRequestWrapper.getError())
          {
            LikeActionController.access$2400(localLikeActionController, "get_verified_id", paramAnonymousGraphRequestBatch);
            if (paramRequestCompletionCallback != null)
              paramRequestCompletionCallback.onComplete();
            AppMethodBeat.o(96982);
            return;
          }
        }
      });
      localGraphRequestBatch.executeAsync();
      AppMethodBeat.o(97056);
    }
  }

  private AppEventsLogger getAppEventsLogger()
  {
    AppMethodBeat.i(97039);
    if (this.appEventsLogger == null)
      this.appEventsLogger = AppEventsLogger.newLogger(FacebookSdk.getApplicationContext());
    AppEventsLogger localAppEventsLogger = this.appEventsLogger;
    AppMethodBeat.o(97039);
    return localAppEventsLogger;
  }

  private static String getCacheKeyForObjectId(String paramString)
  {
    AppMethodBeat.i(97035);
    String str = null;
    Object localObject = AccessToken.getCurrentAccessToken();
    if (AccessToken.isCurrentAccessTokenActive())
      str = ((AccessToken)localObject).getToken();
    localObject = str;
    if (str != null)
      localObject = Utility.md5hash(str);
    paramString = String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", new Object[] { paramString, Utility.coerceValueIfNullOrEmpty((String)localObject, ""), Integer.valueOf(objectSuffix) });
    AppMethodBeat.o(97035);
    return paramString;
  }

  @Deprecated
  public static void getControllerForObjectId(String paramString, LikeView.ObjectType paramObjectType, LikeActionController.CreationCallback paramCreationCallback)
  {
    AppMethodBeat.i(97022);
    if (!isInitialized)
      performFirstInitialize();
    LikeActionController localLikeActionController = getControllerFromInMemoryCache(paramString);
    if (localLikeActionController != null)
    {
      verifyControllerAndInvokeCallback(localLikeActionController, paramObjectType, paramCreationCallback);
      AppMethodBeat.o(97022);
    }
    while (true)
    {
      return;
      diskIOWorkQueue.addActiveWorkItem(new LikeActionController.CreateLikeActionControllerWorkItem(paramString, paramObjectType, paramCreationCallback));
      AppMethodBeat.o(97022);
    }
  }

  private static LikeActionController getControllerFromInMemoryCache(String paramString)
  {
    AppMethodBeat.i(97029);
    String str = getCacheKeyForObjectId(paramString);
    paramString = (LikeActionController)cache.get(str);
    if (paramString != null)
      mruCacheWorkQueue.addActiveWorkItem(new MRUCacheWorkItem(str, false));
    AppMethodBeat.o(97029);
    return paramString;
  }

  private ResultProcessor getResultProcessor(Bundle paramBundle)
  {
    AppMethodBeat.i(97046);
    paramBundle = new LikeActionController.6(this, null, paramBundle);
    AppMethodBeat.o(97046);
    return paramBundle;
  }

  @Deprecated
  public static boolean handleOnActivityResult(int paramInt1, final int paramInt2, final Intent paramIntent)
  {
    boolean bool = false;
    AppMethodBeat.i(97021);
    if (Utility.isNullOrEmpty(objectIdForPendingController))
      objectIdForPendingController = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", null);
    if (Utility.isNullOrEmpty(objectIdForPendingController))
      AppMethodBeat.o(97021);
    while (true)
    {
      return bool;
      getControllerForObjectId(objectIdForPendingController, LikeView.ObjectType.UNKNOWN, new LikeActionController.CreationCallback()
      {
        public final void onComplete(LikeActionController paramAnonymousLikeActionController, FacebookException paramAnonymousFacebookException)
        {
          AppMethodBeat.i(96980);
          if (paramAnonymousFacebookException == null)
          {
            LikeActionController.access$000(paramAnonymousLikeActionController, this.val$requestCode, paramInt2, paramIntent);
            AppMethodBeat.o(96980);
          }
          while (true)
          {
            return;
            Utility.logd(LikeActionController.TAG, paramAnonymousFacebookException);
            AppMethodBeat.o(96980);
          }
        }
      });
      bool = true;
      AppMethodBeat.o(97021);
    }
  }

  private static void invokeCallbackWithController(LikeActionController.CreationCallback paramCreationCallback, LikeActionController paramLikeActionController, FacebookException paramFacebookException)
  {
    AppMethodBeat.i(97026);
    if (paramCreationCallback == null)
      AppMethodBeat.o(97026);
    while (true)
    {
      return;
      handler.post(new LikeActionController.4(paramCreationCallback, paramLikeActionController, paramFacebookException));
      AppMethodBeat.o(97026);
    }
  }

  private void logAppEventForError(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(97057);
    paramBundle = new Bundle(paramBundle);
    paramBundle.putString("object_id", this.objectId);
    paramBundle.putString("object_type", this.objectType.toString());
    paramBundle.putString("current_action", paramString);
    getAppEventsLogger().logSdkEvent("fb_like_control_error", null, paramBundle);
    AppMethodBeat.o(97057);
  }

  private void logAppEventForError(String paramString, FacebookRequestError paramFacebookRequestError)
  {
    AppMethodBeat.i(97058);
    Bundle localBundle = new Bundle();
    if (paramFacebookRequestError != null)
    {
      paramFacebookRequestError = paramFacebookRequestError.getRequestResult();
      if (paramFacebookRequestError != null)
        localBundle.putString("error", paramFacebookRequestError.toString());
    }
    logAppEventForError(paramString, localBundle);
    AppMethodBeat.o(97058);
  }

  private void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(97045);
    ShareInternalUtility.handleActivityResult(paramInt1, paramInt2, paramIntent, getResultProcessor(this.facebookDialogAnalyticsBundle));
    clearState();
    AppMethodBeat.o(97045);
  }

  private static void performFirstInitialize()
  {
    try
    {
      AppMethodBeat.i(97025);
      if (isInitialized)
        AppMethodBeat.o(97025);
      while (true)
      {
        return;
        Object localObject1 = new android/os/Handler;
        ((Handler)localObject1).<init>(Looper.getMainLooper());
        handler = (Handler)localObject1;
        objectSuffix = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
        localObject1 = new com/facebook/internal/FileLruCache;
        String str = TAG;
        FileLruCache.Limits localLimits = new com/facebook/internal/FileLruCache$Limits;
        localLimits.<init>();
        ((FileLruCache)localObject1).<init>(str, localLimits);
        controllerDiskCache = (FileLruCache)localObject1;
        registerAccessTokenTracker();
        int i = CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode();
        localObject1 = new com/facebook/share/internal/LikeActionController$3;
        ((LikeActionController.3)localObject1).<init>();
        CallbackManagerImpl.registerStaticCallback(i, (CallbackManagerImpl.Callback)localObject1);
        isInitialized = true;
        AppMethodBeat.o(97025);
      }
    }
    finally
    {
    }
  }

  private void presentLikeDialog(Activity paramActivity, FragmentWrapper paramFragmentWrapper, Bundle paramBundle)
  {
    AppMethodBeat.i(97044);
    Object localObject;
    if (LikeDialog.canShowNativeDialog())
    {
      localObject = "fb_like_control_did_present_dialog";
      if (localObject != null)
      {
        if (this.objectType == null)
          break label146;
        localObject = this.objectType.toString();
        label38: localObject = new LikeContent.Builder().setObjectId(this.objectId).setObjectType((String)localObject).build();
        if (paramFragmentWrapper == null)
          break label157;
        new LikeDialog(paramFragmentWrapper).show((LikeContent)localObject);
      }
    }
    while (true)
    {
      saveState(paramBundle);
      getAppEventsLogger().logSdkEvent("fb_like_control_did_present_dialog", null, paramBundle);
      AppMethodBeat.o(97044);
      return;
      if (LikeDialog.canShowWebFallback())
      {
        localObject = "fb_like_control_did_present_fallback_dialog";
        break;
      }
      logAppEventForError("present_dialog", paramBundle);
      Utility.logd(TAG, "Cannot show the Like Dialog on this device.");
      broadcastAction(null, "com.facebook.sdk.LikeActionController.UPDATED");
      localObject = null;
      break;
      label146: localObject = LikeView.ObjectType.UNKNOWN.toString();
      break label38;
      label157: new LikeDialog(paramActivity).show((LikeContent)localObject);
    }
  }

  private void publishAgainIfNeeded(Bundle paramBundle)
  {
    AppMethodBeat.i(97055);
    if ((this.isObjectLiked != this.isObjectLikedOnServer) && (!publishLikeOrUnlikeAsync(this.isObjectLiked, paramBundle)))
      if (this.isObjectLiked)
        break label50;
    label50: for (boolean bool = true; ; bool = false)
    {
      publishDidError(bool);
      AppMethodBeat.o(97055);
      return;
    }
  }

  private void publishDidError(boolean paramBoolean)
  {
    AppMethodBeat.i(97041);
    updateLikeState(paramBoolean);
    Bundle localBundle = new Bundle();
    localBundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
    broadcastAction(this, "com.facebook.sdk.LikeActionController.DID_ERROR", localBundle);
    AppMethodBeat.o(97041);
  }

  private void publishLikeAsync(final Bundle paramBundle)
  {
    AppMethodBeat.i(97051);
    this.isPendingLikeOrUnlike = true;
    fetchVerifiedObjectId(new LikeActionController.RequestCompletionCallback()
    {
      public void onComplete()
      {
        AppMethodBeat.i(96992);
        Object localObject;
        if (Utility.isNullOrEmpty(LikeActionController.this.verifiedObjectId))
        {
          localObject = new Bundle();
          ((Bundle)localObject).putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
          LikeActionController.access$1500(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", (Bundle)localObject);
          AppMethodBeat.o(96992);
        }
        while (true)
        {
          return;
          localObject = new GraphRequestBatch();
          LikeActionController.PublishLikeRequestWrapper localPublishLikeRequestWrapper = new LikeActionController.PublishLikeRequestWrapper(LikeActionController.this, LikeActionController.this.verifiedObjectId, LikeActionController.this.objectType);
          localPublishLikeRequestWrapper.addToBatch((GraphRequestBatch)localObject);
          ((GraphRequestBatch)localObject).addCallback(new LikeActionController.7.1(this, localPublishLikeRequestWrapper));
          ((GraphRequestBatch)localObject).executeAsync();
          AppMethodBeat.o(96992);
        }
      }
    });
    AppMethodBeat.o(97051);
  }

  private boolean publishLikeOrUnlikeAsync(boolean paramBoolean, Bundle paramBundle)
  {
    boolean bool = true;
    AppMethodBeat.i(97040);
    if (canUseOGPublish())
      if (paramBoolean)
      {
        publishLikeAsync(paramBundle);
        paramBoolean = bool;
      }
    while (true)
    {
      AppMethodBeat.o(97040);
      return paramBoolean;
      if (!Utility.isNullOrEmpty(this.unlikeToken))
      {
        publishUnlikeAsync(paramBundle);
        paramBoolean = bool;
      }
      else
      {
        paramBoolean = false;
      }
    }
  }

  private void publishUnlikeAsync(Bundle paramBundle)
  {
    AppMethodBeat.i(97052);
    this.isPendingLikeOrUnlike = true;
    GraphRequestBatch localGraphRequestBatch = new GraphRequestBatch();
    LikeActionController.PublishUnlikeRequestWrapper localPublishUnlikeRequestWrapper = new LikeActionController.PublishUnlikeRequestWrapper(this, this.unlikeToken);
    localPublishUnlikeRequestWrapper.addToBatch(localGraphRequestBatch);
    localGraphRequestBatch.addCallback(new LikeActionController.8(this, localPublishUnlikeRequestWrapper, paramBundle));
    localGraphRequestBatch.executeAsync();
    AppMethodBeat.o(97052);
  }

  private static void putControllerInMemoryCache(String paramString, LikeActionController paramLikeActionController)
  {
    AppMethodBeat.i(97028);
    paramString = getCacheKeyForObjectId(paramString);
    mruCacheWorkQueue.addActiveWorkItem(new MRUCacheWorkItem(paramString, true));
    cache.put(paramString, paramLikeActionController);
    AppMethodBeat.o(97028);
  }

  private void refreshStatusAsync()
  {
    AppMethodBeat.i(97053);
    if (!AccessToken.isCurrentAccessTokenActive())
    {
      refreshStatusViaService();
      AppMethodBeat.o(97053);
    }
    while (true)
    {
      return;
      fetchVerifiedObjectId(new LikeActionController.9(this));
      AppMethodBeat.o(97053);
    }
  }

  private void refreshStatusViaService()
  {
    AppMethodBeat.i(97054);
    LikeStatusClient localLikeStatusClient = new LikeStatusClient(FacebookSdk.getApplicationContext(), FacebookSdk.getApplicationId(), this.objectId);
    if (!localLikeStatusClient.start())
      AppMethodBeat.o(97054);
    while (true)
    {
      return;
      localLikeStatusClient.setCompletedListener(new LikeActionController.10(this));
      AppMethodBeat.o(97054);
    }
  }

  private static void registerAccessTokenTracker()
  {
    AppMethodBeat.i(97027);
    accessTokenTracker = new LikeActionController.5();
    AppMethodBeat.o(97027);
  }

  private void saveState(Bundle paramBundle)
  {
    AppMethodBeat.i(97047);
    storeObjectIdForPendingController(this.objectId);
    this.facebookDialogAnalyticsBundle = paramBundle;
    serializeToDiskAsync(this);
    AppMethodBeat.o(97047);
  }

  private static void serializeToDiskAsync(LikeActionController paramLikeActionController)
  {
    AppMethodBeat.i(97030);
    String str = serializeToJson(paramLikeActionController);
    paramLikeActionController = getCacheKeyForObjectId(paramLikeActionController.objectId);
    if ((!Utility.isNullOrEmpty(str)) && (!Utility.isNullOrEmpty(paramLikeActionController)))
      diskIOWorkQueue.addActiveWorkItem(new SerializeToDiskWorkItem(paramLikeActionController, str));
    AppMethodBeat.o(97030);
  }

  private static void serializeToDiskSynchronously(String paramString1, String paramString2)
  {
    AppMethodBeat.i(97031);
    String str1 = null;
    String str2 = null;
    while (true)
    {
      try
      {
        paramString1 = controllerDiskCache.openPutStream(paramString1);
        str2 = paramString1;
        str1 = paramString1;
        paramString1.write(paramString2.getBytes());
        return;
      }
      catch (IOException paramString1)
      {
        if (str2 != null)
        {
          Utility.closeQuietly(str2);
          AppMethodBeat.o(97031);
          continue;
        }
      }
      finally
      {
        if (str1 != null)
          Utility.closeQuietly(str1);
        AppMethodBeat.o(97031);
      }
      AppMethodBeat.o(97031);
    }
  }

  private static String serializeToJson(LikeActionController paramLikeActionController)
  {
    AppMethodBeat.i(97034);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("com.facebook.share.internal.LikeActionController.version", 3);
      localJSONObject.put("object_id", paramLikeActionController.objectId);
      localJSONObject.put("object_type", paramLikeActionController.objectType.getValue());
      localJSONObject.put("like_count_string_with_like", paramLikeActionController.likeCountStringWithLike);
      localJSONObject.put("like_count_string_without_like", paramLikeActionController.likeCountStringWithoutLike);
      localJSONObject.put("social_sentence_with_like", paramLikeActionController.socialSentenceWithLike);
      localJSONObject.put("social_sentence_without_like", paramLikeActionController.socialSentenceWithoutLike);
      localJSONObject.put("is_object_liked", paramLikeActionController.isObjectLiked);
      localJSONObject.put("unlike_token", paramLikeActionController.unlikeToken);
      if (paramLikeActionController.facebookDialogAnalyticsBundle != null)
      {
        paramLikeActionController = BundleJSONConverter.convertToJSON(paramLikeActionController.facebookDialogAnalyticsBundle);
        if (paramLikeActionController != null)
          localJSONObject.put("facebook_dialog_analytics_bundle", paramLikeActionController);
      }
      paramLikeActionController = localJSONObject.toString();
      AppMethodBeat.o(97034);
      return paramLikeActionController;
    }
    catch (JSONException paramLikeActionController)
    {
      while (true)
      {
        paramLikeActionController = null;
        AppMethodBeat.o(97034);
      }
    }
  }

  private static void storeObjectIdForPendingController(String paramString)
  {
    AppMethodBeat.i(97049);
    objectIdForPendingController = paramString;
    FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", objectIdForPendingController).apply();
    AppMethodBeat.o(97049);
  }

  private void updateLikeState(boolean paramBoolean)
  {
    AppMethodBeat.i(97042);
    updateState(paramBoolean, this.likeCountStringWithLike, this.likeCountStringWithoutLike, this.socialSentenceWithLike, this.socialSentenceWithoutLike, this.unlikeToken);
    AppMethodBeat.o(97042);
  }

  private void updateState(boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(97043);
    paramString1 = Utility.coerceValueIfNullOrEmpty(paramString1, null);
    paramString2 = Utility.coerceValueIfNullOrEmpty(paramString2, null);
    paramString3 = Utility.coerceValueIfNullOrEmpty(paramString3, null);
    paramString4 = Utility.coerceValueIfNullOrEmpty(paramString4, null);
    paramString5 = Utility.coerceValueIfNullOrEmpty(paramString5, null);
    int i;
    if ((paramBoolean != this.isObjectLiked) || (!Utility.areObjectsEqual(paramString1, this.likeCountStringWithLike)) || (!Utility.areObjectsEqual(paramString2, this.likeCountStringWithoutLike)) || (!Utility.areObjectsEqual(paramString3, this.socialSentenceWithLike)) || (!Utility.areObjectsEqual(paramString4, this.socialSentenceWithoutLike)) || (!Utility.areObjectsEqual(paramString5, this.unlikeToken)))
    {
      i = 1;
      if (i != 0)
        break label129;
      AppMethodBeat.o(97043);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label129: this.isObjectLiked = paramBoolean;
      this.likeCountStringWithLike = paramString1;
      this.likeCountStringWithoutLike = paramString2;
      this.socialSentenceWithLike = paramString3;
      this.socialSentenceWithoutLike = paramString4;
      this.unlikeToken = paramString5;
      serializeToDiskAsync(this);
      broadcastAction(this, "com.facebook.sdk.LikeActionController.UPDATED");
      AppMethodBeat.o(97043);
    }
  }

  private static void verifyControllerAndInvokeCallback(LikeActionController paramLikeActionController, LikeView.ObjectType paramObjectType, LikeActionController.CreationCallback paramCreationCallback)
  {
    AppMethodBeat.i(97023);
    LikeView.ObjectType localObjectType = ShareInternalUtility.getMostSpecificObjectType(paramObjectType, paramLikeActionController.objectType);
    if (localObjectType == null)
    {
      paramObjectType = new FacebookException("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", new Object[] { paramLikeActionController.objectId, paramLikeActionController.objectType.toString(), paramObjectType.toString() });
      paramLikeActionController = null;
    }
    while (true)
    {
      invokeCallbackWithController(paramCreationCallback, paramLikeActionController, paramObjectType);
      AppMethodBeat.o(97023);
      return;
      paramLikeActionController.objectType = localObjectType;
      paramObjectType = null;
    }
  }

  @Deprecated
  public String getLikeCountString()
  {
    if (this.isObjectLiked);
    for (String str = this.likeCountStringWithLike; ; str = this.likeCountStringWithoutLike)
      return str;
  }

  @Deprecated
  public String getObjectId()
  {
    return this.objectId;
  }

  @Deprecated
  public String getSocialSentence()
  {
    if (this.isObjectLiked);
    for (String str = this.socialSentenceWithLike; ; str = this.socialSentenceWithoutLike)
      return str;
  }

  @Deprecated
  public boolean isObjectLiked()
  {
    return this.isObjectLiked;
  }

  @Deprecated
  public boolean shouldEnableView()
  {
    return false;
  }

  @Deprecated
  public void toggleLike(Activity paramActivity, FragmentWrapper paramFragmentWrapper, Bundle paramBundle)
  {
    boolean bool1 = true;
    AppMethodBeat.i(97038);
    if (!this.isObjectLiked)
      bool2 = true;
    while (canUseOGPublish())
    {
      updateLikeState(bool2);
      if (this.isPendingLikeOrUnlike)
      {
        getAppEventsLogger().logSdkEvent("fb_like_control_did_undo_quickly", null, paramBundle);
        AppMethodBeat.o(97038);
        return;
        bool2 = false;
      }
      else
      {
        if (publishLikeOrUnlikeAsync(bool2, paramBundle))
          break label96;
        if (bool2)
          break label105;
      }
    }
    label96: label105: for (boolean bool2 = bool1; ; bool2 = false)
    {
      updateLikeState(bool2);
      presentLikeDialog(paramActivity, paramFragmentWrapper, paramBundle);
      AppMethodBeat.o(97038);
      break;
    }
  }

  class GetPageIdRequestWrapper extends LikeActionController.AbstractRequestWrapper
  {
    boolean objectIsPage;
    String verifiedObjectId;

    GetPageIdRequestWrapper(String paramObjectType, LikeView.ObjectType arg3)
    {
      super(paramObjectType, localObjectType);
      AppMethodBeat.i(97007);
      this$1 = new Bundle();
      LikeActionController.this.putString("fields", "id");
      LikeActionController.this.putString("ids", paramObjectType);
      setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "", LikeActionController.this, HttpMethod.GET));
      AppMethodBeat.o(97007);
    }

    protected void processError(FacebookRequestError paramFacebookRequestError)
    {
      AppMethodBeat.i(97009);
      Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error getting the FB id for object '%s' with type '%s' : %s", new Object[] { this.objectId, this.objectType, paramFacebookRequestError });
      AppMethodBeat.o(97009);
    }

    protected void processSuccess(GraphResponse paramGraphResponse)
    {
      AppMethodBeat.i(97008);
      paramGraphResponse = Utility.tryGetJSONObjectFromResponse(paramGraphResponse.getJSONObject(), this.objectId);
      if (paramGraphResponse != null)
      {
        this.verifiedObjectId = paramGraphResponse.optString("id");
        if (Utility.isNullOrEmpty(this.verifiedObjectId))
          break label54;
      }
      label54: for (boolean bool = true; ; bool = false)
      {
        this.objectIsPage = bool;
        AppMethodBeat.o(97008);
        return;
      }
    }
  }

  static class MRUCacheWorkItem
    implements Runnable
  {
    private static ArrayList<String> mruCachedItems;
    private String cacheItem;
    private boolean shouldTrim;

    static
    {
      AppMethodBeat.i(97014);
      mruCachedItems = new ArrayList();
      AppMethodBeat.o(97014);
    }

    MRUCacheWorkItem(String paramString, boolean paramBoolean)
    {
      this.cacheItem = paramString;
      this.shouldTrim = paramBoolean;
    }

    public void run()
    {
      AppMethodBeat.i(97013);
      if (this.cacheItem != null)
      {
        mruCachedItems.remove(this.cacheItem);
        mruCachedItems.add(0, this.cacheItem);
      }
      if ((this.shouldTrim) && (mruCachedItems.size() >= 128))
        while (64 < mruCachedItems.size())
        {
          Object localObject = mruCachedItems;
          localObject = (String)((ArrayList)localObject).remove(((ArrayList)localObject).size() - 1);
          LikeActionController.cache.remove(localObject);
        }
      AppMethodBeat.o(97013);
    }
  }

  static class SerializeToDiskWorkItem
    implements Runnable
  {
    private String cacheKey;
    private String controllerJson;

    SerializeToDiskWorkItem(String paramString1, String paramString2)
    {
      this.cacheKey = paramString1;
      this.controllerJson = paramString2;
    }

    public void run()
    {
      AppMethodBeat.i(97020);
      LikeActionController.access$2600(this.cacheKey, this.controllerJson);
      AppMethodBeat.o(97020);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeActionController
 * JD-Core Version:    0.6.2
 */