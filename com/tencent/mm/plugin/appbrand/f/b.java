package com.tencent.mm.plugin.appbrand.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends com.tencent.mm.plugin.fts.a.b
{
  m eAX;
  c hpO;
  private k.a hpP;

  public b()
  {
    AppMethodBeat.i(129964);
    this.hpP = new b.1(this);
    AppMethodBeat.o(129964);
  }

  public final boolean Pq()
  {
    AppMethodBeat.i(129967);
    i.onDestroy();
    i.f(this.hpP);
    this.hpO = null;
    this.eAX = null;
    AppMethodBeat.o(129967);
    return true;
  }

  public final a a(com.tencent.mm.plugin.fts.a.a.i parami)
  {
    AppMethodBeat.i(129965);
    parami = new b.c(this, parami);
    parami = this.eAX.a(-65536, parami);
    AppMethodBeat.o(129965);
    return parami;
  }

  public final String getName()
  {
    return "FTS5SearchWeAppLogic";
  }

  public final boolean onCreate()
  {
    AppMethodBeat.i(129966);
    boolean bool;
    if (!((n)g.M(n.class)).isFTSContextReady())
    {
      ab.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "Create Fail!");
      bool = false;
      AppMethodBeat.o(129966);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "Create Success!");
      this.hpO = ((c)((n)g.M(n.class)).getFTSIndexStorage(512));
      this.eAX = ((n)g.M(n.class)).getFTSTaskDaemon();
      this.eAX.a(65616, new b.d(this));
      i.onCreate();
      i.e(this.hpP);
      bool = true;
      AppMethodBeat.o(129966);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.f.b
 * JD-Core Version:    0.6.2
 */