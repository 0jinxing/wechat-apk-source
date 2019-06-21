package com.tencent.mm.plugin.luckymoney.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyPrepareUI$34$2
  implements Runnable
{
  LuckyMoneyPrepareUI$34$2(LuckyMoneyPrepareUI.34 param34)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42982);
    LuckyMoneyPrepareUI.F(this.ohQ.ohI).setVisibility(0);
    this.ohQ.ohI.aoB();
    ((InputMethodManager)this.ohQ.ohI.mController.ylL.getSystemService("input_method")).showSoftInput(this.ohQ.gnV, 0);
    AppMethodBeat.o(42982);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.34.2
 * JD-Core Version:    0.6.2
 */