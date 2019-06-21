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

public final class ax extends a
{
  public static final int CTRL_INDEX = 403;
  public static final String NAME = "openOfflinePayView";
  private int bOs;

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(130517);
    Context localContext = paramc.getContext();
    if ((localContext == null) || (!(localContext instanceof MMActivity)))
    {
      paramc.M(paramInt, j("fail", null));
      ab.e("MicroMsg.JsApiOpenOfflinePayView", "mmActivity is null, invoke fail!");
      AppMethodBeat.o(130517);
    }
    while (true)
    {
      return;
      ((MMActivity)localContext).ifE = new ax.1(this, paramc, paramInt);
      this.bOs = paramInt;
      ab.d("MicroMsg.JsApiOpenOfflinePayView", "json: %s", new Object[] { paramJSONObject.toString() });
      AppBrandSysConfigWC localAppBrandSysConfigWC = com.tencent.mm.plugin.appbrand.a.wJ(paramc.getAppId());
      if (localAppBrandSysConfigWC == null)
      {
        paramc.M(paramInt, j("fail", null));
        ab.e("MicroMsg.JsApiOpenOfflinePayView", "sysConfig is null, invoke fail!");
        AppMethodBeat.o(130517);
      }
      else
      {
        Object localObject = com.tencent.mm.plugin.appbrand.a.wI(paramc.getAppId());
        if (localObject == null)
        {
          paramc.M(paramInt, j("fail", null));
          ab.e("MicroMsg.JsApiOpenOfflinePayView", "runtime is null, invoke fail!");
          AppMethodBeat.o(130517);
        }
        else
        {
          String str = ((i)localObject).asV().getCurrentUrl();
          localObject = new Intent();
          ((Intent)localObject).putExtra("appId", paramc.getAppId());
          ((Intent)localObject).putExtra("timeStamp", paramJSONObject.optString("timeStamp"));
          ((Intent)localObject).putExtra("nonceStr", paramJSONObject.optString("nonceStr"));
          ((Intent)localObject).putExtra("packageExt", paramJSONObject.optString("package"));
          ((Intent)localObject).putExtra("signtype", paramJSONObject.optString("signType"));
          ((Intent)localObject).putExtra("paySignature", paramJSONObject.optString("paySign"));
          ((Intent)localObject).putExtra("wxapp_username", localAppBrandSysConfigWC.cwz);
          ((Intent)localObject).putExtra("wxapp_path", str);
          paramInt = hashCode();
          ((Intent)localObject).putExtra("key_from_scene", 7);
          d.b(localContext, "offline", ".ui.WalletOfflineEntranceUI", (Intent)localObject, paramInt & 0xFFFF);
          AppMethodBeat.o(130517);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.ax
 * JD-Core Version:    0.6.2
 */