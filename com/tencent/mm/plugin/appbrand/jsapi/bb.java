package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.mm.plugin.appbrand.config.h;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.page.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class bb extends a
{
  public static final int CTRL_INDEX = 618;
  public static final String NAME = "openWCPayLQTDepositPlan";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(130521);
    Context localContext = paramc.getContext();
    if ((localContext == null) || (!(localContext instanceof MMActivity)))
    {
      paramc.M(paramInt, j("fail", null));
      ab.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "mmActivity is null, invoke fail!");
      AppMethodBeat.o(130521);
    }
    while (true)
    {
      return;
      ((MMActivity)localContext).ifE = new bb.1(this, localContext, paramc, paramInt);
      AppBrandSysConfigWC localAppBrandSysConfigWC = com.tencent.mm.plugin.appbrand.a.wJ(paramc.getAppId());
      if (localAppBrandSysConfigWC == null)
      {
        paramc.M(paramInt, j("fail", null));
        ab.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "sysConfig is null, invoke fail!");
        AppMethodBeat.o(130521);
      }
      else
      {
        Object localObject = com.tencent.mm.plugin.appbrand.a.wI(paramc.getAppId());
        if (localObject == null)
        {
          paramc.M(paramInt, j("fail", null));
          ab.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "runtime is null, invoke fail!");
          AppMethodBeat.o(130521);
        }
        else
        {
          ab.d("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "do openWCPayLQTDepositPlan");
          String str = ((i)localObject).asV().getCurrentUrl();
          localObject = new Intent();
          ((Intent)localObject).putExtra("appId", paramc.getAppId());
          ((Intent)localObject).putExtra("timeStamp", paramJSONObject.optString("timeStamp"));
          ((Intent)localObject).putExtra("nonceStr", paramJSONObject.optString("nonceStr"));
          ((Intent)localObject).putExtra("packageExt", paramJSONObject.optString("package"));
          ((Intent)localObject).putExtra("signtype", paramJSONObject.optString("signType"));
          ((Intent)localObject).putExtra("paySignature", paramJSONObject.optString("paySign"));
          ((Intent)localObject).putExtra("pay_channel", paramJSONObject.optString("pay_channel"));
          ((Intent)localObject).putExtra("wxapp_username", localAppBrandSysConfigWC.cwz);
          ((Intent)localObject).putExtra("jsapi_scene", 21);
          ((Intent)localObject).putExtra("command_word", "openWCPayLQTDepositPlan");
          ((Intent)localObject).putExtra("wxapp_path", str);
          ((Intent)localObject).putExtra("source_type", 2);
          d.b(localContext, "wallet", ".ui.WalletJsApiAdapterUI", (Intent)localObject, hashCode() & 0xFFFF);
          AppMethodBeat.o(130521);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bb
 * JD-Core Version:    0.6.2
 */