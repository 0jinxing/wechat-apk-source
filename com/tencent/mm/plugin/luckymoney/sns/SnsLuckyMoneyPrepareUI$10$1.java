package com.tencent.mm.plugin.luckymoney.sns;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class SnsLuckyMoneyPrepareUI$10$1
  implements Runnable
{
  SnsLuckyMoneyPrepareUI$10$1(SnsLuckyMoneyPrepareUI.10 param10, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42517);
    if ((!this.obQ.obN.nTi.isShown()) && (this.val$view.isShown()))
      SnsLuckyMoneyPrepareUI.k(this.obQ.obN);
    SnsLuckyMoneyPrepareUI.b(this.obQ.obN, this.obQ.gnX);
    this.obQ.obN.mKeyboard.setInputEditText((EditText)this.val$view);
    ((InputMethodManager)this.obQ.obN.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(this.val$view.getWindowToken(), 0);
    AppMethodBeat.o(42517);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.10.1
 * JD-Core Version:    0.6.2
 */