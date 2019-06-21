package com.tencent.mm.hardcoder;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public final class f
  implements Runnable
{
  private b eEA;
  private Deque<b> eEB;
  private boolean eEb;
  private Queue<d.b> eEz;
  private Thread thread;

  public final void a(d.b paramb)
  {
    AppMethodBeat.i(93940);
    if (this.eEz != null);
    while (true)
    {
      try
      {
        this.eEz.add(paramb);
        notify();
        return;
      }
      finally
      {
        AppMethodBeat.o(93940);
      }
      AppMethodBeat.o(93940);
    }
  }

  protected final void finalize()
  {
    AppMethodBeat.i(93941);
    super.finalize();
    this.eEz = null;
    this.eEA = null;
    this.eEB = null;
    AppMethodBeat.o(93941);
  }

  public final void run()
  {
    AppMethodBeat.i(93939);
    if (!Thread.currentThread().isInterrupted());
    while (true)
    {
      Object localObject4;
      try
      {
        if (this.eEz.isEmpty())
          break label408;
        localObject1 = (d.b)this.eEz.poll();
        if (localObject1 == null)
          break;
        l = ((d.b)localObject1).time;
        Object localObject2 = ((d.b)localObject1).eEs;
        localObject1 = ((d.b)localObject1).eEt;
        if (this.eEA == null)
        {
          localObject4 = new com/tencent/mm/hardcoder/f$b;
          ((b)localObject4).<init>(l, (Map)localObject2, (Map)localObject1);
          this.eEA = ((b)localObject4);
          c.i("HardCoder.HardCoderStatThread", this.eEA.toString());
          localObject4 = new com/tencent/mm/hardcoder/f$b;
          ((b)localObject4).<init>(l, (Map)localObject2, (Map)localObject1);
          localObject1 = (b)this.eEB.peekFirst();
          localObject2 = (b)this.eEB.peekLast();
          if ((localObject1 == null) || (localObject2 == null))
            break label393;
          if (((b)localObject2).startTime - ((b)localObject1).startTime >= 30000L)
            this.eEB.removeFirst();
          this.eEB.add(localObject4);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        Object localObject1;
        long l;
        c.e("HardCoder.HardCoderStatThread", "Stat thread need to interrupt:" + localInterruptedException.getMessage());
        Thread.currentThread().interrupt();
        AppMethodBeat.o(93939);
        return;
        b localb = this.eEA;
        localObject4 = b.h(localInterruptedException);
        localb.updateTime = l;
        localb.eDX.v(((d.a)localInterruptedException.get(Integer.valueOf(localObject4[0]))).eEq, ((d.a)localInterruptedException.get(Integer.valueOf(localObject4[0]))).eEr);
        if (localb.eDY != null)
          localb.eDY.v(((d.a)localInterruptedException.get(Integer.valueOf(localObject4[1]))).eEq, ((d.a)localInterruptedException.get(Integer.valueOf(localObject4[1]))).eEr);
        localb.i((Map)localObject1);
        continue;
      }
      catch (Exception localException)
      {
        c.e("HardCoder.HardCoderStatThread", "exception:" + localException.getMessage());
      }
      break;
      label393: this.eEB.add(localObject4);
      break;
      try
      {
        label408: if (this.eEb)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("snapshotStatDeque size:");
          c.i("HardCoder.HardCoderStatThread", this.eEB.size());
          if (this.thread != null)
          {
            this.thread.interrupt();
            this.thread = null;
            this.eEb = false;
          }
        }
        while (this.eEz.isEmpty())
          wait();
      }
      finally
      {
        AppMethodBeat.o(93939);
      }
      break;
      AppMethodBeat.o(93939);
    }
  }

  public static final class a
  {
    public final long eEC;
    public final long eED;
    public long eEE;
    public long eEF;

    public a(long paramLong1, long paramLong2)
    {
      AppMethodBeat.i(93933);
      this.eEE = 0L;
      this.eEF = 0L;
      this.eEC = paramLong1;
      this.eED = paramLong2;
      this.eEE = this.eEC;
      this.eEF = this.eED;
      AppMethodBeat.o(93933);
    }

    public final String toString()
    {
      AppMethodBeat.i(93934);
      String str = String.format("startFreq:%s, startPower:%s, averageFreq:%s, averagePower:%s", new Object[] { Long.valueOf(this.eEC), Long.valueOf(this.eED), Long.valueOf(this.eEE), Long.valueOf(this.eEF) });
      AppMethodBeat.o(93934);
      return str;
    }

    public final void v(long paramLong1, long paramLong2)
    {
      this.eEE = ((this.eEE + paramLong1) / 2L);
      this.eEF = ((this.eEF + paramLong2) / 2L);
    }
  }

  public static final class b
  {
    public final f.a eDX;
    public final f.a eDY;
    public final Map<Integer, d.c> eEG;
    public final Map<Integer, d.a> eEs;
    public final long startTime;
    public long updateTime;

    public b(long paramLong, Map<Integer, d.a> paramMap, Map<Integer, d.c> paramMap1)
    {
      AppMethodBeat.i(93935);
      this.eEG = new TreeMap();
      this.updateTime = 0L;
      int[] arrayOfInt = h(paramMap);
      this.eEs = paramMap;
      this.eDX = new f.a(((d.a)paramMap.get(Integer.valueOf(arrayOfInt[0]))).eEq, ((d.a)paramMap.get(Integer.valueOf(arrayOfInt[0]))).eEr);
      if (arrayOfInt[1] < 0)
        c.e("HardCoder.HardCoderStatThread", "cluster one is unused?may be possible.");
      for (this.eDY = null; ; this.eDY = new f.a(((d.a)paramMap.get(Integer.valueOf(arrayOfInt[1]))).eEq, ((d.a)paramMap.get(Integer.valueOf(arrayOfInt[1]))).eEr))
      {
        this.startTime = paramLong;
        this.updateTime = this.startTime;
        i(paramMap1);
        AppMethodBeat.o(93935);
        return;
      }
    }

    public static int[] h(Map<Integer, d.a> paramMap)
    {
      AppMethodBeat.i(93936);
      if (paramMap == null)
      {
        paramMap = new NullPointerException("cpuStatusMap can not be null");
        AppMethodBeat.o(93936);
        throw paramMap;
      }
      int i = h.eEJ;
      if (i >= 0)
        if (!paramMap.containsKey(Integer.valueOf(i)));
      for (int j = i; ; j = -1)
      {
        if (j < 0)
          c.e("HardCoder.HardCoderStatThread", "cluster zero is unused?impossible.CLUSTER_ZERO_CORE_ID:" + h.eEJ);
        i = h.eEK;
        label80: if (i > h.eEJ)
          if (!paramMap.containsKey(Integer.valueOf(i)));
        while (true)
        {
          AppMethodBeat.o(93936);
          return new int[] { j, i };
          i--;
          break;
          i--;
          break label80;
          i = -1;
        }
      }
    }

    final void i(Map<Integer, d.c> paramMap)
    {
      AppMethodBeat.i(93937);
      if (paramMap == null)
      {
        paramMap = new NullPointerException("threadStatusMap can not be null");
        AppMethodBeat.o(93937);
        throw paramMap;
      }
      Iterator localIterator = paramMap.entrySet().iterator();
      if (localIterator.hasNext())
      {
        paramMap = (Map.Entry)localIterator.next();
        int i = ((Integer)paramMap.getKey()).intValue();
        d.c localc = (d.c)paramMap.getValue();
        if (this.eEG.containsKey(Integer.valueOf(i)))
          paramMap = (d.c)this.eEG.get(Integer.valueOf(i));
        while (true)
        {
          paramMap.a(localc.eEw, localc.eDS);
          break;
          paramMap = new d.c(localc.eEu, localc.startTime, localc.eEv, localc.eEw, localc.eDS);
          this.eEG.put(Integer.valueOf(i), paramMap);
        }
      }
      AppMethodBeat.o(93937);
    }

    public final String toString()
    {
      AppMethodBeat.i(93938);
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(String.format("startTime:%s,updateTime:%s", new Object[] { Long.valueOf(this.startTime), Long.valueOf(this.updateTime) }));
      ((StringBuilder)localObject).append(",");
      ((StringBuilder)localObject).append(this.eDX);
      if (this.eDY != null)
      {
        ((StringBuilder)localObject).append(",");
        ((StringBuilder)localObject).append(this.eDY);
      }
      ((StringBuilder)localObject).append(",");
      ((StringBuilder)localObject).append(this.eEG.toString());
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(93938);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.hardcoder.f
 * JD-Core Version:    0.6.2
 */