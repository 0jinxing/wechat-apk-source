package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FetchedAppGateKeepersManager
{
  private static final String APPLICATION_DEVICE_ID = "device_id";
  private static final String APPLICATION_FIELDS = "fields";
  private static final String APPLICATION_GATEKEEPER_EDGE = "mobile_sdk_gk";
  private static final String APPLICATION_GATEKEEPER_FIELD = "gatekeepers";
  private static final String APPLICATION_GRAPH_DATA = "data";
  private static final String APPLICATION_PLATFORM = "platform";
  private static final String APPLICATION_SDK_VERSION = "sdk_version";
  public static final String APP_EVENTS_IF_AUTO_LOG_SUBS = "app_events_if_auto_log_subs";
  private static final String APP_GATEKEEPERS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_GATEKEEPERS.%s";
  private static final String APP_GATEKEEPERS_PREFS_STORE = "com.facebook.internal.preferences.APP_GATEKEEPERS";
  private static final String APP_PLATFORM = "android";
  private static final String TAG;
  private static final Map<String, JSONObject> fetchedAppGateKeepers;

  static
  {
    AppMethodBeat.i(72300);
    TAG = FetchedAppGateKeepersManager.class.getCanonicalName();
    fetchedAppGateKeepers = new ConcurrentHashMap();
    AppMethodBeat.o(72300);
  }

  private static JSONObject getAppGateKeepersQueryResponse(String paramString)
  {
    AppMethodBeat.i(72296);
    Bundle localBundle = new Bundle();
    AttributionIdentifiers localAttributionIdentifiers = AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
    String str1 = "";
    String str2 = str1;
    if (localAttributionIdentifiers != null)
    {
      str2 = str1;
      if (localAttributionIdentifiers.getAndroidAdvertiserId() != null)
        str2 = localAttributionIdentifiers.getAndroidAdvertiserId();
    }
    str1 = FacebookSdk.getSdkVersion();
    localBundle.putString("platform", "android");
    localBundle.putString("device_id", str2);
    localBundle.putString("sdk_version", str1);
    localBundle.putString("fields", "gatekeepers");
    paramString = GraphRequest.newGraphPathRequest(null, String.format("%s/%s", new Object[] { paramString, "mobile_sdk_gk" }), null);
    paramString.setSkipClientToken(true);
    paramString.setParameters(localBundle);
    paramString = paramString.executeAndWait().getJSONObject();
    AppMethodBeat.o(72296);
    return paramString;
  }

  public static boolean getGateKeeperForKey(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(72295);
    if ((paramString2 == null) || (!fetchedAppGateKeepers.containsKey(paramString2)))
      AppMethodBeat.o(72295);
    while (true)
    {
      return paramBoolean;
      paramBoolean = ((JSONObject)fetchedAppGateKeepers.get(paramString2)).optBoolean(paramString1, paramBoolean);
      AppMethodBeat.o(72295);
    }
  }

  public static void loadAppGateKeepersAsync()
  {
    try
    {
      AppMethodBeat.i(72294);
      Context localContext = FacebookSdk.getApplicationContext();
      String str1 = FacebookSdk.getApplicationId();
      String str2 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[] { str1 });
      Executor localExecutor = FacebookSdk.getExecutor();
      FetchedAppGateKeepersManager.1 local1 = new com/facebook/internal/FetchedAppGateKeepersManager$1;
      local1.<init>(localContext, str2, str1);
      localExecutor.execute(local1);
      AppMethodBeat.o(72294);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static void parseAppGateKeepersFromJSON(String paramString, JSONObject paramJSONObject)
  {
    int i = 0;
    AppMethodBeat.i(72297);
    JSONObject localJSONObject;
    if (fetchedAppGateKeepers.containsKey(paramString))
      localJSONObject = (JSONObject)fetchedAppGateKeepers.get(paramString);
    while (true)
    {
      Object localObject = paramJSONObject.optJSONArray("data");
      paramJSONObject = null;
      if (localObject != null)
        paramJSONObject = ((JSONArray)localObject).optJSONObject(0);
      if ((paramJSONObject != null) && (paramJSONObject.optJSONArray("gatekeepers") != null))
      {
        paramJSONObject = paramJSONObject.optJSONArray("gatekeepers");
        label74: if (i < paramJSONObject.length())
          try
          {
            localObject = paramJSONObject.getJSONObject(i);
            localJSONObject.put(((JSONObject)localObject).getString("key"), ((JSONObject)localObject).getBoolean("value"));
            i++;
            break label74;
            localJSONObject = new JSONObject();
          }
          catch (JSONException localJSONException)
          {
            while (true)
              Utility.logd("FacebookSDK", localJSONException);
          }
      }
    }
    fetchedAppGateKeepers.put(paramString, localJSONObject);
    AppMethodBeat.o(72297);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FetchedAppGateKeepersManager
 * JD-Core Version:    0.6.2
 */