package com.tencent.mm.plugin.luckymoney.sns;

import android.support.v7.app.AppCompatActivity;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsLuckyMoneyPrepareUI$10$2
  implements Runnable
{
  SnsLuckyMoneyPrepareUI$10$2(SnsLuckyMoneyPrepareUI.10 param10)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42518);
    this.obQ.obN.aoB();
    ((InputMethodManager)this.obQ.obN.mController.ylL.getSystemService("input_method")).showSoftInput(this.obQ.gnV, 0);
    AppMethodBeat.o(42518);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.10.2
 * JD-Core Version:    0.6.2
 */