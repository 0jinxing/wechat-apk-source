package kotlinx.coroutines.c;

import a.aa;
import a.f.b.j;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "Ljava/lang/Thread;", "index", "", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "indexInArray", "getIndexInArray", "()I", "setIndexInArray", "(I)V", "isBlocking", "", "()Z", "isParking", "lastExhaustionTime", "", "lastStealIndex", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "getLocalQueue", "()Lkotlinx/coroutines/scheduling/WorkQueue;", "nextParkedWorker", "", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "parkTimeNs", "rngState", "scheduler", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "spins", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "getState", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "setState", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)V", "terminationDeadline", "terminationState", "Lkotlinx/atomicfu/AtomicInt;", "afterTask", "", "taskMode", "Lkotlinx/coroutines/scheduling/TaskMode;", "beforeTask", "taskSubmissionTime", "blockingQuiescence", "blockingWorkerIdle", "cpuWorkerIdle", "doPark", "nanos", "findTask", "Lkotlinx/coroutines/scheduling/Task;", "findTask$kotlinx_coroutines_core", "findTaskWithCpuPermit", "idleReset", "mode", "idleResetBeforeUnpark", "nextInt", "upperBound", "nextInt$kotlinx_coroutines_core", "run", "tryAcquireCpuPermit", "tryForbidTermination", "tryReleaseCpu", "newState", "tryReleaseCpu$kotlinx_coroutines_core", "trySteal", "tryTerminateWorker", "kotlinx-coroutines-core"})
public final class a$b extends Thread
{
  private static final AtomicIntegerFieldUpdater BSn;
  volatile int BSj;
  final o BSk;
  volatile a.c BSl;
  private volatile int BSm;
  private long BSo;
  volatile Object BSp;
  private long BSq;
  private volatile int BSr;
  private int BSs;
  private int BSt;
  private int BSu;

  static
  {
    AppMethodBeat.i(118352);
    BSn = AtomicIntegerFieldUpdater.newUpdater(b.class, "BSm");
    AppMethodBeat.o(118352);
  }

  private a$b()
  {
    AppMethodBeat.i(118350);
    setDaemon(true);
    this.BSk = new o();
    this.BSl = a.c.BSz;
    this.BSm = 0;
    this.BSp = a.elZ();
    this.BSs = a.elY();
    this.BSt = a.j(locala).nextInt();
    AppMethodBeat.o(118350);
  }

  public a$b(int paramInt)
  {
    this(paramInt);
    AppMethodBeat.i(118351);
    int i;
    Vd(i);
    AppMethodBeat.o(118351);
  }

  private void Vd(int paramInt)
  {
    AppMethodBeat.i(118339);
    StringBuilder localStringBuilder = new StringBuilder().append(a.a(this.BSv)).append("-worker-");
    if (paramInt == 0);
    for (String str = "TERMINATED"; ; str = String.valueOf(paramInt))
    {
      setName(str);
      this.BSj = paramInt;
      AppMethodBeat.o(118339);
      return;
    }
  }

  private int Ve(int paramInt)
  {
    this.BSt ^= this.BSt << 13;
    this.BSt ^= this.BSt >> 17;
    this.BSt ^= this.BSt << 5;
    int i = paramInt - 1;
    if ((i & paramInt) == 0);
    for (paramInt = i & this.BSt; ; paramInt = (this.BSt & 0x7FFFFFFF) % paramInt)
      return paramInt;
  }

  private final boolean emd()
  {
    AppMethodBeat.i(118345);
    i locali = a.i(this.BSv).emi();
    boolean bool;
    if (locali != null)
    {
      this.BSk.a(locali, a.i(this.BSv));
      bool = false;
      AppMethodBeat.o(118345);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(118345);
    }
  }

  private final i emg()
  {
    AppMethodBeat.i(118348);
    int i;
    i locali;
    if (Ve(a.h(this.BSv) * 2) == 0)
    {
      i = 1;
      if (i == 0)
        break label57;
      locali = (i)a.i(this.BSv).elE();
      if (locali == null)
        break label57;
      AppMethodBeat.o(118348);
    }
    while (true)
    {
      return locali;
      i = 0;
      break;
      label57: locali = this.BSk.emn();
      if (locali != null)
      {
        AppMethodBeat.o(118348);
      }
      else if (i == 0)
      {
        locali = (i)a.i(this.BSv).elE();
        if (locali != null)
          AppMethodBeat.o(118348);
      }
      else
      {
        locali = emh();
        AppMethodBeat.o(118348);
      }
    }
  }

  private final i emh()
  {
    AppMethodBeat.i(118349);
    int i = a.g(this.BSv);
    Object localObject;
    if (i < 2)
    {
      AppMethodBeat.o(118349);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      int j = this.BSu;
      int k = j;
      if (j == 0)
        k = Ve(i);
      j = k + 1;
      k = j;
      if (j > i)
        k = 1;
      this.BSu = k;
      localObject = a.f(this.BSv)[k];
      if ((localObject != null) && (localObject != (b)this) && (this.BSk.a(((b)localObject).BSk, a.i(this.BSv))))
      {
        localObject = this.BSk.emn();
        AppMethodBeat.o(118349);
      }
      else
      {
        AppMethodBeat.o(118349);
        localObject = null;
      }
    }
  }

  private final void oc(long paramLong)
  {
    AppMethodBeat.i(118344);
    a.a(this.BSv, this);
    LockSupport.parkNanos(paramLong);
    AppMethodBeat.o(118344);
  }

  public final boolean a(a.c paramc)
  {
    AppMethodBeat.i(118342);
    j.p(paramc, "newState");
    a.c localc = this.BSl;
    if (localc == a.c.BSw);
    for (boolean bool = true; ; bool = false)
    {
      if (bool)
        a.b(this.BSv).release();
      if (localc != paramc)
        this.BSl = paramc;
      AppMethodBeat.o(118342);
      return bool;
    }
  }

  public final boolean ema()
  {
    if (this.BSl == a.c.BSy);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean emb()
  {
    boolean bool = false;
    AppMethodBeat.i(118340);
    int i = this.BSm;
    switch (i)
    {
    default:
      Throwable localThrowable = (Throwable)new IllegalStateException("Invalid terminationState = ".concat(String.valueOf(i)).toString());
      AppMethodBeat.o(118340);
      throw localThrowable;
    case 1:
      AppMethodBeat.o(118340);
    case -1:
    case 0:
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(118340);
      continue;
      bool = BSn.compareAndSet(this, 0, -1);
      AppMethodBeat.o(118340);
    }
  }

  public final boolean emc()
  {
    boolean bool = true;
    AppMethodBeat.i(118341);
    if (this.BSl == a.c.BSw)
      AppMethodBeat.o(118341);
    while (true)
    {
      return bool;
      if (a.b(this.BSv).tryAcquire())
      {
        this.BSl = a.c.BSw;
        AppMethodBeat.o(118341);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(118341);
      }
    }
  }

  public final void eme()
  {
    AppMethodBeat.i(118346);
    this.BSs = a.elY();
    this.BSr = 0;
    AppMethodBeat.o(118346);
  }

  public final i emf()
  {
    AppMethodBeat.i(118347);
    Object localObject;
    if (emc())
    {
      localObject = emg();
      AppMethodBeat.o(118347);
    }
    while (true)
    {
      return localObject;
      i locali = this.BSk.emn();
      localObject = locali;
      if (locali == null)
        localObject = a.i(this.BSv).emi();
      AppMethodBeat.o(118347);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(118343);
    int i = 0;
    while ((!a.c(this.BSv)) && (this.BSl != a.c.BSA))
    {
      ??? = emf();
      if (??? == null)
      {
        if (this.BSl == a.c.BSw)
        {
          i = this.BSr;
          if (i <= 1500)
          {
            this.BSr = (i + 1);
            if (i >= 1000)
              Thread.yield();
          }
        }
        while (true)
        {
          i = 1;
          break;
          if (this.BSs < a.elX())
            this.BSs = a.h.e.in(this.BSs * 3 >>> 1, a.elX());
          a(a.c.BSy);
          oc(this.BSs);
          continue;
          a(a.c.BSy);
          if (emd())
          {
            this.BSm = 0;
            if (this.BSo == 0L)
              this.BSo = (System.nanoTime() + a.e(this.BSv));
            oc(a.e(this.BSv));
            if (System.nanoTime() - this.BSo >= 0L)
            {
              this.BSo = 0L;
              synchronized (a.f(this.BSv))
              {
                boolean bool = a.c(this.BSv);
                if (!bool)
                {
                  i = a.g(this.BSv);
                  j = a.h(this.BSv);
                  if (i > j)
                  {
                    bool = emd();
                    if (bool)
                    {
                      bool = BSn.compareAndSet(this, 0, 1);
                      if (bool)
                      {
                        i = this.BSj;
                        Vd(0);
                        a.a(this.BSv, this, i, 0);
                        Object localObject2 = this.BSv;
                        j = (int)(a.BRZ.getAndDecrement(localObject2) & 0x1FFFFF);
                        if (j != i)
                        {
                          localObject2 = a.f(this.BSv)[j];
                          if (localObject2 == null)
                            j.dWJ();
                          a.f(this.BSv)[i] = localObject2;
                          ((b)localObject2).Vd(i);
                          a.a(this.BSv, (b)localObject2, j, i);
                        }
                        a.f(this.BSv)[j] = null;
                        localObject2 = y.AUy;
                        this.BSl = a.c.BSA;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      l locall = ((i)???).eml();
      int j = i;
      if (i != 0)
      {
        this.BSo = 0L;
        this.BSu = 0;
        if (this.BSl == a.c.BSy)
        {
          if (locall == l.BSQ);
          for (i = 1; (aa.AUz) && (i == 0); i = 0)
          {
            ??? = (Throwable)new AssertionError("Assertion failed");
            AppMethodBeat.o(118343);
            throw ((Throwable)???);
          }
          this.BSl = a.c.BSx;
          this.BSs = a.elY();
        }
        this.BSr = 0;
        j = 0;
      }
      long l1 = ((i)???).BSM;
      if (locall != l.BSP)
      {
        a locala = this.BSv;
        a.BRZ.addAndGet(locala, 2097152L);
        if (a(a.c.BSx))
          a.d(this.BSv);
        a.b((i)???);
        i = j;
        if (locall != l.BSP)
        {
          ??? = this.BSv;
          a.BRZ.addAndGet(???, -2097152L);
          ??? = this.BSl;
          i = j;
          if (??? != a.c.BSA)
            if (??? != a.c.BSx);
        }
      }
      else
      {
        for (i = 1; ; i = 0)
        {
          if ((!aa.AUz) || (i != 0))
            break label744;
          ??? = (Throwable)new AssertionError("Expected BLOCKING state, but has ".concat(String.valueOf(???)));
          AppMethodBeat.o(118343);
          throw ((Throwable)???);
          if (a.b(this.BSv).availablePermits() == 0)
            break;
          long l2 = m.BSX.nanoTime();
          if ((l2 - l1 < m.BSS) || (l2 - this.BSq < m.BSS * 5L))
            break;
          this.BSq = l2;
          a.d(this.BSv);
          break;
        }
        label744: this.BSl = a.c.BSz;
        i = j;
      }
    }
    a(a.c.BSA);
    AppMethodBeat.o(118343);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.c.a.b
 * JD-Core Version:    0.6.2
 */