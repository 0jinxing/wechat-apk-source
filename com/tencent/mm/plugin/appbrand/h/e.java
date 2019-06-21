package com.tencent.mm.plugin.appbrand.h;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.atomic.AtomicInteger;

public class e
{
  private final e.a ieY;
  private final AtomicInteger ieZ;
  final SparseArray<d> ifa;

  static
  {
    AppMethodBeat.i(113940);
    if (!e.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      AppMethodBeat.o(113940);
      return;
    }
  }

  public e(e.a parama)
  {
    AppMethodBeat.i(113937);
    this.ieY = parama;
    this.ieZ = new AtomicInteger(1);
    this.ifa = new SparseArray();
    AppMethodBeat.o(113937);
  }

  public static int aGX()
  {
    return 1;
  }

  public final g aGV()
  {
    AppMethodBeat.i(113939);
    int i = this.ieZ.incrementAndGet();
    f localf = new f(this.ieY.oT(i), i);
    synchronized (this.ifa)
    {
      this.ifa.put(i, localf);
      ab.i("MicroMsg.AppBrandJ2V8ContextMgr", "allocJsContext id:%d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(113939);
      return localf;
    }
  }

  public final g oO(int paramInt)
  {
    AppMethodBeat.i(113938);
    synchronized (this.ifa)
    {
      g localg = (g)this.ifa.get(paramInt);
      AppMethodBeat.o(113938);
      return localg;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.h.e
 * JD-Core Version:    0.6.2
 */