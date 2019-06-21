package com.tencent.mm.plugin.fav.ui;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.a.k;

final class FavoriteIndexUI$21
  implements View.OnCreateContextMenuListener
{
  FavoriteIndexUI$21(FavoriteIndexUI paramFavoriteIndexUI, int paramInt)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(74247);
    paramView = new k();
    paramContextMenuInfo = FavoriteIndexUI.a(this.mkH).vE(this.sN - this.mkH.mhs.getHeaderViewsCount() - 1);
    boolean bool = paramView.t(paramContextMenuInfo);
    if (!bool)
      paramContextMenu.add(0, 3, 0, 2131299720);
    if ((bool) && (com.tencent.mm.plugin.fav.a.b.g(paramContextMenuInfo)))
      paramContextMenu.add(0, 3, 0, 2131299720);
    if (paramContextMenuInfo.field_type == 8)
    {
      paramView = com.tencent.mm.plugin.fav.a.b.c(paramContextMenuInfo);
      if ((com.tencent.mm.plugin.fav.a.b.f(paramView)) && (!com.tencent.mm.plugin.fav.a.b.g(paramView)))
        paramContextMenu.add(0, 4, 0, 2131299676);
    }
    paramContextMenu.add(0, 2, 0, 2131299612);
    paramContextMenu.add(0, 0, 0, 2131299593);
    paramContextMenu.add(0, 1, 0, 2131299665);
    AppMethodBeat.o(74247);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavoriteIndexUI.21
 * JD-Core Version:    0.6.2
 */