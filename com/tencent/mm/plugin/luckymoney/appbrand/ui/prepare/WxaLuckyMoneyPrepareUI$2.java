package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tenpay.android.wechat.MyKeyboardWindow;

final class WxaLuckyMoneyPrepareUI$2
  implements View.OnClickListener
{
  WxaLuckyMoneyPrepareUI$2(WxaLuckyMoneyPrepareUI paramWxaLuckyMoneyPrepareUI, EditText paramEditText1, EditText paramEditText2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42054);
    this.gnV.setOnClickListener(null);
    this.nTp.setOnClickListener(null);
    this.nTo.V(WxaLuckyMoneyPrepareUI.b(this.nTo), 2);
    this.nTo.V(WxaLuckyMoneyPrepareUI.c(this.nTo), 0);
    this.nTo.mKeyboard.setXMode(2);
    this.nTo.mKeyboard.setInputEditText((EditText)paramView);
    this.nTo.nTi.setVisibility(0);
    AppMethodBeat.o(42054);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.2
 * JD-Core Version:    0.6.2
 */