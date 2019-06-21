package com.tencent.mm.plugin.luckymoney.ui;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.scaledLayout.c;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyPickEnvelopeUI$9 extends RecyclerView.m
{
  LuckyMoneyPickEnvelopeUI$9(LuckyMoneyPickEnvelopeUI paramLuckyMoneyPickEnvelopeUI)
  {
  }

  public final void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(42910);
    super.a(paramRecyclerView, paramInt1, paramInt2);
    paramInt1 = LuckyMoneyPickEnvelopeUI.c(this.ogX).iS();
    ab.v("MicroMsg.LuckyMoneyPickEnvelopeUI", "scroll last vispos: %s", new Object[] { Integer.valueOf(paramInt1) });
    if ((!LuckyMoneyPickEnvelopeUI.f(this.ogX)) && (LuckyMoneyPickEnvelopeUI.g(this.ogX) == 1) && (paramInt1 == LuckyMoneyPickEnvelopeUI.h(this.ogX).getItemCount() - 1))
    {
      ab.d("MicroMsg.LuckyMoneyPickEnvelopeUI", "trigger load more: %s", new Object[] { Integer.valueOf(paramInt1) });
      LuckyMoneyPickEnvelopeUI.i(this.ogX);
    }
    AppMethodBeat.o(42910);
  }

  public final void c(RecyclerView paramRecyclerView, int paramInt)
  {
    AppMethodBeat.i(42909);
    super.c(paramRecyclerView, paramInt);
    AppMethodBeat.o(42909);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.9
 * JD-Core Version:    0.6.2
 */