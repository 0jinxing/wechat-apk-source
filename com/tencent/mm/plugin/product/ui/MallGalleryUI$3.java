package com.tencent.mm.plugin.product.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallGalleryUI$3
  implements MenuItem.OnMenuItemClickListener
{
  MallGalleryUI$3(MallGalleryUI paramMallGalleryUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44037);
    this.piy.finish();
    AppMethodBeat.o(44037);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallGalleryUI.3
 * JD-Core Version:    0.6.2
 */