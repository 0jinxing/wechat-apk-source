package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class WxaLuckyMoneyPrepareUI$8
  implements View.OnClickListener
{
  WxaLuckyMoneyPrepareUI$8(WxaLuckyMoneyPrepareUI paramWxaLuckyMoneyPrepareUI, EditText paramEditText, View paramView, int paramInt)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42063);
    if ((this.nTo.nTi.isShown()) && (!this.gnT))
    {
      if (this.nTo.mKeyboard == null)
        break label178;
      this.nTo.mKeyboard.setInputEditText(this.gnV);
      AppMethodBeat.o(42063);
    }
    while (true)
    {
      return;
      if ((!this.nTo.nTi.isShown()) && (!this.gnT))
      {
        ((InputMethodManager)this.nTo.mController.ylL.getSystemService("input_method")).hideSoftInputFromWindow(paramView.getWindowToken(), 0);
        new ak().postDelayed(new WxaLuckyMoneyPrepareUI.8.1(this), 200L);
        AppMethodBeat.o(42063);
      }
      else
      {
        if (this.gnT)
        {
          this.nTo.nTi.setVisibility(8);
          ((InputMethodManager)this.nTo.mController.ylL.getSystemService("input_method")).showSoftInput(this.gnV, 0);
        }
        label178: AppMethodBeat.o(42063);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.8
 * JD-Core Version:    0.6.2
 */