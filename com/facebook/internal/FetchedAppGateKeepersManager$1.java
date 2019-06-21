package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

final class FetchedAppGateKeepersManager$1
  implements Runnable
{
  FetchedAppGateKeepersManager$1(Context paramContext, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(72293);
    SharedPreferences localSharedPreferences = this.val$context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0);
    String str = localSharedPreferences.getString(this.val$gateKeepersKey, null);
    if (!Utility.isNullOrEmpty(str));
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(str);
      if (localJSONObject != null)
        FetchedAppGateKeepersManager.access$000(this.val$applicationId, localJSONObject);
      localJSONObject = FetchedAppGateKeepersManager.access$100(this.val$applicationId);
      if (localJSONObject != null)
      {
        FetchedAppGateKeepersManager.access$000(this.val$applicationId, localJSONObject);
        localSharedPreferences.edit().putString(this.val$gateKeepersKey, localJSONObject.toString()).apply();
      }
      AppMethodBeat.o(72293);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        Utility.logd("FacebookSDK", localJSONException);
        Object localObject = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FetchedAppGateKeepersManager.1
 * JD-Core Version:    0.6.2
 */