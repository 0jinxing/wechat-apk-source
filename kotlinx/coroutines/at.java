package kotlinx.coroutines;

import a.l;
import a.v;
import a.y;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.a.j.a;
import kotlinx.coroutines.a.j.b;
import kotlinx.coroutines.a.q;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/EventLoopBase;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "Lkotlinx/coroutines/EventLoop;", "()V", "_delayed", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopBase$DelayedTask;", "_queue", "", "isCompleted", "", "()Z", "isDelayedEmpty", "isEmpty", "isQueueEmpty", "nextTime", "", "getNextTime", "()J", "closeQueue", "", "dequeue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "enqueueImpl", "task", "execute", "execute$kotlinx_coroutines_core", "isCorrectThread", "processNextEvent", "removeDelayedImpl", "delayedTask", "removeDelayedImpl$kotlinx_coroutines_core", "rescheduleAllDelayed", "resetAll", "schedule", "schedule$kotlinx_coroutines_core", "scheduleImpl", "", "scheduleResumeAfterDelay", "timeMillis", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "shouldUnpark", "unpark", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "kotlinx-coroutines-core"})
public abstract class at extends w
  implements aj, as
{
  private static final AtomicReferenceFieldUpdater BQk = AtomicReferenceFieldUpdater.newUpdater(at.class, Object.class, "BQj");
  private static final AtomicReferenceFieldUpdater BQm = AtomicReferenceFieldUpdater.newUpdater(at.class, Object.class, "BQl");
  volatile Object BQj = null;
  volatile Object BQl = null;

  private final boolean aF(Runnable paramRunnable)
  {
    Object localObject;
    do
    {
      localObject = this.BQj;
      if (localObject != null)
        break;
    }
    while (!BQk.compareAndSet(this, null, paramRunnable));
    boolean bool = true;
    while (true)
    {
      return bool;
      if ((localObject instanceof kotlinx.coroutines.a.j))
      {
        if (localObject == null)
          throw new v("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
        switch (((kotlinx.coroutines.a.j)localObject).eo(paramRunnable))
        {
        default:
          break;
        case 0:
          bool = true;
          break;
        case 2:
          bool = false;
          break;
        case 1:
        }
        BQk.compareAndSet(this, localObject, ((kotlinx.coroutines.a.j)localObject).elO());
        break;
      }
      if (localObject == au.elr())
      {
        bool = false;
      }
      else
      {
        kotlinx.coroutines.a.j localj = new kotlinx.coroutines.a.j(8, true);
        if (localObject == null)
          throw new v("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
        localj.eo((Runnable)localObject);
        localj.eo(paramRunnable);
        if (!BQk.compareAndSet(this, localObject, localj))
          break;
        bool = true;
      }
    }
  }

  private final boolean elm()
  {
    Object localObject = this.BQj;
    boolean bool;
    if (localObject == null)
      bool = true;
    while (true)
    {
      return bool;
      if ((localObject instanceof kotlinx.coroutines.a.j))
        bool = ((kotlinx.coroutines.a.j)localObject).isEmpty();
      else if (localObject == au.elr())
        bool = true;
      else
        bool = false;
    }
  }

  private final boolean eln()
  {
    q localq = (q)this.BQl;
    if ((localq == null) || (localq.isEmpty()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void a(a.c.e parame, Runnable paramRunnable)
  {
    a.f.b.j.p(parame, "context");
    a.f.b.j.p(paramRunnable, "block");
    aE(paramRunnable);
  }

  public final void a(i<? super y> parami)
  {
    a.f.b.j.p(parami, "continuation");
    at.b localb = (at.b)new at.a(this, parami);
    for (parami = this; ; parami = ag.BPW)
    {
      a.f.b.j.p(localb, "delayedTask");
      q localq = (q)parami.BQl;
      Object localObject = localq;
      if (localq == null)
      {
        localObject = (at)parami;
        BQm.compareAndSet(localObject, null, new q());
        localObject = ((at)localObject).BQl;
        if (localObject == null)
          a.f.b.j.dWJ();
        localObject = (q)localObject;
      }
      switch (localb.a((q)localObject, parami))
      {
      default:
        throw ((Throwable)new IllegalStateException("unexpected result".toString()));
      case 0:
        localObject = (q)parami.BQl;
        if (localObject != null)
        {
          localObject = (at.b)((q)localObject).elR();
          if (localObject != localb)
            break label185;
        }
      case 2:
        label185: for (int i = 1; ; i = 0)
        {
          if (i != 0)
            parami.ele();
          return;
          localObject = null;
          break;
        }
      case 1:
      }
    }
  }

  public final void aE(Runnable paramRunnable)
  {
    for (Object localObject = this; ; localObject = ag.BPW)
    {
      a.f.b.j.p(paramRunnable, "task");
      if (((at)localObject).aF(paramRunnable))
      {
        ((at)localObject).ele();
        return;
      }
    }
  }

  protected abstract void ele();

  public final long elo()
  {
    Object localObject1 = (q)this.BQl;
    long l;
    if ((localObject1 != null) && (!((q)localObject1).isEmpty()))
      l = bs.elC().nanoTime();
    while (true)
    {
      Object localObject5;
      int i;
      try
      {
        Object localObject2 = ((q)localObject1).elS();
        if (localObject2 == null)
        {
          localObject2 = null;
          if ((at.b)localObject2 != null)
            break;
          localObject5 = this.BQj;
          if (localObject5 != null)
            break label194;
          localObject2 = null;
          if (localObject2 != null)
            ((Runnable)localObject2).run();
          localObject2 = this.BQj;
          if (localObject2 == null)
            break label539;
          if (!(localObject2 instanceof kotlinx.coroutines.a.j))
            break label519;
          if (((kotlinx.coroutines.a.j)localObject2).isEmpty())
            break label539;
          l = 0L;
          return l;
        }
        localObject2 = (at.b)localObject2;
        if (l - ((at.b)localObject2).nanoTime >= 0L)
        {
          i = 1;
          if (i == 0)
            continue;
          bool = aF((Runnable)localObject2);
          if (!bool)
            continue;
          localObject2 = ((q)localObject1).Va(0);
          continue;
        }
        i = 0;
        continue;
        boolean bool = false;
        continue;
        localObject2 = null;
        continue;
      }
      finally
      {
      }
      label194: label224: Object localObject4;
      if ((localObject5 instanceof kotlinx.coroutines.a.j))
      {
        if (localObject5 == null)
          throw new v("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
        kotlinx.coroutines.a.j localj = (kotlinx.coroutines.a.j)localObject5;
        l = localj.BRz;
        if ((0x0 & l) != 0L)
          localObject4 = kotlinx.coroutines.a.j.BRD;
        while (true)
        {
          if (localObject4 == kotlinx.coroutines.a.j.BRD)
            break label446;
          localObject4 = (Runnable)localObject4;
          break;
          int j = (int)((0x3FFFFFFF & l) >> 0);
          if (((int)((0xC0000000 & l) >> 30) & kotlinx.coroutines.a.j.a(localj)) == (kotlinx.coroutines.a.j.a(localj) & j))
          {
            localObject4 = null;
          }
          else
          {
            localObject4 = kotlinx.coroutines.a.j.b(localj).get(kotlinx.coroutines.a.j.a(localj) & j);
            if (localObject4 == null)
            {
              if (!kotlinx.coroutines.a.j.c(localj))
                break label224;
              localObject4 = null;
              continue;
            }
            if ((localObject4 instanceof j.b))
            {
              localObject4 = null;
            }
            else
            {
              i = j + 1 & 0x3FFFFFFF;
              localObject1 = kotlinx.coroutines.a.j.BRA;
              Object localObject6 = kotlinx.coroutines.a.j.BRE;
              if (((AtomicLongFieldUpdater)localObject1).compareAndSet(localj, l, j.a.K(l, i)))
              {
                kotlinx.coroutines.a.j.b(localj).set(kotlinx.coroutines.a.j.a(localj) & j, null);
              }
              else
              {
                if (!kotlinx.coroutines.a.j.c(localj))
                  break label224;
                localObject1 = (kotlinx.coroutines.a.j)localj;
                do
                {
                  localObject6 = kotlinx.coroutines.a.j.a((kotlinx.coroutines.a.j)localObject1, j, i);
                  localObject1 = localObject6;
                }
                while (localObject6 != null);
              }
            }
          }
        }
        label446: BQk.compareAndSet(this, localObject5, ((kotlinx.coroutines.a.j)localObject5).elO());
      }
      else if (localObject5 == au.elr())
      {
        localObject4 = null;
      }
      else if (BQk.compareAndSet(this, localObject5, null))
      {
        if (localObject5 == null)
          throw new v("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
        localObject4 = (Runnable)localObject5;
        continue;
        label519: if (localObject4 == au.elr())
        {
          l = 9223372036854775807L;
        }
        else
        {
          l = 0L;
          continue;
          label539: localObject4 = (q)this.BQl;
          if (localObject4 == null)
          {
            l = 9223372036854775807L;
          }
          else
          {
            localObject4 = (at.b)((q)localObject4).elR();
            if (localObject4 == null)
              l = 9223372036854775807L;
            else
              l = a.h.e.ai(((at.b)localObject4).nanoTime - bs.elC().nanoTime(), 0L);
          }
        }
      }
    }
  }

  protected final boolean isEmpty()
  {
    if ((elm()) && (eln()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.at
 * JD-Core Version:    0.6.2
 */