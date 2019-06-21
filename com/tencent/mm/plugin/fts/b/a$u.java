package com.tencent.mm.plugin.fts.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.PluginFTS;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.storage.ad;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class a$u extends com.tencent.mm.plugin.fts.a.a.a
{
  private int mGg = 0;
  private int mGh = 0;
  private int mGi = 0;

  private a$u(a parama)
  {
  }

  public final String aAo()
  {
    AppMethodBeat.i(136694);
    String str = String.format("{Dirty: %d Timestamp: %d tophitsCount: %d}", new Object[] { Integer.valueOf(this.mGg), Integer.valueOf(this.mGh), Integer.valueOf(this.mGi) });
    AppMethodBeat.o(136694);
    return str;
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136693);
    Ng("start");
    Object localObject1 = a.b(this.mFK).entrySet().iterator();
    int i = 50;
    if (((Iterator)localObject1).hasNext())
    {
      if (Thread.interrupted())
      {
        a.a(this.mFK).commit();
        localObject1 = new InterruptedException();
        AppMethodBeat.o(136693);
        throw ((Throwable)localObject1);
      }
      if (i < 50)
        break label520;
      a.a(this.mFK).commit();
      a.a(this.mFK).beginTransaction();
      i = 0;
    }
    label514: label520: 
    while (true)
    {
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      Object localObject3 = ((List)((Map.Entry)localObject2).getValue()).iterator();
      long l;
      while (((Iterator)localObject3).hasNext())
      {
        l = ((Long)((Iterator)localObject3).next()).longValue();
        a.a(this.mFK).g(Long.valueOf(l));
        i++;
      }
      localObject3 = (String)((Map.Entry)localObject2).getKey();
      localObject2 = a.d(this.mFK).MU((String)localObject3);
      if ((localObject2 != null) && (((ap)localObject2).field_username.length() > 0) && (this.mFK.H((ad)localObject2)))
        i += this.mFK.I((ad)localObject2);
      while (true)
      {
        ((Iterator)localObject1).remove();
        a.c(this.mFK).remove(localObject3);
        this.mGg += 1;
        break;
        Ng("dirtyContact");
        localObject3 = a.c(this.mFK).iterator();
        if (((Iterator)localObject3).hasNext())
        {
          if (Thread.interrupted())
          {
            a.a(this.mFK).commit();
            localObject1 = new InterruptedException();
            AppMethodBeat.o(136693);
            throw ((Throwable)localObject1);
          }
          if (i < 50)
            break label511;
          a.a(this.mFK).commit();
          a.a(this.mFK).beginTransaction();
          i = 0;
          label351: localObject1 = (String)((Iterator)localObject3).next();
          l = a.d(this.mFK).MW((String)localObject1);
          localObject2 = a.d(this.mFK).MU((String)localObject1);
          if ((localObject2 == null) || (((ap)localObject2).field_username.length() <= 0) || (!this.mFK.H((ad)localObject2)))
            break label514;
          a.a(this.mFK).G((String)localObject1, l);
          i++;
        }
        while (true)
        {
          ((Iterator)localObject3).remove();
          this.mGh += 1;
          break;
          a.a(this.mFK).commit();
          Ng("timestampContact");
          localObject1 = ((PluginFTS)g.M(PluginFTS.class)).getTopHitsLogic();
          ((e)localObject1).mGP.clear();
          this.mGi = ((e)localObject1).mGO.bAJ();
          Ng("topHits");
          AppMethodBeat.o(136693);
          return true;
          label511: break label351;
        }
      }
    }
  }

  public final int getId()
  {
    return 16;
  }

  public final String getName()
  {
    return "UpdateDirtyAndTimestampContactTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.a.u
 * JD-Core Version:    0.6.2
 */