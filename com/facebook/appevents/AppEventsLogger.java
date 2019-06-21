package com.facebook.appevents;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.webkit.WebView;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest.Callback;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class AppEventsLogger
{
  public static final String ACTION_APP_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_FLUSHED";
  public static final String APP_EVENTS_EXTRA_FLUSH_RESULT = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";
  public static final String APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";
  private static final String APP_EVENT_NAME_PUSH_OPENED = "fb_mobile_push_opened";
  public static final String APP_EVENT_PREFERENCES = "com.facebook.sdk.appEventPreferences";
  private static final String APP_EVENT_PUSH_PARAMETER_ACTION = "fb_push_action";
  private static final String APP_EVENT_PUSH_PARAMETER_CAMPAIGN = "fb_push_campaign";
  private static final int APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS = 86400;
  private static final int FLUSH_APP_SESSION_INFO_IN_SECONDS = 30;
  private static final String PUSH_PAYLOAD_CAMPAIGN_KEY = "campaign";
  private static final String PUSH_PAYLOAD_KEY = "fb_push_payload";
  private static final String SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT = "_fbSourceApplicationHasBeenSet";
  private static final String TAG;
  private static String anonymousAppDeviceGUID;
  private static ScheduledThreadPoolExecutor backgroundExecutor;
  private static FlushBehavior flushBehavior;
  private static boolean isActivateAppEventRequested;
  private static boolean isOpenedByAppLink;
  private static String pushNotificationsRegistrationId;
  private static String sourceApplication;
  private static Object staticLock;
  private final AccessTokenAppIdPair accessTokenAppId;
  private final String contextName;

  static
  {
    AppMethodBeat.i(71983);
    TAG = AppEventsLogger.class.getCanonicalName();
    flushBehavior = FlushBehavior.AUTO;
    staticLock = new Object();
    AppMethodBeat.o(71983);
  }

  private AppEventsLogger(Context paramContext, String paramString, AccessToken paramAccessToken)
  {
    this(Utility.getActivityName(paramContext), paramString, paramAccessToken);
    AppMethodBeat.i(71969);
    AppMethodBeat.o(71969);
  }

  protected AppEventsLogger(String paramString1, String paramString2, AccessToken paramAccessToken)
  {
    AppMethodBeat.i(71970);
    Validate.sdkInitialized();
    this.contextName = paramString1;
    paramString1 = paramAccessToken;
    if (paramAccessToken == null)
      paramString1 = AccessToken.getCurrentAccessToken();
    if ((AccessToken.isCurrentAccessTokenActive()) && ((paramString2 == null) || (paramString2.equals(paramString1.getApplicationId()))));
    for (this.accessTokenAppId = new AccessTokenAppIdPair(paramString1); ; this.accessTokenAppId = new AccessTokenAppIdPair(null, paramString1))
    {
      initializeTimersIfNeeded();
      AppMethodBeat.o(71970);
      return;
      paramString1 = paramString2;
      if (paramString2 == null)
        paramString1 = Utility.getMetadataApplicationId(FacebookSdk.getApplicationContext());
    }
  }

  public static void activateApp(Application paramApplication)
  {
    AppMethodBeat.i(71928);
    activateApp(paramApplication, null);
    AppMethodBeat.o(71928);
  }

  public static void activateApp(Application paramApplication, String paramString)
  {
    AppMethodBeat.i(71929);
    if (!FacebookSdk.isInitialized())
    {
      paramApplication = new FacebookException("The Facebook sdk must be initialized before calling activateApp");
      AppMethodBeat.o(71929);
      throw paramApplication;
    }
    AnalyticsUserIDStore.initStore();
    UserDataStore.initStore();
    String str = paramString;
    if (paramString == null)
      str = FacebookSdk.getApplicationId();
    FacebookSdk.publishInstallAsync(paramApplication, str);
    ActivityLifecycleTracker.startTracking(paramApplication, str);
    AppMethodBeat.o(71929);
  }

  @Deprecated
  public static void activateApp(Context paramContext)
  {
    AppMethodBeat.i(71930);
    if (ActivityLifecycleTracker.isTracking())
      AppMethodBeat.o(71930);
    while (true)
    {
      return;
      FacebookSdk.sdkInitialize(paramContext);
      activateApp(paramContext, Utility.getMetadataApplicationId(paramContext));
      AppMethodBeat.o(71930);
    }
  }

  @Deprecated
  public static void activateApp(Context paramContext, String paramString)
  {
    AppMethodBeat.i(71931);
    if (ActivityLifecycleTracker.isTracking())
    {
      AppMethodBeat.o(71931);
      return;
    }
    if ((paramContext == null) || (paramString == null))
    {
      paramContext = new IllegalArgumentException("Both context and applicationId must be non-null");
      AppMethodBeat.o(71931);
      throw paramContext;
    }
    AnalyticsUserIDStore.initStore();
    UserDataStore.initStore();
    if ((paramContext instanceof Activity))
      setSourceApplication((Activity)paramContext);
    while (true)
    {
      FacebookSdk.publishInstallAsync(paramContext, paramString);
      paramString = new AppEventsLogger(paramContext, paramString, null);
      long l = System.currentTimeMillis();
      paramContext = getSourceApplication();
      backgroundExecutor.execute(new AppEventsLogger.1(paramString, l, paramContext));
      AppMethodBeat.o(71931);
      break;
      resetSourceApplication();
      Utility.logd(AppEventsLogger.class.getName(), "To set source application the context of activateApp must be an instance of Activity");
    }
  }

  public static void augmentWebView(WebView paramWebView, Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(71957);
    String[] arrayOfString = Build.VERSION.RELEASE.split("\\.");
    int j;
    if (arrayOfString.length > 0)
    {
      j = Integer.parseInt(arrayOfString[0]);
      if (arrayOfString.length > 1)
        i = Integer.parseInt(arrayOfString[1]);
      if ((Build.VERSION.SDK_INT >= 17) && (j >= 4) && ((j != 4) || (i > 1)))
        break label94;
      Logger.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "augmentWebView is only available for Android SDK version >= 17 on devices running Android >= 4.2");
      AppMethodBeat.o(71957);
    }
    while (true)
    {
      return;
      j = 0;
      break;
      label94: paramWebView.addJavascriptInterface(new FacebookSDKJSInterface(paramContext), "fbmq_" + FacebookSdk.getApplicationId());
      AppMethodBeat.o(71957);
    }
  }

  public static void clearUserData()
  {
    AppMethodBeat.i(71964);
    UserDataStore.setUserDataAndHash(null);
    AppMethodBeat.o(71964);
  }

  public static void clearUserID()
  {
    AppMethodBeat.i(71960);
    AnalyticsUserIDStore.setUserID(null);
    AppMethodBeat.o(71960);
  }

  @Deprecated
  public static void deactivateApp(Context paramContext)
  {
    AppMethodBeat.i(71932);
    if (ActivityLifecycleTracker.isTracking())
      AppMethodBeat.o(71932);
    while (true)
    {
      return;
      deactivateApp(paramContext, Utility.getMetadataApplicationId(paramContext));
      AppMethodBeat.o(71932);
    }
  }

  @Deprecated
  public static void deactivateApp(Context paramContext, String paramString)
  {
    AppMethodBeat.i(71933);
    if (ActivityLifecycleTracker.isTracking())
      AppMethodBeat.o(71933);
    while (true)
    {
      return;
      if ((paramContext == null) || (paramString == null))
      {
        paramContext = new IllegalArgumentException("Both context and applicationId must be non-null");
        AppMethodBeat.o(71933);
        throw paramContext;
      }
      resetSourceApplication();
      paramContext = new AppEventsLogger(paramContext, paramString, null);
      long l = System.currentTimeMillis();
      backgroundExecutor.execute(new AppEventsLogger.2(paramContext, l));
      AppMethodBeat.o(71933);
    }
  }

  static void eagerFlush()
  {
    AppMethodBeat.i(71975);
    if (getFlushBehavior() != FlushBehavior.EXPLICIT_ONLY)
      AppEventQueue.flush(FlushReason.EAGER_FLUSHING_EVENT);
    AppMethodBeat.o(71975);
  }

  static Executor getAnalyticsExecutor()
  {
    AppMethodBeat.i(71979);
    if (backgroundExecutor == null)
      initializeTimersIfNeeded();
    ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = backgroundExecutor;
    AppMethodBeat.o(71979);
    return localScheduledThreadPoolExecutor;
  }

  public static String getAnonymousAppDeviceGUID(Context paramContext)
  {
    AppMethodBeat.i(71980);
    if (anonymousAppDeviceGUID == null);
    synchronized (staticLock)
    {
      if (anonymousAppDeviceGUID == null)
      {
        Object localObject2 = paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
        anonymousAppDeviceGUID = (String)localObject2;
        if (localObject2 == null)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("XZ");
          anonymousAppDeviceGUID = UUID.randomUUID().toString();
          paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", anonymousAppDeviceGUID).apply();
        }
      }
      paramContext = anonymousAppDeviceGUID;
      AppMethodBeat.o(71980);
      return paramContext;
    }
  }

  public static FlushBehavior getFlushBehavior()
  {
    synchronized (staticLock)
    {
      FlushBehavior localFlushBehavior = flushBehavior;
      return localFlushBehavior;
    }
  }

  static String getPushNotificationsRegistrationId()
  {
    synchronized (staticLock)
    {
      String str = pushNotificationsRegistrationId;
      return str;
    }
  }

  static String getSourceApplication()
  {
    AppMethodBeat.i(71978);
    String str = "Unclassified";
    if (isOpenedByAppLink)
      str = "Applink";
    if (sourceApplication != null)
    {
      str = str + "(" + sourceApplication + ")";
      AppMethodBeat.o(71978);
    }
    while (true)
    {
      return str;
      AppMethodBeat.o(71978);
    }
  }

  public static String getUserData()
  {
    AppMethodBeat.i(71963);
    String str = UserDataStore.getHashedUserData();
    AppMethodBeat.o(71963);
    return str;
  }

  public static String getUserID()
  {
    AppMethodBeat.i(71959);
    String str = AnalyticsUserIDStore.getUserID();
    AppMethodBeat.o(71959);
    return str;
  }

  public static void initializeLib(Context paramContext, String paramString)
  {
    AppMethodBeat.i(71936);
    if (!FacebookSdk.getAutoLogAppEventsEnabled())
      AppMethodBeat.o(71936);
    while (true)
    {
      return;
      paramContext = new AppEventsLogger(paramContext, paramString, null);
      backgroundExecutor.execute(new AppEventsLogger.3(paramContext));
      AppMethodBeat.o(71936);
    }
  }

  private static void initializeTimersIfNeeded()
  {
    AppMethodBeat.i(71971);
    synchronized (staticLock)
    {
      if (backgroundExecutor != null)
      {
        AppMethodBeat.o(71971);
        return;
      }
      ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = new java/util/concurrent/ScheduledThreadPoolExecutor;
      localScheduledThreadPoolExecutor.<init>(1);
      backgroundExecutor = localScheduledThreadPoolExecutor;
      ??? = new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(71910);
          Object localObject = new HashSet();
          Iterator localIterator = AppEventQueue.getKeySet().iterator();
          while (localIterator.hasNext())
            ((Set)localObject).add(((AccessTokenAppIdPair)localIterator.next()).getApplicationId());
          localObject = ((Set)localObject).iterator();
          while (((Iterator)localObject).hasNext())
            FetchedAppSettingsManager.queryAppSettings((String)((Iterator)localObject).next(), true);
          AppMethodBeat.o(71910);
        }
      };
      backgroundExecutor.scheduleAtFixedRate((Runnable)???, 0L, 86400L, TimeUnit.SECONDS);
      AppMethodBeat.o(71971);
    }
  }

  private void logAppSessionResumeEvent(long paramLong, String paramString)
  {
    AppMethodBeat.i(71934);
    PersistedAppSessionInfo.onResume(FacebookSdk.getApplicationContext(), this.accessTokenAppId, this, paramLong, paramString);
    AppMethodBeat.o(71934);
  }

  private void logAppSessionSuspendEvent(long paramLong)
  {
    AppMethodBeat.i(71935);
    PersistedAppSessionInfo.onSuspend(FacebookSdk.getApplicationContext(), this.accessTokenAppId, this, paramLong);
    AppMethodBeat.o(71935);
  }

  private static void logEvent(AppEvent paramAppEvent, AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    AppMethodBeat.i(71974);
    AppEventQueue.add(paramAccessTokenAppIdPair, paramAppEvent);
    if ((!paramAppEvent.getIsImplicit()) && (!isActivateAppEventRequested))
      if (paramAppEvent.getName().equals("fb_mobile_activate_app"))
      {
        isActivateAppEventRequested = true;
        AppMethodBeat.o(71974);
      }
    while (true)
    {
      return;
      Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
      AppMethodBeat.o(71974);
    }
  }

  private void logEvent(String paramString, Double paramDouble, Bundle paramBundle, boolean paramBoolean, UUID paramUUID)
  {
    AppMethodBeat.i(71973);
    try
    {
      AppEvent localAppEvent = new com/facebook/appevents/AppEvent;
      localAppEvent.<init>(this.contextName, paramString, paramDouble, paramBundle, paramBoolean, paramUUID);
      logEvent(localAppEvent, this.accessTokenAppId);
      AppMethodBeat.o(71973);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] { paramString.toString() });
        AppMethodBeat.o(71973);
      }
    }
    catch (FacebookException paramString)
    {
      while (true)
      {
        Logger.log(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", new Object[] { paramString.toString() });
        AppMethodBeat.o(71973);
      }
    }
  }

  private void logPurchase(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle, boolean paramBoolean)
  {
    AppMethodBeat.i(71949);
    if (paramBigDecimal == null)
    {
      notifyDeveloperError("purchaseAmount cannot be null");
      AppMethodBeat.o(71949);
    }
    while (true)
    {
      return;
      if (paramCurrency != null)
        break;
      notifyDeveloperError("currency cannot be null");
      AppMethodBeat.o(71949);
    }
    if (paramBundle == null)
      paramBundle = new Bundle();
    while (true)
    {
      paramBundle.putString("fb_currency", paramCurrency.getCurrencyCode());
      logEvent("fb_mobile_purchase", Double.valueOf(paramBigDecimal.doubleValue()), paramBundle, paramBoolean, ActivityLifecycleTracker.getCurrentSessionGuid());
      eagerFlush();
      AppMethodBeat.o(71949);
      break;
    }
  }

  public static AppEventsLogger newLogger(Context paramContext)
  {
    AppMethodBeat.i(71937);
    paramContext = new AppEventsLogger(paramContext, null, null);
    AppMethodBeat.o(71937);
    return paramContext;
  }

  public static AppEventsLogger newLogger(Context paramContext, AccessToken paramAccessToken)
  {
    AppMethodBeat.i(71938);
    paramContext = new AppEventsLogger(paramContext, null, paramAccessToken);
    AppMethodBeat.o(71938);
    return paramContext;
  }

  public static AppEventsLogger newLogger(Context paramContext, String paramString)
  {
    AppMethodBeat.i(71940);
    paramContext = new AppEventsLogger(paramContext, paramString, null);
    AppMethodBeat.o(71940);
    return paramContext;
  }

  public static AppEventsLogger newLogger(Context paramContext, String paramString, AccessToken paramAccessToken)
  {
    AppMethodBeat.i(71939);
    paramContext = new AppEventsLogger(paramContext, paramString, paramAccessToken);
    AppMethodBeat.o(71939);
    return paramContext;
  }

  private static void notifyDeveloperError(String paramString)
  {
    AppMethodBeat.i(71976);
    Logger.log(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", paramString);
    AppMethodBeat.o(71976);
  }

  public static void onContextStop()
  {
    AppMethodBeat.i(71954);
    AppEventQueue.persistToDisk();
    AppMethodBeat.o(71954);
  }

  static void resetSourceApplication()
  {
    sourceApplication = null;
    isOpenedByAppLink = false;
  }

  public static void setFlushBehavior(FlushBehavior paramFlushBehavior)
  {
    synchronized (staticLock)
    {
      flushBehavior = paramFlushBehavior;
      return;
    }
  }

  public static void setPushNotificationsRegistrationId(String paramString)
  {
    AppMethodBeat.i(71956);
    synchronized (staticLock)
    {
      if (!Utility.stringsEqualOrEmpty(pushNotificationsRegistrationId, paramString))
      {
        pushNotificationsRegistrationId = paramString;
        paramString = newLogger(FacebookSdk.getApplicationContext());
        paramString.logEvent("fb_mobile_obtain_push_token");
        if (getFlushBehavior() != FlushBehavior.EXPLICIT_ONLY)
          paramString.flush();
      }
      AppMethodBeat.o(71956);
      return;
    }
  }

  private static void setSourceApplication(Activity paramActivity)
  {
    AppMethodBeat.i(71977);
    Object localObject = paramActivity.getCallingActivity();
    if (localObject != null)
    {
      localObject = ((ComponentName)localObject).getPackageName();
      if (((String)localObject).equals(paramActivity.getPackageName()))
      {
        resetSourceApplication();
        AppMethodBeat.o(71977);
      }
    }
    while (true)
    {
      return;
      sourceApplication = (String)localObject;
      paramActivity = paramActivity.getIntent();
      if ((paramActivity == null) || (paramActivity.getBooleanExtra("_fbSourceApplicationHasBeenSet", false)))
      {
        resetSourceApplication();
        AppMethodBeat.o(71977);
      }
      else
      {
        localObject = paramActivity.getBundleExtra("al_applink_data");
        if (localObject == null)
        {
          resetSourceApplication();
          AppMethodBeat.o(71977);
        }
        else
        {
          isOpenedByAppLink = true;
          localObject = ((Bundle)localObject).getBundle("referer_app_link");
          if (localObject == null)
          {
            sourceApplication = null;
            AppMethodBeat.o(71977);
          }
          else
          {
            sourceApplication = ((Bundle)localObject).getString("package");
            paramActivity.putExtra("_fbSourceApplicationHasBeenSet", true);
            AppMethodBeat.o(71977);
          }
        }
      }
    }
  }

  static void setSourceApplication(String paramString, boolean paramBoolean)
  {
    sourceApplication = paramString;
    isOpenedByAppLink = paramBoolean;
  }

  @Deprecated
  public static void setUserData(Bundle paramBundle)
  {
    AppMethodBeat.i(71961);
    UserDataStore.setUserDataAndHash(paramBundle);
    AppMethodBeat.o(71961);
  }

  public static void setUserData(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10)
  {
    AppMethodBeat.i(71962);
    UserDataStore.setUserDataAndHash(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, paramString8, paramString9, paramString10);
    AppMethodBeat.o(71962);
  }

  public static void setUserID(String paramString)
  {
    AppMethodBeat.i(71958);
    AnalyticsUserIDStore.setUserID(paramString);
    AppMethodBeat.o(71958);
  }

  public static void updateUserProperties(Bundle paramBundle, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(71965);
    updateUserProperties(paramBundle, FacebookSdk.getApplicationId(), paramCallback);
    AppMethodBeat.o(71965);
  }

  public static void updateUserProperties(Bundle paramBundle, String paramString, GraphRequest.Callback paramCallback)
  {
    AppMethodBeat.i(71966);
    getAnalyticsExecutor().execute(new AppEventsLogger.4(paramBundle, paramString, paramCallback));
    AppMethodBeat.o(71966);
  }

  public void flush()
  {
    AppMethodBeat.i(71953);
    AppEventQueue.flush(FlushReason.EXPLICIT);
    AppMethodBeat.o(71953);
  }

  public String getApplicationId()
  {
    AppMethodBeat.i(71968);
    String str = this.accessTokenAppId.getApplicationId();
    AppMethodBeat.o(71968);
    return str;
  }

  public boolean isValidForAccessToken(AccessToken paramAccessToken)
  {
    AppMethodBeat.i(71955);
    paramAccessToken = new AccessTokenAppIdPair(paramAccessToken);
    boolean bool = this.accessTokenAppId.equals(paramAccessToken);
    AppMethodBeat.o(71955);
    return bool;
  }

  public void logEvent(String paramString)
  {
    AppMethodBeat.i(71941);
    logEvent(paramString, null);
    AppMethodBeat.o(71941);
  }

  public void logEvent(String paramString, double paramDouble)
  {
    AppMethodBeat.i(71942);
    logEvent(paramString, paramDouble, null);
    AppMethodBeat.o(71942);
  }

  public void logEvent(String paramString, double paramDouble, Bundle paramBundle)
  {
    AppMethodBeat.i(71944);
    logEvent(paramString, Double.valueOf(paramDouble), paramBundle, false, ActivityLifecycleTracker.getCurrentSessionGuid());
    AppMethodBeat.o(71944);
  }

  public void logEvent(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(71943);
    logEvent(paramString, null, paramBundle, false, ActivityLifecycleTracker.getCurrentSessionGuid());
    AppMethodBeat.o(71943);
  }

  protected void logEventImplicitly(String paramString, BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    AppMethodBeat.i(71972);
    logEvent(paramString, Double.valueOf(paramBigDecimal.doubleValue()), paramBundle, true, ActivityLifecycleTracker.getCurrentSessionGuid());
    AppMethodBeat.o(71972);
  }

  public void logProductItem(String paramString1, AppEventsLogger.ProductAvailability paramProductAvailability, AppEventsLogger.ProductCondition paramProductCondition, String paramString2, String paramString3, String paramString4, String paramString5, BigDecimal paramBigDecimal, Currency paramCurrency, String paramString6, String paramString7, String paramString8, Bundle paramBundle)
  {
    AppMethodBeat.i(71952);
    if (paramString1 == null)
    {
      notifyDeveloperError("itemID cannot be null");
      AppMethodBeat.o(71952);
    }
    while (true)
    {
      return;
      if (paramProductAvailability == null)
      {
        notifyDeveloperError("availability cannot be null");
        AppMethodBeat.o(71952);
      }
      else if (paramProductCondition == null)
      {
        notifyDeveloperError("condition cannot be null");
        AppMethodBeat.o(71952);
      }
      else if (paramString2 == null)
      {
        notifyDeveloperError("description cannot be null");
        AppMethodBeat.o(71952);
      }
      else if (paramString3 == null)
      {
        notifyDeveloperError("imageLink cannot be null");
        AppMethodBeat.o(71952);
      }
      else if (paramString4 == null)
      {
        notifyDeveloperError("link cannot be null");
        AppMethodBeat.o(71952);
      }
      else if (paramString5 == null)
      {
        notifyDeveloperError("title cannot be null");
        AppMethodBeat.o(71952);
      }
      else if (paramBigDecimal == null)
      {
        notifyDeveloperError("priceAmount cannot be null");
        AppMethodBeat.o(71952);
      }
      else if (paramCurrency == null)
      {
        notifyDeveloperError("currency cannot be null");
        AppMethodBeat.o(71952);
      }
      else if ((paramString6 == null) && (paramString7 == null) && (paramString8 == null))
      {
        notifyDeveloperError("Either gtin, mpn or brand is required");
        AppMethodBeat.o(71952);
      }
      else
      {
        Bundle localBundle = paramBundle;
        if (paramBundle == null)
          localBundle = new Bundle();
        localBundle.putString("fb_product_item_id", paramString1);
        localBundle.putString("fb_product_availability", paramProductAvailability.name());
        localBundle.putString("fb_product_condition", paramProductCondition.name());
        localBundle.putString("fb_product_description", paramString2);
        localBundle.putString("fb_product_image_link", paramString3);
        localBundle.putString("fb_product_link", paramString4);
        localBundle.putString("fb_product_title", paramString5);
        localBundle.putString("fb_product_price_amount", paramBigDecimal.setScale(3, 4).toString());
        localBundle.putString("fb_product_price_currency", paramCurrency.getCurrencyCode());
        if (paramString6 != null)
          localBundle.putString("fb_product_gtin", paramString6);
        if (paramString7 != null)
          localBundle.putString("fb_product_mpn", paramString7);
        if (paramString8 != null)
          localBundle.putString("fb_product_brand", paramString8);
        logEvent("fb_mobile_catalog_update", localBundle);
        eagerFlush();
        AppMethodBeat.o(71952);
      }
    }
  }

  public void logPurchase(BigDecimal paramBigDecimal, Currency paramCurrency)
  {
    AppMethodBeat.i(71945);
    AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled();
    logPurchase(paramBigDecimal, paramCurrency, null, false);
    AppMethodBeat.o(71945);
  }

  public void logPurchase(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    AppMethodBeat.i(71946);
    AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled();
    logPurchase(paramBigDecimal, paramCurrency, paramBundle, false);
    AppMethodBeat.o(71946);
  }

  @Deprecated
  public void logPurchaseImplicitly(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    AppMethodBeat.i(71947);
    if (AutomaticAnalyticsLogger.isImplicitPurchaseLoggingEnabled())
    {
      new StringBuilder().append("Function logPurchaseImplicitly() is deprecated and your purchase events cannot be logged with this function. ").append("Auto-logging of in-app purchase has been enabled in the SDK, so you don't have to manually log purchases");
      AppMethodBeat.o(71947);
    }
    while (true)
    {
      return;
      new StringBuilder().append("Function logPurchaseImplicitly() is deprecated and your purchase events cannot be logged with this function. ").append("Please use logPurchase() function instead.");
      AppMethodBeat.o(71947);
    }
  }

  protected void logPurchaseImplicitlyInternal(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    AppMethodBeat.i(71948);
    logPurchase(paramBigDecimal, paramCurrency, paramBundle, true);
    AppMethodBeat.o(71948);
  }

  public void logPushNotificationOpen(Bundle paramBundle)
  {
    AppMethodBeat.i(71950);
    logPushNotificationOpen(paramBundle, null);
    AppMethodBeat.o(71950);
  }

  public void logPushNotificationOpen(Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(71951);
    Bundle localBundle = null;
    try
    {
      paramBundle = paramBundle.getString("fb_push_payload");
      boolean bool = Utility.isNullOrEmpty(paramBundle);
      if (bool)
        AppMethodBeat.o(71951);
      while (true)
      {
        return;
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramBundle);
        paramBundle = localJSONObject.getString("campaign");
        if (paramBundle == null)
        {
          Logger.log(LoggingBehavior.DEVELOPER_ERRORS, TAG, "Malformed payload specified for logging a push notification open.");
          AppMethodBeat.o(71951);
        }
        else
        {
          localBundle = new Bundle();
          localBundle.putString("fb_push_campaign", paramBundle);
          if (paramString != null)
            localBundle.putString("fb_push_action", paramString);
          logEvent("fb_mobile_push_opened", localBundle);
          AppMethodBeat.o(71951);
        }
      }
    }
    catch (JSONException paramBundle)
    {
      while (true)
        paramBundle = localBundle;
    }
  }

  public void logSdkEvent(String paramString, Double paramDouble, Bundle paramBundle)
  {
    AppMethodBeat.i(71967);
    logEvent(paramString, paramDouble, paramBundle, true, ActivityLifecycleTracker.getCurrentSessionGuid());
    AppMethodBeat.o(71967);
  }

  public static enum FlushBehavior
  {
    static
    {
      AppMethodBeat.i(71913);
      AUTO = new FlushBehavior("AUTO", 0);
      EXPLICIT_ONLY = new FlushBehavior("EXPLICIT_ONLY", 1);
      $VALUES = new FlushBehavior[] { AUTO, EXPLICIT_ONLY };
      AppMethodBeat.o(71913);
    }
  }

  static class PersistedAppSessionInfo
  {
    private static final String PERSISTED_SESSION_INFO_FILENAME = "AppEventsLogger.persistedsessioninfo";
    private static final Runnable appSessionInfoFlushRunnable;
    private static Map<AccessTokenAppIdPair, FacebookTimeSpentData> appSessionInfoMap;
    private static boolean hasChanges;
    private static boolean isLoaded;
    private static final Object staticLock;

    static
    {
      AppMethodBeat.i(71921);
      staticLock = new Object();
      hasChanges = false;
      isLoaded = false;
      appSessionInfoFlushRunnable = new AppEventsLogger.PersistedAppSessionInfo.1();
      AppMethodBeat.o(71921);
    }

    private static FacebookTimeSpentData getTimeSpentData(Context paramContext, AccessTokenAppIdPair paramAccessTokenAppIdPair)
    {
      AppMethodBeat.i(71919);
      restoreAppSessionInformation(paramContext);
      FacebookTimeSpentData localFacebookTimeSpentData = (FacebookTimeSpentData)appSessionInfoMap.get(paramAccessTokenAppIdPair);
      paramContext = localFacebookTimeSpentData;
      if (localFacebookTimeSpentData == null)
      {
        paramContext = new FacebookTimeSpentData();
        appSessionInfoMap.put(paramAccessTokenAppIdPair, paramContext);
      }
      AppMethodBeat.o(71919);
      return paramContext;
    }

    static void onResume(Context paramContext, AccessTokenAppIdPair paramAccessTokenAppIdPair, AppEventsLogger paramAppEventsLogger, long paramLong, String paramString)
    {
      AppMethodBeat.i(71917);
      synchronized (staticLock)
      {
        getTimeSpentData(paramContext, paramAccessTokenAppIdPair).onResume(paramAppEventsLogger, paramLong, paramString);
        onTimeSpentDataUpdate();
        AppMethodBeat.o(71917);
        return;
      }
    }

    static void onSuspend(Context paramContext, AccessTokenAppIdPair paramAccessTokenAppIdPair, AppEventsLogger paramAppEventsLogger, long paramLong)
    {
      AppMethodBeat.i(71918);
      synchronized (staticLock)
      {
        getTimeSpentData(paramContext, paramAccessTokenAppIdPair).onSuspend(paramAppEventsLogger, paramLong);
        onTimeSpentDataUpdate();
        AppMethodBeat.o(71918);
        return;
      }
    }

    private static void onTimeSpentDataUpdate()
    {
      AppMethodBeat.i(71920);
      if (!hasChanges)
      {
        hasChanges = true;
        AppEventsLogger.backgroundExecutor.schedule(appSessionInfoFlushRunnable, 30L, TimeUnit.SECONDS);
      }
      AppMethodBeat.o(71920);
    }

    // ERROR //
    private static void restoreAppSessionInformation(Context paramContext)
    {
      // Byte code:
      //   0: ldc 111
      //   2: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: aconst_null
      //   6: astore_1
      //   7: getstatic 35	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:staticLock	Ljava/lang/Object;
      //   10: astore_2
      //   11: aload_2
      //   12: monitorenter
      //   13: getstatic 39	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:isLoaded	Z
      //   16: istore_3
      //   17: iload_3
      //   18: ifne +78 -> 96
      //   21: new 113	java/io/ObjectInputStream
      //   24: astore 4
      //   26: aload 4
      //   28: aload_0
      //   29: ldc 11
      //   31: invokevirtual 119	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
      //   34: invokespecial 122	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
      //   37: aload 4
      //   39: invokevirtual 126	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
      //   42: checkcast 128	java/util/HashMap
      //   45: putstatic 57	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:appSessionInfoMap	Ljava/util/Map;
      //   48: getstatic 134	com/facebook/LoggingBehavior:APP_EVENTS	Lcom/facebook/LoggingBehavior;
      //   51: ldc 136
      //   53: ldc 138
      //   55: invokestatic 144	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
      //   58: aload 4
      //   60: invokestatic 150	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
      //   63: aload_0
      //   64: ldc 11
      //   66: invokevirtual 154	android/content/Context:deleteFile	(Ljava/lang/String;)Z
      //   69: pop
      //   70: getstatic 57	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:appSessionInfoMap	Ljava/util/Map;
      //   73: ifnonnull +15 -> 88
      //   76: new 128	java/util/HashMap
      //   79: astore_0
      //   80: aload_0
      //   81: invokespecial 155	java/util/HashMap:<init>	()V
      //   84: aload_0
      //   85: putstatic 57	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:appSessionInfoMap	Ljava/util/Map;
      //   88: iconst_1
      //   89: putstatic 39	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:isLoaded	Z
      //   92: iconst_0
      //   93: putstatic 37	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:hasChanges	Z
      //   96: aload_2
      //   97: monitorexit
      //   98: ldc 111
      //   100: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   103: return
      //   104: astore 4
      //   106: aload_1
      //   107: astore 4
      //   109: aload 4
      //   111: invokestatic 150	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
      //   114: aload_0
      //   115: ldc 11
      //   117: invokevirtual 154	android/content/Context:deleteFile	(Ljava/lang/String;)Z
      //   120: pop
      //   121: getstatic 57	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:appSessionInfoMap	Ljava/util/Map;
      //   124: ifnonnull +15 -> 139
      //   127: new 128	java/util/HashMap
      //   130: astore_0
      //   131: aload_0
      //   132: invokespecial 155	java/util/HashMap:<init>	()V
      //   135: aload_0
      //   136: putstatic 57	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:appSessionInfoMap	Ljava/util/Map;
      //   139: iconst_1
      //   140: putstatic 39	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:isLoaded	Z
      //   143: iconst_0
      //   144: putstatic 37	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:hasChanges	Z
      //   147: goto -51 -> 96
      //   150: astore_0
      //   151: aload_2
      //   152: monitorexit
      //   153: ldc 111
      //   155: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   158: aload_0
      //   159: athrow
      //   160: astore_1
      //   161: aconst_null
      //   162: astore 4
      //   164: invokestatic 159	com/facebook/appevents/AppEventsLogger:access$200	()Ljava/lang/String;
      //   167: pop
      //   168: new 161	java/lang/StringBuilder
      //   171: astore 5
      //   173: aload 5
      //   175: ldc 163
      //   177: invokespecial 166	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   180: aload 5
      //   182: aload_1
      //   183: invokevirtual 169	java/lang/Exception:toString	()Ljava/lang/String;
      //   186: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   189: pop
      //   190: aload 4
      //   192: invokestatic 150	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
      //   195: aload_0
      //   196: ldc 11
      //   198: invokevirtual 154	android/content/Context:deleteFile	(Ljava/lang/String;)Z
      //   201: pop
      //   202: getstatic 57	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:appSessionInfoMap	Ljava/util/Map;
      //   205: ifnonnull +15 -> 220
      //   208: new 128	java/util/HashMap
      //   211: astore_0
      //   212: aload_0
      //   213: invokespecial 155	java/util/HashMap:<init>	()V
      //   216: aload_0
      //   217: putstatic 57	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:appSessionInfoMap	Ljava/util/Map;
      //   220: iconst_1
      //   221: putstatic 39	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:isLoaded	Z
      //   224: iconst_0
      //   225: putstatic 37	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:hasChanges	Z
      //   228: goto -132 -> 96
      //   231: astore_1
      //   232: aconst_null
      //   233: astore 4
      //   235: aload 4
      //   237: invokestatic 150	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
      //   240: aload_0
      //   241: ldc 11
      //   243: invokevirtual 154	android/content/Context:deleteFile	(Ljava/lang/String;)Z
      //   246: pop
      //   247: getstatic 57	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:appSessionInfoMap	Ljava/util/Map;
      //   250: ifnonnull +15 -> 265
      //   253: new 128	java/util/HashMap
      //   256: astore_0
      //   257: aload_0
      //   258: invokespecial 155	java/util/HashMap:<init>	()V
      //   261: aload_0
      //   262: putstatic 57	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:appSessionInfoMap	Ljava/util/Map;
      //   265: iconst_1
      //   266: putstatic 39	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:isLoaded	Z
      //   269: iconst_0
      //   270: putstatic 37	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:hasChanges	Z
      //   273: ldc 111
      //   275: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   278: aload_1
      //   279: athrow
      //   280: astore_1
      //   281: goto -46 -> 235
      //   284: astore_1
      //   285: goto -50 -> 235
      //   288: astore_1
      //   289: goto -125 -> 164
      //   292: astore_1
      //   293: goto -184 -> 109
      //
      // Exception table:
      //   from	to	target	type
      //   21	37	104	java/io/FileNotFoundException
      //   13	17	150	finally
      //   58	88	150	finally
      //   88	96	150	finally
      //   96	98	150	finally
      //   109	139	150	finally
      //   139	147	150	finally
      //   151	153	150	finally
      //   190	220	150	finally
      //   220	228	150	finally
      //   235	265	150	finally
      //   265	280	150	finally
      //   21	37	160	java/lang/Exception
      //   21	37	231	finally
      //   37	58	280	finally
      //   164	190	284	finally
      //   37	58	288	java/lang/Exception
      //   37	58	292	java/io/FileNotFoundException
    }

    // ERROR //
    static void saveAppSessionInformation(Context paramContext)
    {
      // Byte code:
      //   0: ldc 175
      //   2: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
      //   5: getstatic 35	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:staticLock	Ljava/lang/Object;
      //   8: astore_1
      //   9: aload_1
      //   10: monitorenter
      //   11: getstatic 37	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:hasChanges	Z
      //   14: istore_2
      //   15: iload_2
      //   16: ifeq +61 -> 77
      //   19: new 177	java/io/ObjectOutputStream
      //   22: astore_3
      //   23: new 179	java/io/BufferedOutputStream
      //   26: astore 4
      //   28: aload 4
      //   30: aload_0
      //   31: ldc 11
      //   33: iconst_0
      //   34: invokevirtual 183	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
      //   37: invokespecial 186	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   40: aload_3
      //   41: aload 4
      //   43: invokespecial 187	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   46: aload_3
      //   47: astore_0
      //   48: aload_3
      //   49: getstatic 57	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:appSessionInfoMap	Ljava/util/Map;
      //   52: invokevirtual 191	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
      //   55: aload_3
      //   56: astore_0
      //   57: iconst_0
      //   58: putstatic 37	com/facebook/appevents/AppEventsLogger$PersistedAppSessionInfo:hasChanges	Z
      //   61: aload_3
      //   62: astore_0
      //   63: getstatic 134	com/facebook/LoggingBehavior:APP_EVENTS	Lcom/facebook/LoggingBehavior;
      //   66: ldc 136
      //   68: ldc 193
      //   70: invokestatic 144	com/facebook/internal/Logger:log	(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;)V
      //   73: aload_3
      //   74: invokestatic 150	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
      //   77: aload_1
      //   78: monitorexit
      //   79: ldc 175
      //   81: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   84: return
      //   85: astore 4
      //   87: aconst_null
      //   88: astore_3
      //   89: aload_3
      //   90: astore_0
      //   91: invokestatic 159	com/facebook/appevents/AppEventsLogger:access$200	()Ljava/lang/String;
      //   94: pop
      //   95: aload_3
      //   96: astore_0
      //   97: new 161	java/lang/StringBuilder
      //   100: astore 5
      //   102: aload_3
      //   103: astore_0
      //   104: aload 5
      //   106: ldc 195
      //   108: invokespecial 166	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   111: aload_3
      //   112: astore_0
      //   113: aload 5
      //   115: aload 4
      //   117: invokevirtual 169	java/lang/Exception:toString	()Ljava/lang/String;
      //   120: invokevirtual 173	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   123: pop
      //   124: aload_3
      //   125: invokestatic 150	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
      //   128: goto -51 -> 77
      //   131: astore_0
      //   132: aload_1
      //   133: monitorexit
      //   134: ldc 175
      //   136: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   139: aload_0
      //   140: athrow
      //   141: astore_3
      //   142: aconst_null
      //   143: astore_0
      //   144: aload_0
      //   145: invokestatic 150	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
      //   148: ldc 175
      //   150: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
      //   153: aload_3
      //   154: athrow
      //   155: astore_3
      //   156: goto -12 -> 144
      //   159: astore 4
      //   161: goto -72 -> 89
      //
      // Exception table:
      //   from	to	target	type
      //   19	46	85	java/lang/Exception
      //   11	15	131	finally
      //   73	77	131	finally
      //   77	79	131	finally
      //   124	128	131	finally
      //   132	134	131	finally
      //   144	155	131	finally
      //   19	46	141	finally
      //   48	55	155	finally
      //   57	61	155	finally
      //   63	73	155	finally
      //   91	95	155	finally
      //   97	102	155	finally
      //   104	111	155	finally
      //   113	124	155	finally
      //   48	55	159	java/lang/Exception
      //   57	61	159	java/lang/Exception
      //   63	73	159	java/lang/Exception
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventsLogger
 * JD-Core Version:    0.6.2
 */