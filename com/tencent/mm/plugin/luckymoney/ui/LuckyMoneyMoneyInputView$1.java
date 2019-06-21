package com.tencent.mm.plugin.luckymoney.ui;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyMoneyInputView$1
  implements TextWatcher
{
  LuckyMoneyMoneyInputView$1(LuckyMoneyMoneyInputView paramLuckyMoneyMoneyInputView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    AppMethodBeat.i(42739);
    if (LuckyMoneyMoneyInputView.a(this.oeP) != null)
    {
      paramEditable = LuckyMoneyMoneyInputView.a(this.oeP);
      this.oeP.getInputViewId();
      paramEditable.bLa();
    }
    AppMethodBeat.o(42739);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView.1
 * JD-Core Version:    0.6.2
 */