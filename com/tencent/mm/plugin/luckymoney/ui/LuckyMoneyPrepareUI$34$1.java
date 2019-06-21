package com.tencent.mm.plugin.luckymoney.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class LuckyMoneyPrepareUI$34$1
  implements Runnable
{
  LuckyMoneyPrepareUI$34$1(LuckyMoneyPrepareUI.34 param34, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42981);
    if ((!this.ohQ.ohI.nTi.isShown()) && (this.val$view.isShown()))
    {
      this.ohQ.ohI.nTi.setVisibility(0);
      LuckyMoneyPrepareUI.F(this.ohQ.ohI).setVisibility(8);
    }
    LuckyMoneyPrepareUI.c(this.ohQ.ohI, this.ohQ.gnX);
    this.ohQ.ohI.mKeyboard.setInputEditText((EditText)this.val$view);
    ((InputMethodManager)this.ohQ.ohI.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(this.val$view.getWindowToken(), 0);
    AppMethodBeat.o(42981);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.34.1
 * JD-Core Version:    0.6.2
 */