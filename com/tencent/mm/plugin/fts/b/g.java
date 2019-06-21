package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.b;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

public final class g extends b
{
  m eAX;
  private f fur;
  c mGU;
  String[] mGV;
  List<String> mGW;

  public g()
  {
    AppMethodBeat.i(136806);
    this.mGU = new g.1(this);
    this.fur = new g.2(this);
    AppMethodBeat.o(136806);
  }

  public final boolean Pq()
  {
    AppMethodBeat.i(136809);
    com.tencent.mm.kernel.g.Rg().b(30, this.fur);
    AppMethodBeat.o(136809);
    return false;
  }

  public final a a(i parami)
  {
    AppMethodBeat.i(136808);
    switch (parami.hbo)
    {
    case 65522:
    default:
      parami = new g.a(this, (byte)0);
    case 65521:
    case 65525:
    case 65523:
    case 65524:
    }
    while (true)
    {
      parami = this.eAX.a(-65536, parami);
      AppMethodBeat.o(136808);
      return parami;
      parami = new g.f(this, parami.mEt, parami.talker);
      continue;
      parami = new g.g(this, (byte)0);
      continue;
      parami = new g.e(this, parami);
      continue;
      parami = new g.d(this, (byte)0);
    }
  }

  public final String getName()
  {
    return "SearchTestLogic";
  }

  public final boolean onCreate()
  {
    AppMethodBeat.i(136807);
    boolean bool;
    if (!((n)com.tencent.mm.kernel.g.M(n.class)).isFTSContextReady())
    {
      ab.i("MicroMsg.FTS.FTSSearchTestLogic", "Create Fail!");
      bool = false;
      AppMethodBeat.o(136807);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.FTS.FTSSearchTestLogic", "Create Success!");
      this.eAX = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSTaskDaemon();
      this.mGU.dnU();
      bool = true;
      AppMethodBeat.o(136807);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.g
 * JD-Core Version:    0.6.2
 */