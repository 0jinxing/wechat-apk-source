package com.tencent.mm.plugin.appbrand.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.i;
import com.tencent.mm.plugin.appbrand.r.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.Set;

final class h$3
  implements f.a
{
  h$3(h paramh, String paramString, boolean paramBoolean, j paramj, c paramc)
  {
  }

  public final void a(d paramd)
  {
    AppMethodBeat.i(102156);
    ab.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "hy: on load module progress %s", new Object[] { paramd });
    Object localObject1 = this.inU;
    Object localObject2 = this.gPZ;
    localObject2 = ((h)localObject1).inQ.bC(localObject2);
    if (localObject2 == null)
      AppMethodBeat.o(102156);
    while (true)
    {
      return;
      localObject2 = ((Set)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (h.a)((Iterator)localObject2).next();
        if (((h.a)localObject1).iob != null)
          ((h.a)localObject1).iob.b(paramd);
      }
      AppMethodBeat.o(102156);
    }
  }

  public final void ds(String paramString)
  {
    AppMethodBeat.i(102155);
    ab.i("MicroMsg.AppBrand.RuntimeModularizingHelper[modularizing]", "onLoad, module(%s) pkgPath(%s)", new Object[] { this.gPZ, paramString });
    paramString = new h.3.1(this, paramString);
    this.inT.K(paramString);
    AppMethodBeat.o(102155);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.j.h.3
 * JD-Core Version:    0.6.2
 */