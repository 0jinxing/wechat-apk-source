package com.tencent.mm.plugin.downloader_app.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.f.a;
import com.tencent.mm.plugin.downloader_app.b.c;
import com.tencent.mm.plugin.downloader_app.b.i;

final class DownloadMainUI$6
  implements Runnable
{
  DownloadMainUI$6(DownloadMainUI paramDownloadMainUI, a parama, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136231);
    if (this.kMF != null)
    {
      if (this.kMF.field_status == 1)
        break label85;
      if (this.kMF.field_status == 2)
      {
        c.a(this.kQk, this.kOI, false, null);
        AppMethodBeat.o(136231);
      }
    }
    while (true)
    {
      return;
      c.a(this.kQk, this.kOI, true);
      AppMethodBeat.o(136231);
      continue;
      c.a(this.kQk, this.kOI, true);
      label85: AppMethodBeat.o(136231);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI.6
 * JD-Core Version:    0.6.2
 */