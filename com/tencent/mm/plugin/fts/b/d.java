package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.b;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends b
{
  private m eAX;
  com.tencent.mm.plugin.fts.c.d mGL;

  public final boolean Pq()
  {
    this.mGL = null;
    this.eAX = null;
    return true;
  }

  public final a a(i parami)
  {
    AppMethodBeat.i(136776);
    parami = new d.d(this, parami);
    this.eAX.a(-65536, parami);
    AppMethodBeat.o(136776);
    return parami;
  }

  public final void addSOSHistory(String paramString)
  {
    AppMethodBeat.i(136773);
    d.a locala = new d.a(this);
    locala.mGM = paramString;
    this.eAX.a(132072, locala);
    AppMethodBeat.o(136773);
  }

  public final void deleteSOSHistory()
  {
    AppMethodBeat.i(136774);
    d.b localb = new d.b(this);
    this.eAX.a(132072, localb);
    AppMethodBeat.o(136774);
  }

  public final void deleteSOSHistory(String paramString)
  {
    AppMethodBeat.i(136775);
    d.c localc = new d.c(this);
    localc.mGM = paramString;
    this.eAX.a(132072, localc);
    AppMethodBeat.o(136775);
  }

  public final String getName()
  {
    return "FTS5SearchSOSHistoryLogic";
  }

  public final boolean onCreate()
  {
    AppMethodBeat.i(136772);
    boolean bool;
    if (!((n)g.M(n.class)).isFTSContextReady())
    {
      ab.i("MicroMsg.FTS.FTS5SearchSOSHistoryLogic", "Create Fail!");
      bool = false;
      AppMethodBeat.o(136772);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.FTS.FTS5SearchSOSHistoryLogic", "Create Success!");
      this.mGL = ((com.tencent.mm.plugin.fts.c.d)((n)g.M(n.class)).getFTSIndexStorage(1024));
      this.eAX = ((n)g.M(n.class)).getFTSTaskDaemon();
      bool = true;
      AppMethodBeat.o(136772);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.d
 * JD-Core Version:    0.6.2
 */