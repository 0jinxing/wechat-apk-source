package com.tencent.mm.plugin.downloader_app.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader_app.b.f;
import com.tencent.mm.plugin.downloader_app.b.h;
import com.tencent.mm.plugin.downloader_app.b.i;
import com.tencent.mm.sdk.platformtools.ab;

final class DownloadMainUI$7
  implements Runnable
{
  DownloadMainUI$7(DownloadMainUI paramDownloadMainUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136232);
    if (!DownloadMainUI.e(this.kQk))
      com.tencent.mm.ui.widget.snackbar.b.i(this.kQk, this.kQk.getString(2131304025));
    TaskListView localTaskListView = DownloadMainUI.g(this.kQk);
    i locali = DownloadMainUI.c(this.kQk).IL(DownloadMainUI.d(this.kQk));
    int i = localTaskListView.kQZ.kQR.indexOf(locali);
    if ((i < 0) || (i >= DownloadMainUI.g(this.kQk).getSize()))
    {
      ab.e("MicroMsg.DownloadMainUI", "error position < 0");
      AppMethodBeat.o(136232);
    }
    while (true)
    {
      return;
      DownloadMainUI.g(this.kQk).smoothScrollToPosition(i);
      AppMethodBeat.o(136232);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI.7
 * JD-Core Version:    0.6.2
 */