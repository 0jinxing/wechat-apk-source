package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class az$1
  implements MMActivity.a
{
  az$1(az paramaz, q paramq, int paramInt)
  {
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(130518);
    if (paramInt1 == 1)
      if (paramIntent == null)
        break label148;
    label148: for (paramIntent = paramIntent.getStringExtra("key_app_authorize_state"); ; paramIntent = "")
      try
      {
        localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>(paramIntent);
        paramIntent = (Intent)localObject;
        localObject = new JSONObject();
      }
      catch (JSONException paramIntent)
      {
        try
        {
          Object localObject;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          ((JSONObject)localObject).put("errMsg", this.hyl.getName() + ":ok");
          ((JSONObject)localObject).put("authSetting", paramIntent);
          this.hyj.M(this.hyk, ((JSONObject)localObject).toString());
          AppMethodBeat.o(130518);
          return;
          paramIntent = paramIntent;
          paramIntent = new JSONArray();
        }
        catch (JSONException paramIntent)
        {
          while (true)
          {
            ab.e("MicroMsg.JsApiOpenSetting", "set json error!");
            ab.printErrStackTrace("MicroMsg.JsApiOpenSetting", paramIntent, "", new Object[0]);
          }
        }
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.az.1
 * JD-Core Version:    0.6.2
 */