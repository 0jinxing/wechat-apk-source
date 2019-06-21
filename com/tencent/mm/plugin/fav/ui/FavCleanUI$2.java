package com.tencent.mm.plugin.fav.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FavCleanUI$2
  implements AbsListView.OnScrollListener
{
  FavCleanUI$2(FavCleanUI paramFavCleanUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(73950);
    if ((paramInt == 0) && (FavCleanUI.a(this.mhW)))
    {
      ab.i("MicroMsg.FavCleanUI", "force bottom load data");
      FavCleanUI.b(this.mhW);
    }
    AppMethodBeat.o(73950);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavCleanUI.2
 * JD-Core Version:    0.6.2
 */