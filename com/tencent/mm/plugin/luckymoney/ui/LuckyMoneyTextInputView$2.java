package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyTextInputView$2
  implements View.OnClickListener
{
  LuckyMoneyTextInputView$2(LuckyMoneyTextInputView paramLuckyMoneyTextInputView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43037);
    if (LuckyMoneyTextInputView.b(this.oib) != null)
      LuckyMoneyTextInputView.b(this.oib).onClick(paramView);
    AppMethodBeat.o(43037);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView.2
 * JD-Core Version:    0.6.2
 */