package com.tencent.mm.plugin.gallery.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AlbumPreviewUI$6
  implements MenuItem.OnMenuItemClickListener
{
  AlbumPreviewUI$6(AlbumPreviewUI paramAlbumPreviewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(21398);
    ab.i("MicroMsg.AlbumPreviewUI", "backBtn");
    this.mPO.setResult(-2);
    if (AlbumPreviewUI.y(this.mPO).aej)
    {
      AlbumPreviewUI.y(this.mPO).bCE();
      AppMethodBeat.o(21398);
    }
    while (true)
    {
      return true;
      this.mPO.finish();
      AppMethodBeat.o(21398);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.6
 * JD-Core Version:    0.6.2
 */