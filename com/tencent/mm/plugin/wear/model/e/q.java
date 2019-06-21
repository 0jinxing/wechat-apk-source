package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class q
{
  public HashMap<Integer, a> tYL;

  public q()
  {
    AppMethodBeat.i(26426);
    this.tYL = new HashMap();
    AppMethodBeat.o(26426);
  }

  public final a HL(int paramInt)
  {
    AppMethodBeat.i(26428);
    a locala = (a)this.tYL.get(Integer.valueOf(paramInt));
    AppMethodBeat.o(26428);
    return locala;
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(26427);
    Iterator localIterator = parama.cUA().iterator();
    while (localIterator.hasNext())
    {
      int i = ((Integer)localIterator.next()).intValue();
      ab.d("MicroMsg.Wear.WearHttpServerLogic", "add funId %d %s", new Object[] { Integer.valueOf(i), parama });
      this.tYL.put(Integer.valueOf(i), parama);
    }
    AppMethodBeat.o(26427);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.q
 * JD-Core Version:    0.6.2
 */