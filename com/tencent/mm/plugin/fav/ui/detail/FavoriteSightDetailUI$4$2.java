package com.tencent.mm.plugin.fav.ui.detail;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class FavoriteSightDetailUI$4$2
  implements n.d
{
  FavoriteSightDetailUI$4$2(FavoriteSightDetailUI.4 param4)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(74418);
    switch (paramMenuItem.getItemId())
    {
    case 1:
    default:
    case 0:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(74418);
      while (true)
      {
        return;
        com.tencent.mm.plugin.fav.a.h.j(FavoriteSightDetailUI.a(this.mmJ.mmH).field_localId, 1, 0);
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Select_Conv_Type", 3);
        paramMenuItem.putExtra("scene_from", 1);
        paramMenuItem.putExtra("mutil_select_is_ret", true);
        paramMenuItem.putExtra("select_fav_local_id", FavoriteSightDetailUI.a(this.mmJ.mmH).field_localId);
        d.b(this.mmJ.mmH.mController.ylL, ".ui.transmit.SelectConversationUI", paramMenuItem, 1);
        paramMenuItem = this.mmJ.mmH.mlz;
        paramMenuItem.meZ += 1;
        AppMethodBeat.o(74418);
        continue;
        com.tencent.mm.ui.base.h.a(this.mmJ.mmH.mController.ylL, this.mmJ.mmH.getString(2131296882), "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(74417);
            paramAnonymousDialogInterface = com.tencent.mm.ui.base.h.b(FavoriteSightDetailUI.4.2.this.mmJ.mmH.mController.ylL, FavoriteSightDetailUI.4.2.this.mmJ.mmH.getString(2131296882), false, null);
            b.a(FavoriteSightDetailUI.a(FavoriteSightDetailUI.4.2.this.mmJ.mmH).field_localId, new FavoriteSightDetailUI.4.2.1.1(this, paramAnonymousDialogInterface));
            AppMethodBeat.o(74417);
          }
        }
        , null);
        AppMethodBeat.o(74418);
        continue;
        paramMenuItem = this.mmJ.mmH.mlz;
        paramMenuItem.mfc += 1;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("key_fav_scene", 2);
        paramMenuItem.putExtra("key_fav_item_id", FavoriteSightDetailUI.a(this.mmJ.mmH).field_localId);
        b.b(this.mmJ.mmH.mController.ylL, ".ui.FavTagEditUI", paramMenuItem);
        AppMethodBeat.o(74418);
      }
      com.tencent.mm.plugin.fav.ui.g.a(this.mmJ.mmH, FavoriteSightDetailUI.k(this.mmJ.mmH), this.mmJ.mmH.mlz);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteSightDetailUI.4.2
 * JD-Core Version:    0.6.2
 */