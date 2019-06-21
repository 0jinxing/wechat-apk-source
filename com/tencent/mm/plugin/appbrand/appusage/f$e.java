package com.tencent.mm.plugin.appbrand.appusage;

import a.a.v;
import a.l;
import android.support.v7.h.c.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class f$e
  implements Runnable
{
  f$e(f paramf, List paramList, f.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134514);
    Object localObject1 = f.a(this.gYX);
    Object localObject2 = localObject1;
    if (localObject1 == null)
      localObject2 = (List)v.AUP;
    android.support.v7.h.c.b localb = android.support.v7.h.c.a((c.a)new ab((List)localObject2, this.gYY), true);
    localObject1 = (c)g.K(c.class);
    a.f.b.j.o(localb, "diff");
    List localList = a.a.j.m((Iterable)localObject2);
    localObject2 = this.gYY;
    if (localObject2 == null)
      a.f.b.j.dWJ();
    boolean bool = ((c)localObject1).a(localb, localList, a.a.j.m((Iterable)localObject2), (c.b)this.gYZ);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "[collection] reorderWithCallback, changed = ".concat(String.valueOf(bool)));
    if (bool)
      ((s)com.tencent.mm.plugin.appbrand.app.f.E(s.class)).a(LocalUsageInfo.class, this.gYY, null);
    f.b(this.gYX).set(false);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.AppBrandCollectionStorageExport[collection]", "[collection] reorderWithCallback, before run callback");
    localObject2 = this.gYZ;
    if (localObject2 != null)
    {
      ((f.b)localObject2).axa();
      AppMethodBeat.o(134514);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134514);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.f.e
 * JD-Core Version:    0.6.2
 */