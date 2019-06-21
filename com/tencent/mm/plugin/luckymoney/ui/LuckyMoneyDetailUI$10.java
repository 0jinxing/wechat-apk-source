package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.y;

final class LuckyMoneyDetailUI$10
  implements View.OnClickListener
{
  LuckyMoneyDetailUI$10(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42656);
    LuckyMoneyDetailUI.a(this.oeA, new y());
    LuckyMoneyDetailUI.w(this.oeA).cVT = 7L;
    LuckyMoneyDetailUI.w(this.oeA).ajK();
    LuckyMoneyDetailUI.B(this.oeA);
    AppMethodBeat.o(42656);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.10
 * JD-Core Version:    0.6.2
 */