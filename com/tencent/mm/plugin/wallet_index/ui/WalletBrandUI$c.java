package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_index.c.b.a;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.platformtools.ab;

final class WalletBrandUI$c
  implements WalletBrandUI.b
{
  private String tos = "";

  WalletBrandUI$c(WalletBrandUI paramWalletBrandUI)
  {
  }

  public final int cSY()
  {
    return 1521;
  }

  public final m cSZ()
  {
    AppMethodBeat.i(48253);
    WalletBrandUI.a(this.tRU, this.tRU.getIntent().getStringExtra("appId"));
    String str1 = this.tRU.getIntent().getStringExtra("signtype");
    String str2 = this.tRU.getIntent().getStringExtra("nonceStr");
    String str3 = this.tRU.getIntent().getStringExtra("timeStamp");
    String str4 = this.tRU.getIntent().getStringExtra("packageExt");
    String str5 = this.tRU.getIntent().getStringExtra("paySignature");
    Object localObject = this.tRU.getIntent().getStringExtra("url");
    WalletBrandUI.b(this.tRU, this.tRU.getIntent().getStringExtra("bizUsername"));
    int i = this.tRU.getIntent().getIntExtra("pay_channel", 0);
    localObject = new a(WalletBrandUI.f(this.tRU), str1, str2, str4, str5, str3, (String)localObject, WalletBrandUI.g(this.tRU), i);
    g.RQ();
    g.RO().eJo.a((m)localObject, 0);
    AppMethodBeat.o(48253);
    return localObject;
  }

  public final String cTa()
  {
    return this.tos;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48254);
    paramm = (a)paramm;
    String str = paramm.tRa;
    ab.d("MicroMsg.WalletBrandUI", "req_key = ".concat(String.valueOf(str)));
    this.tos = str;
    PayInfo localPayInfo = new PayInfo();
    localPayInfo.czZ = str;
    localPayInfo.appId = WalletBrandUI.f(this.tRU);
    localPayInfo.tRb = paramm.tRb;
    localPayInfo.cIf = WalletBrandUI.h(this.tRU);
    localPayInfo.aIm = paramString;
    localPayInfo.cIb = this.tRU.getIntent().getIntExtra("pay_channel", 0);
    h.a(this.tRU, localPayInfo, 1);
    AppMethodBeat.o(48254);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.WalletBrandUI.c
 * JD-Core Version:    0.6.2
 */