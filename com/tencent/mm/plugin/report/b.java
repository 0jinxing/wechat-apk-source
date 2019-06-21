package com.tencent.mm.plugin.report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class b
{
  private int mID;
  private long mInterval;
  private long pWX;
  private HashMap<Integer, Long> pWY;

  public b()
  {
    AppMethodBeat.i(115098);
    this.pWY = new HashMap();
    this.mID = 463;
    this.mInterval = 300000L;
    AppMethodBeat.o(115098);
  }

  private void U(int paramInt, long paramLong)
  {
    AppMethodBeat.i(115100);
    Long localLong = (Long)this.pWY.get(Integer.valueOf(paramInt));
    long l = paramLong;
    if (localLong != null)
      l = paramLong + localLong.longValue();
    this.pWY.put(Integer.valueOf(paramInt), Long.valueOf(l));
    AppMethodBeat.o(115100);
  }

  public final void g(int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(115099);
    try
    {
      U(paramInt1, paramLong);
      U(paramInt2, 1L);
      paramLong = System.currentTimeMillis();
      if (paramLong - this.pWX <= this.mInterval)
        break label132;
      Iterator localIterator = this.pWY.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        e.pXa.a(this.mID, ((Integer)localEntry.getKey()).intValue(), ((Long)localEntry.getValue()).longValue(), false);
      }
    }
    finally
    {
      AppMethodBeat.o(115099);
    }
    this.pWX = paramLong;
    label132: AppMethodBeat.o(115099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.b
 * JD-Core Version:    0.6.2
 */