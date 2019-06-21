package com.tencent.mm.plugin.webview.modelcache.downloaderimpl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.g.a.c.j;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.m;
import com.tencent.mm.pluginsdk.g.a.c.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.ConcurrentHashMap;

public final class c extends n.a<e>
{
  private static final ConcurrentHashMap<String, Boolean> uox;

  static
  {
    AppMethodBeat.i(6908);
    uox = new ConcurrentHashMap();
    AppMethodBeat.o(6908);
  }

  public c(e parame)
  {
    super(parame);
  }

  public static void clearCache()
  {
    AppMethodBeat.i(6907);
    uox.clear();
    AppMethodBeat.o(6907);
  }

  public final m a(j paramj)
  {
    AppMethodBeat.i(6906);
    if (uox.putIfAbsent(((e)awh()).getFilePath(), Boolean.TRUE) != null)
    {
      ab.i("MicroMsg.ResDownloader.WebViewCacheDownloadNetworkRequestHandler", "request urlKey = %s, already downloading this file", new Object[] { ((e)awh()).vdC });
      paramj = null;
      AppMethodBeat.o(6906);
    }
    while (true)
    {
      return paramj;
      paramj = super.a(paramj);
      uox.remove(((e)awh()).getFilePath());
      AppMethodBeat.o(6906);
    }
  }

  public final String awa()
  {
    return "WebViewCache";
  }

  public final boolean awb()
  {
    return true;
  }

  public final boolean awc()
  {
    return false;
  }

  public final boolean awd()
  {
    return true;
  }

  public final boolean awf()
  {
    return false;
  }

  public final boolean gh(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(6905);
    if (!super.gh(paramLong))
      AppMethodBeat.o(6905);
    while (true)
    {
      return bool;
      if (paramLong < 5242880L)
      {
        bool = true;
        AppMethodBeat.o(6905);
      }
      else
      {
        AppMethodBeat.o(6905);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modelcache.downloaderimpl.c
 * JD-Core Version:    0.6.2
 */