package com.tencent.mm.plugin.fav.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.i;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import java.util.LinkedList;
import java.util.List;

final class FavoriteIndexUI$22
  implements n.d
{
  FavoriteIndexUI$22(FavoriteIndexUI paramFavoriteIndexUI, int paramInt)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(74249);
    switch (FavoriteIndexUI.d(this.mkH))
    {
    default:
      AppMethodBeat.o(74249);
    case 0:
    }
    while (true)
    {
      return;
      if (paramMenuItem != null)
        break;
      AppMethodBeat.o(74249);
    }
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(74249);
      break;
      if (this.sN < this.mkH.mhs.getHeaderViewsCount())
      {
        AppMethodBeat.o(74249);
        break;
      }
      ab.i("MicroMsg.FavoriteIndexUI", "do delete, long click info is %s", new Object[] { Integer.valueOf(this.sN) });
      com.tencent.mm.plugin.fav.a.b.i(FavoriteIndexUI.a(this.mkH).vE(this.sN - this.mkH.mhs.getHeaderViewsCount() - 1));
      AppMethodBeat.o(74249);
      break;
      FavoriteIndexUI.a(this.mkH, bo.anT());
      ab.i("MicroMsg.FavoriteIndexUI", "do edit, long click info is %s", new Object[] { Integer.valueOf(this.sN) });
      FavoriteIndexUI.a(this.mkH, FavoriteIndexUI.a(this.mkH).vE(this.sN - this.mkH.mhs.getHeaderViewsCount() - 1));
      FavoriteIndexUI.b(this.mkH, FavoriteIndexUI.e(this.mkH));
      AppMethodBeat.o(74249);
      break;
      ab.i("MicroMsg.FavoriteIndexUI", "do tag, long click info is %s", new Object[] { Integer.valueOf(this.sN) });
      com.tencent.mm.plugin.fav.a.g localg = FavoriteIndexUI.a(this.mkH).vE(this.sN - this.mkH.mhs.getHeaderViewsCount() - 1);
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("key_fav_scene", 4);
      paramMenuItem.putExtra("key_fav_item_id", localg.field_localId);
      com.tencent.mm.plugin.fav.a.b.b(this.mkH.mController.ylL, ".ui.FavTagEditUI", paramMenuItem);
      i.LK("FavTagEditUI");
      AppMethodBeat.o(74249);
      break;
      FavoriteIndexUI.a(this.mkH, bo.anT());
      ab.i("MicroMsg.FavoriteIndexUI", "do transmit, long click info is %s", new Object[] { Integer.valueOf(this.sN) });
      FavoriteIndexUI.c(this.mkH, FavoriteIndexUI.a(this.mkH).vE(this.sN - this.mkH.mhs.getHeaderViewsCount() - 1));
      FavoriteIndexUI.c(this.mkH, FavoriteIndexUI.f(this.mkH).buB());
      if (FavoriteIndexUI.f(this.mkH) == null)
      {
        AppMethodBeat.o(74249);
        break;
      }
      paramMenuItem = new LinkedList();
      paramMenuItem.add(FavoriteIndexUI.f(this.mkH));
      if (!FavoriteIndexUI.a(paramMenuItem, this.mkH, new FavoriteIndexUI.22.1(this)))
      {
        AppMethodBeat.o(74249);
        break;
      }
      FavoriteIndexUI.a(this.mkH, 4106);
      AppMethodBeat.o(74249);
      break;
      localg = FavoriteIndexUI.a(this.mkH).vE(this.sN - this.mkH.mhs.getHeaderViewsCount() - 1);
      paramMenuItem = new abh();
      paramMenuItem.cOi = 1;
      ((y)com.tencent.mm.kernel.g.K(y.class)).a(this.mkH.mController.ylL, localg, paramMenuItem);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.22
 * JD-Core Version:    0.6.2
 */