package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 277;
  public static final String NAME = "startSoterAuthentication";

  public final void a(final com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, final int paramInt)
  {
    AppMethodBeat.i(3225);
    ab.i("MicroMsg.JsApiStartSoterAuthentication", "hy: JsApiStartSoterAuthentication");
    MMActivity localMMActivity;
    if ((paramc.getContext() instanceof MMActivity))
    {
      localMMActivity = (MMActivity)paramc.getContext();
      if (localMMActivity != null)
        break label88;
      ab.e("MicroMsg.JsApiStartSoterAuthentication", "JsApiStartSoterAuthentication context is null, appId is %s", new Object[] { paramc.getAppId() });
      paramc.M(paramInt, j("fail", null));
      AppMethodBeat.o(3225);
    }
    while (true)
    {
      return;
      localMMActivity = null;
      break;
      label88: JSONArray localJSONArray = paramJSONObject.optJSONArray("requestAuthModes");
      String str = paramJSONObject.optString("challenge");
      paramJSONObject = paramJSONObject.optString("authContent");
      Intent localIntent = new Intent(localMMActivity, SoterAuthenticationUIWC.class);
      localIntent.putExtra("auth_mode", a.m(localJSONArray));
      localIntent.putExtra("challenge", str);
      localIntent.putExtra("auth_content", paramJSONObject);
      localIntent.putExtra("key_soter_fp_mp_scene", 0);
      localMMActivity.ifE = new MMActivity.a()
      {
        public final void c(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
        {
          Object localObject1 = null;
          Object localObject2 = null;
          Object localObject3 = null;
          AppMethodBeat.i(3224);
          if (paramAnonymousInt1 == 1000)
            if (paramAnonymousInt2 == -1)
            {
              ab.i("MicroMsg.JsApiStartSoterAuthentication", "hy: soter auth ok");
              localObject2 = c.this;
              localObject1 = paramc;
              paramAnonymousInt1 = paramInt;
              if (paramAnonymousIntent != null)
                localObject3 = paramAnonymousIntent.getExtras();
              c.a((c)localObject2, (com.tencent.mm.plugin.appbrand.jsapi.c)localObject1, paramAnonymousInt1, (Bundle)localObject3, "ok");
              AppMethodBeat.o(3224);
            }
          while (true)
          {
            return;
            Object localObject4;
            if (paramAnonymousInt2 == 1)
            {
              ab.w("MicroMsg.JsApiStartSoterAuthentication", "hy: soter auth failed");
              localObject4 = c.this;
              localObject2 = paramc;
              paramAnonymousInt1 = paramInt;
              localObject3 = localObject1;
              if (paramAnonymousIntent != null)
                localObject3 = paramAnonymousIntent.getExtras();
              c.a((c)localObject4, (com.tencent.mm.plugin.appbrand.jsapi.c)localObject2, paramAnonymousInt1, (Bundle)localObject3, "fail");
              AppMethodBeat.o(3224);
            }
            else
            {
              ab.e("MicroMsg.JsApiStartSoterAuthentication", "hy: soter user cancelled");
              localObject1 = c.this;
              localObject4 = paramc;
              paramAnonymousInt1 = paramInt;
              localObject3 = localObject2;
              if (paramAnonymousIntent != null)
                localObject3 = paramAnonymousIntent.getExtras();
              c.a((c)localObject1, (com.tencent.mm.plugin.appbrand.jsapi.c)localObject4, paramAnonymousInt1, (Bundle)localObject3, "cancel");
              AppMethodBeat.o(3224);
            }
          }
        }
      };
      localMMActivity.startActivityForResult(localIntent, 1000);
      AppMethodBeat.o(3225);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bio.soter.c
 * JD-Core Version:    0.6.2
 */