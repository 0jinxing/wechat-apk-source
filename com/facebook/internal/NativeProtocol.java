package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.login.DefaultAudience;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class NativeProtocol
{
  public static final String ACTION_APPINVITE_DIALOG = "com.facebook.platform.action.request.APPINVITES_DIALOG";
  public static final String ACTION_CAMERA_EFFECT = "com.facebook.platform.action.request.CAMERA_EFFECT";
  public static final String ACTION_FEED_DIALOG = "com.facebook.platform.action.request.FEED_DIALOG";
  public static final String ACTION_LIKE_DIALOG = "com.facebook.platform.action.request.LIKE_DIALOG";
  public static final String ACTION_MESSAGE_DIALOG = "com.facebook.platform.action.request.MESSAGE_DIALOG";
  public static final String ACTION_OGACTIONPUBLISH_DIALOG = "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
  public static final String ACTION_OGMESSAGEPUBLISH_DIALOG = "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
  public static final String ACTION_SHARE_STORY = "com.facebook.platform.action.request.SHARE_STORY";
  public static final String AUDIENCE_EVERYONE = "everyone";
  public static final String AUDIENCE_FRIENDS = "friends";
  public static final String AUDIENCE_ME = "only_me";
  public static final String BRIDGE_ARG_ACTION_ID_STRING = "action_id";
  public static final String BRIDGE_ARG_APP_NAME_STRING = "app_name";
  public static final String BRIDGE_ARG_ERROR_BUNDLE = "error";
  public static final String BRIDGE_ARG_ERROR_CODE = "error_code";
  public static final String BRIDGE_ARG_ERROR_DESCRIPTION = "error_description";
  public static final String BRIDGE_ARG_ERROR_JSON = "error_json";
  public static final String BRIDGE_ARG_ERROR_SUBCODE = "error_subcode";
  public static final String BRIDGE_ARG_ERROR_TYPE = "error_type";
  private static final String CONTENT_SCHEME = "content://";
  public static final String ERROR_APPLICATION_ERROR = "ApplicationError";
  public static final String ERROR_NETWORK_ERROR = "NetworkError";
  public static final String ERROR_PERMISSION_DENIED = "PermissionDenied";
  public static final String ERROR_PROTOCOL_ERROR = "ProtocolError";
  public static final String ERROR_SERVICE_DISABLED = "ServiceDisabled";
  public static final String ERROR_UNKNOWN_ERROR = "UnknownError";
  public static final String ERROR_USER_CANCELED = "UserCanceled";
  public static final String EXTRA_ACCESS_TOKEN = "com.facebook.platform.extra.ACCESS_TOKEN";
  public static final String EXTRA_APPLICATION_ID = "com.facebook.platform.extra.APPLICATION_ID";
  public static final String EXTRA_APPLICATION_NAME = "com.facebook.platform.extra.APPLICATION_NAME";
  public static final String EXTRA_ARGS_PROFILE = "com.facebook.platform.extra.PROFILE";
  public static final String EXTRA_ARGS_PROFILE_FIRST_NAME = "com.facebook.platform.extra.PROFILE_FIRST_NAME";
  public static final String EXTRA_ARGS_PROFILE_LAST_NAME = "com.facebook.platform.extra.PROFILE_LAST_NAME";
  public static final String EXTRA_ARGS_PROFILE_LINK = "com.facebook.platform.extra.PROFILE_LINK";
  public static final String EXTRA_ARGS_PROFILE_MIDDLE_NAME = "com.facebook.platform.extra.PROFILE_MIDDLE_NAME";
  public static final String EXTRA_ARGS_PROFILE_NAME = "com.facebook.platform.extra.PROFILE_NAME";
  public static final String EXTRA_ARGS_PROFILE_USER_ID = "com.facebook.platform.extra.PROFILE_USER_ID";
  public static final String EXTRA_DATA_ACCESS_EXPIRATION_TIME = "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME";
  public static final String EXTRA_DIALOG_COMPLETE_KEY = "com.facebook.platform.extra.DID_COMPLETE";
  public static final String EXTRA_DIALOG_COMPLETION_GESTURE_KEY = "com.facebook.platform.extra.COMPLETION_GESTURE";
  public static final String EXTRA_EXPIRES_SECONDS_SINCE_EPOCH = "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH";
  public static final String EXTRA_GET_INSTALL_DATA_PACKAGE = "com.facebook.platform.extra.INSTALLDATA_PACKAGE";
  public static final String EXTRA_GRAPH_API_VERSION = "com.facebook.platform.extra.GRAPH_API_VERSION";
  public static final String EXTRA_LOGGER_REF = "com.facebook.platform.extra.LOGGER_REF";
  public static final String EXTRA_PERMISSIONS = "com.facebook.platform.extra.PERMISSIONS";
  public static final String EXTRA_PROTOCOL_ACTION = "com.facebook.platform.protocol.PROTOCOL_ACTION";
  public static final String EXTRA_PROTOCOL_BRIDGE_ARGS = "com.facebook.platform.protocol.BRIDGE_ARGS";
  public static final String EXTRA_PROTOCOL_CALL_ID = "com.facebook.platform.protocol.CALL_ID";
  public static final String EXTRA_PROTOCOL_METHOD_ARGS = "com.facebook.platform.protocol.METHOD_ARGS";
  public static final String EXTRA_PROTOCOL_METHOD_RESULTS = "com.facebook.platform.protocol.RESULT_ARGS";
  public static final String EXTRA_PROTOCOL_VERSION = "com.facebook.platform.protocol.PROTOCOL_VERSION";
  static final String EXTRA_PROTOCOL_VERSIONS = "com.facebook.platform.extra.PROTOCOL_VERSIONS";
  public static final String EXTRA_TOAST_DURATION_MS = "com.facebook.platform.extra.EXTRA_TOAST_DURATION_MS";
  public static final String EXTRA_USER_ID = "com.facebook.platform.extra.USER_ID";
  private static final String FACEBOOK_PROXY_AUTH_ACTIVITY = "com.facebook.katana.ProxyAuth";
  public static final String FACEBOOK_PROXY_AUTH_APP_ID_KEY = "client_id";
  public static final String FACEBOOK_PROXY_AUTH_E2E_KEY = "e2e";
  public static final String FACEBOOK_PROXY_AUTH_PERMISSIONS_KEY = "scope";
  public static final String FACEBOOK_SDK_VERSION_KEY = "facebook_sdk_version";
  private static final String FACEBOOK_TOKEN_REFRESH_ACTIVITY = "com.facebook.katana.platform.TokenRefreshService";
  public static final String IMAGE_URL_KEY = "url";
  public static final String IMAGE_USER_GENERATED_KEY = "user_generated";
  static final String INTENT_ACTION_PLATFORM_ACTIVITY = "com.facebook.platform.PLATFORM_ACTIVITY";
  static final String INTENT_ACTION_PLATFORM_SERVICE = "com.facebook.platform.PLATFORM_SERVICE";
  private static final List<Integer> KNOWN_PROTOCOL_VERSIONS;
  public static final int MESSAGE_GET_ACCESS_TOKEN_REPLY = 65537;
  public static final int MESSAGE_GET_ACCESS_TOKEN_REQUEST = 65536;
  public static final int MESSAGE_GET_AK_SEAMLESS_TOKEN_REPLY = 65545;
  public static final int MESSAGE_GET_AK_SEAMLESS_TOKEN_REQUEST = 65544;
  public static final int MESSAGE_GET_INSTALL_DATA_REPLY = 65541;
  public static final int MESSAGE_GET_INSTALL_DATA_REQUEST = 65540;
  public static final int MESSAGE_GET_LIKE_STATUS_REPLY = 65543;
  public static final int MESSAGE_GET_LIKE_STATUS_REQUEST = 65542;
  public static final int MESSAGE_GET_LOGIN_STATUS_REPLY = 65547;
  public static final int MESSAGE_GET_LOGIN_STATUS_REQUEST = 65546;
  static final int MESSAGE_GET_PROTOCOL_VERSIONS_REPLY = 65539;
  static final int MESSAGE_GET_PROTOCOL_VERSIONS_REQUEST = 65538;
  public static final int NO_PROTOCOL_AVAILABLE = -1;
  public static final String OPEN_GRAPH_CREATE_OBJECT_KEY = "fbsdk:create_object";
  private static final String PLATFORM_PROVIDER = ".provider.PlatformProvider";
  private static final String PLATFORM_PROVIDER_VERSIONS = ".provider.PlatformProvider/versions";
  private static final String PLATFORM_PROVIDER_VERSION_COLUMN = "version";
  public static final int PROTOCOL_VERSION_20121101 = 20121101;
  public static final int PROTOCOL_VERSION_20130502 = 20130502;
  public static final int PROTOCOL_VERSION_20130618 = 20130618;
  public static final int PROTOCOL_VERSION_20131107 = 20131107;
  public static final int PROTOCOL_VERSION_20140204 = 20140204;
  public static final int PROTOCOL_VERSION_20140324 = 20140324;
  public static final int PROTOCOL_VERSION_20140701 = 20140701;
  public static final int PROTOCOL_VERSION_20141001 = 20141001;
  public static final int PROTOCOL_VERSION_20141028 = 20141028;
  public static final int PROTOCOL_VERSION_20141107 = 20141107;
  public static final int PROTOCOL_VERSION_20141218 = 20141218;
  public static final int PROTOCOL_VERSION_20160327 = 20160327;
  public static final int PROTOCOL_VERSION_20170213 = 20170213;
  public static final int PROTOCOL_VERSION_20170411 = 20170411;
  public static final int PROTOCOL_VERSION_20170417 = 20170417;
  public static final int PROTOCOL_VERSION_20171115 = 20171115;
  public static final String RESULT_ARGS_ACCESS_TOKEN = "access_token";
  public static final String RESULT_ARGS_DIALOG_COMPLETE_KEY = "didComplete";
  public static final String RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY = "completionGesture";
  public static final String RESULT_ARGS_EXPIRES_SECONDS_SINCE_EPOCH = "expires_seconds_since_epoch";
  public static final String RESULT_ARGS_PERMISSIONS = "permissions";
  public static final String RESULT_ARGS_SIGNED_REQUEST = "signed request";
  public static final String STATUS_ERROR_CODE = "com.facebook.platform.status.ERROR_CODE";
  public static final String STATUS_ERROR_DESCRIPTION = "com.facebook.platform.status.ERROR_DESCRIPTION";
  public static final String STATUS_ERROR_JSON = "com.facebook.platform.status.ERROR_JSON";
  public static final String STATUS_ERROR_SUBCODE = "com.facebook.platform.status.ERROR_SUBCODE";
  public static final String STATUS_ERROR_TYPE = "com.facebook.platform.status.ERROR_TYPE";
  private static final String TAG;
  public static final String WEB_DIALOG_ACTION = "action";
  public static final String WEB_DIALOG_IS_FALLBACK = "is_fallback";
  public static final String WEB_DIALOG_PARAMS = "params";
  public static final String WEB_DIALOG_URL = "url";
  private static final Map<String, List<NativeProtocol.NativeAppInfo>> actionToAppInfoMap;
  private static final List<NativeProtocol.NativeAppInfo> effectCameraAppInfoList;
  private static final List<NativeProtocol.NativeAppInfo> facebookAppInfoList;
  private static final AtomicBoolean protocolVersionsAsyncUpdating;

  static
  {
    AppMethodBeat.i(72472);
    TAG = NativeProtocol.class.getName();
    facebookAppInfoList = buildFacebookAppList();
    effectCameraAppInfoList = buildEffectCameraAppInfoList();
    actionToAppInfoMap = buildActionToAppInfoMap();
    protocolVersionsAsyncUpdating = new AtomicBoolean(false);
    KNOWN_PROTOCOL_VERSIONS = Arrays.asList(new Integer[] { Integer.valueOf(20170417), Integer.valueOf(20160327), Integer.valueOf(20141218), Integer.valueOf(20141107), Integer.valueOf(20141028), Integer.valueOf(20141001), Integer.valueOf(20140701), Integer.valueOf(20140324), Integer.valueOf(20140204), Integer.valueOf(20131107), Integer.valueOf(20130618), Integer.valueOf(20130502), Integer.valueOf(20121101) });
    AppMethodBeat.o(72472);
  }

  private static Map<String, List<NativeProtocol.NativeAppInfo>> buildActionToAppInfoMap()
  {
    AppMethodBeat.i(72442);
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new MessengerAppInfo(null));
    localHashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", facebookAppInfoList);
    localHashMap.put("com.facebook.platform.action.request.FEED_DIALOG", facebookAppInfoList);
    localHashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", facebookAppInfoList);
    localHashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", facebookAppInfoList);
    localHashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", localArrayList);
    localHashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", localArrayList);
    localHashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", effectCameraAppInfoList);
    localHashMap.put("com.facebook.platform.action.request.SHARE_STORY", facebookAppInfoList);
    AppMethodBeat.o(72442);
    return localHashMap;
  }

  private static List<NativeProtocol.NativeAppInfo> buildEffectCameraAppInfoList()
  {
    AppMethodBeat.i(72441);
    ArrayList localArrayList = new ArrayList(buildFacebookAppList());
    localArrayList.add(0, new NativeProtocol.EffectTestAppInfo(null));
    AppMethodBeat.o(72441);
    return localArrayList;
  }

  private static List<NativeProtocol.NativeAppInfo> buildFacebookAppList()
  {
    AppMethodBeat.i(72440);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new NativeProtocol.KatanaAppInfo(null));
    localArrayList.add(new NativeProtocol.WakizashiAppInfo(null));
    AppMethodBeat.o(72440);
    return localArrayList;
  }

  private static Uri buildPlatformProviderVersionURI(NativeProtocol.NativeAppInfo paramNativeAppInfo)
  {
    AppMethodBeat.i(72470);
    paramNativeAppInfo = Uri.parse("content://" + paramNativeAppInfo.getPackage() + ".provider.PlatformProvider/versions");
    AppMethodBeat.o(72470);
    return paramNativeAppInfo;
  }

  public static int computeLatestAvailableVersionFromVersionSpec(TreeSet<Integer> paramTreeSet, int paramInt, int[] paramArrayOfInt)
  {
    int i = -1;
    AppMethodBeat.i(72469);
    int j = paramArrayOfInt.length;
    paramTreeSet = paramTreeSet.descendingIterator();
    int k = -1;
    j--;
    int m;
    if (paramTreeSet.hasNext())
    {
      m = ((Integer)paramTreeSet.next()).intValue();
      k = Math.max(k, m);
      while ((j >= 0) && (paramArrayOfInt[j] > m))
        j--;
      if (j < 0)
      {
        AppMethodBeat.o(72469);
        paramInt = i;
      }
    }
    while (true)
    {
      return paramInt;
      if (paramArrayOfInt[j] == m)
      {
        if (j % 2 == 0)
        {
          paramInt = Math.min(k, paramInt);
          AppMethodBeat.o(72469);
        }
        else
        {
          AppMethodBeat.o(72469);
          paramInt = i;
        }
      }
      else
      {
        break;
        AppMethodBeat.o(72469);
        paramInt = i;
      }
    }
  }

  public static Bundle createBundleForException(FacebookException paramFacebookException)
  {
    AppMethodBeat.i(72463);
    if (paramFacebookException == null)
    {
      paramFacebookException = null;
      AppMethodBeat.o(72463);
    }
    while (true)
    {
      return paramFacebookException;
      Bundle localBundle = new Bundle();
      localBundle.putString("error_description", paramFacebookException.toString());
      if ((paramFacebookException instanceof FacebookOperationCanceledException))
        localBundle.putString("error_type", "UserCanceled");
      AppMethodBeat.o(72463);
      paramFacebookException = localBundle;
    }
  }

  public static Intent createFacebookLiteIntent(Context paramContext, String paramString1, Collection<String> paramCollection, String paramString2, boolean paramBoolean1, boolean paramBoolean2, DefaultAudience paramDefaultAudience, String paramString3, String paramString4)
  {
    AppMethodBeat.i(72445);
    NativeProtocol.FBLiteAppInfo localFBLiteAppInfo = new NativeProtocol.FBLiteAppInfo(null);
    paramContext = validateActivityIntent(paramContext, createNativeAppIntent(localFBLiteAppInfo, paramString1, paramCollection, paramString2, paramBoolean1, paramBoolean2, paramDefaultAudience, paramString3, paramString4), localFBLiteAppInfo);
    AppMethodBeat.o(72445);
    return paramContext;
  }

  private static Intent createNativeAppIntent(NativeProtocol.NativeAppInfo paramNativeAppInfo, String paramString1, Collection<String> paramCollection, String paramString2, boolean paramBoolean1, boolean paramBoolean2, DefaultAudience paramDefaultAudience, String paramString3, String paramString4)
  {
    AppMethodBeat.i(72446);
    String str = paramNativeAppInfo.getLoginActivity();
    if (str == null)
    {
      paramNativeAppInfo = null;
      AppMethodBeat.o(72446);
    }
    while (true)
    {
      return paramNativeAppInfo;
      paramNativeAppInfo = new Intent().setClassName(paramNativeAppInfo.getPackage(), str).putExtra("client_id", paramString1);
      paramNativeAppInfo.putExtra("facebook_sdk_version", FacebookSdk.getSdkVersion());
      if (!Utility.isNullOrEmpty(paramCollection))
        paramNativeAppInfo.putExtra("scope", TextUtils.join(",", paramCollection));
      if (!Utility.isNullOrEmpty(paramString2))
        paramNativeAppInfo.putExtra("e2e", paramString2);
      paramNativeAppInfo.putExtra("state", paramString3);
      paramNativeAppInfo.putExtra("response_type", "token,signed_request");
      paramNativeAppInfo.putExtra("return_scopes", "true");
      if (paramBoolean2)
        paramNativeAppInfo.putExtra("default_audience", paramDefaultAudience.getNativeProtocolAudience());
      paramNativeAppInfo.putExtra("legacy_override", FacebookSdk.getGraphApiVersion());
      paramNativeAppInfo.putExtra("auth_type", paramString4);
      AppMethodBeat.o(72446);
    }
  }

  public static Intent createPlatformActivityIntent(Context paramContext, String paramString1, String paramString2, NativeProtocol.ProtocolVersionQueryResult paramProtocolVersionQueryResult, Bundle paramBundle)
  {
    Object localObject = null;
    AppMethodBeat.i(72451);
    if (paramProtocolVersionQueryResult == null)
    {
      AppMethodBeat.o(72451);
      paramContext = localObject;
    }
    while (true)
    {
      return paramContext;
      NativeProtocol.NativeAppInfo localNativeAppInfo = NativeProtocol.ProtocolVersionQueryResult.access$700(paramProtocolVersionQueryResult);
      if (localNativeAppInfo == null)
      {
        AppMethodBeat.o(72451);
        paramContext = localObject;
      }
      else
      {
        paramContext = validateActivityIntent(paramContext, new Intent().setAction("com.facebook.platform.PLATFORM_ACTIVITY").setPackage(localNativeAppInfo.getPackage()).addCategory("android.intent.category.DEFAULT"), localNativeAppInfo);
        if (paramContext == null)
        {
          AppMethodBeat.o(72451);
          paramContext = localObject;
        }
        else
        {
          setupProtocolRequestIntent(paramContext, paramString1, paramString2, NativeProtocol.ProtocolVersionQueryResult.access$800(paramProtocolVersionQueryResult), paramBundle);
          AppMethodBeat.o(72451);
        }
      }
    }
  }

  public static Intent createPlatformServiceIntent(Context paramContext)
  {
    AppMethodBeat.i(72454);
    Iterator localIterator = facebookAppInfoList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (NativeProtocol.NativeAppInfo)localIterator.next();
      localObject = validateServiceIntent(paramContext, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((NativeProtocol.NativeAppInfo)localObject).getPackage()).addCategory("android.intent.category.DEFAULT"), (NativeProtocol.NativeAppInfo)localObject);
      if (localObject != null)
      {
        AppMethodBeat.o(72454);
        paramContext = (Context)localObject;
      }
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(72454);
    }
  }

  public static Intent createProtocolResultIntent(Intent paramIntent, Bundle paramBundle, FacebookException paramFacebookException)
  {
    AppMethodBeat.i(72453);
    UUID localUUID = getCallIdFromIntent(paramIntent);
    if (localUUID == null)
    {
      paramIntent = null;
      AppMethodBeat.o(72453);
    }
    while (true)
    {
      return paramIntent;
      Intent localIntent = new Intent();
      localIntent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", getProtocolVersionFromIntent(paramIntent));
      paramIntent = new Bundle();
      paramIntent.putString("action_id", localUUID.toString());
      if (paramFacebookException != null)
        paramIntent.putBundle("error", createBundleForException(paramFacebookException));
      localIntent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", paramIntent);
      if (paramBundle != null)
        localIntent.putExtra("com.facebook.platform.protocol.RESULT_ARGS", paramBundle);
      AppMethodBeat.o(72453);
      paramIntent = localIntent;
    }
  }

  public static Intent createProxyAuthIntent(Context paramContext, String paramString1, Collection<String> paramCollection, String paramString2, boolean paramBoolean1, boolean paramBoolean2, DefaultAudience paramDefaultAudience, String paramString3, String paramString4)
  {
    AppMethodBeat.i(72447);
    Iterator localIterator = facebookAppInfoList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (NativeProtocol.NativeAppInfo)localIterator.next();
      localObject = validateActivityIntent(paramContext, createNativeAppIntent((NativeProtocol.NativeAppInfo)localObject, paramString1, paramCollection, paramString2, paramBoolean1, paramBoolean2, paramDefaultAudience, paramString3, paramString4), (NativeProtocol.NativeAppInfo)localObject);
      if (localObject != null)
      {
        AppMethodBeat.o(72447);
        paramContext = (Context)localObject;
      }
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(72447);
    }
  }

  public static Intent createTokenRefreshIntent(Context paramContext)
  {
    AppMethodBeat.i(72448);
    Iterator localIterator = facebookAppInfoList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (NativeProtocol.NativeAppInfo)localIterator.next();
      localObject = validateServiceIntent(paramContext, new Intent().setClassName(((NativeProtocol.NativeAppInfo)localObject).getPackage(), "com.facebook.katana.platform.TokenRefreshService"), (NativeProtocol.NativeAppInfo)localObject);
      if (localObject != null)
      {
        AppMethodBeat.o(72448);
        paramContext = (Context)localObject;
      }
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(72448);
    }
  }

  // ERROR //
  private static TreeSet<Integer> fetchAllAvailableProtocolVersionsForAppInfo(NativeProtocol.NativeAppInfo paramNativeAppInfo)
  {
    // Byte code:
    //   0: ldc_w 668
    //   3: invokestatic 347	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 475	java/util/TreeSet
    //   9: dup
    //   10: invokespecial 669	java/util/TreeSet:<init>	()V
    //   13: astore_1
    //   14: invokestatic 673	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   17: invokevirtual 679	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   20: astore_2
    //   21: aload_0
    //   22: invokestatic 681	com/facebook/internal/NativeProtocol:buildPlatformProviderVersionURI	(Lcom/facebook/internal/NativeProtocol$NativeAppInfo;)Landroid/net/Uri;
    //   25: astore_3
    //   26: invokestatic 673	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   29: invokevirtual 685	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   32: astore 4
    //   34: new 451	java/lang/StringBuilder
    //   37: astore 5
    //   39: aload 5
    //   41: invokespecial 686	java/lang/StringBuilder:<init>	()V
    //   44: aload 5
    //   46: aload_0
    //   47: invokevirtual 457	com/facebook/internal/NativeProtocol$NativeAppInfo:getPackage	()Ljava/lang/String;
    //   50: invokevirtual 461	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: ldc 248
    //   55: invokevirtual 461	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: invokevirtual 464	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   61: astore_0
    //   62: aload 4
    //   64: aload_0
    //   65: iconst_0
    //   66: invokevirtual 692	android/content/pm/PackageManager:resolveContentProvider	(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;
    //   69: astore_0
    //   70: aload_0
    //   71: ifnull +94 -> 165
    //   74: aload_2
    //   75: aload_3
    //   76: iconst_1
    //   77: anewarray 694	java/lang/String
    //   80: dup
    //   81: iconst_0
    //   82: ldc 254
    //   84: aastore
    //   85: aconst_null
    //   86: aconst_null
    //   87: aconst_null
    //   88: invokevirtual 700	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   91: astore_0
    //   92: aload_0
    //   93: astore_2
    //   94: aload_0
    //   95: ifnull +72 -> 167
    //   98: aload_0
    //   99: astore_2
    //   100: aload_0
    //   101: invokeinterface 705 1 0
    //   106: ifeq +61 -> 167
    //   109: aload_1
    //   110: aload_0
    //   111: aload_0
    //   112: ldc 254
    //   114: invokeinterface 709 2 0
    //   119: invokeinterface 713 2 0
    //   124: invokestatic 386	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   127: invokevirtual 714	java/util/TreeSet:add	(Ljava/lang/Object;)Z
    //   130: pop
    //   131: goto -33 -> 98
    //   134: astore_2
    //   135: aload_0
    //   136: ifnull +9 -> 145
    //   139: aload_0
    //   140: invokeinterface 717 1 0
    //   145: ldc_w 668
    //   148: invokestatic 397	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   151: aload_2
    //   152: athrow
    //   153: astore_0
    //   154: aconst_null
    //   155: astore_0
    //   156: goto -86 -> 70
    //   159: astore_0
    //   160: aconst_null
    //   161: astore_0
    //   162: goto -70 -> 92
    //   165: aconst_null
    //   166: astore_2
    //   167: aload_2
    //   168: ifnull +9 -> 177
    //   171: aload_2
    //   172: invokeinterface 717 1 0
    //   177: ldc_w 668
    //   180: invokestatic 397	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   183: aload_1
    //   184: areturn
    //   185: astore_0
    //   186: goto -26 -> 160
    //   189: astore_0
    //   190: goto -30 -> 160
    //   193: astore_2
    //   194: aconst_null
    //   195: astore_0
    //   196: goto -61 -> 135
    //
    // Exception table:
    //   from	to	target	type
    //   100	131	134	finally
    //   62	70	153	java/lang/RuntimeException
    //   74	92	159	java/lang/NullPointerException
    //   74	92	185	java/lang/SecurityException
    //   74	92	189	java/lang/IllegalArgumentException
    //   26	62	193	finally
    //   62	70	193	finally
    //   74	92	193	finally
  }

  public static Bundle getBridgeArgumentsFromIntent(Intent paramIntent)
  {
    AppMethodBeat.i(72457);
    if (!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(paramIntent)))
    {
      paramIntent = null;
      AppMethodBeat.o(72457);
    }
    while (true)
    {
      return paramIntent;
      paramIntent = paramIntent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
      AppMethodBeat.o(72457);
    }
  }

  public static UUID getCallIdFromIntent(Intent paramIntent)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(72456);
    if (paramIntent == null)
    {
      AppMethodBeat.o(72456);
      return localObject2;
    }
    if (isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(paramIntent)))
    {
      paramIntent = paramIntent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
      if (paramIntent == null)
        break label86;
    }
    label86: for (paramIntent = paramIntent.getString("action_id"); ; paramIntent = null)
      while (true)
      {
        localObject2 = localObject1;
        if (paramIntent != null);
        try
        {
          localObject2 = UUID.fromString(paramIntent);
          AppMethodBeat.o(72456);
          break;
          paramIntent = paramIntent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        catch (IllegalArgumentException paramIntent)
        {
          while (true)
            localObject2 = localObject1;
        }
      }
  }

  public static Bundle getErrorDataFromResultIntent(Intent paramIntent)
  {
    AppMethodBeat.i(72461);
    if (!isErrorResult(paramIntent))
    {
      paramIntent = null;
      AppMethodBeat.o(72461);
    }
    while (true)
    {
      return paramIntent;
      Bundle localBundle = getBridgeArgumentsFromIntent(paramIntent);
      if (localBundle != null)
      {
        paramIntent = localBundle.getBundle("error");
        AppMethodBeat.o(72461);
      }
      else
      {
        paramIntent = paramIntent.getExtras();
        AppMethodBeat.o(72461);
      }
    }
  }

  public static FacebookException getExceptionFromErrorData(Bundle paramBundle)
  {
    AppMethodBeat.i(72462);
    if (paramBundle == null)
    {
      paramBundle = null;
      AppMethodBeat.o(72462);
    }
    while (true)
    {
      return paramBundle;
      Object localObject1 = paramBundle.getString("error_type");
      Object localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = paramBundle.getString("com.facebook.platform.status.ERROR_TYPE");
      String str = paramBundle.getString("error_description");
      localObject1 = str;
      if (str == null)
        localObject1 = paramBundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
      if ((localObject2 != null) && (((String)localObject2).equalsIgnoreCase("UserCanceled")))
      {
        paramBundle = new FacebookOperationCanceledException((String)localObject1);
        AppMethodBeat.o(72462);
      }
      else
      {
        paramBundle = new FacebookException((String)localObject1);
        AppMethodBeat.o(72462);
      }
    }
  }

  public static NativeProtocol.ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAction(String paramString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(72465);
    paramString = getLatestAvailableProtocolVersionForAppInfoList((List)actionToAppInfoMap.get(paramString), paramArrayOfInt);
    AppMethodBeat.o(72465);
    return paramString;
  }

  private static NativeProtocol.ProtocolVersionQueryResult getLatestAvailableProtocolVersionForAppInfoList(List<NativeProtocol.NativeAppInfo> paramList, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(72466);
    updateAllAvailableProtocolVersionsAsync();
    if (paramList == null)
    {
      paramList = NativeProtocol.ProtocolVersionQueryResult.createEmpty();
      AppMethodBeat.o(72466);
    }
    while (true)
    {
      return paramList;
      Iterator localIterator = paramList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          paramList = (NativeProtocol.NativeAppInfo)localIterator.next();
          int i = computeLatestAvailableVersionFromVersionSpec(paramList.getAvailableVersions(), getLatestKnownVersion(), paramArrayOfInt);
          if (i != -1)
          {
            paramList = NativeProtocol.ProtocolVersionQueryResult.create(paramList, i);
            AppMethodBeat.o(72466);
            break;
          }
        }
      paramList = NativeProtocol.ProtocolVersionQueryResult.createEmpty();
      AppMethodBeat.o(72466);
    }
  }

  public static int getLatestAvailableProtocolVersionForService(int paramInt)
  {
    AppMethodBeat.i(72464);
    paramInt = getLatestAvailableProtocolVersionForAppInfoList(facebookAppInfoList, new int[] { paramInt }).getProtocolVersion();
    AppMethodBeat.o(72464);
    return paramInt;
  }

  public static final int getLatestKnownVersion()
  {
    AppMethodBeat.i(72449);
    int i = ((Integer)KNOWN_PROTOCOL_VERSIONS.get(0)).intValue();
    AppMethodBeat.o(72449);
    return i;
  }

  public static Bundle getMethodArgumentsFromIntent(Intent paramIntent)
  {
    AppMethodBeat.i(72458);
    if (!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(paramIntent)))
    {
      paramIntent = paramIntent.getExtras();
      AppMethodBeat.o(72458);
    }
    while (true)
    {
      return paramIntent;
      paramIntent = paramIntent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
      AppMethodBeat.o(72458);
    }
  }

  public static int getProtocolVersionFromIntent(Intent paramIntent)
  {
    AppMethodBeat.i(72455);
    int i = paramIntent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    AppMethodBeat.o(72455);
    return i;
  }

  public static Bundle getSuccessResultsFromIntent(Intent paramIntent)
  {
    AppMethodBeat.i(72459);
    int i = getProtocolVersionFromIntent(paramIntent);
    paramIntent = paramIntent.getExtras();
    if ((!isVersionCompatibleWithBucketedIntent(i)) || (paramIntent == null))
      AppMethodBeat.o(72459);
    while (true)
    {
      return paramIntent;
      paramIntent = paramIntent.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
      AppMethodBeat.o(72459);
    }
  }

  public static boolean isErrorResult(Intent paramIntent)
  {
    AppMethodBeat.i(72460);
    Bundle localBundle = getBridgeArgumentsFromIntent(paramIntent);
    boolean bool;
    if (localBundle != null)
    {
      bool = localBundle.containsKey("error");
      AppMethodBeat.o(72460);
    }
    while (true)
    {
      return bool;
      bool = paramIntent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
      AppMethodBeat.o(72460);
    }
  }

  public static boolean isVersionCompatibleWithBucketedIntent(int paramInt)
  {
    AppMethodBeat.i(72450);
    boolean bool;
    if ((KNOWN_PROTOCOL_VERSIONS.contains(Integer.valueOf(paramInt))) && (paramInt >= 20140701))
    {
      bool = true;
      AppMethodBeat.o(72450);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72450);
    }
  }

  public static void setupProtocolRequestIntent(Intent paramIntent, String paramString1, String paramString2, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(72452);
    String str1 = FacebookSdk.getApplicationId();
    String str2 = FacebookSdk.getApplicationName();
    paramIntent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", paramInt).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", paramString2).putExtra("com.facebook.platform.extra.APPLICATION_ID", str1);
    if (isVersionCompatibleWithBucketedIntent(paramInt))
    {
      paramString2 = new Bundle();
      paramString2.putString("action_id", paramString1);
      Utility.putNonEmptyString(paramString2, "app_name", str2);
      paramIntent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", paramString2);
      paramString1 = paramBundle;
      if (paramBundle == null)
        paramString1 = new Bundle();
      paramIntent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", paramString1);
      AppMethodBeat.o(72452);
    }
    while (true)
    {
      return;
      paramIntent.putExtra("com.facebook.platform.protocol.CALL_ID", paramString1);
      if (!Utility.isNullOrEmpty(str2))
        paramIntent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", str2);
      paramIntent.putExtras(paramBundle);
      AppMethodBeat.o(72452);
    }
  }

  public static void updateAllAvailableProtocolVersionsAsync()
  {
    AppMethodBeat.i(72467);
    if (!protocolVersionsAsyncUpdating.compareAndSet(false, true))
      AppMethodBeat.o(72467);
    while (true)
    {
      return;
      FacebookSdk.getExecutor().execute(new NativeProtocol.1());
      AppMethodBeat.o(72467);
    }
  }

  static Intent validateActivityIntent(Context paramContext, Intent paramIntent, NativeProtocol.NativeAppInfo paramNativeAppInfo)
  {
    AppMethodBeat.i(72443);
    if (paramIntent == null)
    {
      AppMethodBeat.o(72443);
      paramIntent = null;
    }
    while (true)
    {
      return paramIntent;
      paramNativeAppInfo = paramContext.getPackageManager().resolveActivity(paramIntent, 0);
      if (paramNativeAppInfo == null)
      {
        AppMethodBeat.o(72443);
        paramIntent = null;
      }
      else if (!FacebookSignatureValidator.validateSignature(paramContext, paramNativeAppInfo.activityInfo.packageName))
      {
        AppMethodBeat.o(72443);
        paramIntent = null;
      }
      else
      {
        AppMethodBeat.o(72443);
      }
    }
  }

  static Intent validateServiceIntent(Context paramContext, Intent paramIntent, NativeProtocol.NativeAppInfo paramNativeAppInfo)
  {
    AppMethodBeat.i(72444);
    if (paramIntent == null)
    {
      AppMethodBeat.o(72444);
      paramIntent = null;
    }
    while (true)
    {
      return paramIntent;
      paramNativeAppInfo = paramContext.getPackageManager().resolveService(paramIntent, 0);
      if (paramNativeAppInfo == null)
      {
        AppMethodBeat.o(72444);
        paramIntent = null;
      }
      else if (!FacebookSignatureValidator.validateSignature(paramContext, paramNativeAppInfo.serviceInfo.packageName))
      {
        AppMethodBeat.o(72444);
        paramIntent = null;
      }
      else
      {
        AppMethodBeat.o(72444);
      }
    }
  }

  static class MessengerAppInfo extends NativeProtocol.NativeAppInfo
  {
    static final String MESSENGER_PACKAGE = "com.facebook.orca";

    private MessengerAppInfo()
    {
      super();
    }

    protected String getLoginActivity()
    {
      return null;
    }

    protected String getPackage()
    {
      return "com.facebook.orca";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.internal.NativeProtocol
 * JD-Core Version:    0.6.2
 */