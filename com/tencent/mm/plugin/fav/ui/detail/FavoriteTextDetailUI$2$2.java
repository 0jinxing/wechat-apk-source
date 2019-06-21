package com.tencent.mm.plugin.fav.ui.detail;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class FavoriteTextDetailUI$2$2
  implements n.d
{
  FavoriteTextDetailUI$2$2(FavoriteTextDetailUI.2 param2)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(74441);
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
      AppMethodBeat.o(74441);
      while (true)
      {
        return;
        if ((FavoriteTextDetailUI.a(this.mmS.mmR) == null) || (FavoriteTextDetailUI.a(this.mmS.mmR).field_favProto == null))
          break;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("key_value", FavoriteTextDetailUI.a(this.mmS.mmR).field_favProto.desc);
        paramMenuItem.putExtra("key_max_count", FavoriteTextDetailUI.access$100());
        paramMenuItem.putExtra("key_show_confirm", true);
        paramMenuItem.putExtra("key_fav_item_id", FavoriteTextDetailUI.a(this.mmS.mmR).field_id);
        b.a(this.mmS.mmR, ".ui.FavTextEditUI", paramMenuItem, 1);
        paramMenuItem = this.mmS.mmR.mlz;
        paramMenuItem.mfb += 1;
        AppMethodBeat.o(74441);
        continue;
        com.tencent.mm.plugin.fav.ui.g.a(this.mmS.mmR, FavoriteTextDetailUI.b(this.mmS.mmR), this.mmS.mmR.mlz);
        AppMethodBeat.o(74441);
        continue;
        if ((FavoriteTextDetailUI.a(this.mmS.mmR) == null) || (FavoriteTextDetailUI.a(this.mmS.mmR).field_favProto == null))
          break;
        paramMenuItem = this.mmS.mmR.mlz;
        paramMenuItem.meZ += 1;
        b.e(FavoriteTextDetailUI.a(this.mmS.mmR).field_favProto.desc, this.mmS.mmR);
        com.tencent.mm.plugin.fav.a.h.j(FavoriteTextDetailUI.a(this.mmS.mmR).field_localId, 1, 0);
        AppMethodBeat.o(74441);
        continue;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("key_fav_scene", 2);
        paramMenuItem.putExtra("key_fav_item_id", FavoriteTextDetailUI.a(this.mmS.mmR).field_localId);
        b.b(this.mmS.mmR.mController.ylL, ".ui.FavTagEditUI", paramMenuItem);
        paramMenuItem = this.mmS.mmR.mlz;
        paramMenuItem.mfc += 1;
        AppMethodBeat.o(74441);
      }
      com.tencent.mm.ui.base.h.a(this.mmS.mmR.mController.ylL, this.mmS.mmR.getString(2131296882), "", new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(74440);
          paramAnonymousDialogInterface = com.tencent.mm.ui.base.h.b(FavoriteTextDetailUI.2.2.this.mmS.mmR.mController.ylL, FavoriteTextDetailUI.2.2.this.mmS.mmR.getString(2131296882), false, null);
          b.a(FavoriteTextDetailUI.b(FavoriteTextDetailUI.2.2.this.mmS.mmR), new FavoriteTextDetailUI.2.2.1.1(this, paramAnonymousDialogInterface));
          AppMethodBeat.o(74440);
        }
      }
      , null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI.2.2
 * JD-Core Version:    0.6.2
 */