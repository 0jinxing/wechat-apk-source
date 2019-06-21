package com.tencent.mm.plugin.appbrand.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.f.b;
import com.tencent.mm.plugin.appbrand.f.c;
import com.tencent.mm.plugin.appbrand.f.e;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.d.d;
import com.tencent.mm.plugin.fts.a.i;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.plugin.fts.a.n;

final class f$9 extends a
{
  f$9(f paramf)
  {
  }

  public final boolean execute()
  {
    AppMethodBeat.i(129249);
    Object localObject = new c();
    ((n)com.tencent.mm.kernel.g.M(n.class)).registerIndexStorage((i)localObject);
    ((i)localObject).create();
    localObject = new b();
    ((n)com.tencent.mm.kernel.g.M(n.class)).registerNativeLogic(7, (k)localObject);
    ((k)localObject).create();
    localObject = new com.tencent.mm.plugin.appbrand.f.g();
    ((n)com.tencent.mm.kernel.g.M(n.class)).registerFTSUILogic((d)localObject);
    localObject = new e();
    ((n)com.tencent.mm.kernel.g.M(n.class)).registerFTSUILogic((d)localObject);
    AppMethodBeat.o(129249);
    return true;
  }

  public final String getName()
  {
    return "InitFTSWeAppPluginTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.f.9
 * JD-Core Version:    0.6.2
 */