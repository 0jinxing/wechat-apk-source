package com.tencent.mm.plugin.fav.ui.detail;

import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.d;

final class FavoriteImgDetailUI$3
  implements MenuItem.OnMenuItemClickListener
{
  FavoriteImgDetailUI$3(FavoriteImgDetailUI paramFavoriteImgDetailUI, long paramLong)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(74381);
    paramMenuItem = new d(this.mmn.mController.ylL, 1, false);
    paramMenuItem.rBl = new n.c()
    {
      public final void a(l paramAnonymousl)
      {
        AppMethodBeat.i(74377);
        if (FavoriteImgDetailUI.a(FavoriteImgDetailUI.3.this.mmn))
          paramAnonymousl.e(2, FavoriteImgDetailUI.3.this.mmn.getString(2131299734));
        paramAnonymousl.e(3, FavoriteImgDetailUI.3.this.mmn.getString(2131299722));
        paramAnonymousl.e(0, FavoriteImgDetailUI.3.this.mmn.getString(2131299612));
        paramAnonymousl.e(1, FavoriteImgDetailUI.3.this.mmn.mController.ylL.getString(2131296881));
        AppMethodBeat.o(74377);
      }
    };
    paramMenuItem.rBm = new FavoriteImgDetailUI.3.2(this);
    paramMenuItem.cpD();
    AppMethodBeat.o(74381);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.3
 * JD-Core Version:    0.6.2
 */