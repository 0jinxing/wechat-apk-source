package com.tencent.mm.plugin.fav.ui.gallery;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FavMediaGalleryUI$5
  implements MenuItem.OnMenuItemClickListener
{
  FavMediaGalleryUI$5(FavMediaGalleryUI paramFavMediaGalleryUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(74512);
    this.mnH.finish();
    AppMethodBeat.o(74512);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.FavMediaGalleryUI.5
 * JD-Core Version:    0.6.2
 */