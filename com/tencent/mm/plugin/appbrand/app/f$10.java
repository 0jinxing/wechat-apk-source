package com.tencent.mm.plugin.appbrand.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.game.b.b;
import com.tencent.mm.plugin.fts.a.i;
import com.tencent.mm.plugin.fts.a.k;
import com.tencent.mm.plugin.fts.a.n;

final class f$10 extends com.tencent.mm.plugin.fts.a.a.a
{
  f$10(f paramf)
  {
  }

  public final boolean execute()
  {
    AppMethodBeat.i(129250);
    Object localObject = new com.tencent.mm.plugin.appbrand.game.b.a();
    ((n)g.M(n.class)).registerIndexStorage((i)localObject);
    ((i)localObject).create();
    localObject = new b();
    ((n)g.M(n.class)).registerNativeLogic(10, (k)localObject);
    ((k)localObject).create();
    localObject = new com.tencent.mm.plugin.appbrand.game.b.f();
    ((n)g.M(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    localObject = new com.tencent.mm.plugin.appbrand.game.b.d();
    ((n)g.M(n.class)).registerFTSUILogic((com.tencent.mm.plugin.fts.a.d.d)localObject);
    AppMethodBeat.o(129250);
    return true;
  }

  public final String getName()
  {
    return "InitFTSMiniGamePluginTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.app.f.10
 * JD-Core Version:    0.6.2
 */