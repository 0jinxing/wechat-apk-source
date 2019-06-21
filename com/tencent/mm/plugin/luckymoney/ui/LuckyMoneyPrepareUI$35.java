package com.tencent.mm.plugin.luckymoney.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class LuckyMoneyPrepareUI$35
  implements View.OnClickListener
{
  LuckyMoneyPrepareUI$35(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI, int paramInt, EditText paramEditText)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42984);
    if ((!this.ohI.nTi.isShown()) && (!this.gnT))
    {
      this.ohI.nTi.setVisibility(0);
      this.ohI.mKeyboard.setInputEditText((EditText)paramView);
      LuckyMoneyPrepareUI.c(this.ohI, this.gnX);
      AppMethodBeat.o(42984);
    }
    while (true)
    {
      return;
      if (this.gnT)
      {
        this.ohI.nTi.setVisibility(8);
        LuckyMoneyPrepareUI.F(this.ohI).setVisibility(0);
        ((InputMethodManager)this.ohI.mController.ylL.getSystemService("input_method")).showSoftInput(this.gnV, 0);
      }
      AppMethodBeat.o(42984);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.35
 * JD-Core Version:    0.6.2
 */