package com.tencent.mm.plugin.trafficmonitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class e
{
  private static Map<Integer, c> sKi;
  private static e sKj;

  static
  {
    AppMethodBeat.i(114787);
    sKi = new ConcurrentHashMap();
    AppMethodBeat.o(114787);
  }

  private e()
  {
    AppMethodBeat.i(114781);
    l(1, 471859200L, 300000L);
    l(2, 838860800L, 600000L);
    l(3, 1887436800L, 1800000L);
    l(4, -1673527296L, 3603000L);
    AppMethodBeat.o(114781);
  }

  public static e cHE()
  {
    AppMethodBeat.i(114782);
    if (sKj == null);
    try
    {
      if (sKj == null)
      {
        locale = new com/tencent/mm/plugin/trafficmonitor/e;
        locale.<init>();
        sKj = locale;
      }
      e locale = sKj;
      AppMethodBeat.o(114782);
      return locale;
    }
    finally
    {
      AppMethodBeat.o(114782);
    }
  }

  public static void cHF()
  {
    AppMethodBeat.i(114784);
    Iterator localIterator = sKi.values().iterator();
    while (localIterator.hasNext())
      ((c)localIterator.next()).cHB();
    AppMethodBeat.o(114784);
  }

  public static void cHG()
  {
    AppMethodBeat.i(114785);
    Iterator localIterator = sKi.values().iterator();
    while (localIterator.hasNext())
      ((c)localIterator.next()).currentIndex = 0;
    AppMethodBeat.o(114785);
  }

  public static int cHH()
  {
    AppMethodBeat.i(114786);
    int i = -1;
    Iterator localIterator = sKi.values().iterator();
    long l = 0L;
    if (localIterator.hasNext())
    {
      c localc = (c)localIterator.next();
      if (localc.interval <= l)
        break label75;
      l = localc.interval;
      i = localc.id;
    }
    label75: 
    while (true)
    {
      break;
      AppMethodBeat.o(114786);
      return i;
    }
  }

  private void l(int paramInt, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(114783);
    d locald = new d(paramLong1);
    b localb = new b();
    localb.id = paramInt;
    localb.interval = paramLong2;
    localb.type = 0;
    localb.sJZ = locald;
    localb.sKa = new e.1(this, paramInt);
    sKi.put(Integer.valueOf(paramInt), localb);
    AppMethodBeat.o(114783);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.trafficmonitor.e
 * JD-Core Version:    0.6.2
 */