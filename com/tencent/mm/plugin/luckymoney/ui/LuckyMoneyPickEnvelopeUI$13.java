package com.tencent.mm.plugin.luckymoney.ui;

import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager;
import com.tencent.mm.plugin.luckymoney.scaledLayout.c;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyPickEnvelopeUI$13
  implements Runnable
{
  LuckyMoneyPickEnvelopeUI$13(LuckyMoneyPickEnvelopeUI paramLuckyMoneyPickEnvelopeUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42913);
    LuckyMoneyEnvelopeTouchRecyclerView localLuckyMoneyEnvelopeTouchRecyclerView;
    int i;
    if ((LuckyMoneyPickEnvelopeUI.a(this.ogX) >= 0) && (LuckyMoneyPickEnvelopeUI.a(this.ogX) < LuckyMoneyPickEnvelopeUI.h(this.ogX).getItemCount()))
    {
      ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "scroll to pos: %s", new Object[] { Integer.valueOf(LuckyMoneyPickEnvelopeUI.a(this.ogX)) });
      localLuckyMoneyEnvelopeTouchRecyclerView = LuckyMoneyPickEnvelopeUI.m(this.ogX);
      c localc = LuckyMoneyPickEnvelopeUI.c(this.ogX);
      i = localc.qY(LuckyMoneyPickEnvelopeUI.a(this.ogX));
      if (localc.mOrientation == 1)
      {
        localLuckyMoneyEnvelopeTouchRecyclerView.scrollBy(0, i);
        AppMethodBeat.o(42913);
      }
    }
    while (true)
    {
      return;
      localLuckyMoneyEnvelopeTouchRecyclerView.scrollBy(i, 0);
      AppMethodBeat.o(42913);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.13
 * JD-Core Version:    0.6.2
 */