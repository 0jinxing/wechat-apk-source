package com.tencent.mm.plugin.webview.modelcache.downloaderimpl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.d;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.pluginsdk.g.a.c.s;
import com.tencent.mm.pluginsdk.g.a.d.a;

final class WebViewCacheDownloadHelper$ResDownloaderPlugin$1
  implements d
{
  WebViewCacheDownloadHelper$ResDownloaderPlugin$1(WebViewCacheDownloadHelper.ResDownloaderPlugin paramResDownloaderPlugin)
  {
  }

  private static void Ah(String paramString)
  {
    AppMethodBeat.i(6895);
    paramString = q.a.diy().ajg(paramString);
    if (paramString != null)
      a.ajj(paramString.field_filePath);
    AppMethodBeat.o(6895);
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(6892);
    b.a.c(paramString, paramm);
    AppMethodBeat.o(6892);
  }

  public final void aeQ(String paramString)
  {
    AppMethodBeat.i(6894);
    Ah(paramString);
    AppMethodBeat.o(6894);
  }

  public final String awa()
  {
    return "WebViewCache";
  }

  public final void b(String paramString, m paramm)
  {
    AppMethodBeat.i(6893);
    Ah(paramString);
    b.a.c(paramString, paramm);
    AppMethodBeat.o(6893);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.downloaderimpl.WebViewCacheDownloadHelper.ResDownloaderPlugin.1
 * JD-Core Version:    0.6.2
 */