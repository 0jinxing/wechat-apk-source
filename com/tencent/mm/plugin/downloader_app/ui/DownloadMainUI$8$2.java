package com.tencent.mm.plugin.downloader_app.ui;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.plugin.downloader_app.b.f;
import com.tencent.mm.plugin.downloader_app.b.i;
import com.tencent.mm.plugin.downloader_app.b.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class DownloadMainUI$8$2
  implements Runnable
{
  DownloadMainUI$8$2(DownloadMainUI.8 param8)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(136235);
    if (!bo.isNullOrNil(this.kQn.kQm))
    {
      i locali = DownloadMainUI.c(this.kQn.kQk).IL(this.kQn.kQm);
      if (locali == null)
        break label96;
      j.Iz(this.kQn.kQm);
      l.postDelayed(new DownloadMainUI.8.2.1(this, locali), 200L);
    }
    while (true)
    {
      DownloadMainUI.a(this.kQn.kQk, DownloadMainUI.c(this.kQn.kQk), true);
      AppMethodBeat.o(136235);
      return;
      label96: h.b(this.kQn.kQk, "", this.kQn.kQk.getResources().getString(2131301724), true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI.8.2
 * JD-Core Version:    0.6.2
 */