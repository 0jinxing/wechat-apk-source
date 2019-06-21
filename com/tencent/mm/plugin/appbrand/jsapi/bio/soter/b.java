package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends a
{
  public static final int CTRL_INDEX = 277;
  public static final String NAME = "startSoterAuthentication";
  private Class<?> hDo;
  private int scene;

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(73793);
    ab.i("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: JsApiStartSoterAuthentication");
    Activity localActivity = (Activity)paramc.getContext();
    if (localActivity == null)
    {
      ab.e("MicroMsg.JsApiLuggageStartSoterAuthentication", "JsApiStartSoterAuthentication context is null, appId is %s", new Object[] { paramc.getAppId() });
      paramc.M(paramInt, j("fail", null));
      AppMethodBeat.o(73793);
    }
    while (true)
    {
      return;
      if (this.hDo == null)
      {
        ab.e("MicroMsg.JsApiLuggageStartSoterAuthentication", "JsApiStartSoterAuthentication ui is null!");
        paramc.M(paramInt, j("fail:JsApiStartSoterAuthentication UI is null!", null));
        AppMethodBeat.o(73793);
        continue;
      }
      JSONArray localJSONArray = paramJSONObject.optJSONArray("requestAuthModes");
      String str1 = paramJSONObject.optString("challenge");
      String str2 = paramJSONObject.optString("authContent");
      Intent localIntent = new Intent(localActivity, this.hDo);
      localIntent.putExtra("auth_mode", d.m(localJSONArray));
      localIntent.putExtra("challenge", str1);
      localIntent.putExtra("auth_content", str2);
      localIntent.putExtra("key_soter_fp_luggage_fromscene", 1);
      try
      {
        this.scene = paramJSONObject.getInt("scene");
        localIntent.putExtra("key_soter_fp_luggage_scene", this.scene);
        localIntent.putExtra("Soter_Result_Receiver", new JsApiLuggageStartSoterAuthentication.1(this, new Handler(Looper.getMainLooper()), paramc, paramInt));
        localActivity.startActivity(localIntent);
        AppMethodBeat.o(73793);
      }
      catch (JSONException paramJSONObject)
      {
        while (true)
          ab.i("MicroMsg.JsApiLuggageStartSoterAuthentication", "hy: soter authentication scene null");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.soter.b
 * JD-Core Version:    0.6.2
 */