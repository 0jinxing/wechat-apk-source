package com.tencent.mm.plugin.appbrand.game.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends com.tencent.mm.plugin.fts.a.b
{
  m eAX;
  a hqX;
  private k.a hqY;

  public b()
  {
    AppMethodBeat.i(130073);
    this.hqY = new b.1(this);
    AppMethodBeat.o(130073);
  }

  public final boolean Pq()
  {
    AppMethodBeat.i(130076);
    i.onDestroy();
    i.f(this.hqY);
    this.hqX = null;
    this.eAX = null;
    AppMethodBeat.o(130076);
    return true;
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(com.tencent.mm.plugin.fts.a.a.i parami)
  {
    AppMethodBeat.i(130074);
    parami = new b.c(this, parami);
    parami = this.eAX.a(-65536, parami);
    AppMethodBeat.o(130074);
    return parami;
  }

  public final String getName()
  {
    return "FTS5SearchMiniGameLogic";
  }

  public final boolean onCreate()
  {
    AppMethodBeat.i(130075);
    boolean bool;
    if (!((n)g.M(n.class)).isFTSContextReady())
    {
      ab.i("MicroMsg.FTS.FTS5SearchMiniGameLogic", "Create Fail!");
      bool = false;
      AppMethodBeat.o(130075);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.FTS.FTS5SearchMiniGameLogic", "Create Success!");
      this.hqX = ((a)((n)g.M(n.class)).getFTSIndexStorage(8));
      this.eAX = ((n)g.M(n.class)).getFTSTaskDaemon();
      this.eAX.a(65601, new b.d(this));
      i.onCreate();
      i.e(this.hqY);
      bool = true;
      AppMethodBeat.o(130075);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.b.b
 * JD-Core Version:    0.6.2
 */