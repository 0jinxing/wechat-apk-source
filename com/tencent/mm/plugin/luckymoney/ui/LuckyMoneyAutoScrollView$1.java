package com.tencent.mm.plugin.luckymoney.ui;

import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyAutoScrollView$1
  implements Runnable
{
  LuckyMoneyAutoScrollView$1(LuckyMoneyAutoScrollView paramLuckyMoneyAutoScrollView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42568);
    LuckyMoneyAutoScrollView.a(this.ocy).setVisibility(0);
    LuckyMoneyAutoScrollView.b(this.ocy).setVisibility(0);
    LuckyMoneyAutoScrollView.c(this.ocy).setVisibility(0);
    LuckyMoneyAutoScrollView.d(this.ocy).bMm();
    LuckyMoneyAutoScrollView.e(this.ocy).bMm();
    LuckyMoneyAutoScrollView.f(this.ocy).bMm();
    AppMethodBeat.o(42568);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView.1
 * JD-Core Version:    0.6.2
 */