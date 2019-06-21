package com.tencent.mm.plugin.fav.ui.detail;

import android.app.Dialog;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.fav.a.am;
import com.tencent.mm.plugin.fav.a.h.a;
import com.tencent.mm.plugin.fav.ui.i.2;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;

final class FavoriteFileDetailUI$16$2
  implements n.d
{
  FavoriteFileDetailUI$16$2(FavoriteFileDetailUI.16 param16)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(74342);
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
      AppMethodBeat.o(74342);
      while (true)
      {
        return;
        if (FavoriteFileDetailUI.c(this.mme.mlX) == 8)
        {
          paramMenuItem = com.tencent.mm.plugin.fav.a.b.b(FavoriteFileDetailUI.a(this.mme.mlX));
          if (!e.ct(paramMenuItem))
          {
            ab.e("MicroMsg.FavoriteFileDetailUI", "share file failed, file not exists");
            Toast.makeText(this.mme.mlX, this.mme.mlX.getString(2131299732), 1).show();
            AppMethodBeat.o(74342);
          }
          else if (new com.tencent.mm.vfs.b(paramMenuItem).length() > 10485760L)
          {
            ab.e("MicroMsg.FavoriteFileDetailUI", "share file failed, file too large");
            Toast.makeText(this.mme.mlX, this.mme.mlX.getString(2131299733), 1).show();
            AppMethodBeat.o(74342);
          }
        }
        else
        {
          paramMenuItem = this.mme.mlX.mlz;
          paramMenuItem.meZ += 1;
          FavoriteFileDetailUI.a(this.mme.mlX, FavoriteFileDetailUI.b(this.mme.mlX));
          AppMethodBeat.o(74342);
          continue;
          paramMenuItem = this.mme.mlX.mlz;
          paramMenuItem.mfa += 1;
          Object localObject = h.b(this.mme.mlX.mController.ylL, this.mme.mlX.getString(2131299643), false, null);
          paramMenuItem = this.mme.mlX.mController.ylL;
          com.tencent.mm.plugin.fav.a.g localg = FavoriteFileDetailUI.b(this.mme.mlX);
          localObject = new FavoriteFileDetailUI.16.2.1(this, (Dialog)localObject);
          LinkedList localLinkedList = new LinkedList();
          localLinkedList.add(Integer.valueOf(localg.field_id));
          paramMenuItem = new am("", localLinkedList, new i.2(localg, paramMenuItem, (Runnable)localObject));
          com.tencent.mm.kernel.g.Rg().a(paramMenuItem, 0);
          AppMethodBeat.o(74342);
          continue;
          h.a(this.mme.mlX.mController.ylL, this.mme.mlX.getString(2131296882), "", new FavoriteFileDetailUI.16.2.2(this), null);
          AppMethodBeat.o(74342);
          continue;
          paramMenuItem = this.mme.mlX.mlz;
          paramMenuItem.mfc += 1;
          paramMenuItem = new Intent();
          paramMenuItem.putExtra("key_fav_scene", 2);
          paramMenuItem.putExtra("key_fav_item_id", FavoriteFileDetailUI.b(this.mme.mlX).field_localId);
          com.tencent.mm.plugin.fav.a.b.b(this.mme.mlX.mController.ylL, ".ui.FavTagEditUI", paramMenuItem);
          AppMethodBeat.o(74342);
        }
      }
      FavoriteFileDetailUI.k(this.mme.mlX);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteFileDetailUI.16.2
 * JD-Core Version:    0.6.2
 */