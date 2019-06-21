package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.support.v7.app.AppCompatActivity;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class WxaLuckyMoneyPrepareUI$6$2
  implements Runnable
{
  WxaLuckyMoneyPrepareUI$6$2(WxaLuckyMoneyPrepareUI.6 param6)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42059);
    this.nTq.nTo.aoB();
    ((InputMethodManager)this.nTq.nTo.mController.ylL.getSystemService("input_method")).showSoftInput(this.nTq.gnV, 0);
    AppMethodBeat.o(42059);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.6.2
 * JD-Core Version:    0.6.2
 */