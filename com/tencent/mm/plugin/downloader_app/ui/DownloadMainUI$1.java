package com.tencent.mm.plugin.downloader_app.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DownloadMainUI$1
  implements MenuItem.OnMenuItemClickListener
{
  DownloadMainUI$1(DownloadMainUI paramDownloadMainUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(136224);
    this.kQk.finish();
    AppMethodBeat.o(136224);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI.1
 * JD-Core Version:    0.6.2
 */