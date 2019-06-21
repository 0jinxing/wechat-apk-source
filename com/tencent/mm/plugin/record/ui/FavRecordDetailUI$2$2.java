package com.tencent.mm.plugin.record.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class FavRecordDetailUI$2$2
  implements n.d
{
  FavRecordDetailUI$2$2(FavRecordDetailUI.2 param2)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(24206);
    switch (paramMenuItem.getItemId())
    {
    case 1:
    default:
    case 0:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(24206);
      while (true)
      {
        return;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Select_Conv_Type", 3);
        paramMenuItem.putExtra("scene_from", 1);
        paramMenuItem.putExtra("mutil_select_is_ret", true);
        paramMenuItem.putExtra("select_fav_local_id", FavRecordDetailUI.b(this.pKl.pKi).field_localId);
        d.b(this.pKl.pKi, ".ui.transmit.SelectConversationUI", paramMenuItem, 4097);
        com.tencent.mm.plugin.fav.a.h.j(FavRecordDetailUI.b(this.pKl.pKi).field_localId, 1, 0);
        AppMethodBeat.o(24206);
        continue;
        com.tencent.mm.ui.base.h.a(this.pKl.pKi.mController.ylL, this.pKl.pKi.getString(2131296882), "", new FavRecordDetailUI.2.2.1(this), null);
        AppMethodBeat.o(24206);
        continue;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("key_fav_scene", 2);
        paramMenuItem.putExtra("key_fav_item_id", FavRecordDetailUI.a(this.pKl.pKi));
        b.b(this.pKl.pKi.mController.ylL, ".ui.FavTagEditUI", paramMenuItem);
        AppMethodBeat.o(24206);
        continue;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("key_fav_scene", 1);
        paramMenuItem.putExtra("key_fav_item_id", FavRecordDetailUI.b(this.pKl.pKi).field_localId);
        b.b(this.pKl.pKi.mController.ylL, ".ui.FavTagEditUI", paramMenuItem);
        AppMethodBeat.o(24206);
      }
      com.tencent.mm.plugin.fav.ui.g.a(this.pKl.pKi, FavRecordDetailUI.a(this.pKl.pKi), FavRecordDetailUI.d(this.pKl.pKi));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.FavRecordDetailUI.2.2
 * JD-Core Version:    0.6.2
 */