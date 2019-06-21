package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.Callback;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BundleJSONConverter;
import com.facebook.internal.Logger;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class AppEventsLogger$4
  implements Runnable
{
  AppEventsLogger$4(Bundle paramBundle, String paramString, GraphRequest.Callback paramCallback)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(71909);
    Object localObject1 = AppEventsLogger.getUserID();
    if ((localObject1 == null) || (((String)localObject1).isEmpty()))
    {
      Logger.log(LoggingBehavior.APP_EVENTS, AppEventsLogger.access$200(), "AppEventsLogger userID cannot be null or empty");
      AppMethodBeat.o(71909);
    }
    while (true)
    {
      return;
      Object localObject2 = new Bundle();
      ((Bundle)localObject2).putString("user_unique_id", (String)localObject1);
      ((Bundle)localObject2).putBundle("custom_data", this.val$parameters);
      localObject1 = AttributionIdentifiers.getAttributionIdentifiers(FacebookSdk.getApplicationContext());
      if ((localObject1 != null) && (((AttributionIdentifiers)localObject1).getAndroidAdvertiserId() != null))
        ((Bundle)localObject2).putString("advertiser_id", ((AttributionIdentifiers)localObject1).getAndroidAdvertiserId());
      localObject1 = new Bundle();
      try
      {
        JSONObject localJSONObject = BundleJSONConverter.convertToJSON((Bundle)localObject2);
        localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>();
        ((JSONArray)localObject2).put(localJSONObject);
        ((Bundle)localObject1).putString("data", ((JSONArray)localObject2).toString());
        localObject1 = new GraphRequest(AccessToken.getCurrentAccessToken(), String.format(Locale.US, "%s/user_properties", new Object[] { this.val$applicationID }), (Bundle)localObject1, HttpMethod.POST, this.val$callback);
        ((GraphRequest)localObject1).setSkipClientToken(true);
        ((GraphRequest)localObject1).executeAsync();
        AppMethodBeat.o(71909);
      }
      catch (JSONException localJSONException)
      {
        FacebookException localFacebookException = new FacebookException("Failed to construct request", localJSONException);
        AppMethodBeat.o(71909);
        throw localFacebookException;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventsLogger.4
 * JD-Core Version:    0.6.2
 */