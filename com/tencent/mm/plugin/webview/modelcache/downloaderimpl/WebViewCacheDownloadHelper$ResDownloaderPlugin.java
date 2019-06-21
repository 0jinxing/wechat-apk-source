package com.tencent.mm.plugin.webview.modelcache.downloaderimpl;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.g;
import com.tencent.mm.pluginsdk.g.a.c.h;
import com.tencent.mm.pluginsdk.g.a.c.i;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.n.a;
import com.tencent.mm.pluginsdk.g.a.c.q;
import com.tencent.mm.pluginsdk.g.a.c.q.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public final class WebViewCacheDownloadHelper$ResDownloaderPlugin
  implements g
{
  private final com.tencent.mm.pluginsdk.g.a.c.d uov;

  public WebViewCacheDownloadHelper$ResDownloaderPlugin()
  {
    AppMethodBeat.i(6896);
    this.uov = new WebViewCacheDownloadHelper.ResDownloaderPlugin.1(this);
    AppMethodBeat.o(6896);
  }

  public final String awa()
  {
    return "WebViewCache";
  }

  public final n.a c(l paraml)
  {
    AppMethodBeat.i(6899);
    if ((paraml == null) || (!(paraml instanceof e)))
    {
      ab.e("MicroMsg.ResDownloader.WebViewCacheDownloadHelper", "getNetworkRequestHandler, get invalid request = ".concat(String.valueOf(paraml)));
      paraml = null;
      AppMethodBeat.o(6899);
    }
    while (true)
    {
      return paraml;
      paraml = new c((e)paraml);
      AppMethodBeat.o(6899);
    }
  }

  public final void cYt()
  {
    AppMethodBeat.i(6897);
    q.a.diy().b("WebViewCache", this.uov);
    AppMethodBeat.o(6897);
  }

  public final h cYu()
  {
    AppMethodBeat.i(6900);
    d locald = new d();
    AppMethodBeat.o(6900);
    return locald;
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(6898);
    c.clearCache();
    ??? = q.a.diy();
    com.tencent.mm.pluginsdk.g.a.c.d locald = this.uov;
    Object localObject3;
    int i;
    if (((q)???).hrm)
    {
      localObject3 = ((q)???).vfz;
      if (locald != null)
        i = "WebViewCache".hashCode();
    }
    while (true)
    {
      synchronized (((i)localObject3).vfe)
      {
        localObject3 = (List)((i)localObject3).vfd.get(i);
        if (localObject3 == null)
        {
          AppMethodBeat.o(6898);
          return;
        }
        ((List)localObject3).remove(locald);
        AppMethodBeat.o(6898);
      }
      AppMethodBeat.o(6898);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.downloaderimpl.WebViewCacheDownloadHelper.ResDownloaderPlugin
 * JD-Core Version:    0.6.2
 */