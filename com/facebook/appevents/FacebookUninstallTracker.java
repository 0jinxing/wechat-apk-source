package com.facebook.appevents;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookUninstallTracker
{
  private static final String PLATFORM = "android";
  private static final String SUCCESS = "success";
  private static final String TAG;
  private static final String UPLOADED_TOKEN_STORE = "com.facebook.appevents.FacebookUninstallTracker.UPLOADED_TOKEN";
  private static final SharedPreferences uploadedTokenSharedPrefs;

  static
  {
    AppMethodBeat.i(72003);
    TAG = FacebookUninstallTracker.class.getCanonicalName();
    uploadedTokenSharedPrefs = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.appevents.FacebookUninstallTracker.UPLOADED_TOKEN", 0);
    AppMethodBeat.o(72003);
  }

  private static GraphRequest buildPushDeviceTokenRequest(String paramString1, String paramString2)
  {
    Bundle localBundle = null;
    AppMethodBeat.i(72001);
    GraphRequest localGraphRequest = GraphRequest.newPostRequest(null, String.format(Locale.US, "%s/app_push_device_token", new Object[] { paramString1 }), null, null);
    localGraphRequest.setSkipClientToken(true);
    paramString1 = AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
    if (paramString1 == null)
      AppMethodBeat.o(72001);
    for (paramString1 = localBundle; ; paramString1 = localGraphRequest)
    {
      return paramString1;
      String str = paramString1.getAndroidAdvertiserId();
      localBundle = localGraphRequest.getParameters();
      paramString1 = localBundle;
      if (localBundle == null)
        paramString1 = new Bundle();
      paramString1.putString("device_id", str);
      paramString1.putString("device_token", paramString2);
      paramString1.putString("platform", "android");
      localGraphRequest.setParameters(paramString1);
      AppMethodBeat.o(72001);
    }
  }

  private static void sendToServer(String paramString)
  {
    AppMethodBeat.i(72000);
    FacebookSdk.getExecutor().execute(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(71998);
        Object localObject1 = FacebookUninstallTracker.access$000(FacebookSdk.getApplicationId(), this.val$deviceToken);
        if (localObject1 != null)
          localObject1 = ((GraphRequest)localObject1).executeAndWait();
        while (true)
        {
          try
          {
            Object localObject2 = ((GraphResponse)localObject1).getJSONObject();
            if (localObject2 != null)
            {
              if ((((JSONObject)localObject2).has("success")) && (((JSONObject)localObject2).getString("success").equals("true")))
              {
                FacebookUninstallTracker.uploadedTokenSharedPrefs.edit().putString("uploaded_token", this.val$deviceToken).putBoolean("pre_track_uninstall_enabled", true).apply();
                AppMethodBeat.o(71998);
                return;
              }
              localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>("Error sending device token to Facebook: ");
              ((StringBuilder)localObject2).append(((GraphResponse)localObject1).getError());
            }
            AppMethodBeat.o(71998);
            continue;
          }
          catch (JSONException localJSONException)
          {
          }
          AppMethodBeat.o(71998);
        }
      }
    });
    AppMethodBeat.o(72000);
  }

  public static void updateDeviceToken(String paramString)
  {
    AppMethodBeat.i(71999);
    Object localObject = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
    if (localObject == null)
      AppMethodBeat.o(71999);
    while (true)
    {
      return;
      boolean bool1 = ((FetchedAppSettings)localObject).getTrackUninstallEnabled();
      localObject = uploadedTokenSharedPrefs.getString("uploaded_token", null);
      boolean bool2 = uploadedTokenSharedPrefs.getBoolean("pre_track_uninstall_enabled", false);
      if ((bool1) && ((!bool2) || (!paramString.equals(localObject))))
      {
        sendToServer(paramString);
        AppMethodBeat.o(71999);
      }
      else
      {
        if ((!bool1) && (bool2))
          uploadedTokenSharedPrefs.edit().putBoolean("pre_track_uninstall_enabled", false).apply();
        AppMethodBeat.o(71999);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.FacebookUninstallTracker
 * JD-Core Version:    0.6.2
 */