package com.tencent.mm.plugin.clean.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class b
  implements c
{
  public HashMap<Long, ak> kwM;
  private HashSet<Long> kwN;

  public b()
  {
    this((byte)0);
  }

  private b(byte paramByte)
  {
    AppMethodBeat.i(18727);
    this.kwN = new HashSet(5);
    this.kwM = new HashMap(5);
    for (paramByte = 0; paramByte <= 5; paramByte++)
      d.a(new b.1(this), "ThreadController_handler", 1).start();
    AppMethodBeat.o(18727);
  }

  private void e(Long paramLong)
  {
    try
    {
      AppMethodBeat.i(18729);
      if (this.kwN.remove(paramLong))
        ab.d("MicroMsg.ThreadController", "thread is idle, id=%d", new Object[] { paramLong });
      AppMethodBeat.o(18729);
      return;
    }
    finally
    {
    }
    throw paramLong;
  }

  public final boolean b(a parama)
  {
    try
    {
      AppMethodBeat.i(18728);
      parama.kwL = this;
      ab.d("MicroMsg.ThreadController", "running threads %s", new Object[] { this.kwN.toString() });
      Iterator localIterator = this.kwM.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        if (!this.kwN.contains(localEntry.getKey()))
        {
          ((ak)localEntry.getValue()).post(parama);
          this.kwN.add(localEntry.getKey());
          AppMethodBeat.o(18728);
        }
      }
      for (boolean bool = true; ; bool = false)
      {
        return bool;
        AppMethodBeat.o(18728);
      }
    }
    finally
    {
    }
    throw parama;
  }

  public final void f(Long paramLong)
  {
    AppMethodBeat.i(18730);
    e(paramLong);
    AppMethodBeat.o(18730);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.a.b
 * JD-Core Version:    0.6.2
 */