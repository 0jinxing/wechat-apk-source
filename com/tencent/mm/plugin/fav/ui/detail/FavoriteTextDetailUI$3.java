package com.tencent.mm.plugin.fav.ui.detail;

import android.support.v7.app.AppCompatActivity;
import android.text.ClipboardManager;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.q;

final class FavoriteTextDetailUI$3
  implements n.d
{
  FavoriteTextDetailUI$3(FavoriteTextDetailUI paramFavoriteTextDetailUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(74443);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(74443);
      return;
      if ((FavoriteTextDetailUI.c(this.mmR) != null) && (FavoriteTextDetailUI.a(this.mmR) != null) && (FavoriteTextDetailUI.a(this.mmR).field_favProto != null))
      {
        FavoriteTextDetailUI.c(this.mmR).setText(FavoriteTextDetailUI.a(this.mmR).field_favProto.desc);
        h.bQ(this.mmR.mController.ylL, this.mmR.mController.ylL.getString(2131296876));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteTextDetailUI.3
 * JD-Core Version:    0.6.2
 */