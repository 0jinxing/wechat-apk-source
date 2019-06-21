package com.tencent.mm.plugin.downloader_app.detail;

import android.os.Bundle;
import com.tencent.luggage.d.e;
import com.tencent.luggage.d.f;
import com.tencent.luggage.d.j;
import com.tencent.luggage.d.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class DownloadDetailUI$2
  implements j
{
  DownloadDetailUI$2(DownloadDetailUI paramDownloadDetailUI)
  {
  }

  public final e j(String paramString, Bundle paramBundle)
  {
    boolean bool = true;
    AppMethodBeat.i(136032);
    k localk = d.dC(this.kOg);
    if (localk == null);
    while (true)
    {
      ab.i("MicroMsg.DownloadDetailUI", "preloadDetail is null ? %b", new Object[] { Boolean.valueOf(bool) });
      if (localk == null)
        d.IC(paramString);
      paramString = new c(DownloadDetailUI.a(this.kOg).bPq, localk, paramBundle);
      AppMethodBeat.o(136032);
      return paramString;
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.DownloadDetailUI.2
 * JD-Core Version:    0.6.2
 */