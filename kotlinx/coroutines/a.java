package kotlinx.coroutines;

import a.c.c;
import a.f.b.j;
import a.l;
import a.y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/AbstractContinuation;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/Continuation;", "delegate", "resumeMode", "", "(Lkotlin/coroutines/Continuation;I)V", "_decision", "Lkotlinx/atomicfu/AtomicInt;", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "getDelegate", "()Lkotlin/coroutines/Continuation;", "isActive", "", "()Z", "isCancelled", "isCompleted", "parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "cancel", "cause", "", "cancelImpl", "completeStateUpdate", "", "expect", "Lkotlinx/coroutines/NotCompleted;", "update", "mode", "dispatchResume", "getContinuationCancellationCause", "parent", "Lkotlinx/coroutines/Job;", "getResult", "handleException", "exception", "initParentJobInternal", "initParentJobInternal$kotlinx_coroutines_core", "invokeOnCancellation", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "loopOnState", "", "block", "makeHandler", "Lkotlinx/coroutines/CancelHandler;", "nameString", "", "resumeImpl", "proposedUpdate", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resumeWithExceptionMode", "resumeWithExceptionMode$kotlinx_coroutines_core", "stateString", "takeState", "toString", "tryResume", "trySuspend", "tryUpdateStateToFinal", "updateStateToFinal", "kotlinx-coroutines-core"})
public abstract class a<T> extends an<T>
  implements c<T>
{
  private static final AtomicIntegerFieldUpdater BPr = AtomicIntegerFieldUpdater.newUpdater(a.class, "BPq");
  private static final AtomicReferenceFieldUpdater BPt = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "BPs");
  private volatile int BPq;
  public volatile Object BPs;
  public volatile ap BPu;
  public final c<T> BPv;

  public a(c<? super T> paramc)
  {
    super(1);
    this.BPv = paramc;
    this.BPq = 0;
    this.BPs = b.ekS();
  }

  private final void UX(int paramInt)
  {
    int i = 0;
    do
    {
      j = i;
      switch (this.BPq)
      {
      default:
        throw ((Throwable)new IllegalStateException("Already resumed".toString()));
      case 0:
      case 1:
      }
    }
    while (!BPr.compareAndSet(this, 0, 2));
    int j = 1;
    if (j != 0);
    while (true)
    {
      return;
      am.a(this, paramInt);
    }
  }

  public static Throwable a(bc parambc)
  {
    j.p(parambc, "parent");
    return (Throwable)parambc.els();
  }

  private boolean a(bm parambm, Object paramObject)
  {
    boolean bool = false;
    j.p(parambm, "expect");
    if (!(paramObject instanceof bm));
    for (int i = 1; i == 0; i = 0)
      throw ((Throwable)new IllegalArgumentException("Failed requirement.".toString()));
    if (!BPt.compareAndSet(this, parambm, paramObject));
    while (true)
    {
      return bool;
      parambm = this.BPu;
      if (parambm != null)
      {
        parambm.dispose();
        this.BPu = ((ap)bl.BQP);
      }
      bool = true;
    }
  }

  private void b(bm parambm, Object paramObject, int paramInt)
  {
    Object localObject1 = null;
    j.p(parambm, "expect");
    if (!(paramObject instanceof q));
    for (Object localObject2 = null; ; localObject2 = paramObject)
    {
      q localq = (q)localObject2;
      if (((paramObject instanceof k)) && ((parambm instanceof g)));
      try
      {
        localObject2 = (g)parambm;
        paramObject = localObject1;
        if (localq != null)
          paramObject = localq.cause;
        ((g)localObject2).v(paramObject);
        UX(paramInt);
        return;
      }
      catch (Throwable paramObject)
      {
        while (true)
          t((Throwable)new u("Exception in completion handler " + parambm + " for " + this, paramObject));
      }
    }
  }

  private final void t(Throwable paramThrowable)
  {
    z.a(dWv(), paramThrowable, null);
  }

  final boolean a(bm parambm, Object paramObject, int paramInt)
  {
    if (!a(parambm, paramObject));
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      b(parambm, paramObject, paramInt);
    }
  }

  public final void dn(Object paramObject)
  {
    l(r.ed(paramObject), this.BQd);
  }

  public final Object ekO()
  {
    return this.BPs;
  }

  public final boolean ekP()
  {
    boolean bool = true;
    do
      switch (this.BPq)
      {
      case 1:
      default:
        throw ((Throwable)new IllegalStateException("Already suspended".toString()));
      case 0:
      case 2:
      }
    while (!BPr.compareAndSet(this, 0, 1));
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  protected String ekQ()
  {
    return af.ef(this);
  }

  public final c<T> ekR()
  {
    return this.BPv;
  }

  public final void h(a.f.a.b<? super Throwable, y> paramb)
  {
    Object localObject1 = null;
    j.p(paramb, "handler");
    Object localObject2 = null;
    Object localObject3 = this.BPs;
    if ((localObject3 instanceof d))
    {
      if (localObject2 != null)
        break label181;
      if ((paramb instanceof g))
        localObject2 = (g)paramb;
    }
    label175: label181: for (Object localObject4 = localObject2; ; localObject4 = localObject2)
    {
      if (BPt.compareAndSet(this, localObject3, localObject4))
      {
        label58: 
        do
        {
          return;
          localObject2 = (g)new az(paramb);
          break;
          if ((localObject3 instanceof g))
            throw ((Throwable)new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + paramb + ", already has " + localObject3).toString()));
        }
        while (!(localObject3 instanceof k));
        if ((localObject3 instanceof q))
          break label175;
      }
      for (localObject2 = null; ; localObject2 = localObject3)
      {
        localObject4 = (q)localObject2;
        localObject2 = localObject1;
        if (localObject4 != null)
          localObject2 = ((q)localObject4).cause;
        paramb.am(localObject2);
        break label58;
        break;
      }
    }
  }

  protected final void l(Object paramObject, int paramInt)
  {
    Object localObject;
    do
    {
      localObject = this.BPs;
      if (!(localObject instanceof bm))
        break;
    }
    while (!a((bm)localObject, paramObject, paramInt));
    while (true)
    {
      return;
      if (!(localObject instanceof k))
        break;
      if ((paramObject instanceof q))
        t(((q)paramObject).cause);
    }
    throw ((Throwable)new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(paramObject)).toString()));
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder().append(ekQ()).append('{');
    Object localObject = this.BPs;
    if ((localObject instanceof bm))
      localObject = "Active";
    while (true)
    {
      return (String)localObject + "}@" + af.ee(this);
      if ((localObject instanceof k))
        localObject = "Cancelled";
      else if ((localObject instanceof q))
        localObject = "CompletedExceptionally";
      else
        localObject = "Completed";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a
 * JD-Core Version:    0.6.2
 */