package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.ab;

final class FreewifiActivateWeChatNoAuthStateUI$1
  implements f
{
  FreewifiActivateWeChatNoAuthStateUI$1(FreewifiActivateWeChatNoAuthStateUI paramFreewifiActivateWeChatNoAuthStateUI)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(21111);
    aw.Rg().b(640, this);
    ab.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "onSceneEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "check ap ok");
      d.a(this.mAu.ssid, 2, this.mAu.getIntent());
      AppMethodBeat.o(21111);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.FreeWifi.FreewifiActivateWeChatNoAuthStateUI", "check ap failed ： rssi is :  %d, mac : %s, ssid is : %s", new Object[] { Integer.valueOf(FreewifiActivateWeChatNoAuthStateUI.a(this.mAu)), FreewifiActivateWeChatNoAuthStateUI.b(this.mAu), FreewifiActivateWeChatNoAuthStateUI.c(this.mAu) });
      this.mAu.uQ(-2014);
      d.MF(FreewifiActivateWeChatNoAuthStateUI.c(this.mAu));
      AppMethodBeat.o(21111);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreewifiActivateWeChatNoAuthStateUI.1
 * JD-Core Version:    0.6.2
 */