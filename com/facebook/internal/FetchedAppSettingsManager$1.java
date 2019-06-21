package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.facebook.appevents.internal.AutomaticAnalyticsLogger;
import com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

final class FetchedAppSettingsManager$1
  implements Runnable
{
  FetchedAppSettingsManager$1(Context paramContext, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    Object localObject1 = null;
    AppMethodBeat.i(72304);
    SharedPreferences localSharedPreferences = this.val$context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
    String str = localSharedPreferences.getString(this.val$settingsKey, null);
    Object localObject2 = localObject1;
    if (!Utility.isNullOrEmpty(str));
    try
    {
      localObject3 = new org/json/JSONObject;
      ((JSONObject)localObject3).<init>(str);
      localObject2 = localObject1;
      if (localObject3 != null)
        localObject2 = FetchedAppSettingsManager.access$000(this.val$applicationId, (JSONObject)localObject3);
      localObject3 = FetchedAppSettingsManager.access$100(this.val$applicationId);
      if (localObject3 != null)
      {
        FetchedAppSettingsManager.access$000(this.val$applicationId, (JSONObject)localObject3);
        localSharedPreferences.edit().putString(this.val$settingsKey, ((JSONObject)localObject3).toString()).apply();
      }
      if (localObject2 != null)
      {
        localObject2 = ((FetchedAppSettings)localObject2).getSdkUpdateMessage();
        if ((!FetchedAppSettingsManager.access$200()) && (localObject2 != null) && (((String)localObject2).length() > 0))
        {
          FetchedAppSettingsManager.access$202(true);
          FetchedAppSettingsManager.access$300();
        }
      }
      AutomaticAnalyticsLogger.logActivateAppEvent();
      InAppPurchaseActivityLifecycleTracker.update();
      localObject3 = FetchedAppSettingsManager.access$500();
      if (FetchedAppSettingsManager.access$400().containsKey(this.val$applicationId))
      {
        localObject2 = FetchedAppSettingsManager.FetchAppSettingState.SUCCESS;
        ((AtomicReference)localObject3).set(localObject2);
        FetchedAppSettingsManager.access$600();
        AppMethodBeat.o(72304);
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        Utility.logd("FacebookSDK", localJSONException);
        Object localObject3 = null;
        continue;
        FetchedAppSettingsManager.FetchAppSettingState localFetchAppSettingState = FetchedAppSettingsManager.FetchAppSettingState.ERROR;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FetchedAppSettingsManager.1
 * JD-Core Version:    0.6.2
 */