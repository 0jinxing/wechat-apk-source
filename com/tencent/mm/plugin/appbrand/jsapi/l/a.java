package com.tencent.mm.plugin.appbrand.jsapi.l;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.pluginsdk.wallet.g;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public enum a
  implements b
{
  static
  {
    AppMethodBeat.i(131410);
    hTJ = new a("INSTANCE");
    hTK = new a[] { hTJ };
    AppMethodBeat.o(131410);
  }

  public final void a(MMActivity paramMMActivity, JSONObject paramJSONObject, b.b paramb)
  {
    AppMethodBeat.i(131409);
    paramb = new a.5(this, paramb);
    g localg = new g(paramJSONObject);
    paramJSONObject = new Intent();
    paramJSONObject.putExtra("appId", localg.appId);
    paramJSONObject.putExtra("timeStamp", localg.timeStamp);
    paramJSONObject.putExtra("nonceStr", localg.nonceStr);
    paramJSONObject.putExtra("packageExt", localg.packageExt);
    paramJSONObject.putExtra("signtype", localg.signType);
    paramJSONObject.putExtra("paySignature", localg.cId);
    paramJSONObject.putExtra("url", localg.url);
    paramJSONObject.putExtra("scene", 1);
    paramMMActivity.ifE = paramb;
    d.a(paramMMActivity, "wallet_core", ".ui.WalletCheckPwdUI", paramJSONObject, 0xFFFF & hashCode(), false);
    AppMethodBeat.o(131409);
  }

  public final boolean a(MMActivity paramMMActivity, AppBrandStatObject paramAppBrandStatObject, JSONObject paramJSONObject, final b.a parama, PString paramPString)
  {
    AppMethodBeat.i(131408);
    paramJSONObject = new g(paramJSONObject);
    if (paramAppBrandStatObject != null)
    {
      paramJSONObject.cvS = g.gT(paramAppBrandStatObject.scene, paramAppBrandStatObject.cOo);
      paramJSONObject.vwt = g.gS(paramAppBrandStatObject.scene, paramAppBrandStatObject.cOo);
    }
    paramJSONObject.cIf = 46;
    paramPString.value = paramJSONObject.packageExt;
    paramAppBrandStatObject = new MMActivity.a()
    {
      public final void c(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(131401);
        if (paramAnonymousInt1 != (a.this.hashCode() & 0xFFFF))
        {
          AppMethodBeat.o(131401);
          return;
        }
        if (paramAnonymousIntent != null);
        for (paramAnonymousInt1 = paramAnonymousIntent.getIntExtra("key_is_clear_failure", -1); ; paramAnonymousInt1 = -1)
        {
          HashMap localHashMap = new HashMap();
          if (paramAnonymousInt1 == 0)
            localHashMap.put("payStatus", "pending");
          while (true)
          {
            if (paramAnonymousInt2 != -1)
              break label115;
            if (parama != null)
              parama.a(1, null, localHashMap);
            AppMethodBeat.o(131401);
            break;
            if (paramAnonymousInt1 == 1)
              localHashMap.put("pay_status", "fail");
          }
          label115: if (paramAnonymousInt2 == 5)
          {
            paramAnonymousInt1 = paramAnonymousIntent.getIntExtra("key_jsapi_pay_err_code", 0);
            paramAnonymousIntent = bo.nullAsNil(paramAnonymousIntent.getStringExtra("key_jsapi_pay_err_msg"));
            ab.e("MicroMsg.AppBrandJsApiPayService", "errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousIntent });
            if (parama != null)
              parama.a(2, paramAnonymousIntent, localHashMap);
            AppMethodBeat.o(131401);
            break;
          }
          if (parama != null)
            parama.a(3, null, localHashMap);
          AppMethodBeat.o(131401);
          break;
        }
      }
    };
    boolean bool = h.a(paramMMActivity, paramJSONObject, hashCode() & 0xFFFF, paramAppBrandStatObject);
    AppMethodBeat.o(131408);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.l.a
 * JD-Core Version:    0.6.2
 */