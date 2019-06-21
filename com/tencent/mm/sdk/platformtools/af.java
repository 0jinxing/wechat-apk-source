package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public final class af
{
  private static af.b ebD;
  private static int xyU;
  private static Map<Integer, af> xyW;
  private static boolean xyY;
  private static boolean xyZ;
  private final boolean fqL;
  private long interval;
  private long ts;
  private final int xyV;
  private final af.a xyX;

  static
  {
    AppMethodBeat.i(52050);
    xyW = new HashMap();
    xyY = false;
    AppMethodBeat.o(52050);
  }

  public af(af.a parama)
  {
    AppMethodBeat.i(52045);
    this.ts = 0L;
    this.interval = 0L;
    Assert.assertTrue("bumper not initialized", xyY);
    this.xyX = parama;
    this.fqL = true;
    if (xyU >= 8192)
      xyU = 0;
    int i = xyU + 1;
    xyU = i;
    this.xyV = i;
    AppMethodBeat.o(52045);
  }

  public static void a(af.b paramb)
  {
    xyY = true;
    ebD = paramb;
  }

  public static long dov()
  {
    AppMethodBeat.i(52046);
    xyZ = false;
    LinkedList localLinkedList = new LinkedList();
    Object localObject = new HashSet();
    ((Set)localObject).addAll(xyW.keySet());
    Iterator localIterator = ((Set)localObject).iterator();
    long l1 = 9223372036854775807L;
    if (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      localObject = (af)xyW.get(localInteger);
      if (localObject == null)
        break label270;
      long l2 = bo.az(((af)localObject).ts);
      long l3 = l2;
      if (l2 < 0L)
        l3 = 0L;
      if (l3 > ((af)localObject).interval)
      {
        if ((!((af)localObject).xyX.BI()) || (!((af)localObject).fqL))
          localLinkedList.add(localInteger);
        while (true)
        {
          ((af)localObject).ts = bo.yz();
          break;
          l1 = ((af)localObject).interval;
        }
      }
      if (((af)localObject).interval - l3 >= l1)
        break label270;
      l1 = ((af)localObject).interval - l3;
    }
    label270: 
    while (true)
    {
      break;
      for (int i = 0; i < localLinkedList.size(); i++)
        xyW.remove(localLinkedList.get(i));
      if ((!xyZ) && (l1 == 9223372036854775807L) && (ebD != null))
      {
        ebD.cancel();
        ab.v("MicroMsg.MAlarmHandler", "cancel bumper for no more handler");
      }
      AppMethodBeat.o(52046);
      return l1;
    }
  }

  private static boolean mr(long paramLong)
  {
    AppMethodBeat.i(52049);
    ab.d("MicroMsg.MAlarmHandler", "check need prepare: check=".concat(String.valueOf(paramLong)));
    Iterator localIterator = xyW.entrySet().iterator();
    long l1 = 9223372036854775807L;
    while (localIterator.hasNext())
    {
      af localaf = (af)((Map.Entry)localIterator.next()).getValue();
      if (localaf == null)
        break label167;
      long l2 = bo.az(localaf.ts);
      long l3 = l2;
      if (l2 < 0L)
        l3 = 0L;
      if (l3 > localaf.interval)
      {
        l1 = localaf.interval;
      }
      else
      {
        if (localaf.interval - l3 >= l1)
          break label167;
        l1 = localaf.interval - l3;
      }
    }
    label167: 
    while (true)
    {
      break;
      boolean bool;
      if (l1 > paramLong)
      {
        bool = true;
        AppMethodBeat.o(52049);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(52049);
      }
    }
  }

  public final void dow()
  {
    AppMethodBeat.i(52047);
    xyZ = true;
    this.interval = 50000L;
    this.ts = bo.yz();
    boolean bool = mr(this.interval);
    stopTimer();
    xyW.put(Integer.valueOf(this.xyV), this);
    if ((ebD != null) && (bool))
    {
      ab.v("MicroMsg.MAlarmHandler", "prepare bumper");
      ebD.prepare();
    }
    AppMethodBeat.o(52047);
  }

  protected final void finalize()
  {
    AppMethodBeat.i(52044);
    stopTimer();
    super.finalize();
    AppMethodBeat.o(52044);
  }

  public final void stopTimer()
  {
    AppMethodBeat.i(52048);
    xyW.remove(Integer.valueOf(this.xyV));
    AppMethodBeat.o(52048);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.af
 * JD-Core Version:    0.6.2
 */