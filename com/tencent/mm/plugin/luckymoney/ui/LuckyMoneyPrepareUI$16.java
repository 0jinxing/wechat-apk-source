package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyPrepareUI$16
  implements View.OnFocusChangeListener
{
  LuckyMoneyPrepareUI$16(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI, EditText paramEditText1, EditText paramEditText2)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(42956);
    this.gnV.setOnClickListener(null);
    this.nTp.setOnClickListener(null);
    this.ohI.V(LuckyMoneyPrepareUI.c(this.ohI), 2);
    this.ohI.V(LuckyMoneyPrepareUI.b(this.ohI), 0);
    AppMethodBeat.o(42956);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.16
 * JD-Core Version:    0.6.2
 */