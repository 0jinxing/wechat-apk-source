package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.codeless.internal.UnityReflection;
import com.facebook.appevents.internal.Constants;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

public final class FetchedAppSettingsManager
{
  private static final String ADVERTISER_ID_KEY = "advertiser_id";
  private static final String APPLICATION_FIELDS = "fields";
  private static final String APP_SETTINGS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_SETTINGS.%s";
  private static final String APP_SETTINGS_PREFS_STORE = "com.facebook.internal.preferences.APP_SETTINGS";
  private static final String APP_SETTING_ANDROID_SDK_ERROR_CATEGORIES = "android_sdk_error_categories";
  private static final String APP_SETTING_APP_EVENTS_CODELESS_SETUP_ENABLED = "auto_event_setup_enabled";
  private static final String APP_SETTING_APP_EVENTS_EVENT_BINDINGS = "auto_event_mapping_android";
  private static final String APP_SETTING_APP_EVENTS_FEATURE_BITMASK = "app_events_feature_bitmask";
  private static final String APP_SETTING_APP_EVENTS_SESSION_TIMEOUT = "app_events_session_timeout";
  private static final String APP_SETTING_CUSTOM_TABS_ENABLED = "gdpv4_chrome_custom_tabs_enabled";
  private static final String APP_SETTING_DIALOG_CONFIGS = "android_dialog_configs";
  private static final String[] APP_SETTING_FIELDS;
  private static final String APP_SETTING_NUX_CONTENT = "gdpv4_nux_content";
  private static final String APP_SETTING_NUX_ENABLED = "gdpv4_nux_enabled";
  private static final String APP_SETTING_SMART_LOGIN_OPTIONS = "seamless_login";
  private static final String APP_SETTING_SUPPORTS_IMPLICIT_SDK_LOGGING = "supports_implicit_sdk_logging";
  private static final int AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 8;
  private static final int CODELESS_EVENTS_ENABLED_BITMASK_FIELD = 32;
  private static final int IAP_AUTOMATIC_LOGGING_ENABLED_BITMASK_FIELD = 16;
  private static final String SDK_UPDATE_MESSAGE = "sdk_update_message";
  private static final String SMART_LOGIN_BOOKMARK_ICON_URL = "smart_login_bookmark_icon_url";
  private static final String SMART_LOGIN_MENU_ICON_URL = "smart_login_menu_icon_url";
  private static final String TAG;
  private static final int TRACK_UNINSTALL_ENABLED_BITMASK_FIELD = 256;
  private static final Map<String, FetchedAppSettings> fetchedAppSettings;
  private static final ConcurrentLinkedQueue<FetchedAppSettingsManager.FetchedAppSettingsCallback> fetchedAppSettingsCallbacks;
  private static boolean isUnityInit;
  private static final AtomicReference<FetchedAppSettingsManager.FetchAppSettingState> loadingState;
  private static boolean printedSDKUpdatedMessage;
  private static JSONArray unityEventBindings;

  static
  {
    AppMethodBeat.i(72322);
    TAG = FetchedAppSettingsManager.class.getSimpleName();
    APP_SETTING_FIELDS = new String[] { "supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "gdpv4_chrome_custom_tabs_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "auto_event_setup_enabled", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url" };
    fetchedAppSettings = new ConcurrentHashMap();
    loadingState = new AtomicReference(FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED);
    fetchedAppSettingsCallbacks = new ConcurrentLinkedQueue();
    printedSDKUpdatedMessage = false;
    isUnityInit = false;
    unityEventBindings = null;
    AppMethodBeat.o(72322);
  }

  public static void getAppSettingsAsync(FetchedAppSettingsManager.FetchedAppSettingsCallback paramFetchedAppSettingsCallback)
  {
    AppMethodBeat.i(72312);
    fetchedAppSettingsCallbacks.add(paramFetchedAppSettingsCallback);
    loadAppSettingsAsync();
    AppMethodBeat.o(72312);
  }

  private static JSONObject getAppSettingsQueryResponse(String paramString)
  {
    AppMethodBeat.i(72317);
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(APP_SETTING_FIELDS))));
    AttributionIdentifiers localAttributionIdentifiers = AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
    if ((localAttributionIdentifiers != null) && (localAttributionIdentifiers.getAndroidAdvertiserId() != null))
      localBundle.putString("advertiser_id", localAttributionIdentifiers.getAndroidAdvertiserId());
    paramString = GraphRequest.newGraphPathRequest(null, paramString, null);
    paramString.setSkipClientToken(true);
    paramString.setParameters(localBundle);
    paramString = paramString.executeAndWait().getJSONObject();
    AppMethodBeat.o(72317);
    return paramString;
  }

  public static FetchedAppSettings getAppSettingsWithoutQuery(String paramString)
  {
    AppMethodBeat.i(72311);
    if (paramString != null)
    {
      paramString = (FetchedAppSettings)fetchedAppSettings.get(paramString);
      AppMethodBeat.o(72311);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(72311);
    }
  }

  public static void loadAppSettingsAsync()
  {
    AppMethodBeat.i(72310);
    Context localContext = FacebookSdk.getApplicationContext();
    String str1 = FacebookSdk.getApplicationId();
    if (Utility.isNullOrEmpty(str1))
    {
      loadingState.set(FetchedAppSettingsManager.FetchAppSettingState.ERROR);
      pollCallbacks();
      AppMethodBeat.o(72310);
    }
    while (true)
    {
      return;
      if (fetchedAppSettings.containsKey(str1))
      {
        loadingState.set(FetchedAppSettingsManager.FetchAppSettingState.SUCCESS);
        pollCallbacks();
        AppMethodBeat.o(72310);
      }
      else
      {
        if ((loadingState.compareAndSet(FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED, FetchedAppSettingsManager.FetchAppSettingState.LOADING)) || (loadingState.compareAndSet(FetchedAppSettingsManager.FetchAppSettingState.ERROR, FetchedAppSettingsManager.FetchAppSettingState.LOADING)));
        for (int i = 1; ; i = 0)
        {
          if (i != 0)
            break label126;
          pollCallbacks();
          AppMethodBeat.o(72310);
          break;
        }
        label126: String str2 = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[] { str1 });
        FacebookSdk.getExecutor().execute(new FetchedAppSettingsManager.1(localContext, str2, str1));
        AppMethodBeat.o(72310);
      }
    }
  }

  private static FetchedAppSettings parseAppSettingsFromJSON(String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(72315);
    Object localObject = paramJSONObject.optJSONArray("android_sdk_error_categories");
    boolean bool1;
    label39: boolean bool2;
    label49: boolean bool3;
    if (localObject == null)
    {
      localObject = FacebookRequestErrorClassification.getDefaultErrorClassification();
      int i = paramJSONObject.optInt("app_events_feature_bitmask", 0);
      if ((i & 0x8) == 0)
        break label234;
      bool1 = true;
      if ((i & 0x10) == 0)
        break label240;
      bool2 = true;
      if ((i & 0x20) == 0)
        break label246;
      bool3 = true;
      label59: if ((i & 0x100) == 0)
        break label252;
    }
    label234: label240: label246: label252: for (boolean bool4 = true; ; bool4 = false)
    {
      boolean bool5 = paramJSONObject.optBoolean("auto_event_setup_enabled", false);
      JSONArray localJSONArray = paramJSONObject.optJSONArray("auto_event_mapping_android");
      unityEventBindings = localJSONArray;
      if ((localJSONArray != null) && (InternalSettings.isUnityApp()))
        UnityReflection.sendEventMapping(localJSONArray.toString());
      paramJSONObject = new FetchedAppSettings(paramJSONObject.optBoolean("supports_implicit_sdk_logging", false), paramJSONObject.optString("gdpv4_nux_content", ""), paramJSONObject.optBoolean("gdpv4_nux_enabled", false), paramJSONObject.optBoolean("gdpv4_chrome_custom_tabs_enabled", false), paramJSONObject.optInt("app_events_session_timeout", Constants.getDefaultAppEventsSessionTimeoutInSeconds()), SmartLoginOption.parseOptions(paramJSONObject.optLong("seamless_login")), parseDialogConfigurations(paramJSONObject.optJSONObject("android_dialog_configs")), bool1, (FacebookRequestErrorClassification)localObject, paramJSONObject.optString("smart_login_bookmark_icon_url"), paramJSONObject.optString("smart_login_menu_icon_url"), bool2, bool3, localJSONArray, paramJSONObject.optString("sdk_update_message"), bool4, bool5);
      fetchedAppSettings.put(paramString, paramJSONObject);
      AppMethodBeat.o(72315);
      return paramJSONObject;
      localObject = FacebookRequestErrorClassification.createFromJSON((JSONArray)localObject);
      break;
      bool1 = false;
      break label39;
      bool2 = false;
      break label49;
      bool3 = false;
      break label59;
    }
  }

  private static Map<String, Map<String, FetchedAppSettings.DialogFeatureConfig>> parseDialogConfigurations(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(72318);
    HashMap localHashMap = new HashMap();
    if (paramJSONObject != null)
    {
      JSONArray localJSONArray = paramJSONObject.optJSONArray("data");
      if (localJSONArray != null)
        for (int i = 0; i < localJSONArray.length(); i++)
        {
          FetchedAppSettings.DialogFeatureConfig localDialogFeatureConfig = FetchedAppSettings.DialogFeatureConfig.parseDialogConfig(localJSONArray.optJSONObject(i));
          if (localDialogFeatureConfig != null)
          {
            String str = localDialogFeatureConfig.getDialogName();
            Map localMap = (Map)localHashMap.get(str);
            paramJSONObject = localMap;
            if (localMap == null)
            {
              paramJSONObject = new HashMap();
              localHashMap.put(str, paramJSONObject);
            }
            paramJSONObject.put(localDialogFeatureConfig.getFeatureName(), localDialogFeatureConfig);
          }
        }
    }
    AppMethodBeat.o(72318);
    return localHashMap;
  }

  private static void pollCallbacks()
  {
    while (true)
    {
      Object localObject1;
      Object localObject4;
      try
      {
        AppMethodBeat.i(72313);
        localObject1 = (FetchedAppSettingsManager.FetchAppSettingState)loadingState.get();
        if ((FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED.equals(localObject1)) || (FetchedAppSettingsManager.FetchAppSettingState.LOADING.equals(localObject1)))
        {
          AppMethodBeat.o(72313);
          return;
        }
        Object localObject2 = FacebookSdk.getApplicationId();
        localObject4 = (FetchedAppSettings)fetchedAppSettings.get(localObject2);
        localObject2 = new android/os/Handler;
        ((Handler)localObject2).<init>(Looper.getMainLooper());
        if (!FetchedAppSettingsManager.FetchAppSettingState.ERROR.equals(localObject1))
          break label139;
        if (!fetchedAppSettingsCallbacks.isEmpty())
        {
          localObject1 = (FetchedAppSettingsManager.FetchedAppSettingsCallback)fetchedAppSettingsCallbacks.poll();
          localObject4 = new com/facebook/internal/FetchedAppSettingsManager$2;
          ((FetchedAppSettingsManager.2)localObject4).<init>((FetchedAppSettingsManager.FetchedAppSettingsCallback)localObject1);
          ((Handler)localObject2).post((Runnable)localObject4);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(72313);
      continue;
      label139: 
      while (!fetchedAppSettingsCallbacks.isEmpty())
      {
        localObject1 = (FetchedAppSettingsManager.FetchedAppSettingsCallback)fetchedAppSettingsCallbacks.poll();
        FetchedAppSettingsManager.3 local3 = new com/facebook/internal/FetchedAppSettingsManager$3;
        local3.<init>((FetchedAppSettingsManager.FetchedAppSettingsCallback)localObject1, (FetchedAppSettings)localObject4);
        localObject3.post(local3);
      }
      AppMethodBeat.o(72313);
    }
  }

  public static FetchedAppSettings queryAppSettings(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(72314);
    if ((!paramBoolean) && (fetchedAppSettings.containsKey(paramString)))
    {
      paramString = (FetchedAppSettings)fetchedAppSettings.get(paramString);
      AppMethodBeat.o(72314);
    }
    while (true)
    {
      return paramString;
      Object localObject = getAppSettingsQueryResponse(paramString);
      if (localObject == null)
      {
        paramString = null;
        AppMethodBeat.o(72314);
      }
      else
      {
        localObject = parseAppSettingsFromJSON(paramString, (JSONObject)localObject);
        if (paramString.equals(FacebookSdk.getApplicationId()))
        {
          loadingState.set(FetchedAppSettingsManager.FetchAppSettingState.SUCCESS);
          pollCallbacks();
        }
        AppMethodBeat.o(72314);
        paramString = (String)localObject;
      }
    }
  }

  public static void setIsUnityInit(boolean paramBoolean)
  {
    AppMethodBeat.i(72316);
    isUnityInit = paramBoolean;
    if ((unityEventBindings != null) && (isUnityInit))
      UnityReflection.sendEventMapping(unityEventBindings.toString());
    AppMethodBeat.o(72316);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FetchedAppSettingsManager
 * JD-Core Version:    0.6.2
 */