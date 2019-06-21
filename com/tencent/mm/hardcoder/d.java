package com.tencent.mm.hardcoder;

import android.os.Process;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public final class d
  implements Runnable
{
  private h eEa;
  private Set<Integer> eEh;
  private f eEi;
  private long eEj;
  private long eEk;

  public static Map<Integer, a> a(final long paramLong, h paramh)
  {
    AppMethodBeat.i(93929);
    TreeMap localTreeMap = new TreeMap();
    int i = Runtime.getRuntime().availableProcessors();
    for (final int j = 0; j < i; j++)
    {
      File localFile = new File("/sys/devices/system/cpu/cpu" + j + "/cpufreq/scaling_cur_freq");
      if (localFile.exists())
        g.a(localFile.getAbsolutePath(), new g.a()
        {
          public final boolean kZ(String paramAnonymousString)
          {
            AppMethodBeat.i(93923);
            long l = Long.parseLong(paramAnonymousString.trim());
            if (this.eEl.eEH.containsKey(Integer.valueOf(j)))
            {
              paramAnonymousString = (Integer)((h.a)this.eEl.eEH.get(Integer.valueOf(j))).eEN.get(Long.valueOf(l));
              if (paramAnonymousString == null);
            }
            for (int i = paramAnonymousString.intValue(); ; i = 0)
            {
              paramAnonymousString = new d.a(paramLong, j, l, i);
              this.eEo.put(Integer.valueOf(j), paramAnonymousString);
              c.d("HardCoder.HardCoderMonitor", paramAnonymousString.toString());
              AppMethodBeat.o(93923);
              return false;
            }
          }
        });
    }
    AppMethodBeat.o(93929);
    return localTreeMap;
  }

  protected final void finalize()
  {
    AppMethodBeat.i(93930);
    super.finalize();
    this.eEh = null;
    this.eEa = null;
    this.eEi = null;
    AppMethodBeat.o(93930);
  }

  public final void run()
  {
    AppMethodBeat.i(93928);
    if (!Thread.currentThread().isInterrupted());
    while (true)
    {
      while (true)
      {
        while (true)
        {
          while (true)
          {
            long l1;
            Object localObject8;
            int j;
            long l2;
            try
            {
              l1 = System.currentTimeMillis();
              if ((l1 < this.eEj) || (l1 > this.eEk))
                break label670;
              Object localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("get cpu current freq,begin:");
              c.d("HardCoder.HardCoderMonitor", SystemClock.elapsedRealtime());
              localObject1 = a(l1, this.eEa);
              localObject6 = new java/lang/StringBuilder;
              ((StringBuilder)localObject6).<init>("get cpu current freq,end:");
              c.d("HardCoder.HardCoderMonitor", SystemClock.elapsedRealtime());
              localObject6 = new java/util/HashSet;
              ((HashSet)localObject6).<init>();
              localObject7 = new java/io/File;
              localObject8 = new java/lang/StringBuilder;
              ((StringBuilder)localObject8).<init>("/proc/");
              ((File)localObject7).<init>(Process.myPid() + "/task");
              if (!((File)localObject7).isDirectory())
                break label500;
              localObject8 = ((File)localObject7).listFiles();
              if ((localObject8 == null) || (localObject8.length == 0))
              {
                i = 1;
                localObject8 = new java/util/TreeMap;
                ((TreeMap)localObject8).<init>();
                this.eEh.addAll((Collection)localObject6);
                localObject6 = new java/lang/StringBuilder;
                ((StringBuilder)localObject6).<init>("get thread current stat,end:");
                c.d("HardCoder.HardCoderMonitor", SystemClock.elapsedRealtime());
                if (i != 0)
                  break label638;
                if (this.eEh.isEmpty())
                  break label602;
                localObject6 = this.eEh.iterator();
                if (!((Iterator)localObject6).hasNext())
                  break label551;
                i = ((Integer)((Iterator)localObject6).next()).intValue();
                long[] arrayOfLong = g.jr(i);
                j = g.js(i);
                l2 = g.jt(j);
                if (!((Map)localObject8).containsKey(Integer.valueOf(i)))
                  break label514;
                ((Map)localObject8).get(Integer.valueOf(i));
                continue;
              }
            }
            catch (InterruptedException localInterruptedException)
            {
              c.e("HardCoder.HardCoderMonitor", "Monitor thread need to interrupt:" + localInterruptedException.getMessage());
              Thread.currentThread().interrupt();
              AppMethodBeat.o(93928);
              return;
              localObject7 = new java/lang/StringBuilder;
              ((StringBuilder)localObject7).<init>("thread size:");
              c.d("HardCoder.HardCoderMonitor", localObject8.length);
              j = localObject8.length;
              i = 0;
              if (i >= j)
                break label494;
              localObject7 = localObject8[i].getName();
              try
              {
                ((Set)localObject6).add(Integer.valueOf(Integer.parseInt((String)localObject7, 0)));
                i++;
              }
              catch (Exception localException2)
              {
                localObject7 = new java/lang/StringBuilder;
                ((StringBuilder)localObject7).<init>("integer parse error:");
                c.e("HardCoder.HardCoderMonitor", localException2.getMessage());
                continue;
              }
            }
            catch (Exception localException1)
            {
              c.printErrStackTrace("HardCoder.HardCoderMonitor", localException1, "exception:", new Object[0]);
            }
            break;
            label494: int i = 0;
            continue;
            label500: c.e("HardCoder.HardCoderMonitor", "impossible as usual");
            i = 1;
            continue;
            label514: Object localObject7 = new com/tencent/mm/hardcoder/d$c;
            ((c)localObject7).<init>(i, l1, j, l2, localException2);
            ((Map)localObject8).put(Integer.valueOf(i), localObject7);
            continue;
            label551: localObject7 = this.eEi;
            Object localObject6 = new com/tencent/mm/hardcoder/d$b;
            ((b)localObject6).<init>(l1, localException1, (Map)localObject8);
            ((f)localObject7).a((b)localObject6);
            try
            {
              wait(50L);
              break;
            }
            finally
            {
              AppMethodBeat.o(93928);
            }
          }
          try
          {
            label602: 
            while (this.eEh.isEmpty())
              wait();
          }
          finally
          {
            AppMethodBeat.o(93928);
          }
          break;
          try
          {
            label638: wait(60000L);
            c.i("HardCoder.HardCoderMonitor", "Monitor thread wait(pid/task error):60000");
            break;
          }
          finally
          {
            AppMethodBeat.o(93928);
          }
        }
        try
        {
          label670: wait(60000L);
          c.i("HardCoder.HardCoderMonitor", "Monitor thread wait(no in time):60000");
          break;
        }
        finally
        {
          AppMethodBeat.o(93928);
        }
      }
      AppMethodBeat.o(93928);
    }
  }

  public static final class a
  {
    public final int eEp;
    public final long eEq;
    public final int eEr;
    public final long startTime;

    public a(long paramLong1, int paramInt1, long paramLong2, int paramInt2)
    {
      this.startTime = paramLong1;
      this.eEp = paramInt1;
      this.eEq = paramLong2;
      this.eEr = paramInt2;
    }

    public final String toString()
    {
      AppMethodBeat.i(93924);
      String str = String.format("Cpu status,startTime:%s,coreId:%s,freq:%s,power:%s", new Object[] { Long.valueOf(this.startTime), Integer.valueOf(this.eEp), Long.valueOf(this.eEq), Integer.valueOf(this.eEr) });
      AppMethodBeat.o(93924);
      return str;
    }
  }

  public static final class b
  {
    public final Map<Integer, d.a> eEs;
    public final Map<Integer, d.c> eEt;
    public final long time;

    public b(long paramLong, Map<Integer, d.a> paramMap, Map<Integer, d.c> paramMap1)
    {
      this.time = paramLong;
      this.eEs = paramMap;
      this.eEt = paramMap1;
    }
  }

  public static final class c
  {
    public final long[] eDS;
    public long eDU;
    public final int eEu;
    public final int eEv;
    public final long eEw;
    public long eEx;
    public final long startTime;

    public c(int paramInt1, long paramLong1, int paramInt2, long paramLong2, long[] paramArrayOfLong)
    {
      AppMethodBeat.i(93925);
      this.eDU = 0L;
      this.eEx = 0L;
      this.eEu = paramInt1;
      this.startTime = paramLong1;
      this.eEv = paramInt2;
      this.eEw = paramLong2;
      this.eDS = paramArrayOfLong;
      this.eDU = this.eEw;
      AppMethodBeat.o(93925);
    }

    public final void a(long paramLong, long[] paramArrayOfLong)
    {
      AppMethodBeat.i(93926);
      this.eDU = ((this.eDU + paramLong) / 2L);
      if (paramArrayOfLong != null)
      {
        this.eEx = (paramArrayOfLong[0] - this.eDS[0] + (paramArrayOfLong[1] - this.eDS[1]));
        c.d("HardCoder.HardCoderMonitor", "thread id:" + this.eEu + ",start jiffies:[" + this.eDS[0] + "," + this.eDS[1] + "], end jiffies:[" + paramArrayOfLong[0] + "," + paramArrayOfLong[1] + "]");
      }
      AppMethodBeat.o(93926);
    }

    public final String toString()
    {
      AppMethodBeat.i(93927);
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(String.format("Thread status,threadId:%s,startTime:%s,startCoreId:%s,startCoreFreq:%s", new Object[] { Integer.valueOf(this.eEu), Long.valueOf(this.startTime), Integer.valueOf(this.eEv), Long.valueOf(this.eEw) }));
      ((StringBuilder)localObject).append(String.format(",sumJiffies:%s", new Object[] { Long.valueOf(this.eEx) }));
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(93927);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.hardcoder.d
 * JD-Core Version:    0.6.2
 */