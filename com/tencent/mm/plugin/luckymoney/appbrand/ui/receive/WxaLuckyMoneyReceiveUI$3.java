package com.tencent.mm.plugin.luckymoney.appbrand.ui.receive;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxaLuckyMoneyReceiveUI$3
  implements View.OnClickListener
{
  WxaLuckyMoneyReceiveUI$3(WxaLuckyMoneyReceiveUI paramWxaLuckyMoneyReceiveUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42101);
    WxaLuckyMoneyReceiveUI.d(this.nTJ);
    this.nTJ.finish();
    AppMethodBeat.o(42101);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI.3
 * JD-Core Version:    0.6.2
 */