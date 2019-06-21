package com.tencent.mm.plugin.wepkg.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class a
{
  private Map<String, a.b> uXQ;

  private a()
  {
    AppMethodBeat.i(63607);
    this.uXQ = new ConcurrentHashMap();
    AppMethodBeat.o(63607);
  }

  public final void l(Set<String> paramSet)
  {
    AppMethodBeat.i(63608);
    if (paramSet.isEmpty())
    {
      h.pYm.a(859L, 20L, 1L, false);
      AppMethodBeat.o(63608);
    }
    while (true)
    {
      return;
      h.pYm.a(859L, 21L, 1L, false);
      a.b localb = new a.b(this);
      localb.uXS = paramSet.size();
      localb.fVz = 0L;
      paramSet = paramSet.iterator();
      while (paramSet.hasNext())
      {
        String str = (String)paramSet.next();
        this.uXQ.put(str, localb);
      }
      AppMethodBeat.o(63608);
    }
  }

  public final void n(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(63609);
    paramString1 = ag.ck(paramString1 + paramString2);
    paramString1 = (a.b)this.uXQ.remove(paramString1);
    if (paramString1 != null)
    {
      paramString1.uXS -= 1;
      paramString1.fVz += paramLong;
      if (paramString1.uXS == 0)
      {
        ab.i("MicroMsg.Wepkg.BatchUpdateReporter", "batch update size: %s", new Object[] { Long.valueOf(paramString1.fVz) });
        c.eBG.g(1, "", String.valueOf(paramString1.fVz));
      }
    }
    AppMethodBeat.o(63609);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.c.a
 * JD-Core Version:    0.6.2
 */