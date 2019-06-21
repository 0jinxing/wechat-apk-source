package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_index.c.d;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.ad;
import com.tencent.mm.wallet_core.c.u;

final class WalletBrandUI$e
  implements WalletBrandUI.b
{
  private String tos = "";

  WalletBrandUI$e(WalletBrandUI paramWalletBrandUI)
  {
  }

  public final int cSY()
  {
    return 2755;
  }

  public final m cSZ()
  {
    AppMethodBeat.i(48258);
    WalletBrandUI.a(this.tRU, this.tRU.getIntent().getStringExtra("appId"));
    String str1 = this.tRU.getIntent().getStringExtra("signtype");
    String str2 = this.tRU.getIntent().getStringExtra("nonceStr");
    Object localObject = this.tRU.getIntent().getStringExtra("timeStamp");
    String str3 = this.tRU.getIntent().getStringExtra("packageExt");
    String str4 = this.tRU.getIntent().getStringExtra("paySignature");
    String str5 = this.tRU.getIntent().getStringExtra("url");
    String str6 = this.tRU.getIntent().getStringExtra("ext_info");
    WalletBrandUI.b(this.tRU, this.tRU.getIntent().getStringExtra("bizUsername"));
    int i = this.tRU.getIntent().getIntExtra("pay_channel", 0);
    localObject = new d(WalletBrandUI.f(this.tRU), str1, str2, str3, str4, (String)localObject, str5, WalletBrandUI.g(this.tRU), i, WalletBrandUI.h(this.tRU), str6);
    ((u)localObject).hbj = System.currentTimeMillis();
    ((u)localObject).eHT = "PayProcess";
    ((u)localObject).gOW = WalletBrandUI.h(this.tRU);
    g.RQ();
    g.RO().eJo.a((m)localObject, 0);
    AppMethodBeat.o(48258);
    return localObject;
  }

  public final String cTa()
  {
    return this.tos;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48259);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramm = (d)paramm;
      String str = paramm.tRa;
      this.tos = str;
      ab.d("MicroMsg.WalletBrandUI", "req_key = ".concat(String.valueOf(str)));
      PayInfo localPayInfo = new PayInfo();
      localPayInfo.czZ = str;
      localPayInfo.appId = WalletBrandUI.f(this.tRU);
      localPayInfo.tRb = paramm.tRb;
      localPayInfo.cIf = WalletBrandUI.h(this.tRU);
      localPayInfo.aIm = paramString;
      localPayInfo.cIb = this.tRU.getIntent().getIntExtra("pay_channel", 16);
      localPayInfo.vwj = paramm.hbj;
      ad.o(localPayInfo.cIf, str, paramInt2);
      h.a(this.tRU, localPayInfo, 1);
      AppMethodBeat.o(48259);
    }
    while (true)
    {
      return;
      this.tRU.finish();
      AppMethodBeat.o(48259);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI.e
 * JD-Core Version:    0.6.2
 */