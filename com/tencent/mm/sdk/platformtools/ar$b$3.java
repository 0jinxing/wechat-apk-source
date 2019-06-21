package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ar$b$3
  implements Runnable
{
  ar$b$3(ar.b paramb, ar.c paramc, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(93421);
    synchronized (ar.f(this.xAf.xzZ))
    {
      ar.b.a(this.xAf, this.xAe);
    }
    synchronized (this.xAf.xzZ)
    {
      ar.g(this.xAf.xzZ);
      if (this.xAh != null)
        this.xAh.run();
      AppMethodBeat.o(93421);
      return;
      localObject3 = finally;
      AppMethodBeat.o(93421);
      throw localObject3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ar.b.3
 * JD-Core Version:    0.6.2
 */