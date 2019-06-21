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

public final class be extends a
{
  public static final int CTRL_INDEX = 617;
  public static final String NAME = "openWCPayLQTSave";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(130527);
    Context localContext = paramc.getContext();
    if ((localContext == null) || (!(localContext instanceof MMActivity)))
    {
      paramc.M(paramInt, j("fail", null));
      ab.e("MicroMsg.JsApiOpenWCPayLQTSave", "mmActivity is null, invoke fail!");
      AppMethodBeat.o(130527);
    }
    while (true)
    {
      return;
      ((MMActivity)localContext).ifE = new be.1(this, localContext, paramc, paramInt);
      AppBrandSysConfigWC localAppBrandSysConfigWC = com.tencent.mm.plugin.appbrand.a.wJ(paramc.getAppId());
      if (localAppBrandSysConfigWC == null)
      {
        paramc.M(paramInt, j("fail", null));
        ab.e("MicroMsg.JsApiOpenWCPayLQTSave", "sysConfig is null, invoke fail!");
        AppMethodBeat.o(130527);
      }
      else
      {
        Object localObject = com.tencent.mm.plugin.appbrand.a.wI(paramc.getAppId());
        if (localObject == null)
        {
          paramc.M(paramInt, j("fail", null));
          ab.e("MicroMsg.JsApiOpenWCPayLQTSave", "runtime is null, invoke fail!");
          AppMethodBeat.o(130527);
        }
        else
        {
          ab.d("MicroMsg.JsApiOpenWCPayLQTSave", "do openWCPayLQTDepositPlan");
          localObject = ((i)localObject).asV().getCurrentUrl();
          Intent localIntent = new Intent();
          localIntent.putExtra("appId", paramc.getAppId());
          localIntent.putExtra("timeStamp", paramJSONObject.optString("timeStamp"));
          localIntent.putExtra("nonceStr", paramJSONObject.optString("nonceStr"));
          localIntent.putExtra("packageExt", paramJSONObject.optString("package"));
          localIntent.putExtra("signtype", paramJSONObject.optString("signType"));
          localIntent.putExtra("paySignature", paramJSONObject.optString("paySign"));
          localIntent.putExtra("pay_channel", paramJSONObject.optString("pay_channel"));
          localIntent.putExtra("wxapp_username", localAppBrandSysConfigWC.cwz);
          localIntent.putExtra("jsapi_scene", 20);
          localIntent.putExtra("command_word", "openWCPayLQTSave");
          localIntent.putExtra("wxapp_path", (String)localObject);
          localIntent.putExtra("source_type", 2);
          d.b(localContext, "wallet", ".ui.WalletJsApiAdapterUI", localIntent, hashCode() & 0xFFFF);
          AppMethodBeat.o(130527);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.be
 * JD-Core Version:    0.6.2
 */