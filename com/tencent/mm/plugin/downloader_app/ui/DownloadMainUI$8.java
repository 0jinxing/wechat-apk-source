package com.tencent.mm.plugin.downloader_app.ui;

import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.plugin.downloader_app.b.g;
import com.tencent.mm.plugin.downloader_app.b.g.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class DownloadMainUI$8
  implements g.a
{
  DownloadMainUI$8(DownloadMainUI paramDownloadMainUI, String paramString)
  {
  }

  public final void gd(boolean paramBoolean)
  {
    AppMethodBeat.i(136236);
    l.q(new DownloadMainUI.8.1(this));
    if (paramBoolean)
    {
      DownloadMainUI.a(this.kQk, g.biM());
      al.d(new DownloadMainUI.8.2(this));
      AppMethodBeat.o(136236);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.kQm))
        h.b(this.kQk, "", this.kQk.getResources().getString(2131298020), true);
      AppMethodBeat.o(136236);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.DownloadMainUI.8
 * JD-Core Version:    0.6.2
 */