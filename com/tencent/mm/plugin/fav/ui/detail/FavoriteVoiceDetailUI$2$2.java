package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class FavoriteVoiceDetailUI$2$2
  implements n.d
{
  FavoriteVoiceDetailUI$2$2(FavoriteVoiceDetailUI.2 param2)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(74482);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(74482);
      while (true)
      {
        return;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("key_fav_scene", 2);
        paramMenuItem.putExtra("key_fav_item_id", FavoriteVoiceDetailUI.a(this.mnk.mnj).field_localId);
        b.b(this.mnk.mnj.mController.ylL, ".ui.FavTagEditUI", paramMenuItem);
        paramMenuItem = this.mnk.mnj.mlz;
        paramMenuItem.mfc += 1;
        AppMethodBeat.o(74482);
        continue;
        h.a(this.mnk.mnj.mController.ylL, this.mnk.mnj.getString(2131296882), "", new FavoriteVoiceDetailUI.2.2.1(this), null);
        AppMethodBeat.o(74482);
      }
      com.tencent.mm.plugin.fav.ui.g.a(this.mnk.mnj, FavoriteVoiceDetailUI.b(this.mnk.mnj), this.mnk.mnj.mlz);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI.2.2
 * JD-Core Version:    0.6.2
 */