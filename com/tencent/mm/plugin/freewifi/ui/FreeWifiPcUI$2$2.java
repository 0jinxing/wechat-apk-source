package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.plugin.freewifi.k;
import com.tencent.mm.plugin.freewifi.k.a;
import com.tencent.mm.plugin.freewifi.k.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class FreeWifiPcUI$2$2
  implements f
{
  FreeWifiPcUI$2$2(FreeWifiPcUI.2 param2, ap paramap)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(21063);
    this.mzY.stopTimer();
    if ((paramInt1 == 0) && (paramInt2 == 0))
      this.mzW.mzV.finish();
    while (true)
    {
      paramString = k.byo();
      paramString.muc = String.valueOf(FreeWifiPcUI.e(this.mzW.mzV));
      paramString.mud = FreeWifiPcUI.d(this.mzW.mzV);
      paramString.kBq = FreeWifiPcUI.c(this.mzW.mzV);
      paramString.muf = k.b.muN.muQ;
      paramString.mug = k.b.muN.name;
      paramString.result = paramInt2;
      paramString.byq().byp();
      ab.i("MicroMsg.FreeWifi.FreeWifiPcUI", "sessionKey=%s, step=%d, method=setOnClickListener, desc=NetSceneSetPcLoginUserInfo returns.shopid=%d, appid=%s, ticket=%s", new Object[] { com.tencent.mm.plugin.freewifi.m.V(this.mzW.mzV.getIntent()), Integer.valueOf(com.tencent.mm.plugin.freewifi.m.W(this.mzW.mzV.getIntent())), Integer.valueOf(FreeWifiPcUI.e(this.mzW.mzV)), FreeWifiPcUI.d(this.mzW.mzV), FreeWifiPcUI.c(this.mzW.mzV) });
      AppMethodBeat.o(21063);
      return;
      if ((com.tencent.mm.plugin.freewifi.m.eh(paramInt1, paramInt2)) && (!com.tencent.mm.plugin.freewifi.m.isEmpty(paramString)))
        FreeWifiPcUI.a(this.mzW.mzV, paramString + "(" + com.tencent.mm.plugin.freewifi.m.a(com.tencent.mm.plugin.freewifi.m.X(this.mzW.mzV.getIntent()), k.b.muN, paramInt2) + ")", "");
      else
        FreeWifiPcUI.a(this.mzW.mzV, this.mzW.mzV.getString(2131300046), this.mzW.mzV.getString(2131300047));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiPcUI.2.2
 * JD-Core Version:    0.6.2
 */