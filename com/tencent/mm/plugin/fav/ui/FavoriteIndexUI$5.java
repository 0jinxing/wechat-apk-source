package com.tencent.mm.plugin.fav.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.a.i;
import com.tencent.mm.plugin.fav.ui.widget.b.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.List;

final class FavoriteIndexUI$5
  implements b.a
{
  FavoriteIndexUI$5(FavoriteIndexUI paramFavoriteIndexUI)
  {
  }

  public final void bvB()
  {
    AppMethodBeat.i(74226);
    h.a(this.mkH.mController.ylL, this.mkH.getString(2131299594), "", new FavoriteIndexUI.5.2(this), null);
    AppMethodBeat.o(74226);
  }

  public final void bvS()
  {
    AppMethodBeat.i(74225);
    if (!FavoriteIndexUI.a(FavoriteIndexUI.a(this.mkH).hk(false), this.mkH, new FavoriteIndexUI.5.1(this)))
      AppMethodBeat.o(74225);
    while (true)
    {
      return;
      FavoriteIndexUI.a(this.mkH, 4105);
      AppMethodBeat.o(74225);
    }
  }

  public final void bvT()
  {
    AppMethodBeat.i(74227);
    if (FavoriteIndexUI.a(this.mkH).bwb() <= 0)
      AppMethodBeat.o(74227);
    while (true)
    {
      return;
      Intent localIntent;
      if (FavoriteIndexUI.a(this.mkH).bwb() > 1)
      {
        localIntent = new Intent();
        localIntent.putExtra("key_fav_scene", 3);
        com.tencent.mm.plugin.fav.a.b.a(this.mkH.mController.ylL, ".ui.FavTagEditUI", localIntent, 4104);
        i.LK("FavTagEditUI");
        AppMethodBeat.o(74227);
      }
      else
      {
        g localg = (g)FavoriteIndexUI.a(this.mkH).hk(false).get(0);
        localIntent = new Intent();
        localIntent.putExtra("key_fav_scene", 3);
        localIntent.putExtra("key_fav_item_id", localg.field_localId);
        com.tencent.mm.plugin.fav.a.b.b(this.mkH.mController.ylL, ".ui.FavTagEditUI", localIntent);
        i.LK("FavTagEditUI");
        if (FavoriteIndexUI.a(this.mkH).mlh)
          FavoriteIndexUI.b(this.mkH);
        AppMethodBeat.o(74227);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.5
 * JD-Core Version:    0.6.2
 */