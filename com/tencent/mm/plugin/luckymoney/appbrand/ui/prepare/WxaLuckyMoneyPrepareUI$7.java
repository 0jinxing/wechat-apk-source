package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class WxaLuckyMoneyPrepareUI$7
  implements View.OnClickListener
{
  WxaLuckyMoneyPrepareUI$7(WxaLuckyMoneyPrepareUI paramWxaLuckyMoneyPrepareUI, int paramInt, EditText paramEditText)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42061);
    if ((!this.nTo.nTi.isShown()) && (!this.gnT))
    {
      this.nTo.nTi.setVisibility(0);
      this.nTo.mKeyboard.setInputEditText((EditText)paramView);
      WxaLuckyMoneyPrepareUI.b(this.nTo, this.gnX);
      AppMethodBeat.o(42061);
    }
    while (true)
    {
      return;
      if (this.gnT)
      {
        this.nTo.nTi.setVisibility(8);
        ((InputMethodManager)this.nTo.mController.ylL.getSystemService("input_method")).showSoftInput(this.gnV, 0);
      }
      AppMethodBeat.o(42061);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.7
 * JD-Core Version:    0.6.2
 */