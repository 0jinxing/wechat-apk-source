package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class WxaLuckyMoneyPrepareUI$6$1
  implements Runnable
{
  WxaLuckyMoneyPrepareUI$6$1(WxaLuckyMoneyPrepareUI.6 param6, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42058);
    if ((!this.nTq.nTo.nTi.isShown()) && (this.val$view.isShown()))
      this.nTq.nTo.nTi.setVisibility(0);
    WxaLuckyMoneyPrepareUI.b(this.nTq.nTo, this.nTq.gnX);
    this.nTq.nTo.mKeyboard.setInputEditText((EditText)this.val$view);
    ((InputMethodManager)this.nTq.nTo.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(this.val$view.getWindowToken(), 0);
    AppMethodBeat.o(42058);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.6.1
 * JD-Core Version:    0.6.2
 */