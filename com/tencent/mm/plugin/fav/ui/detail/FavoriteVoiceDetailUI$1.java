package com.tencent.mm.plugin.fav.ui.detail;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavoriteVoiceDetailUI$1
  implements MenuItem.OnMenuItemClickListener
{
  FavoriteVoiceDetailUI$1(FavoriteVoiceDetailUI paramFavoriteVoiceDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(74478);
    this.mnj.finish();
    AppMethodBeat.o(74478);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.detail.FavoriteVoiceDetailUI.1
 * JD-Core Version:    0.6.2
 */