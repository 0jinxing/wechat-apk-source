package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appcache.a.a;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.j;

public final class ap
{
  final ap.b gUn;

  ap()
  {
    AppMethodBeat.i(59507);
    this.gUn = new ap.b(this);
    AppMethodBeat.o(59507);
  }

  public static String avY()
  {
    AppMethodBeat.i(59508);
    String str1 = g.RP().cachePath;
    String str2 = str1;
    if (!str1.endsWith("/"))
      str2 = str1 + "/";
    str2 = str2 + "appbrand/pkg/";
    j.aih(str2);
    AppMethodBeat.o(59508);
    return str2;
  }

  public final int b(a parama)
  {
    int i = 0;
    AppMethodBeat.i(59509);
    if (this.gUn.ajd(parama.vdC))
    {
      ab.i("MicroMsg.AppBrandWxaPkgDownloadPerformer", "addRequestIfNotRunning, urlKey %s already in queue", new Object[] { parama.vdC });
      AppMethodBeat.o(59509);
    }
    while (true)
    {
      return i;
      i = this.gUn.b(parama);
      ab.i("MicroMsg.AppBrandWxaPkgDownloadPerformer", "addRequestIfNotRunning, urlKey %s, addResult %d", new Object[] { parama.vdC, Integer.valueOf(i) });
      AppMethodBeat.o(59509);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ap
 * JD-Core Version:    0.6.2
 */