package com.facebook.appevents.internal;

import android.os.Build;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.appevents.codeless.ViewIndexer;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

final class ActivityLifecycleTracker$6
  implements Runnable
{
  ActivityLifecycleTracker$6(String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(72145);
    GraphRequest localGraphRequest = GraphRequest.newPostRequest(null, String.format(Locale.US, "%s/app_indexing_session", new Object[] { this.val$applicationId }), null, null);
    Object localObject1 = localGraphRequest.getParameters();
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = new Bundle();
    AttributionIdentifiers localAttributionIdentifiers = AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
    JSONArray localJSONArray = new JSONArray();
    label108: label125: boolean bool;
    if (Build.MODEL != null)
    {
      localObject1 = Build.MODEL;
      localJSONArray.put(localObject1);
      if ((localAttributionIdentifiers == null) || (localAttributionIdentifiers.getAndroidAdvertiserId() == null))
        break label269;
      localJSONArray.put(localAttributionIdentifiers.getAndroidAdvertiserId());
      localJSONArray.put("0");
      if (!AppEventUtility.isEmulator())
        break label280;
      localObject1 = "1";
      localJSONArray.put(localObject1);
      localObject1 = Utility.getCurrentLocale();
      localJSONArray.put(((Locale)localObject1).getLanguage() + "_" + ((Locale)localObject1).getCountry());
      localObject1 = localJSONArray.toString();
      ((Bundle)localObject2).putString("device_session_id", ActivityLifecycleTracker.getCurrentDeviceSessionID());
      ((Bundle)localObject2).putString("extinfo", (String)localObject1);
      localGraphRequest.setParameters((Bundle)localObject2);
      if (localGraphRequest != null)
      {
        localObject2 = localGraphRequest.executeAndWait().getJSONObject();
        if ((localObject2 == null) || (!((JSONObject)localObject2).optBoolean("is_app_indexing_enabled", false)))
          break label286;
        bool = true;
        label227: ActivityLifecycleTracker.access$1002(Boolean.valueOf(bool));
        if (ActivityLifecycleTracker.access$1000().booleanValue())
          break label292;
        ActivityLifecycleTracker.access$1102(null);
      }
    }
    while (true)
    {
      ActivityLifecycleTracker.access$1302(Boolean.FALSE);
      AppMethodBeat.o(72145);
      return;
      localObject1 = "";
      break;
      label269: localJSONArray.put("");
      break label108;
      label280: localObject1 = "0";
      break label125;
      label286: bool = false;
      break label227;
      label292: ActivityLifecycleTracker.access$1200().schedule();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.ActivityLifecycleTracker.6
 * JD-Core Version:    0.6.2
 */