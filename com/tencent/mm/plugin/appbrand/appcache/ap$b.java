package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.a.a;
import com.tencent.mm.pluginsdk.g.a.c.f.d;
import com.tencent.mm.pluginsdk.g.a.c.l;
import com.tencent.mm.pluginsdk.g.a.c.n;
import com.tencent.mm.pluginsdk.g.a.c.u;
import com.tencent.mm.sdk.platformtools.ak;

final class ap$b extends n
{
  ap$b(ap paramap)
  {
    super(new u("WxaPkgDownloaderPool", "WxaPkgDownloaderThread"), new ap.d(paramap));
    AppMethodBeat.i(59486);
    AppMethodBeat.o(59486);
  }

  public final f.d a(l paraml)
  {
    AppMethodBeat.i(59488);
    paraml = new ap.c((a)paraml);
    paraml.vft = this.vfq;
    AppMethodBeat.o(59488);
    return paraml;
  }

  public final int b(l paraml)
  {
    AppMethodBeat.i(59489);
    int i = super.b(paraml);
    if (i == 1)
    {
      super.b(paraml);
      i = 2;
      AppMethodBeat.o(59489);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(59489);
    }
  }

  public final void shutdown()
  {
    AppMethodBeat.i(59487);
    super.shutdown();
    ((ap.d)this.vfq).gUz.getLooper().quit();
    AppMethodBeat.o(59487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.ap.b
 * JD-Core Version:    0.6.2
 */