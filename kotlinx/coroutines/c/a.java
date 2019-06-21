package kotlinx.coroutines.c;

import a.aa;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.af;
import kotlinx.coroutines.bs;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;", "corePoolSize", "", "maxPoolSize", "idleWorkerKeepAliveNs", "", "schedulerName", "", "(IIJLjava/lang/String;)V", "_isTerminated", "Lkotlinx/atomicfu/AtomicInt;", "blockingWorkers", "getBlockingWorkers", "()I", "controlState", "Lkotlinx/atomicfu/AtomicLong;", "cpuPermits", "Ljava/util/concurrent/Semaphore;", "createdWorkers", "getCreatedWorkers", "globalQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "isTerminated", "", "()Z", "parkedWorkersStack", "random", "Ljava/util/Random;", "workers", "", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "[Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "state", "close", "", "createNewWorker", "createTask", "Lkotlinx/coroutines/scheduling/Task;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "taskContext", "Lkotlinx/coroutines/scheduling/TaskContext;", "createTask$kotlinx_coroutines_core", "decrementBlockingWorkers", "decrementCreatedWorkers", "dispatch", "fair", "execute", "command", "incrementBlockingWorkers", "incrementCreatedWorkers", "parkedWorkersStackNextIndex", "worker", "parkedWorkersStackPop", "parkedWorkersStackPush", "parkedWorkersStackTopUpdate", "oldIndex", "newIndex", "requestCpuWorker", "runSafely", "task", "shutdown", "timeout", "submitToLocalQueue", "toString", "tryUnpark", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core"})
public final class a
  implements Closeable, Executor
{
  private static final AtomicLongFieldUpdater BRW;
  static final AtomicLongFieldUpdater BRZ;
  private static final AtomicIntegerFieldUpdater BSb;
  private static final int BSf;
  private static final int BSg;
  private static final kotlinx.coroutines.a.m BSh;
  public static final a.a BSi;
  private final e BRT;
  private final Semaphore BRU;
  private volatile long BRV;
  private final a.b[] BRX;
  volatile long BRY;
  private volatile int BSa;
  private final int BSc;
  private final long BSd;
  private final String BSe;
  private final int cml;
  private final Random random;

  static
  {
    AppMethodBeat.i(118335);
    BSi = new a.a((byte)0);
    BSf = (int)TimeUnit.SECONDS.toNanos(1L);
    BSg = (int)a.h.e.aj(a.h.e.ai(m.BSS / 4L, 10L), BSf);
    BSh = new kotlinx.coroutines.a.m("NOT_IN_STACK");
    BRW = AtomicLongFieldUpdater.newUpdater(a.class, "BRV");
    BRZ = AtomicLongFieldUpdater.newUpdater(a.class, "BRY");
    BSb = AtomicIntegerFieldUpdater.newUpdater(a.class, "BSa");
    AppMethodBeat.o(118335);
  }

  public a(int paramInt1, int paramInt2, long paramLong, String paramString)
  {
    AppMethodBeat.i(118329);
    this.cml = paramInt1;
    this.BSc = paramInt2;
    this.BSd = paramLong;
    this.BSe = paramString;
    if (this.cml > 0);
    for (paramInt1 = 1; paramInt1 == 0; paramInt1 = 0)
    {
      paramString = (Throwable)new IllegalArgumentException(("Core pool size " + this.cml + " should be at least 1").toString());
      AppMethodBeat.o(118329);
      throw paramString;
    }
    if (this.BSc >= this.cml);
    for (paramInt1 = 1; paramInt1 == 0; paramInt1 = 0)
    {
      paramString = (Throwable)new IllegalArgumentException(("Max pool size " + this.BSc + " should be greater than or equals to core pool size " + this.cml).toString());
      AppMethodBeat.o(118329);
      throw paramString;
    }
    if (this.BSc <= 2097150);
    for (paramInt1 = 1; paramInt1 == 0; paramInt1 = 0)
    {
      paramString = (Throwable)new IllegalArgumentException(("Max pool size " + this.BSc + " should not exceed maximal supported number of threads 2097150").toString());
      AppMethodBeat.o(118329);
      throw paramString;
    }
    if (this.BSd > 0L);
    for (paramInt1 = i; paramInt1 == 0; paramInt1 = 0)
    {
      paramString = (Throwable)new IllegalArgumentException(("Idle worker keep alive time " + this.BSd + " must be positive").toString());
      AppMethodBeat.o(118329);
      throw paramString;
    }
    this.BRT = new e();
    this.BRU = new Semaphore(this.cml, false);
    this.BRV = 0L;
    this.BRX = new a.b[this.BSc + 1];
    this.BRY = 0L;
    this.random = new Random();
    this.BSa = 0;
    AppMethodBeat.o(118329);
  }

  private static int a(a.b paramb)
  {
    for (paramb = paramb.BSp; ; paramb = paramb.BSp)
    {
      int i;
      if (paramb == BSh)
        i = -1;
      do
      {
        while (true)
        {
          return i;
          if (paramb != null)
            break;
          i = 0;
        }
        paramb = (a.b)paramb;
        i = paramb.BSj;
      }
      while (i != 0);
    }
  }

  public static i a(Runnable paramRunnable, j paramj)
  {
    AppMethodBeat.i(118323);
    a.f.b.j.p(paramRunnable, "block");
    a.f.b.j.p(paramj, "taskContext");
    long l = m.BSX.nanoTime();
    if ((paramRunnable instanceof i))
    {
      ((i)paramRunnable).BSM = l;
      ((i)paramRunnable).BSN = paramj;
      paramRunnable = (i)paramRunnable;
      AppMethodBeat.o(118323);
    }
    while (true)
    {
      return paramRunnable;
      paramRunnable = (i)new k(paramRunnable, l, paramj);
      AppMethodBeat.o(118323);
    }
  }

  private static void a(i parami)
  {
    AppMethodBeat.i(118328);
    try
    {
      parami.run();
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        parami = Thread.currentThread();
        a.f.b.j.o(parami, "thread");
        parami.getUncaughtExceptionHandler().uncaughtException(parami, localThrowable);
        bs.elC();
        AppMethodBeat.o(118328);
      }
    }
    finally
    {
      bs.elC();
      AppMethodBeat.o(118328);
    }
    throw parami;
  }

  private final a.b elT()
  {
    AppMethodBeat.i(118318);
    long l = this.BRV;
    int i = (int)(0x1FFFFF & l);
    a.b localb = this.BRX[i];
    if (localb == null)
    {
      localb = null;
      AppMethodBeat.o(118318);
    }
    while (true)
    {
      return localb;
      i = a(localb);
      if ((i < 0) || (!BRW.compareAndSet(this, l, 0xFFE00000 & 2097152L + l | i)))
        break;
      localb.BSp = BSh;
      AppMethodBeat.o(118318);
    }
  }

  private final void elU()
  {
    AppMethodBeat.i(118324);
    if (this.BRU.availablePermits() == 0)
    {
      elV();
      AppMethodBeat.o(118324);
    }
    while (true)
    {
      return;
      if (elV())
      {
        AppMethodBeat.o(118324);
      }
      else
      {
        long l = this.BRY;
        if ((int)(0x1FFFFF & l) - (int)((l & 0xFFE00000) >> 21) < this.cml)
        {
          int i = elW();
          if ((i == 1) && (this.cml > 1))
            elW();
          if (i > 0)
            AppMethodBeat.o(118324);
        }
        else
        {
          elV();
          AppMethodBeat.o(118324);
        }
      }
    }
  }

  private final boolean elV()
  {
    AppMethodBeat.i(118325);
    a.b localb = elT();
    boolean bool;
    if (localb == null)
    {
      bool = false;
      AppMethodBeat.o(118325);
    }
    while (true)
    {
      return bool;
      localb.eme();
      bool = localb.ema();
      LockSupport.unpark((Thread)localb);
      if ((!bool) || (!localb.emb()))
        break;
      bool = true;
      AppMethodBeat.o(118325);
    }
  }

  private final int elW()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(118326);
    while (true)
    {
      int k;
      int m;
      synchronized (this.BRX)
      {
        boolean bool = isTerminated();
        if (bool)
        {
          j = -1;
          AppMethodBeat.o(118326);
          return j;
        }
        long l = this.BRY;
        k = (int)(l & 0x1FFFFF);
        m = k - (int)((l & 0xFFE00000) >> 21);
        int n = this.cml;
        if (m >= n)
        {
          AppMethodBeat.o(118326);
          continue;
        }
        if (k < this.BSc)
        {
          k = this.BRU.availablePermits();
          if (k != 0);
        }
        else
        {
          AppMethodBeat.o(118326);
          continue;
        }
        k = (int)(this.BRY & 0x1FFFFF) + 1;
        if ((k > 0) && (this.BRX[k] == null))
        {
          j = 1;
          if (j != 0)
            break label212;
          Object localObject1 = new java/lang/IllegalArgumentException;
          ((IllegalArgumentException)localObject1).<init>("Failed requirement.".toString());
          localObject1 = (Throwable)localObject1;
          AppMethodBeat.o(118326);
          throw ((Throwable)localObject1);
        }
      }
      j = 0;
      continue;
      label212: Object localObject3 = new kotlinx/coroutines/c/a$b;
      ((a.b)localObject3).<init>(this, k);
      ((a.b)localObject3).start();
      j = i;
      if (k == (int)(BRZ.incrementAndGet(this) & 0x1FFFFF))
        j = 1;
      if (j == 0)
      {
        localObject3 = new java/lang/IllegalArgumentException;
        ((IllegalArgumentException)localObject3).<init>("Failed requirement.".toString());
        localObject3 = (Throwable)localObject3;
        AppMethodBeat.o(118326);
        throw ((Throwable)localObject3);
      }
      this.BRX[k] = localObject3;
      j = m + 1;
      AppMethodBeat.o(118326);
    }
  }

  private final boolean isTerminated()
  {
    if (this.BSa != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void a(Runnable paramRunnable, j paramj, boolean paramBoolean)
  {
    AppMethodBeat.i(118321);
    a.f.b.j.p(paramRunnable, "block");
    a.f.b.j.p(paramj, "taskContext");
    bs.elC();
    i locali = a(paramRunnable, paramj);
    paramj = Thread.currentThread();
    paramRunnable = paramj;
    if (!(paramj instanceof a.b))
      paramRunnable = null;
    paramRunnable = (a.b)paramRunnable;
    int i;
    if (paramRunnable == null)
    {
      i = 1;
      switch (i)
      {
      case 0:
      default:
        elU();
        AppMethodBeat.o(118321);
      case -1:
      case 1:
      }
    }
    while (true)
    {
      return;
      if (paramRunnable.BSv != (a)this)
      {
        i = 1;
        break;
      }
      if (paramRunnable.BSl == a.c.BSA)
      {
        i = 1;
        break;
      }
      int j = -1;
      i = j;
      if (locali.eml() == l.BSP)
      {
        if (paramRunnable.BSl == a.c.BSx)
        {
          i = 1;
          label163: if (i == 0)
            break label215;
          i = 0;
        }
      }
      else
        label171: if (!paramBoolean)
          break label232;
      label215: label232: for (paramBoolean = paramRunnable.BSk.b(locali, this.BRT); ; paramBoolean = paramRunnable.BSk.a(locali, this.BRT))
      {
        if ((!paramBoolean) || (paramRunnable.BSk.emm() > m.BST))
          break label249;
        break;
        i = 0;
        break label163;
        i = j;
        if (paramRunnable.emc())
          break label171;
        i = 1;
        break;
      }
      label249: i = 0;
      break;
      AppMethodBeat.o(118321);
      continue;
      if (!this.BRT.en(locali))
      {
        paramRunnable = (Throwable)new RejectedExecutionException(this.BSe + " was terminated");
        AppMethodBeat.o(118321);
        throw paramRunnable;
      }
      elU();
      AppMethodBeat.o(118321);
    }
  }

  public final void close()
  {
    int i = 1;
    AppMethodBeat.i(118320);
    if (BSb.compareAndSet(this, 0, 1))
    {
      Object localObject1 = Thread.currentThread();
      ??? = localObject1;
      if (!(localObject1 instanceof a.b))
        ??? = null;
      a.b localb = (a.b)???;
      while (true)
      {
        int j;
        synchronized (this.BRX)
        {
          long l = this.BRY;
          j = (int)(l & 0x1FFFFF);
          if (j <= 0)
            break;
          k = 1;
          localObject1 = this.BRX[k];
          if (localObject1 == null)
            a.f.b.j.dWJ();
          if (localObject1 == localb)
            break label198;
          if (((a.b)localObject1).isAlive())
          {
            LockSupport.unpark((Thread)localObject1);
            ((a.b)localObject1).join(10000L);
          }
        }
        for (int m = 1; m == 0; m = 0)
        {
          ??? = (Throwable)new IllegalStateException("Expected TERMINATED state, but found ".concat(String.valueOf(???)).toString());
          AppMethodBeat.o(118320);
          throw ((Throwable)???);
        }
        localObject2.BSk.b(this.BRT);
        label198: if (k == j)
          break;
        k++;
      }
      this.BRT.close();
      if (localb != null)
      {
        i locali = localb.emf();
        ??? = locali;
        if (locali != null);
      }
      else
      {
        ??? = (i)this.BRT.elE();
      }
      if (??? == null)
      {
        if (localb != null)
          localb.a(a.c.BSA);
        if (this.BRU.availablePermits() != this.cml)
          break label321;
      }
      label321: for (int k = i; ; k = 0)
      {
        if ((!aa.AUz) || (k != 0))
          break label327;
        ??? = (Throwable)new AssertionError("Assertion failed");
        AppMethodBeat.o(118320);
        throw ((Throwable)???);
        a((i)???);
        break;
      }
      label327: this.BRV = 0L;
      this.BRY = 0L;
    }
    AppMethodBeat.o(118320);
  }

  public final void execute(Runnable paramRunnable)
  {
    AppMethodBeat.i(118319);
    a.f.b.j.p(paramRunnable, "command");
    a(this, paramRunnable);
    AppMethodBeat.o(118319);
  }

  public final String toString()
  {
    AppMethodBeat.i(118327);
    ArrayList localArrayList = new ArrayList();
    Object localObject = this.BRX;
    int i = localObject.length;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 0;
    if (j < i)
    {
      a.c localc = localObject[j];
      int i3 = m;
      o localo;
      int i4;
      if (localc != null)
      {
        localo = localc.BSk;
        if (localo.BSZ != null)
        {
          i4 = localo.emm() + 1;
          label85: localc = localc.BSl;
        }
      }
      else
      {
        switch (b.eQZ[localc.ordinal()])
        {
        default:
          i3 = m;
          label140: m = k;
          k = i3;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
      }
      while (true)
      {
        j++;
        i3 = k;
        k = m;
        m = i3;
        break;
        i4 = localo.emm();
        break label85;
        i2++;
        i3 = k;
        k = m;
        m = i3;
        continue;
        i1++;
        ((Collection)localArrayList).add(String.valueOf(i4) + "b");
        i3 = k;
        k = m;
        m = i3;
        continue;
        n++;
        ((Collection)localArrayList).add(String.valueOf(i4) + "c");
        i3 = m;
        m = k;
        k = i3;
        continue;
        m++;
        i3 = m;
        if (i4 <= 0)
          break label140;
        ((Collection)localArrayList).add(String.valueOf(i4) + "r");
        i3 = k;
        k = m;
        m = i3;
        continue;
        i3 = k + 1;
        k = m;
        m = i3;
      }
    }
    long l1 = this.BRY;
    localObject = new StringBuilder().append(this.BSe).append('@').append(af.ee(this)).append('[').append("Pool Size {core = ").append(this.cml).append(", max = ").append(this.BSc).append("}, Worker States {CPU = ").append(n).append(", blocking = ").append(i1).append(", parked = ").append(i2).append(", retired = ").append(m).append(", terminated = ").append(k).append("}, running workers queues = ").append(localArrayList).append(", global queue size = ");
    long l2 = ((kotlinx.coroutines.a.j)this.BRT.BRx).BRz;
    m = (int)((0x3FFFFFFF & l2) >> 0);
    localObject = ((int)((l2 & 0xC0000000) >> 30) - m & 0x3FFFFFFF) + ", Control State Workers {created = " + (int)(0x1FFFFF & l1) + ", blocking = " + (int)((0xFFE00000 & l1) >> 21) + '}' + "]";
    AppMethodBeat.o(118327);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.c.a
 * JD-Core Version:    0.6.2
 */