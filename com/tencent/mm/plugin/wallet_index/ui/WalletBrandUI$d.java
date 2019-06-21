package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.ul;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_index.c.c;
import com.tencent.mm.plugin.wallet_index.c.e;
import com.tencent.mm.plugin.wallet_index.c.i;
import com.tencent.mm.plugin.wallet_index.c.j;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.protocal.protobuf.csj;
import com.tencent.mm.protocal.protobuf.nb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.ad;
import com.tencent.mm.wallet_core.c.u;

final class WalletBrandUI$d
  implements WalletBrandUI.b
{
  private String tos = "";

  WalletBrandUI$d(WalletBrandUI paramWalletBrandUI)
  {
  }

  public final int cSY()
  {
    AppMethodBeat.i(48257);
    String str = this.tRU.getIntent().getStringExtra("packageExt");
    int i;
    if (com.tencent.mm.plugin.wallet_index.c.a.gO(str, "up_"))
    {
      i = 2519;
      AppMethodBeat.o(48257);
    }
    while (true)
    {
      return i;
      if (com.tencent.mm.plugin.wallet_index.c.a.gO(str, "tax_"))
      {
        i = 2923;
        AppMethodBeat.o(48257);
      }
      else if (com.tencent.mm.plugin.wallet_index.c.a.gO(str, "dc_"))
      {
        i = 2798;
        AppMethodBeat.o(48257);
      }
      else
      {
        i = 398;
        AppMethodBeat.o(48257);
      }
    }
  }

  public final m cSZ()
  {
    AppMethodBeat.i(48255);
    WalletBrandUI.a(this.tRU, this.tRU.getIntent().getStringExtra("appId"));
    String str1 = this.tRU.getIntent().getStringExtra("signtype");
    String str2 = this.tRU.getIntent().getStringExtra("nonceStr");
    String str3 = this.tRU.getIntent().getStringExtra("timeStamp");
    String str4 = this.tRU.getIntent().getStringExtra("packageExt");
    String str5 = this.tRU.getIntent().getStringExtra("paySignature");
    String str6 = this.tRU.getIntent().getStringExtra("url");
    WalletBrandUI.b(this.tRU, this.tRU.getIntent().getStringExtra("bizUsername"));
    int i = this.tRU.getIntent().getIntExtra("pay_channel", 0);
    int j = this.tRU.getIntent().getIntExtra("key_wx_app_scene", 0);
    String str7 = this.tRU.getIntent().getStringExtra("cookie");
    Object localObject = WalletBrandUI.f(this.tRU);
    String str8 = WalletBrandUI.g(this.tRU);
    int k = WalletBrandUI.h(this.tRU);
    if (com.tencent.mm.plugin.wallet_index.c.a.gO(str4, "up_"))
      localObject = new j((String)localObject, str1, str2, str4, str5, str3, str6, str8, i, k, j, str7);
    while (true)
    {
      ((u)localObject).hbj = System.currentTimeMillis();
      ((u)localObject).eHT = "PayProcess";
      ((u)localObject).gOW = WalletBrandUI.h(this.tRU);
      g.RQ();
      g.RO().eJo.a((m)localObject, 0);
      AppMethodBeat.o(48255);
      return localObject;
      if (com.tencent.mm.plugin.wallet_index.c.a.gO(str4, "tax_"))
        localObject = new i((String)localObject, str1, str2, str4, str5, str3, str6, str8, i, k, j, str7);
      else if (com.tencent.mm.plugin.wallet_index.c.a.gO(str4, "dc_"))
        localObject = new c((String)localObject, str1, str2, str4, str5, str3, str6, str8, i, k, j, str7);
      else
        localObject = new e((String)localObject, str1, str2, str4, str5, str3, str6, str8, i, k, j, str7);
    }
  }

  public final String cTa()
  {
    return this.tos;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48256);
    e locale;
    Object localObject1;
    Object localObject2;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      locale = (e)paramm;
      localObject1 = locale.tRa;
      ab.d("MicroMsg.WalletBrandUI", "req_key = ".concat(String.valueOf(localObject1)));
      this.tos = ((String)localObject1);
      com.tencent.mm.sdk.b.a.xxA.m(new ul());
      localObject2 = ((e)paramm).tRc;
      if ((localObject2 != null) && (!bo.isNullOrNil(((csj)localObject2).xpI)))
      {
        paramString = new Intent();
        paramString.putExtra("prepayId", (String)localObject1);
        paramString.putExtra("is_jsapi_offline_pay", false);
        paramString.putExtra("pay_gate_url", ((csj)localObject2).xpI);
        paramString.putExtra("need_dialog", ((csj)localObject2).xpK);
        paramString.putExtra("dialog_text", ((csj)localObject2).xpL);
        paramString.putExtra("max_count", ((csj)localObject2).xpJ.vRG);
        paramString.putExtra("inteval_time", ((csj)localObject2).xpJ.vRF);
        paramString.putExtra("default_wording", ((csj)localObject2).xpJ.vRH);
        d.c(this.tRU, "wallet_core", ".ui.WalletMixOrderInfoUI", paramString);
        AppMethodBeat.o(48256);
      }
    }
    while (true)
    {
      return;
      localObject2 = new PayInfo();
      ((PayInfo)localObject2).czZ = ((String)localObject1);
      ((PayInfo)localObject2).appId = WalletBrandUI.f(this.tRU);
      ((PayInfo)localObject2).tRb = locale.tRb;
      ((PayInfo)localObject2).cIf = WalletBrandUI.h(this.tRU);
      ((PayInfo)localObject2).aIm = paramString;
      ((PayInfo)localObject2).cIb = this.tRU.getIntent().getIntExtra("pay_channel", 0);
      ((PayInfo)localObject2).vwj = locale.hbj;
      if (((PayInfo)localObject2).vwh == null)
        ((PayInfo)localObject2).vwh = new Bundle();
      ((PayInfo)localObject2).vwh.putString("extinfo_key_20", ((e)paramm).tRd);
      ((PayInfo)localObject2).vwh.putString("extinfo_key_21", this.tRU.getIntent().getStringExtra("intent_app_brand_from_path"));
      ((PayInfo)localObject2).vwh.putString("extinfo_key_22", this.tRU.getIntent().getStringExtra("intent_app_brand_from_username"));
      ad.o(((PayInfo)localObject2).cIf, (String)localObject1, paramInt2);
      h.a(this.tRU, (PayInfo)localObject2, 1);
      AppMethodBeat.o(48256);
      continue;
      ad.o(WalletBrandUI.h(this.tRU), "", paramInt2);
      localObject1 = new Intent();
      if (paramInt1 != 0)
        paramInt2 = -1;
      ((Intent)localObject1).putExtra("key_jsapi_pay_err_code", paramInt2);
      paramm = paramString;
      if (bo.isNullOrNil(paramString))
        paramm = this.tRU.getString(2131305019);
      ((Intent)localObject1).putExtra("key_jsapi_pay_err_msg", paramm);
      this.tRU.setResult(5, (Intent)localObject1);
      this.tRU.finish();
      AppMethodBeat.o(48256);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI.d
 * JD-Core Version:    0.6.2
 */