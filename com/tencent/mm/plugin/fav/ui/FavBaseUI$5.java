package com.tencent.mm.plugin.fav.ui;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class FavBaseUI$5
  implements AbsListView.OnScrollListener
{
  FavBaseUI$5(FavBaseUI paramFavBaseUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(73930);
    if (paramInt == 0)
      if (((ae)g.M(ae.class)).getFavItemInfoStorage().t(this.mhG.bvu().bvV(), this.mhG.bvu().getType()))
      {
        ab.v("MicroMsg.FavoriteBaseUI", "has shown all, do not load data");
        AppMethodBeat.o(73930);
      }
    while (true)
    {
      return;
      if (FavBaseUI.a(this.mhG))
      {
        ab.i("MicroMsg.FavoriteBaseUI", "force bottom load data");
        FavBaseUI.b(this.mhG);
      }
      AppMethodBeat.o(73930);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavBaseUI.5
 * JD-Core Version:    0.6.2
 */