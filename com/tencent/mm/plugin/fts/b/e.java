package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.b;
import com.tencent.mm.plugin.fts.a.m;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.HashSet;

public final class e extends b
{
  private m eAX;
  com.tencent.mm.plugin.fts.c.e mGO;
  HashSet<String> mGP;

  public final void Nn(String paramString)
  {
    AppMethodBeat.i(136785);
    if (this.mGP.add(paramString))
      this.mGO.Nr(paramString);
    AppMethodBeat.o(136785);
  }

  public final boolean Pq()
  {
    AppMethodBeat.i(136783);
    if (this.mGP != null)
      this.mGP.clear();
    this.mGO = null;
    this.eAX = null;
    AppMethodBeat.o(136783);
    return true;
  }

  public final a a(i parami)
  {
    AppMethodBeat.i(136784);
    parami = new e.b(this, parami);
    parami = this.eAX.a(-65536, parami);
    AppMethodBeat.o(136784);
    return parami;
  }

  public final void a(String paramString, l paraml, int paramInt, HashMap<String, String> paramHashMap)
  {
    AppMethodBeat.i(136787);
    e.c localc = new e.c(this, (byte)0);
    e.c.a(localc, paramString);
    e.c.a(localc, paraml);
    e.c.a(localc, paramInt);
    e.c.a(localc, paramHashMap);
    this.eAX.a(65626, localc);
    AppMethodBeat.o(136787);
  }

  public final void d(int[] paramArrayOfInt, String paramString)
  {
    AppMethodBeat.i(136786);
    this.mGO.b(paramArrayOfInt, paramString);
    AppMethodBeat.o(136786);
  }

  public final String getName()
  {
    return "FTS5SearchTopHitsLogic";
  }

  public final boolean onCreate()
  {
    AppMethodBeat.i(136782);
    if (!((n)g.M(n.class)).isFTSContextReady())
    {
      ab.i("MicroMsg.FTS.FTS5SearchTopHitsLogic", "Create Fail!");
      AppMethodBeat.o(136782);
    }
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      ab.i("MicroMsg.FTS.FTS5SearchTopHitsLogic", "Create Success!");
      this.mGP = new HashSet();
      this.mGO = ((com.tencent.mm.plugin.fts.c.e)((n)g.M(n.class)).getFTSIndexStorage(1));
      this.eAX = ((n)g.M(n.class)).getFTSTaskDaemon();
      this.eAX.a(65626, new e.a(this, (byte)0));
      AppMethodBeat.o(136782);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.e
 * JD-Core Version:    0.6.2
 */