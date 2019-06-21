package com.tencent.mm.plugin.luckymoney.sns;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsLuckyMoneyPrepareUI$13
  implements View.OnClickListener
{
  SnsLuckyMoneyPrepareUI$13(SnsLuckyMoneyPrepareUI paramSnsLuckyMoneyPrepareUI, int paramInt, EditText paramEditText)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42522);
    if ((!this.obN.nTi.isShown()) && (!this.gnT))
    {
      SnsLuckyMoneyPrepareUI.k(this.obN);
      SnsLuckyMoneyPrepareUI.b(this.obN, this.gnX);
      AppMethodBeat.o(42522);
    }
    while (true)
    {
      return;
      if (this.gnT)
      {
        this.obN.aoB();
        ((InputMethodManager)this.obN.mController.ylL.getSystemService("input_method")).showSoftInput(this.gnV, 0);
      }
      AppMethodBeat.o(42522);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.13
 * JD-Core Version:    0.6.2
 */