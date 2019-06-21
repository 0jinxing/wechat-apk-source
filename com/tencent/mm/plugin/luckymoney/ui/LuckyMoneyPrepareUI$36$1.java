package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class LuckyMoneyPrepareUI$36$1
  implements Runnable
{
  LuckyMoneyPrepareUI$36$1(LuckyMoneyPrepareUI.36 param36)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42985);
    this.ohR.ohI.nTi.setVisibility(0);
    this.ohR.gnW.requestFocus();
    if (this.ohR.ohI.mKeyboard != null)
      this.ohR.ohI.mKeyboard.setInputEditText(this.ohR.gnV);
    LuckyMoneyPrepareUI.c(this.ohR.ohI, this.ohR.gnX);
    AppMethodBeat.o(42985);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.36.1
 * JD-Core Version:    0.6.2
 */