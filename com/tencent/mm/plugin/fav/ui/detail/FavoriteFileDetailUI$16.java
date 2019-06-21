package com.tencent.mm.plugin.fav.ui.detail;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class FavoriteFileDetailUI$16
  implements MenuItem.OnMenuItemClickListener
{
  FavoriteFileDetailUI$16(FavoriteFileDetailUI paramFavoriteFileDetailUI, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    boolean bool = false;
    AppMethodBeat.i(74343);
    if (this.mmc)
    {
      FavoriteFileDetailUI.j(this.mlX);
      if ((!k.h(FavoriteFileDetailUI.a(this.mlX))) && (FavoriteFileDetailUI.a(this.mlX).whh == 0));
    }
    else if (!this.mmd)
    {
      AppMethodBeat.o(74343);
    }
    while (true)
    {
      return bool;
      paramMenuItem = new d(this.mlX.mController.ylL, 1, false);
      paramMenuItem.rBl = new FavoriteFileDetailUI.16.1(this);
      paramMenuItem.rBm = new FavoriteFileDetailUI.16.2(this);
      paramMenuItem.cpD();
      AppMethodBeat.o(74343);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.16
 * JD-Core Version:    0.6.2
 */