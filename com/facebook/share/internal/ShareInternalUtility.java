package com.facebook.share.internal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphRequest.ParcelableResourceWithMimeType;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.NativeAppCallAttachmentStore.Attachment;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.share.Sharer.Result;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import com.facebook.share.widget.LikeView.ObjectType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ShareInternalUtility
{
  public static final String MY_PHOTOS = "me/photos";
  private static final String MY_STAGING_RESOURCES = "me/staging_resources";
  private static final String STAGING_PARAM = "file";

  private static AppCall getAppCallFromActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(97281);
    paramIntent = NativeProtocol.getCallIdFromIntent(paramIntent);
    if (paramIntent == null)
    {
      paramIntent = null;
      AppMethodBeat.o(97281);
    }
    while (true)
    {
      return paramIntent;
      paramIntent = AppCall.finishPendingCall(paramIntent, paramInt1);
      AppMethodBeat.o(97281);
    }
  }

  private static NativeAppCallAttachmentStore.Attachment getAttachment(UUID paramUUID, Uri paramUri, Bitmap paramBitmap)
  {
    AppMethodBeat.i(97294);
    Object localObject = null;
    if (paramBitmap != null)
      paramBitmap = NativeAppCallAttachmentStore.createAttachment(paramUUID, paramBitmap);
    while (true)
    {
      AppMethodBeat.o(97294);
      return paramBitmap;
      paramBitmap = localObject;
      if (paramUri != null)
        paramBitmap = NativeAppCallAttachmentStore.createAttachment(paramUUID, paramUri);
    }
  }

  private static NativeAppCallAttachmentStore.Attachment getAttachment(UUID paramUUID, ShareMedia paramShareMedia)
  {
    AppMethodBeat.i(97293);
    Bitmap localBitmap;
    if ((paramShareMedia instanceof SharePhoto))
    {
      paramShareMedia = (SharePhoto)paramShareMedia;
      localBitmap = paramShareMedia.getBitmap();
      paramShareMedia = paramShareMedia.getImageUrl();
    }
    while (true)
    {
      paramUUID = getAttachment(paramUUID, paramShareMedia, localBitmap);
      AppMethodBeat.o(97293);
      return paramUUID;
      if ((paramShareMedia instanceof ShareVideo))
      {
        paramShareMedia = ((ShareVideo)paramShareMedia).getLocalUrl();
        localBitmap = null;
      }
      else
      {
        paramShareMedia = null;
        localBitmap = null;
      }
    }
  }

  public static Bundle getBackgroundAssetMediaInfo(ShareStoryContent paramShareStoryContent, UUID paramUUID)
  {
    AppMethodBeat.i(97305);
    if ((paramShareStoryContent == null) || (paramShareStoryContent.getBackgroundAsset() == null))
    {
      paramShareStoryContent = null;
      AppMethodBeat.o(97305);
    }
    while (true)
    {
      return paramShareStoryContent;
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(paramShareStoryContent.getBackgroundAsset());
      paramShareStoryContent = new ArrayList();
      paramUUID = Utility.map(localArrayList, new ShareInternalUtility.11(paramUUID, paramShareStoryContent));
      NativeAppCallAttachmentStore.addAttachments(paramShareStoryContent);
      paramShareStoryContent = (Bundle)paramUUID.get(0);
      AppMethodBeat.o(97305);
    }
  }

  public static Pair<String, String> getFieldNameAndNamespaceFromFullName(String paramString)
  {
    AppMethodBeat.i(97292);
    Object localObject1 = null;
    int i = paramString.indexOf(':');
    Object localObject2 = localObject1;
    String str = paramString;
    if (i != -1)
    {
      localObject2 = localObject1;
      str = paramString;
      if (paramString.length() > i + 1)
      {
        localObject2 = paramString.substring(0, i);
        str = paramString.substring(i + 1);
      }
    }
    paramString = new Pair(localObject2, str);
    AppMethodBeat.o(97292);
    return paramString;
  }

  public static List<Bundle> getMediaInfos(ShareMediaContent paramShareMediaContent, UUID paramUUID)
  {
    AppMethodBeat.i(97286);
    if (paramShareMediaContent != null)
    {
      paramShareMediaContent = paramShareMediaContent.getMedia();
      if (paramShareMediaContent != null);
    }
    else
    {
      paramShareMediaContent = null;
      AppMethodBeat.o(97286);
    }
    while (true)
    {
      return paramShareMediaContent;
      ArrayList localArrayList = new ArrayList();
      paramShareMediaContent = Utility.map(paramShareMediaContent, new ShareInternalUtility.6(paramUUID, localArrayList));
      NativeAppCallAttachmentStore.addAttachments(localArrayList);
      AppMethodBeat.o(97286);
    }
  }

  public static LikeView.ObjectType getMostSpecificObjectType(LikeView.ObjectType paramObjectType1, LikeView.ObjectType paramObjectType2)
  {
    if (paramObjectType1 == paramObjectType2);
    while (true)
    {
      return paramObjectType1;
      if (paramObjectType1 == LikeView.ObjectType.UNKNOWN)
        paramObjectType1 = paramObjectType2;
      else if (paramObjectType2 != LikeView.ObjectType.UNKNOWN)
        paramObjectType1 = null;
    }
  }

  public static String getNativeDialogCompletionGesture(Bundle paramBundle)
  {
    AppMethodBeat.i(97277);
    if (paramBundle.containsKey("completionGesture"))
    {
      paramBundle = paramBundle.getString("completionGesture");
      AppMethodBeat.o(97277);
    }
    while (true)
    {
      return paramBundle;
      paramBundle = paramBundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
      AppMethodBeat.o(97277);
    }
  }

  public static List<String> getPhotoUrls(SharePhotoContent paramSharePhotoContent, UUID paramUUID)
  {
    AppMethodBeat.i(97284);
    if (paramSharePhotoContent != null)
    {
      paramSharePhotoContent = paramSharePhotoContent.getPhotos();
      if (paramSharePhotoContent != null);
    }
    else
    {
      paramSharePhotoContent = null;
      AppMethodBeat.o(97284);
    }
    while (true)
    {
      return paramSharePhotoContent;
      paramUUID = Utility.map(paramSharePhotoContent, new ShareInternalUtility.4(paramUUID));
      paramSharePhotoContent = Utility.map(paramUUID, new ShareInternalUtility.5());
      NativeAppCallAttachmentStore.addAttachments(paramUUID);
      AppMethodBeat.o(97284);
    }
  }

  public static String getShareDialogPostId(Bundle paramBundle)
  {
    AppMethodBeat.i(97278);
    if (paramBundle.containsKey("postId"))
    {
      paramBundle = paramBundle.getString("postId");
      AppMethodBeat.o(97278);
    }
    while (true)
    {
      return paramBundle;
      if (paramBundle.containsKey("com.facebook.platform.extra.POST_ID"))
      {
        paramBundle = paramBundle.getString("com.facebook.platform.extra.POST_ID");
        AppMethodBeat.o(97278);
      }
      else
      {
        paramBundle = paramBundle.getString("post_id");
        AppMethodBeat.o(97278);
      }
    }
  }

  public static ResultProcessor getShareResultProcessor(FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    AppMethodBeat.i(97280);
    paramFacebookCallback = new ShareInternalUtility.1(paramFacebookCallback, paramFacebookCallback);
    AppMethodBeat.o(97280);
    return paramFacebookCallback;
  }

  public static Bundle getStickerUrl(ShareStoryContent paramShareStoryContent, UUID paramUUID)
  {
    AppMethodBeat.i(97304);
    if ((paramShareStoryContent == null) || (paramShareStoryContent.getStickerAsset() == null))
    {
      paramShareStoryContent = null;
      AppMethodBeat.o(97304);
    }
    while (true)
    {
      return paramShareStoryContent;
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(paramShareStoryContent.getStickerAsset());
      paramShareStoryContent = Utility.map(localArrayList, new ShareInternalUtility.9(paramUUID));
      paramUUID = Utility.map(paramShareStoryContent, new ShareInternalUtility.10());
      NativeAppCallAttachmentStore.addAttachments(paramShareStoryContent);
      paramShareStoryContent = (Bundle)paramUUID.get(0);
      AppMethodBeat.o(97304);
    }
  }

  public static Bundle getTextureUrlBundle(ShareCameraEffectContent paramShareCameraEffectContent, UUID paramUUID)
  {
    AppMethodBeat.i(97287);
    CameraEffectTextures localCameraEffectTextures;
    if (paramShareCameraEffectContent != null)
    {
      localCameraEffectTextures = paramShareCameraEffectContent.getTextures();
      if (localCameraEffectTextures != null);
    }
    else
    {
      paramShareCameraEffectContent = null;
      AppMethodBeat.o(97287);
    }
    while (true)
    {
      return paramShareCameraEffectContent;
      paramShareCameraEffectContent = new Bundle();
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = localCameraEffectTextures.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        NativeAppCallAttachmentStore.Attachment localAttachment = getAttachment(paramUUID, localCameraEffectTextures.getTextureUri(str), localCameraEffectTextures.getTextureBitmap(str));
        localArrayList.add(localAttachment);
        paramShareCameraEffectContent.putString(str, localAttachment.getAttachmentUrl());
      }
      NativeAppCallAttachmentStore.addAttachments(localArrayList);
      AppMethodBeat.o(97287);
    }
  }

  public static String getUriExtension(Uri paramUri)
  {
    Object localObject = null;
    AppMethodBeat.i(97306);
    if (paramUri == null)
    {
      AppMethodBeat.o(97306);
      paramUri = localObject;
    }
    while (true)
    {
      return paramUri;
      paramUri = paramUri.toString();
      int i = paramUri.lastIndexOf('.');
      if (i == -1)
      {
        AppMethodBeat.o(97306);
        paramUri = localObject;
      }
      else
      {
        paramUri = paramUri.substring(i);
        AppMethodBeat.o(97306);
      }
    }
  }

  public static String getVideoUrl(ShareVideoContent paramShareVideoContent, UUID paramUUID)
  {
    AppMethodBeat.i(97285);
    if ((paramShareVideoContent == null) || (paramShareVideoContent.getVideo() == null))
    {
      paramShareVideoContent = null;
      AppMethodBeat.o(97285);
    }
    while (true)
    {
      return paramShareVideoContent;
      paramUUID = NativeAppCallAttachmentStore.createAttachment(paramUUID, paramShareVideoContent.getVideo().getLocalUrl());
      paramShareVideoContent = new ArrayList(1);
      paramShareVideoContent.add(paramUUID);
      NativeAppCallAttachmentStore.addAttachments(paramShareVideoContent);
      paramShareVideoContent = paramUUID.getAttachmentUrl();
      AppMethodBeat.o(97285);
    }
  }

  public static boolean handleActivityResult(int paramInt1, int paramInt2, Intent paramIntent, ResultProcessor paramResultProcessor)
  {
    boolean bool = true;
    AppMethodBeat.i(97279);
    AppCall localAppCall = getAppCallFromActivityResult(paramInt1, paramInt2, paramIntent);
    if (localAppCall == null)
    {
      bool = false;
      AppMethodBeat.o(97279);
    }
    while (true)
    {
      return bool;
      NativeAppCallAttachmentStore.cleanupAttachmentsForCall(localAppCall.getCallId());
      if (paramResultProcessor != null)
        break;
      AppMethodBeat.o(97279);
    }
    FacebookException localFacebookException = NativeProtocol.getExceptionFromErrorData(NativeProtocol.getErrorDataFromResultIntent(paramIntent));
    if (localFacebookException != null)
      if ((localFacebookException instanceof FacebookOperationCanceledException))
        paramResultProcessor.onCancel(localAppCall);
    while (true)
    {
      AppMethodBeat.o(97279);
      break;
      paramResultProcessor.onError(localAppCall, localFacebookException);
      continue;
      paramResultProcessor.onSuccess(localAppCall, NativeProtocol.getSuccessResultsFromIntent(paramIntent));
    }
  }

  public static void invokeCallbackWithError(FacebookCallback<Sharer.Result> paramFacebookCallback, String paramString)
  {
    AppMethodBeat.i(97275);
    invokeOnErrorCallback(paramFacebookCallback, paramString);
    AppMethodBeat.o(97275);
  }

  public static void invokeCallbackWithException(FacebookCallback<Sharer.Result> paramFacebookCallback, Exception paramException)
  {
    AppMethodBeat.i(97274);
    if ((paramException instanceof FacebookException))
    {
      invokeOnErrorCallback(paramFacebookCallback, (FacebookException)paramException);
      AppMethodBeat.o(97274);
    }
    while (true)
    {
      return;
      invokeCallbackWithError(paramFacebookCallback, "Error preparing share content: " + paramException.getLocalizedMessage());
      AppMethodBeat.o(97274);
    }
  }

  public static void invokeCallbackWithResults(FacebookCallback<Sharer.Result> paramFacebookCallback, String paramString, GraphResponse paramGraphResponse)
  {
    AppMethodBeat.i(97276);
    Object localObject = paramGraphResponse.getError();
    if (localObject != null)
    {
      localObject = ((FacebookRequestError)localObject).getErrorMessage();
      paramString = (String)localObject;
      if (Utility.isNullOrEmpty((String)localObject))
        paramString = "Unexpected error sharing.";
      invokeOnErrorCallback(paramFacebookCallback, paramGraphResponse, paramString);
      AppMethodBeat.o(97276);
    }
    while (true)
    {
      return;
      invokeOnSuccessCallback(paramFacebookCallback, paramString);
      AppMethodBeat.o(97276);
    }
  }

  static void invokeOnCancelCallback(FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    AppMethodBeat.i(97295);
    logShareResult("cancelled", null);
    if (paramFacebookCallback != null)
      paramFacebookCallback.onCancel();
    AppMethodBeat.o(97295);
  }

  static void invokeOnErrorCallback(FacebookCallback<Sharer.Result> paramFacebookCallback, FacebookException paramFacebookException)
  {
    AppMethodBeat.i(97299);
    logShareResult("error", paramFacebookException.getMessage());
    if (paramFacebookCallback != null)
      paramFacebookCallback.onError(paramFacebookException);
    AppMethodBeat.o(97299);
  }

  static void invokeOnErrorCallback(FacebookCallback<Sharer.Result> paramFacebookCallback, GraphResponse paramGraphResponse, String paramString)
  {
    AppMethodBeat.i(97297);
    logShareResult("error", paramString);
    if (paramFacebookCallback != null)
      paramFacebookCallback.onError(new FacebookGraphResponseException(paramGraphResponse, paramString));
    AppMethodBeat.o(97297);
  }

  static void invokeOnErrorCallback(FacebookCallback<Sharer.Result> paramFacebookCallback, String paramString)
  {
    AppMethodBeat.i(97298);
    logShareResult("error", paramString);
    if (paramFacebookCallback != null)
      paramFacebookCallback.onError(new FacebookException(paramString));
    AppMethodBeat.o(97298);
  }

  static void invokeOnSuccessCallback(FacebookCallback<Sharer.Result> paramFacebookCallback, String paramString)
  {
    AppMethodBeat.i(97296);
    logShareResult("succeeded", null);
    if (paramFacebookCallback != null)
      paramFacebookCallback.onSuccess(new Sharer.Result(paramString));
    AppMethodBeat.o(97296);
  }

  private static void logShareResult(String paramString1, String paramString2)
  {
    AppMethodBeat.i(97300);
    AppEventsLogger localAppEventsLogger = AppEventsLogger.newLogger(FacebookSdk.getApplicationContext());
    Bundle localBundle = new Bundle();
    localBundle.putString("fb_share_dialog_outcome", paramString1);
    if (paramString2 != null)
      localBundle.putString("error_message", paramString2);
    localAppEventsLogger.logSdkEvent("fb_share_dialog_result", null, localBundle);
    AppMethodBeat.o(97300);
  }

  public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken paramAccessToken, Bitmap paramBitmap, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(97301);
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("file", paramBitmap);
    paramAccessToken = new GraphRequest(paramAccessToken, "me/staging_resources", localBundle, HttpMethod.POST, paramCallback);
    AppMethodBeat.o(97301);
    return paramAccessToken;
  }

  public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken paramAccessToken, Uri paramUri, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(97303);
    if (Utility.isFileUri(paramUri))
    {
      paramAccessToken = newUploadStagingResourceWithImageRequest(paramAccessToken, new File(paramUri.getPath()), paramCallback);
      AppMethodBeat.o(97303);
    }
    while (true)
    {
      return paramAccessToken;
      if (!Utility.isContentUri(paramUri))
      {
        paramAccessToken = new FacebookException("The image Uri must be either a file:// or content:// Uri");
        AppMethodBeat.o(97303);
        throw paramAccessToken;
      }
      paramUri = new GraphRequest.ParcelableResourceWithMimeType(paramUri, "image/png");
      Bundle localBundle = new Bundle(1);
      localBundle.putParcelable("file", paramUri);
      paramAccessToken = new GraphRequest(paramAccessToken, "me/staging_resources", localBundle, HttpMethod.POST, paramCallback);
      AppMethodBeat.o(97303);
    }
  }

  public static GraphRequest newUploadStagingResourceWithImageRequest(AccessToken paramAccessToken, File paramFile, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(97302);
    GraphRequest.ParcelableResourceWithMimeType localParcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(paramFile, 268435456), "image/png");
    paramFile = new Bundle(1);
    paramFile.putParcelable("file", localParcelableResourceWithMimeType);
    paramAccessToken = new GraphRequest(paramAccessToken, "me/staging_resources", paramFile, HttpMethod.POST, paramCallback);
    AppMethodBeat.o(97302);
    return paramAccessToken;
  }

  public static void registerSharerCallback(int paramInt, CallbackManager paramCallbackManager, FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    AppMethodBeat.i(97283);
    if (!(paramCallbackManager instanceof CallbackManagerImpl))
    {
      paramCallbackManager = new FacebookException("Unexpected CallbackManager, please use the provided Factory.");
      AppMethodBeat.o(97283);
      throw paramCallbackManager;
    }
    ((CallbackManagerImpl)paramCallbackManager).registerCallback(paramInt, new ShareInternalUtility.3(paramInt, paramFacebookCallback));
    AppMethodBeat.o(97283);
  }

  public static void registerStaticShareCallback(int paramInt)
  {
    AppMethodBeat.i(97282);
    CallbackManagerImpl.registerStaticCallback(paramInt, new ShareInternalUtility.2(paramInt));
    AppMethodBeat.o(97282);
  }

  public static JSONArray removeNamespacesFromOGJsonArray(JSONArray paramJSONArray, boolean paramBoolean)
  {
    AppMethodBeat.i(97290);
    JSONArray localJSONArray = new JSONArray();
    int i = 0;
    if (i < paramJSONArray.length())
    {
      Object localObject1 = paramJSONArray.get(i);
      Object localObject2;
      if ((localObject1 instanceof JSONArray))
        localObject2 = removeNamespacesFromOGJsonArray((JSONArray)localObject1, paramBoolean);
      while (true)
      {
        localJSONArray.put(localObject2);
        i++;
        break;
        localObject2 = localObject1;
        if ((localObject1 instanceof JSONObject))
          localObject2 = removeNamespacesFromOGJsonObject((JSONObject)localObject1, paramBoolean);
      }
    }
    AppMethodBeat.o(97290);
    return localJSONArray;
  }

  public static JSONObject removeNamespacesFromOGJsonObject(JSONObject paramJSONObject, boolean paramBoolean)
  {
    AppMethodBeat.i(97291);
    if (paramJSONObject == null)
    {
      paramJSONObject = null;
      AppMethodBeat.o(97291);
      return paramJSONObject;
    }
    label275: label302: 
    while (true)
    {
      JSONObject localJSONObject1;
      JSONObject localJSONObject2;
      String str1;
      Object localObject1;
      Object localObject2;
      String str2;
      try
      {
        localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>();
        localJSONObject2 = new org/json/JSONObject;
        localJSONObject2.<init>();
        JSONArray localJSONArray = paramJSONObject.names();
        int i = 0;
        if (i >= localJSONArray.length())
          break label275;
        str1 = localJSONArray.getString(i);
        localObject1 = paramJSONObject.get(str1);
        if ((localObject1 instanceof JSONObject))
        {
          localObject1 = removeNamespacesFromOGJsonObject((JSONObject)localObject1, true);
          localObject2 = getFieldNameAndNamespaceFromFullName(str1);
          str2 = (String)((Pair)localObject2).first;
          localObject2 = (String)((Pair)localObject2).second;
          if (!paramBoolean)
            break label235;
          if ((str2 == null) || (!str2.equals("fbsdk")))
            continue;
          localJSONObject1.put(str1, localObject1);
          i++;
          continue;
        }
        if (!(localObject1 instanceof JSONArray))
          break label302;
        localObject1 = removeNamespacesFromOGJsonArray((JSONArray)localObject1, true);
        continue;
        if ((str2 == null) || (str2.equals("og")))
        {
          localJSONObject1.put((String)localObject2, localObject1);
          continue;
        }
      }
      catch (JSONException paramJSONObject)
      {
        paramJSONObject = new FacebookException("Failed to create json object from share content");
        AppMethodBeat.o(97291);
        throw paramJSONObject;
      }
      localJSONObject2.put((String)localObject2, localObject1);
      continue;
      label235: if ((str2 != null) && (str2.equals("fb")))
      {
        localJSONObject1.put(str1, localObject1);
      }
      else
      {
        localJSONObject1.put((String)localObject2, localObject1);
        continue;
        if (localJSONObject2.length() > 0)
          localJSONObject1.put("data", localJSONObject2);
        AppMethodBeat.o(97291);
        paramJSONObject = localJSONObject1;
        break;
      }
    }
  }

  public static JSONObject toJSONObjectForCall(UUID paramUUID, ShareOpenGraphContent paramShareOpenGraphContent)
  {
    AppMethodBeat.i(97288);
    Object localObject = paramShareOpenGraphContent.getAction();
    ArrayList localArrayList = new ArrayList();
    localObject = OpenGraphJSONUtility.toJSONObject((ShareOpenGraphAction)localObject, new ShareInternalUtility.7(paramUUID, localArrayList));
    NativeAppCallAttachmentStore.addAttachments(localArrayList);
    if ((paramShareOpenGraphContent.getPlaceId() != null) && (Utility.isNullOrEmpty(((JSONObject)localObject).optString("place"))))
      ((JSONObject)localObject).put("place", paramShareOpenGraphContent.getPlaceId());
    if (paramShareOpenGraphContent.getPeopleIds() != null)
    {
      paramUUID = ((JSONObject)localObject).optJSONArray("tags");
      if (paramUUID == null);
      for (paramUUID = new HashSet(); ; paramUUID = Utility.jsonArrayToSet(paramUUID))
      {
        paramShareOpenGraphContent = paramShareOpenGraphContent.getPeopleIds().iterator();
        while (paramShareOpenGraphContent.hasNext())
          paramUUID.add((String)paramShareOpenGraphContent.next());
      }
      ((JSONObject)localObject).put("tags", new JSONArray(paramUUID));
    }
    AppMethodBeat.o(97288);
    return localObject;
  }

  public static JSONObject toJSONObjectForWeb(ShareOpenGraphContent paramShareOpenGraphContent)
  {
    AppMethodBeat.i(97289);
    paramShareOpenGraphContent = OpenGraphJSONUtility.toJSONObject(paramShareOpenGraphContent.getAction(), new ShareInternalUtility.8());
    AppMethodBeat.o(97289);
    return paramShareOpenGraphContent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.ShareInternalUtility
 * JD-Core Version:    0.6.2
 */