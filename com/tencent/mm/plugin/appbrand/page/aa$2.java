package com.tencent.mm.plugin.appbrand.page;

import android.webkit.DownloadListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class aa$2
  implements DownloadListener
{
  aa$2(aa paramaa)
  {
  }

  public final void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    AppMethodBeat.i(132440);
    ab.i("MicroMsg.AppBrandWebView", "onDownloadStart called, url = %s, mimeType = %s, userAgent = %s", new Object[] { paramString1, paramString4, paramString2 });
    AppMethodBeat.o(132440);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.aa.2
 * JD-Core Version:    0.6.2
 */