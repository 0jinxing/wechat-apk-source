package com.tencent.mm.plugin.luckymoney.appbrand.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxaLuckyMoneyBaseUI$1
  implements Runnable
{
  WxaLuckyMoneyBaseUI$1(WxaLuckyMoneyBaseUI paramWxaLuckyMoneyBaseUI, Class paramClass, Intent paramIntent, d.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42002);
    this.nSn.a(this.gQV, this.nSl, this.nSm);
    AppMethodBeat.o(42002);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI.1
 * JD-Core Version:    0.6.2
 */