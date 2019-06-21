package com.tencent.mm.plugin.fav.ui.detail;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class FavoriteImgDetailUI$3$2
  implements n.d
{
  FavoriteImgDetailUI$3$2(FavoriteImgDetailUI.3 param3)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(74380);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(74380);
      while (true)
      {
        return;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("key_fav_scene", 2);
        paramMenuItem.putExtra("key_fav_item_id", FavoriteImgDetailUI.b(this.mmp.mmn).field_localId);
        b.b(this.mmp.mmn.mController.ylL, ".ui.FavTagEditUI", paramMenuItem);
        paramMenuItem = this.mmp.mmn.mlz;
        paramMenuItem.mfc += 1;
        AppMethodBeat.o(74380);
        continue;
        com.tencent.mm.ui.base.h.a(this.mmp.mmn.mController.ylL, this.mmp.mmn.getString(2131296882), "", new FavoriteImgDetailUI.3.2.1(this), null);
        AppMethodBeat.o(74380);
        continue;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Select_Conv_Type", 3);
        paramMenuItem.putExtra("scene_from", 1);
        paramMenuItem.putExtra("mutil_select_is_ret", true);
        paramMenuItem.putExtra("select_fav_local_id", FavoriteImgDetailUI.b(this.mmp.mmn).field_localId);
        d.b(this.mmp.mmn, ".ui.transmit.SelectConversationUI", paramMenuItem, 1);
        com.tencent.mm.plugin.fav.a.h.j(FavoriteImgDetailUI.b(this.mmp.mmn).field_localId, 1, 0);
        paramMenuItem = this.mmp.mmn.mlz;
        paramMenuItem.meZ += 1;
        AppMethodBeat.o(74380);
      }
      com.tencent.mm.plugin.fav.ui.g.a(this.mmp.mmn, this.mmp.mmo, this.mmp.mmn.mlz);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.3.2
 * JD-Core Version:    0.6.2
 */