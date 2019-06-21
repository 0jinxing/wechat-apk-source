package com.tencent.mm.plugin.luckymoney.ui;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyAutoScrollView$2
  implements Runnable
{
  LuckyMoneyAutoScrollView$2(LuckyMoneyAutoScrollView paramLuckyMoneyAutoScrollView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42569);
    LuckyMoneyAutoScrollView.a(this.ocy).setVisibility(8);
    LuckyMoneyAutoScrollView.b(this.ocy).setVisibility(8);
    LuckyMoneyAutoScrollView.c(this.ocy).setVisibility(8);
    LuckyMoneyAutoScrollView.d(this.ocy).setVisibility(8);
    LuckyMoneyAutoScrollView.e(this.ocy).setVisibility(8);
    LuckyMoneyAutoScrollView.f(this.ocy).setVisibility(8);
    LuckyMoneyAutoScrollView.g(this.ocy).setVisibility(0);
    LuckyMoneyAutoScrollView.h(this.ocy).setVisibility(0);
    LuckyMoneyAutoScrollView.i(this.ocy).setVisibility(0);
    if (LuckyMoneyAutoScrollView.j(this.ocy) != null)
      LuckyMoneyAutoScrollView.j(this.ocy).bMo();
    AppMethodBeat.o(42569);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyAutoScrollView.2
 * JD-Core Version:    0.6.2
 */