package com.tencent.mm.hardcoder;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class b
  implements Runnable
{
  private Queue<Object> eDZ;
  private h eEa;
  private boolean eEb;
  private Thread thread;

  public b(Context paramContext)
  {
    AppMethodBeat.i(93958);
    this.eDZ = new ConcurrentLinkedQueue();
    this.thread = null;
    this.eEb = false;
    this.eEa = new h(paramContext);
    paramContext = this.eEa;
    if (h.context == null)
    {
      paramContext.PH();
      AppMethodBeat.o(93958);
    }
    while (true)
    {
      return;
      paramContext.PG();
      AppMethodBeat.o(93958);
    }
  }

  public final void an(Object paramObject)
  {
    AppMethodBeat.i(93961);
    if (this.eDZ != null);
    while (true)
    {
      try
      {
        this.eDZ.add(paramObject);
        notify();
        return;
      }
      finally
      {
        AppMethodBeat.o(93961);
      }
      AppMethodBeat.o(93961);
    }
  }

  protected final void finalize()
  {
    AppMethodBeat.i(93962);
    super.finalize();
    this.eDZ.clear();
    AppMethodBeat.o(93962);
  }

  public final void run()
  {
    AppMethodBeat.i(93960);
    c.i("HardCoder.HCPerfStatThread", "[oneliang]HCPerfStatThread start to run.");
    if (!Thread.currentThread().isInterrupted());
    label929: label961: label1090: label1366: label1369: 
    while (true)
    {
      int j;
      Map localMap;
      int[] arrayOfInt2;
      int k;
      a.b localb;
      long l2;
      try
      {
        if (this.eDZ.isEmpty())
          break label1291;
        Object localObject1 = this.eDZ.poll();
        if (!(localObject1 instanceof a))
          break label1274;
        localObject1 = (a)localObject1;
        long l1 = ((a)localObject1).time;
        List localList = ((a)localObject1).eEc;
        i = ((a)localObject1).eEd;
        j = ((a)localObject1).eEf;
        int[] arrayOfInt1 = ((a)localObject1).eDR;
        c.d("HardCoder.HardCoderReporter", String.format("[oneliang]save task status,time:%s,size:%s,cpu:%s,io:%s", new Object[] { Long.valueOf(l1), Integer.valueOf(localList.size()), Integer.valueOf(i), Integer.valueOf(j) }));
        localMap = d.a(l1, this.eEa);
        arrayOfInt2 = f.b.h(localMap);
        localObject1 = g.PF();
        if (localObject1 != null)
          break label1369;
        localObject1 = new long[] { 0L, 0L };
        k = 0;
        if (k >= localList.size())
          break;
        localb = (a.b)localList.get(k);
        if (!localb.PD())
          break label1090;
        l2 = l1 - localb.lastUpdateTime;
        localb.lastUpdateTime = l1;
        if (i == -1)
          break label891;
        if (i == -2)
        {
          localObject3 = localb.eDP;
          m = localb.eDN;
          localObject3[m] = ((int)(localObject3[m] + l2));
          if (j == -1)
            break label961;
          if (j != -2)
            break label929;
          localObject3 = localb.eDQ;
          m = localb.eDO;
          localObject3[m] = ((int)(l2 + localObject3[m]));
          if ((arrayOfInt1 != null) && (arrayOfInt1.length > 0))
            localb.eDR = arrayOfInt1;
          if (!localb.PD())
            break label999;
          m = localb.eDI[0];
          localObject3 = g.jr(m);
          if (localObject3 != null)
            break label1366;
          localObject3 = new long[] { 0L, 0L };
          if (!localb.PD())
            break label1005;
          m = localb.eDI[0];
          l2 = g.jt(g.js(m));
          if (localb.eDU == 0L)
            localb.eDU = l2;
          if (localb.eDS == null)
            localb.eDS = ((long[])localObject3);
          if (localb.eDT == null)
            localb.eDT = ((long[])localObject1);
          localb.eDU = ((l2 + localb.eDU) / 2L);
          if ((localObject3 != null) && (localb.PD()))
          {
            localb.eDV = ((int)(localObject3[0] - localb.eDS[0] + (localObject3[1] - localb.eDS[1])));
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("bindTidsId:");
            c.d("HardCoder.HardCoderReporter", localb.PE() + ", start jiffies:[" + localb.eDS[0] + "," + localb.eDS[1] + "], end jiffies:[" + localObject3[0] + "," + localObject3[1] + "], sum thread jiffies:" + localb.eDV);
          }
          if ((HardCoderJNI.isHcDebug()) && (localObject1 != null) && (localb.PD()))
          {
            localb.eDW = (localObject1[0] - localb.eDT[0] + (localObject1[1] - localb.eDT[1]));
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>("bindTidsId:");
            c.d("HardCoder.HardCoderReporter", localb.PE() + ", process start jiffies:[" + localb.eDT[0] + "," + localb.eDT[1] + "], process end jiffies:[" + localObject1[0] + "," + localObject1[1] + "], sum process jiffies:" + localb.eDW);
          }
          if ((localb.eDX != null) || (localb.eDY != null))
            break label1157;
          if (localMap.get(Integer.valueOf(arrayOfInt2[0])) != null)
            break label1011;
          c.e("HardCoder.HCPerfStatThread", String.format("cpuStatusMap dosn't contain core 0 : %d", new Object[] { Integer.valueOf(arrayOfInt2[0]) }));
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        int i;
        c.e("HardCoder.HCPerfStatThread", "Performance status thread need to interrupt:" + localInterruptedException.getMessage());
        Thread.currentThread().interrupt();
        AppMethodBeat.o(93960);
        return;
        localb.eDN = i;
        localObject3 = localb.eDP;
        localObject3[i] = ((int)(localObject3[i] + l2));
        continue;
      }
      catch (Exception localException)
      {
        c.printErrStackTrace("HardCoder.HCPerfStatThread", localException, "run exception:", new Object[0]);
      }
      break;
      label891: localb.eDN = 0;
      Object localObject3 = localb.eDP;
      int m = localb.eDN;
      localObject3[m] = ((int)(localObject3[m] + l2));
      continue;
      localb.eDO = j;
      localObject3 = localb.eDQ;
      localObject3[j] = ((int)(l2 + localObject3[j]));
      continue;
      localb.eDO = 0;
      localObject3 = localb.eDQ;
      m = localb.eDO;
      localObject3[m] = ((int)(l2 + localObject3[m]));
      continue;
      label999: m = 0;
      continue;
      label1005: m = 0;
      continue;
      label1011: localObject3 = new com/tencent/mm/hardcoder/f$a;
      ((f.a)localObject3).<init>(((d.a)localMap.get(Integer.valueOf(arrayOfInt2[0]))).eEq, ((d.a)localMap.get(Integer.valueOf(arrayOfInt2[0]))).eEr);
      localb.eDX = ((f.a)localObject3);
      if (arrayOfInt2[1] < 0)
      {
        c.e("HardCoder.HCPerfStatThread", "cluster one is unused?may be possible.");
        localb.eDY = null;
      }
      while (true)
      {
        k++;
        break;
        localObject3 = new com/tencent/mm/hardcoder/f$a;
        ((f.a)localObject3).<init>(((d.a)localMap.get(Integer.valueOf(arrayOfInt2[1]))).eEq, ((d.a)localMap.get(Integer.valueOf(arrayOfInt2[1]))).eEr);
        localb.eDY = ((f.a)localObject3);
        continue;
        if (localb.eDX != null)
          localb.eDX.v(((d.a)localMap.get(Integer.valueOf(arrayOfInt2[0]))).eEq, ((d.a)localMap.get(Integer.valueOf(arrayOfInt2[0]))).eEr);
        if (localb.eDY != null)
          localb.eDY.v(((d.a)localMap.get(Integer.valueOf(arrayOfInt2[1]))).eEq, ((d.a)localMap.get(Integer.valueOf(arrayOfInt2[1]))).eEr);
      }
      label1274: if (!(localException instanceof a.b))
        break;
      e.a((a.b)localException);
      break;
      try
      {
        if ((this.eEb) && (this.thread != null))
        {
          this.thread.interrupt();
          this.thread = null;
          this.eEb = false;
        }
        while (this.eDZ.isEmpty())
          wait();
      }
      finally
      {
        AppMethodBeat.o(93960);
      }
      break;
      AppMethodBeat.o(93960);
      continue;
    }
  }

  public final void start()
  {
    try
    {
      AppMethodBeat.i(93959);
      if (this.thread == null)
      {
        Thread localThread = new java/lang/Thread;
        localThread.<init>(this);
        this.thread = localThread;
        this.thread.setPriority(5);
        this.thread.start();
      }
      AppMethodBeat.o(93959);
      return;
    }
    finally
    {
    }
  }

  public static final class a
  {
    public final int[] eDR;
    public final List<a.b> eEc;
    public final int eEd;
    public final int eEe;
    public final int eEf;
    public final long time;

    public a(long paramLong, List<a.b> paramList, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt)
    {
      this.time = paramLong;
      this.eEc = paramList;
      this.eEd = paramInt1;
      this.eEe = paramInt2;
      this.eEf = paramInt3;
      this.eDR = paramArrayOfInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.hardcoder.b
 * JD-Core Version:    0.6.2
 */