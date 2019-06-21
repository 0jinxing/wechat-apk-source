package com.facebook.appevents.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.FetchedAppGateKeepersManager;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Validate;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.math.BigDecimal;
import java.util.Currency;
import org.json.JSONException;
import org.json.JSONObject;

public class AutomaticAnalyticsLogger
{
  private static final String TAG;
  private static final InternalAppEventsLogger internalAppEventsLogger;

  static
  {
    AppMethodBeat.i(72178);
    TAG = AutomaticAnalyticsLogger.class.getCanonicalName();
    internalAppEventsLogger = new InternalAppEventsLogger(FacebookSdk.getApplicationContext());
    AppMethodBeat.o(72178);
  }

  private static PurchaseLoggingParameters getPurchaseLoggingParameters(String paramString1, String paramString2)
  {
    AppMethodBeat.i(72177);
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString1);
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString2);
      paramString2 = new android/os/Bundle;
      paramString2.<init>(1);
      paramString2.putCharSequence("fb_iap_product_id", ((JSONObject)localObject).getString("productId"));
      paramString2.putCharSequence("fb_iap_purchase_time", ((JSONObject)localObject).getString("purchaseTime"));
      paramString2.putCharSequence("fb_iap_purchase_token", ((JSONObject)localObject).getString("purchaseToken"));
      paramString2.putCharSequence("fb_iap_package_name", ((JSONObject)localObject).optString("packageName"));
      paramString2.putCharSequence("fb_iap_product_title", localJSONObject.optString("title"));
      paramString2.putCharSequence("fb_iap_product_description", localJSONObject.optString("description"));
      paramString1 = localJSONObject.optString("type");
      paramString2.putCharSequence("fb_iap_product_type", paramString1);
      if (paramString1.equals("subs"))
      {
        paramString2.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(((JSONObject)localObject).optBoolean("autoRenewing", false)));
        paramString2.putCharSequence("fb_iap_subs_period", localJSONObject.optString("subscriptionPeriod"));
        paramString2.putCharSequence("fb_free_trial_period", localJSONObject.optString("freeTrialPeriod"));
        paramString1 = localJSONObject.optString("introductoryPriceCycles");
        if (!paramString1.isEmpty())
        {
          paramString2.putCharSequence("fb_intro_price_amount_micros", localJSONObject.optString("introductoryPriceAmountMicros"));
          paramString2.putCharSequence("fb_intro_price_cycles", paramString1);
        }
      }
      paramString1 = new com/facebook/appevents/internal/AutomaticAnalyticsLogger$PurchaseLoggingParameters;
      localObject = new java/math/BigDecimal;
      ((BigDecimal)localObject).<init>(localJSONObject.getLong("price_amount_micros") / 1000000.0D);
      paramString1.<init>((BigDecimal)localObject, Currency.getInstance(localJSONObject.getString("price_currency_code")), paramString2);
      AppMethodBeat.o(72177);
      return paramString1;
    }
    catch (JSONException paramString1)
    {
      while (true)
      {
        paramString1 = null;
        AppMethodBeat.o(72177);
      }
    }
  }

  public static boolean isImplicitPurchaseLoggingEnabled()
  {
    AppMethodBeat.i(72176);
    FetchedAppSettings localFetchedAppSettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
    boolean bool;
    if ((localFetchedAppSettings != null) && (FacebookSdk.getAutoLogAppEventsEnabled()) && (localFetchedAppSettings.getIAPAutomaticLoggingEnabled()))
    {
      bool = true;
      AppMethodBeat.o(72176);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(72176);
    }
  }

  public static void logActivateAppEvent()
  {
    AppMethodBeat.i(72172);
    Context localContext = FacebookSdk.getApplicationContext();
    String str = FacebookSdk.getApplicationId();
    boolean bool = FacebookSdk.getAutoLogAppEventsEnabled();
    Validate.notNull(localContext, "context");
    if ((bool) && ((localContext instanceof Application)))
      AppEventsLogger.activateApp((Application)localContext, str);
    AppMethodBeat.o(72172);
  }

  public static void logActivityTimeSpentEvent(String paramString, long paramLong)
  {
    AppMethodBeat.i(72173);
    Object localObject1 = FacebookSdk.getApplicationContext();
    Object localObject2 = FacebookSdk.getApplicationId();
    Validate.notNull(localObject1, "context");
    localObject2 = FetchedAppSettingsManager.queryAppSettings((String)localObject2, false);
    if ((localObject2 != null) && (((FetchedAppSettings)localObject2).getAutomaticLoggingEnabled()) && (paramLong > 0L))
    {
      localObject2 = AppEventsLogger.newLogger((Context)localObject1);
      localObject1 = new Bundle(1);
      ((Bundle)localObject1).putCharSequence("fb_aa_time_spent_view_name", paramString);
      ((AppEventsLogger)localObject2).logEvent("fb_aa_time_spent_on_view", paramLong, (Bundle)localObject1);
    }
    AppMethodBeat.o(72173);
  }

  public static void logPurchaseInapp(String paramString1, String paramString2)
  {
    AppMethodBeat.i(72174);
    if (!isImplicitPurchaseLoggingEnabled())
      AppMethodBeat.o(72174);
    while (true)
    {
      return;
      paramString1 = getPurchaseLoggingParameters(paramString1, paramString2);
      if (paramString1 != null)
        internalAppEventsLogger.logPurchaseImplicitlyInternal(paramString1.purchaseAmount, paramString1.currency, paramString1.param);
      AppMethodBeat.o(72174);
    }
  }

  public static void logPurchaseSubs(SubscriptionType paramSubscriptionType, String paramString1, String paramString2)
  {
    AppMethodBeat.i(72175);
    if (!isImplicitPurchaseLoggingEnabled())
    {
      AppMethodBeat.o(72175);
      return;
    }
    String str = FacebookSdk.getApplicationId();
    switch (AutomaticAnalyticsLogger.1.$SwitchMap$com$facebook$appevents$internal$SubscriptionType[paramSubscriptionType.ordinal()])
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(72175);
      break;
      paramSubscriptionType = "SubscriptionRestore";
      while (true)
      {
        paramString1 = getPurchaseLoggingParameters(paramString1, paramString2);
        if (paramString1 != null)
          internalAppEventsLogger.logEventImplicitly(paramSubscriptionType, paramString1.purchaseAmount, paramString1.currency, paramString1.param);
        AppMethodBeat.o(72175);
        break;
        paramSubscriptionType = "SubscriptionCancel";
        continue;
        paramSubscriptionType = "SubscriptionHeartbeat";
        continue;
        paramSubscriptionType = "SubscriptionExpire";
        continue;
        if (!FetchedAppGateKeepersManager.getGateKeeperForKey("app_events_if_auto_log_subs", str, true))
          break label152;
        paramSubscriptionType = "Subscribe";
      }
      label152: logPurchaseInapp(paramString1, paramString2);
    }
  }

  static class PurchaseLoggingParameters
  {
    Currency currency;
    Bundle param;
    BigDecimal purchaseAmount;

    PurchaseLoggingParameters(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
    {
      this.purchaseAmount = paramBigDecimal;
      this.currency = paramCurrency;
      this.param = paramBundle;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.AutomaticAnalyticsLogger
 * JD-Core Version:    0.6.2
 */