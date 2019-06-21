package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class WxaLuckyMoneyPrepareUI$8$1
  implements Runnable
{
  WxaLuckyMoneyPrepareUI$8$1(WxaLuckyMoneyPrepareUI.8 param8)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42062);
    this.nTr.nTo.nTi.setVisibility(0);
    this.nTr.gnW.requestFocus();
    if (this.nTr.nTo.mKeyboard != null)
      this.nTr.nTo.mKeyboard.setInputEditText(this.nTr.gnV);
    WxaLuckyMoneyPrepareUI.b(this.nTr.nTo, this.nTr.gnX);
    AppMethodBeat.o(42062);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.8.1
 * JD-Core Version:    0.6.2
 */