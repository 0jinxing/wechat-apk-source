package com.tencent.mm.plugin.card.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class CardListSelectedUI$4
  implements AbsListView.OnScrollListener
{
  CardListSelectedUI$4(CardListSelectedUI paramCardListSelectedUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(88558);
    if ((paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1) && (!this.kmz.eTf))
    {
      ab.d("MicroMsg.CardListSelectedUI", "onScroll() >> doGetCardList()");
      CardListSelectedUI.e(this.kmz);
    }
    AppMethodBeat.o(88558);
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardListSelectedUI.4
 * JD-Core Version:    0.6.2
 */