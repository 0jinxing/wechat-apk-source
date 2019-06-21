package com.tencent.mm.plugin.luckymoney.appbrand.ui.view;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.ui.g;

final class WxaLuckyMoneyTextInputView$1
  implements View.OnFocusChangeListener
{
  WxaLuckyMoneyTextInputView$1(WxaLuckyMoneyTextInputView paramWxaLuckyMoneyTextInputView)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(42135);
    if (WxaLuckyMoneyTextInputView.a(this.nTQ) != null)
    {
      paramView = WxaLuckyMoneyTextInputView.a(this.nTQ);
      this.nTQ.getInputViewId();
      paramView.bLa();
    }
    AppMethodBeat.o(42135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.view.WxaLuckyMoneyTextInputView.1
 * JD-Core Version:    0.6.2
 */