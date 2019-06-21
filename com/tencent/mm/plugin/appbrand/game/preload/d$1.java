package com.tencent.mm.plugin.appbrand.game.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.j.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicInteger;

final class d$1
  implements f.a
{
  d$1(d paramd, String paramString)
  {
  }

  public final void a(com.tencent.mm.plugin.appbrand.j.d paramd)
  {
    AppMethodBeat.i(130294);
    ab.i("MicroMsg.WAGamePreloadManager", "hy: on load module progress %s", new Object[] { paramd });
    AppMethodBeat.o(130294);
  }

  public final void ds(String paramString)
  {
    AppMethodBeat.i(130293);
    ab.i("MicroMsg.WAGamePreloadManager", "onLoad, module(%s) pkgPath(%s)", new Object[] { this.hty, paramString });
    d.a(this.htz).addAndGet(1);
    AppMethodBeat.o(130293);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.preload.d.1
 * JD-Core Version:    0.6.2
 */