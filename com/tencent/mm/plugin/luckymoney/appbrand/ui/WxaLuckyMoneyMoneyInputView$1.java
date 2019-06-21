package com.tencent.mm.plugin.luckymoney.appbrand.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.ui.g;

final class WxaLuckyMoneyMoneyInputView$1
  implements TextWatcher
{
  WxaLuckyMoneyMoneyInputView$1(WxaLuckyMoneyMoneyInputView paramWxaLuckyMoneyMoneyInputView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(42003);
    if (WxaLuckyMoneyMoneyInputView.a(this.nSw) != null)
    {
      paramEditable = WxaLuckyMoneyMoneyInputView.a(this.nSw);
      this.nSw.getInputViewId();
      paramEditable.bLa();
    }
    AppMethodBeat.o(42003);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView.1
 * JD-Core Version:    0.6.2
 */