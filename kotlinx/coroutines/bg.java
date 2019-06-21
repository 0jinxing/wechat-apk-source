package kotlinx.coroutines;

import a.a;
import a.c.e.b;
import a.c.e.b.a;
import a.c.e.c;
import a.f.a.b;
import a.f.a.b<-Ljava.lang.Throwable;La.y;>;
import a.f.b.j;
import a.v;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.a.f;
import kotlinx.coroutines.a.g;
import kotlinx.coroutines.a.h;
import kotlinx.coroutines.a.h.a;
import kotlinx.coroutines.a.k;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", "Lkotlinx/coroutines/selects/SelectClause0;", "active", "", "(Z)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "cancelsParent", "getCancelsParent", "()Z", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "handlesException", "getHandlesException", "isActive", "isCancelled", "isCompleted", "isCompletedExceptionally", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "onJoin", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "parentHandle", "Lkotlinx/coroutines/ChildHandle;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "exceptionOrNull", "", "getExceptionOrNull", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "isCancelling", "Lkotlinx/coroutines/Incomplete;", "(Lkotlinx/coroutines/Incomplete;)Z", "addLastAtomic", "expect", "list", "Lkotlinx/coroutines/NodeList;", "node", "Lkotlinx/coroutines/JobNode;", "attachChild", "child", "awaitInternal", "awaitInternal$kotlinx_coroutines_core", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitSuspend", "cancel", "", "cause", "cancelImpl", "cancelMakeCompleting", "cancelParent", "childCancelled", "completeStateFinalization", "update", "mode", "", "suppressed", "continueCompleting", "Lkotlinx/coroutines/JobSupport$Finishing;", "lastChild", "Lkotlinx/coroutines/ChildHandleNode;", "proposedUpdate", "createCauseException", "createJobCancellationException", "Lkotlinx/coroutines/JobCancellationException;", "firstChild", "getCancellationException", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "getChildJobCancellationCause", "getCompletedInternal", "getCompletedInternal$kotlinx_coroutines_core", "getCompletionCause", "getCompletionExceptionOrNull", "getFinalRootCause", "exceptions", "", "getOrPromoteCancellingList", "handleJobException", "exception", "handleOnCompletionException", "handleOnCompletionException$kotlinx_coroutines_core", "initParentJobInternal", "parent", "initParentJobInternal$kotlinx_coroutines_core", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "join", "joinInternal", "joinSuspend", "loopOnState", "", "block", "makeCancelling", "makeCompleting", "makeCompleting$kotlinx_coroutines_core", "makeCompletingOnce", "makeCompletingOnce$kotlinx_coroutines_core", "makeNode", "nameString", "", "nameString$kotlinx_coroutines_core", "notifyCancelling", "notifyHandlers", "T", "onCancellation", "onCompletionInternal", "onCompletionInternal$kotlinx_coroutines_core", "onStartInternal", "onStartInternal$kotlinx_coroutines_core", "parentCancelled", "parentJob", "promoteEmptyToNodeList", "Lkotlinx/coroutines/Empty;", "promoteSingleToNodeList", "registerSelectClause0", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function1;)V", "registerSelectClause1Internal", "Lkotlin/Function2;", "registerSelectClause1Internal$kotlinx_coroutines_core", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "removeNode", "removeNode$kotlinx_coroutines_core", "selectAwaitCompletion", "selectAwaitCompletion$kotlinx_coroutines_core", "start", "startInternal", "stateString", "suppressExceptions", "rootCause", "toString", "tryFinalizeFinishingState", "tryFinalizeSimpleState", "tryMakeCancelling", "tryMakeCompleting", "tryWaitForChild", "nextChild", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "notifyCompletion", "toCancellationException", "message", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"})
public class bg
  implements bc, bn, o
{
  static final AtomicReferenceFieldUpdater BPt;
  private volatile Object BPs;
  volatile m BQA;

  static
  {
    AppMethodBeat.i(118623);
    BPt = AtomicReferenceFieldUpdater.newUpdater(bg.class, Object.class, "BPs");
    AppMethodBeat.o(118623);
  }

  public bg(boolean paramBoolean)
  {
    AppMethodBeat.i(118617);
    if (paramBoolean);
    for (ar localar = bh.elA(); ; localar = bh.elB())
    {
      this.BPs = localar;
      AppMethodBeat.o(118617);
      return;
    }
  }

  private final boolean A(Throwable paramThrowable)
  {
    boolean bool = true;
    AppMethodBeat.i(118613);
    if ((paramThrowable instanceof CancellationException))
      AppMethodBeat.o(118613);
    while (true)
    {
      return bool;
      if (!elw())
      {
        AppMethodBeat.o(118613);
        bool = false;
      }
      else
      {
        m localm = this.BQA;
        if ((localm != null) && (localm.x(paramThrowable) == true))
        {
          AppMethodBeat.o(118613);
        }
        else
        {
          AppMethodBeat.o(118613);
          bool = false;
        }
      }
    }
  }

  private final Throwable a(bg.b paramb, List<? extends Throwable> paramList)
  {
    AppMethodBeat.i(118587);
    if (paramList.isEmpty())
    {
      if (paramb.elx())
      {
        paramb = (Throwable)elu();
        AppMethodBeat.o(118587);
      }
      while (true)
      {
        return paramb;
        AppMethodBeat.o(118587);
        paramb = null;
      }
    }
    Object localObject = ((Iterable)paramList).iterator();
    label56: int i;
    if (((Iterator)localObject).hasNext())
    {
      paramb = ((Iterator)localObject).next();
      if (!((Throwable)paramb instanceof CancellationException))
      {
        i = 1;
        label85: if (i == 0)
          break label124;
      }
    }
    while (true)
    {
      localObject = (Throwable)paramb;
      paramb = (bg.b)localObject;
      if (localObject == null)
        paramb = (Throwable)paramList.get(0);
      AppMethodBeat.o(118587);
      break;
      i = 0;
      break label85;
      label124: break label56;
      paramb = null;
    }
  }

  private final bf<?> a(b<? super Throwable, y> paramb, boolean paramBoolean)
  {
    bf localbf = null;
    Object localObject = null;
    int i = 1;
    AppMethodBeat.i(118597);
    if (paramBoolean)
      if ((paramb instanceof be))
        break label248;
    while (true)
    {
      localObject = (be)localObject;
      if (localObject != null)
      {
        if (((be)localObject).BQz == (bg)this);
        while (i == 0)
        {
          paramb = (Throwable)new IllegalArgumentException("Failed requirement.".toString());
          AppMethodBeat.o(118597);
          throw paramb;
          i = 0;
        }
        if (localObject != null)
        {
          localObject = (bf)localObject;
          AppMethodBeat.o(118597);
        }
      }
      while (true)
      {
        return localObject;
        localObject = (bf)new ba((o)this, paramb);
        AppMethodBeat.o(118597);
      }
      if (!(paramb instanceof bf));
      for (localObject = localbf; ; localObject = paramb)
      {
        localbf = (bf)localObject;
        if (localbf != null)
        {
          if ((localbf.BQz == (bg)this) && (!(localbf instanceof be)));
          for (i = 1; i == 0; i = 0)
          {
            paramb = (Throwable)new IllegalArgumentException("Failed requirement.".toString());
            AppMethodBeat.o(118597);
            throw paramb;
          }
          localObject = localbf;
          if (localbf != null);
        }
        else
        {
          localObject = (bf)new bb((o)this, paramb);
        }
        AppMethodBeat.o(118597);
        break;
      }
      label248: localObject = paramb;
    }
  }

  private final bk a(ay paramay)
  {
    AppMethodBeat.i(118606);
    bk localbk = paramay.ell();
    if (localbk == null)
      if ((paramay instanceof ar))
      {
        paramay = new bk();
        AppMethodBeat.o(118606);
      }
    while (true)
    {
      return paramay;
      if ((paramay instanceof bf))
      {
        a((bf)paramay);
        paramay = null;
        AppMethodBeat.o(118606);
      }
      else
      {
        paramay = (Throwable)new IllegalStateException("State should have list: ".concat(String.valueOf(paramay)).toString());
        AppMethodBeat.o(118606);
        throw paramay;
        AppMethodBeat.o(118606);
        paramay = localbk;
      }
    }
  }

  private static n a(h paramh)
  {
    AppMethodBeat.i(118609);
    while ((paramh.elJ() instanceof kotlinx.coroutines.a.l))
      paramh = g.em(paramh.elL());
    h localh;
    do
    {
      localh = g.em(paramh.elJ());
      paramh = localh;
    }
    while ((localh.elJ() instanceof kotlinx.coroutines.a.l));
    if ((localh instanceof n))
    {
      paramh = (n)localh;
      AppMethodBeat.o(118609);
    }
    while (true)
    {
      return paramh;
      paramh = localh;
      if (!(localh instanceof bk))
        break;
      paramh = null;
      AppMethodBeat.o(118609);
    }
  }

  private final void a(bf<?> parambf)
  {
    AppMethodBeat.i(118599);
    parambf.b((h)new bk());
    h localh = g.em(parambf.elJ());
    BPt.compareAndSet(this, parambf, localh);
    AppMethodBeat.o(118599);
  }

  private final void a(bk parambk, Throwable paramThrowable)
  {
    AppMethodBeat.i(118591);
    Object localObject1 = null;
    Object localObject2 = parambk.elJ();
    if (localObject2 == null)
    {
      parambk = new v("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
      AppMethodBeat.o(118591);
      throw parambk;
    }
    localObject2 = (h)localObject2;
    bf localbf;
    if ((j.j(localObject2, (f)parambk) ^ true))
    {
      if (!(localObject2 instanceof be))
        break label182;
      localbf = (bf)localObject2;
    }
    label182: 
    while (true)
    {
      try
      {
        localbf.v(paramThrowable);
        localObject2 = ((h)localObject2).elK();
      }
      catch (Throwable localThrowable)
      {
        if (localObject1 != null)
        {
          a.a((Throwable)localObject1, localThrowable);
          if (localObject1 != null)
            break label182;
        }
        localObject1 = (bg)this;
        localObject1 = (Throwable)new u("Exception in completion handler " + localbf + " for " + localObject1, localThrowable);
        y localy = y.AUy;
        continue;
      }
      if (localObject1 != null)
        u((Throwable)localObject1);
      A(paramThrowable);
      AppMethodBeat.o(118591);
      return;
    }
  }

  private final boolean a(Object paramObject, bk parambk, bf<?> parambf)
  {
    AppMethodBeat.i(118598);
    h.a locala = (h.a)new bg.c((h)parambf, (h)parambf, this, paramObject);
    while (true)
    {
      paramObject = parambk.elL();
      if (paramObject == null)
      {
        paramObject = new v("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        AppMethodBeat.o(118598);
        throw paramObject;
      }
      switch (((h)paramObject).a((h)parambf, parambk, locala))
      {
      default:
      case 1:
      case 2:
      }
    }
    boolean bool = true;
    AppMethodBeat.o(118598);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118598);
    }
  }

  private final boolean a(ay paramay, Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(118589);
    if (((paramay instanceof ar)) || ((paramay instanceof bf)));
    for (int i = 1; i == 0; i = 0)
    {
      paramay = (Throwable)new IllegalStateException("Check failed.".toString());
      AppMethodBeat.o(118589);
      throw paramay;
    }
    if (!(paramObject instanceof q));
    for (i = 1; i == 0; i = 0)
    {
      paramay = (Throwable)new IllegalStateException("Check failed.".toString());
      AppMethodBeat.o(118589);
      throw paramay;
    }
    if (!BPt.compareAndSet(this, paramay, paramObject))
      AppMethodBeat.o(118589);
    while (true)
    {
      return bool;
      b(paramay, paramObject);
      AppMethodBeat.o(118589);
      bool = true;
    }
  }

  private final boolean a(bg.b paramb, Object paramObject)
  {
    Throwable localThrowable = null;
    int i = 0;
    AppMethodBeat.i(118586);
    if (!(paramObject instanceof ay));
    for (int j = 1; j == 0; j = 0)
    {
      paramb = (Throwable)new IllegalArgumentException("Failed requirement.".toString());
      AppMethodBeat.o(118586);
      throw paramb;
    }
    if (elt() == paramb);
    for (j = 1; j == 0; j = 0)
    {
      paramb = (Throwable)new IllegalArgumentException("Failed requirement.".toString());
      AppMethodBeat.o(118586);
      throw paramb;
    }
    j = i;
    if (!paramb.isSealed())
      j = 1;
    if (j == 0)
    {
      paramb = (Throwable)new IllegalArgumentException("Failed requirement.".toString());
      AppMethodBeat.o(118586);
      throw paramb;
    }
    if (!paramb.BQG)
    {
      paramb = (Throwable)new IllegalArgumentException("Failed requirement.".toString());
      AppMethodBeat.o(118586);
      throw paramb;
    }
    if (!(paramObject instanceof q));
    for (Object localObject1 = null; ; localObject1 = paramObject)
    {
      localObject1 = (q)localObject1;
      if (localObject1 != null)
        localThrowable = ((q)localObject1).cause;
      while (true)
      {
        Object localObject2;
        try
        {
          localObject2 = paramb.BQF;
          if (localObject2 == null)
          {
            localObject1 = bg.b.ely();
            localObject2 = paramb.BQH;
            if (localObject2 != null)
              ((ArrayList)localObject1).add(0, localObject2);
            if ((localThrowable != null) && ((j.j(localThrowable, localObject2) ^ true)))
              ((ArrayList)localObject1).add(localThrowable);
            paramb.BQF = bh.elz();
            localObject2 = (List)localObject1;
            localObject1 = a(paramb, (List)localObject2);
            if ((localObject1 != null) && (!b((Throwable)localObject1, (List)localObject2)))
              localObject2 = paramb.BQH;
            if (localObject1 != null)
              break label529;
            if ((localObject1 != null) && (!A((Throwable)localObject1)))
              z((Throwable)localObject1);
            if (BPt.compareAndSet(this, paramb, paramObject))
              break;
            paramb = (Throwable)new IllegalArgumentException(("Unexpected state: " + this.BPs + ", expected: " + paramb + ", update: " + paramObject).toString());
            AppMethodBeat.o(118586);
            throw paramb;
          }
          if ((localObject2 instanceof Throwable))
          {
            localObject1 = bg.b.ely();
            ((ArrayList)localObject1).add(localObject2);
            continue;
          }
          if (!(localObject2 instanceof ArrayList))
            break label489;
          if (localObject2 == null)
          {
            paramObject = new a/v;
            paramObject.<init>("null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.Throwable> /* = java.util.ArrayList<kotlin.Throwable> */");
            AppMethodBeat.o(118586);
            throw paramObject;
          }
        }
        finally
        {
          AppMethodBeat.o(118586);
        }
        localObject1 = (ArrayList)localObject2;
        continue;
        label489: paramObject = "State is ".concat(String.valueOf(localObject2));
        localObject1 = new java/lang/IllegalStateException;
        ((IllegalStateException)localObject1).<init>(paramObject.toString());
        paramObject = (Throwable)localObject1;
        AppMethodBeat.o(118586);
        throw paramObject;
        label529: if (localObject1 != localThrowable)
          paramObject = new q((Throwable)localObject1);
      }
      b((ay)paramb, paramObject);
      AppMethodBeat.o(118586);
      return true;
    }
  }

  private final boolean a(bg.b paramb, n paramn, Object paramObject)
  {
    AppMethodBeat.i(118608);
    if (bc.a.a(paramn.BPA, false, false, (b)new bg.a(this, paramb, paramn, paramObject), 1) != bl.BQP)
      AppMethodBeat.o(118608);
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      n localn = a((h)paramn);
      paramn = localn;
      if (localn != null)
        break;
      AppMethodBeat.o(118608);
    }
  }

  private final void b(ay paramay, Object paramObject)
  {
    Object localObject1 = null;
    AppMethodBeat.i(118590);
    Object localObject2 = this.BQA;
    if (localObject2 != null)
    {
      ((m)localObject2).dispose();
      this.BQA = ((m)bl.BQP);
    }
    if (!(paramObject instanceof q));
    Object localObject3;
    for (localObject2 = null; ; localObject3 = paramObject)
    {
      q localq = (q)localObject2;
      localObject2 = localObject1;
      if (localq != null)
        localObject2 = localq.cause;
      if ((paramay instanceof bf));
      while (true)
      {
        try
        {
          ((bf)paramay).v((Throwable)localObject2);
          eb(paramObject);
          AppMethodBeat.o(118590);
          return;
        }
        catch (Throwable localThrowable)
        {
          u((Throwable)new u("Exception in completion handler " + paramay + " for " + this, localThrowable));
          continue;
        }
        paramay = paramay.ell();
        if (paramay != null)
          b(paramay, localThrowable);
      }
    }
  }

  private final void b(bk parambk, Throwable paramThrowable)
  {
    AppMethodBeat.i(118592);
    Object localObject1 = null;
    Object localObject2 = parambk.elJ();
    if (localObject2 == null)
    {
      parambk = new v("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
      AppMethodBeat.o(118592);
      throw parambk;
    }
    localObject2 = (h)localObject2;
    bf localbf;
    if ((j.j(localObject2, (f)parambk) ^ true))
    {
      if (!(localObject2 instanceof bf))
        break label185;
      localbf = (bf)localObject2;
    }
    label185: 
    while (true)
    {
      try
      {
        localbf.v(paramThrowable);
        localObject2 = ((h)localObject2).elK();
      }
      catch (Throwable localThrowable)
      {
        if (localObject1 != null)
        {
          a.a((Throwable)localObject1, localThrowable);
          if (localObject1 != null)
            break label185;
        }
        localObject1 = (bg)this;
        localObject1 = (Throwable)new u("Exception in completion handler " + localbf + " for " + localObject1, localThrowable);
        y localy = y.AUy;
        continue;
      }
      if (localObject1 != null)
      {
        u((Throwable)localObject1);
        AppMethodBeat.o(118592);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(118592);
      }
    }
  }

  private static boolean b(Throwable paramThrowable, List<? extends Throwable> paramList)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(118588);
    if (paramList.size() <= 1)
    {
      AppMethodBeat.o(118588);
      return bool2;
    }
    Set localSet = kotlinx.coroutines.a.e.UZ(paramList.size());
    Iterator localIterator = paramList.iterator();
    bool2 = bool1;
    label49: if (localIterator.hasNext())
    {
      paramList = (Throwable)localIterator.next();
      if ((paramList == paramThrowable) || ((paramList instanceof CancellationException)) || (!localSet.add(paramList)))
        break label112;
      a.a(paramThrowable, paramList);
      bool2 = true;
    }
    label112: 
    while (true)
    {
      break label49;
      AppMethodBeat.o(118588);
      break;
    }
  }

  private final CancellationException c(Throwable paramThrowable, String paramString)
  {
    AppMethodBeat.i(118595);
    if (!(paramThrowable instanceof CancellationException));
    for (Object localObject = null; ; localObject = paramThrowable)
    {
      CancellationException localCancellationException = (CancellationException)localObject;
      localObject = localCancellationException;
      if (localCancellationException == null)
        localObject = (CancellationException)new bd(paramString, paramThrowable, (o)this);
      AppMethodBeat.o(118595);
      return localObject;
    }
  }

  private final Throwable eh(Object paramObject)
  {
    AppMethodBeat.i(118604);
    boolean bool;
    if (paramObject != null)
    {
      bool = paramObject instanceof Throwable;
      if (!bool)
        break label58;
      if (paramObject == null)
        break label41;
      paramObject = (Throwable)paramObject;
      AppMethodBeat.o(118604);
    }
    while (true)
    {
      return paramObject;
      bool = true;
      break;
      label41: paramObject = (Throwable)elu();
      AppMethodBeat.o(118604);
      continue;
      label58: if (paramObject == null)
      {
        paramObject = new v("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        AppMethodBeat.o(118604);
        throw paramObject;
      }
      paramObject = ((bn)paramObject).elv();
      AppMethodBeat.o(118604);
    }
  }

  private static String ej(Object paramObject)
  {
    AppMethodBeat.i(118616);
    if ((paramObject instanceof bg.b))
      if (((bg.b)paramObject).elx())
      {
        paramObject = "Cancelling";
        AppMethodBeat.o(118616);
      }
    while (true)
    {
      return paramObject;
      if (((bg.b)paramObject).BQG)
      {
        paramObject = "Completing";
        AppMethodBeat.o(118616);
      }
      else
      {
        paramObject = "Active";
        AppMethodBeat.o(118616);
        continue;
        if ((paramObject instanceof ay))
        {
          if (((ay)paramObject).isActive())
          {
            paramObject = "Active";
            AppMethodBeat.o(118616);
          }
          else
          {
            paramObject = "New";
            AppMethodBeat.o(118616);
          }
        }
        else if ((paramObject instanceof q))
        {
          paramObject = "Cancelled";
          AppMethodBeat.o(118616);
        }
        else
        {
          paramObject = "Completed";
          AppMethodBeat.o(118616);
        }
      }
    }
  }

  private final bd elu()
  {
    AppMethodBeat.i(118602);
    bd localbd = new bd("Job was cancelled", null, (o)this);
    AppMethodBeat.o(118602);
    return localbd;
  }

  final int L(Object paramObject1, Object paramObject2)
  {
    int i = 0;
    Object localObject1 = null;
    AppMethodBeat.i(118607);
    int j;
    if (!(paramObject1 instanceof ay))
    {
      AppMethodBeat.o(118607);
      j = 0;
    }
    bk localbk;
    while (true)
    {
      return j;
      if ((((paramObject1 instanceof ar)) || ((paramObject1 instanceof bf))) && (!(paramObject1 instanceof n)) && (!(paramObject2 instanceof q)))
      {
        if (!a((ay)paramObject1, paramObject2))
        {
          AppMethodBeat.o(118607);
          j = 3;
        }
        else
        {
          AppMethodBeat.o(118607);
          j = 1;
        }
      }
      else
      {
        localbk = a((ay)paramObject1);
        if (localbk != null)
          break;
        AppMethodBeat.o(118607);
        j = 3;
      }
    }
    if (!(paramObject1 instanceof bg.b));
    for (??? = null; ; ??? = paramObject1)
    {
      ??? = (bg.b)???;
      if (??? == null);
      while (true)
      {
        synchronized (new bg.b(localbk, null))
        {
          bool = ((bg.b)???).BQG;
          if (bool)
          {
            AppMethodBeat.o(118607);
            j = 0;
            break;
          }
          ((bg.b)???).BQG = true;
          if (??? != paramObject1)
          {
            bool = BPt.compareAndSet(this, paramObject1, ???);
            if (!bool)
            {
              AppMethodBeat.o(118607);
              j = 3;
              break;
            }
          }
          if (!((bg.b)???).isSealed())
          {
            j = 1;
            if (j != 0)
              break label290;
            paramObject1 = new java/lang/IllegalArgumentException;
            paramObject1.<init>("Failed requirement.".toString());
            paramObject1 = (Throwable)paramObject1;
            AppMethodBeat.o(118607);
            throw paramObject1;
          }
        }
        j = 0;
        continue;
        label290: boolean bool = ((bg.b)???).elx();
        if (!(paramObject2 instanceof q));
        for (Object localObject3 = null; ; localObject3 = paramObject2)
        {
          localObject3 = (q)localObject3;
          if (localObject3 != null)
            ((bg.b)???).B(((q)localObject3).cause);
          localObject3 = ((bg.b)???).BQH;
          j = i;
          if (!bool)
            j = 1;
          if (j != 0)
          {
            label352: y localy = y.AUy;
            if (localObject3 != null)
              a(localbk, (Throwable)localObject3);
            localObject3 = (ay)paramObject1;
            if ((localObject3 instanceof n))
              break label480;
          }
          label480: for (paramObject1 = null; ; paramObject1 = localObject3)
          {
            paramObject1 = (n)paramObject1;
            if (paramObject1 == null)
            {
              localObject3 = ((ay)localObject3).ell();
              paramObject1 = localObject1;
              if (localObject3 != null)
                paramObject1 = a((h)localObject3);
            }
            while (true)
            {
              if ((paramObject1 != null) && (a((bg.b)???, paramObject1, paramObject2)))
              {
                j = 2;
                AppMethodBeat.o(118607);
                break;
                localObject3 = null;
                break label352;
              }
              a((bg.b)???, paramObject2);
              AppMethodBeat.o(118607);
              j = 1;
              break;
            }
          }
        }
      }
    }
  }

  public final ap a(boolean paramBoolean1, boolean paramBoolean2, b<? super Throwable, y> paramb)
  {
    Object localObject1 = null;
    AppMethodBeat.i(118596);
    j.p(paramb, "handler");
    Object localObject2 = null;
    Object localObject3 = elt();
    if ((localObject3 instanceof ar))
      if (((ar)localObject3).csi)
      {
        if (localObject2 != null)
          break label563;
        localObject2 = a(paramb, paramBoolean1);
      }
    label532: label544: label546: label553: label563: for (Object localObject4 = localObject2; ; localObject4 = localObject2)
    {
      label87: Object localObject5;
      bk localbk;
      Object localObject6;
      if (BPt.compareAndSet(this, localObject3, localObject4))
      {
        paramb = (ap)localObject4;
        AppMethodBeat.o(118596);
        return paramb;
        localObject5 = (ar)localObject3;
        localObject4 = new bk();
        if (((ar)localObject5).csi);
        for (localObject4 = (ay)localObject4; ; localObject4 = (ay)new ax((bk)localObject4))
        {
          BPt.compareAndSet(this, localObject5, localObject4);
          break;
        }
        if ((localObject3 instanceof ay))
        {
          localbk = ((ay)localObject3).ell();
          if (localbk == null)
          {
            if (localObject3 == null)
            {
              paramb = new v("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
              AppMethodBeat.o(118596);
              throw paramb;
            }
            a((bf)localObject3);
            break;
          }
          localObject6 = (ap)bl.BQP;
          if ((!paramBoolean1) || (!(localObject3 instanceof bg.b)))
            break label553;
        }
      }
      while (true)
      {
        try
        {
          Throwable localThrowable = ((bg.b)localObject3).BQH;
          if (localThrowable != null)
          {
            localObject4 = localObject6;
            localObject5 = localObject2;
            if ((paramb instanceof n))
            {
              localObject4 = localObject6;
              localObject5 = localObject2;
              if (((bg.b)localObject3).BQG);
            }
          }
          else
          {
            if (localObject2 != null)
              break label546;
            localObject2 = a(paramb, paramBoolean1);
            localObject4 = localObject2;
            boolean bool = a(localObject3, localbk, (bf)localObject4);
            if (!bool)
              break;
            if (localThrowable == null)
            {
              paramb = (ap)localObject4;
              AppMethodBeat.o(118596);
              break label87;
            }
            localObject4 = (ap)localObject4;
            localObject5 = localObject2;
          }
          localObject2 = y.AUy;
          localObject6 = localThrowable;
          localObject2 = localObject5;
          localObject5 = localObject6;
          if (localObject5 != null)
          {
            if (paramBoolean2)
              paramb.am(localObject5);
            AppMethodBeat.o(118596);
            paramb = (b<? super Throwable, y>)localObject4;
            break label87;
          }
        }
        finally
        {
          AppMethodBeat.o(118596);
        }
        if (localObject2 == null)
          localObject2 = a(paramb, paramBoolean1);
        for (localObject4 = localObject2; ; localObject4 = localObject2)
        {
          if (!a(localObject3, localbk, (bf)localObject4))
            break label544;
          paramb = (ap)localObject4;
          AppMethodBeat.o(118596);
          break label87;
          if (paramBoolean2)
            if ((localObject3 instanceof q))
              break label532;
          for (localObject2 = null; ; localObject2 = localObject3)
          {
            localObject4 = (q)localObject2;
            localObject2 = localObject1;
            if (localObject4 != null)
              localObject2 = ((q)localObject4).cause;
            paramb.am(localObject2);
            paramb = (ap)bl.BQP;
            AppMethodBeat.o(118596);
            break label87;
            break;
          }
        }
        break;
        localObject4 = localObject2;
        continue;
        localObject5 = null;
        localObject4 = localObject6;
      }
    }
  }

  public final m a(o paramo)
  {
    AppMethodBeat.i(118610);
    j.p(paramo, "child");
    paramo = bc.a.a(this, true, false, (b)new n(this, paramo), 2);
    if (paramo == null)
    {
      paramo = new v("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
      AppMethodBeat.o(118610);
      throw paramo;
    }
    paramo = (m)paramo;
    AppMethodBeat.o(118610);
    return paramo;
  }

  public final void a(bn parambn)
  {
    AppMethodBeat.i(118601);
    j.p(parambn, "parentJob");
    ei(parambn);
    AppMethodBeat.o(118601);
  }

  public void eb(Object paramObject)
  {
  }

  final boolean ei(Object paramObject)
  {
    Object localObject1 = null;
    int i = 0;
    AppMethodBeat.i(118605);
    Throwable localThrowable1 = null;
    label13: Object localObject2 = elt();
    boolean bool;
    int j;
    if ((localObject2 instanceof bg.b))
      try
      {
        bool = ((bg.b)localObject2).isSealed();
        if (bool)
          AppMethodBeat.o(118605);
        for (bool = false; ; bool = true)
        {
          return bool;
          bool = ((bg.b)localObject2).elx();
          if ((paramObject != null) || (!bool))
          {
            localThrowable2 = localThrowable1;
            if (localThrowable1 == null)
              localThrowable2 = eh(paramObject);
            ((bg.b)localObject2).B(localThrowable2);
          }
          localThrowable1 = ((bg.b)localObject2).BQH;
          j = i;
          if (!bool)
            j = 1;
          paramObject = localObject1;
          if (j != 0)
            paramObject = localThrowable1;
          if (paramObject != null)
            a(((bg.b)localObject2).BQt, paramObject);
          AppMethodBeat.o(118605);
        }
      }
      finally
      {
        AppMethodBeat.o(118605);
      }
    if ((localObject2 instanceof ay))
    {
      if (localThrowable1 != null)
        break label520;
      localThrowable1 = eh(paramObject);
    }
    label517: label520: for (Throwable localThrowable2 = localThrowable1; ; localThrowable2 = localThrowable1)
    {
      if (((ay)localObject2).isActive())
      {
        ay localay = (ay)localObject2;
        if (!(localay instanceof bg.b));
        for (j = 1; j == 0; j = 0)
        {
          paramObject = (Throwable)new IllegalStateException("Check failed.".toString());
          AppMethodBeat.o(118605);
          throw paramObject;
        }
        if (!localay.isActive())
        {
          paramObject = (Throwable)new IllegalStateException("Check failed.".toString());
          AppMethodBeat.o(118605);
          throw paramObject;
        }
        bk localbk = a(localay);
        if (localbk == null)
          j = 0;
        while (true)
        {
          if (j == 0)
            break label517;
          AppMethodBeat.o(118605);
          bool = true;
          break;
          localObject2 = new bg.b(localbk, localThrowable2);
          if (!BPt.compareAndSet(this, localay, localObject2))
          {
            j = 0;
          }
          else
          {
            a(localbk, localThrowable2);
            j = 1;
          }
        }
      }
      switch (L(localObject2, new q(localThrowable2)))
      {
      default:
        paramObject = (Throwable)new IllegalStateException("unexpected result".toString());
        AppMethodBeat.o(118605);
        throw paramObject;
      case 0:
        paramObject = (Throwable)new IllegalStateException("Cannot happen in ".concat(String.valueOf(localObject2)).toString());
        AppMethodBeat.o(118605);
        throw paramObject;
      case 1:
      case 2:
        AppMethodBeat.o(118605);
        bool = true;
        break;
      case 3:
        break label13;
        AppMethodBeat.o(118605);
        bool = false;
        break;
        break label13;
      }
    }
  }

  public void ekU()
  {
  }

  public String ekV()
  {
    AppMethodBeat.i(118615);
    String str = af.ef(this);
    AppMethodBeat.o(118615);
    return str;
  }

  public final CancellationException els()
  {
    AppMethodBeat.i(118594);
    Object localObject = elt();
    if ((localObject instanceof bg.b))
    {
      localObject = ((bg.b)localObject).BQH;
      if (localObject != null)
      {
        CancellationException localCancellationException = c((Throwable)localObject, "Job is cancelling");
        localObject = localCancellationException;
        if (localCancellationException != null);
      }
      else
      {
        localObject = (Throwable)new IllegalStateException("Job is still new or active: ".concat(String.valueOf(this)).toString());
        AppMethodBeat.o(118594);
        throw ((Throwable)localObject);
      }
    }
    else
    {
      if ((localObject instanceof ay))
      {
        localObject = (Throwable)new IllegalStateException("Job is still new or active: ".concat(String.valueOf(this)).toString());
        AppMethodBeat.o(118594);
        throw ((Throwable)localObject);
      }
      if ((localObject instanceof q))
      {
        localObject = c(((q)localObject).cause, "Job was cancelled");
        AppMethodBeat.o(118594);
      }
    }
    while (true)
    {
      return localObject;
      localObject = (CancellationException)new bd("Job has completed normally", null, (o)this);
      AppMethodBeat.o(118594);
    }
  }

  public final Object elt()
  {
    AppMethodBeat.i(118584);
    while (true)
    {
      Object localObject = this.BPs;
      if (!(localObject instanceof k))
      {
        AppMethodBeat.o(118584);
        return localObject;
      }
      ((k)localObject).el(this);
    }
  }

  public final Throwable elv()
  {
    AppMethodBeat.i(118603);
    Object localObject = elt();
    Throwable localThrowable;
    if ((localObject instanceof bg.b))
    {
      localThrowable = ((bg.b)localObject).BQH;
      if ((localThrowable != null) && ((localThrowable instanceof CancellationException)))
        break label143;
      localThrowable = (Throwable)new bd("Parent job is " + ej(localObject), localThrowable, (o)this);
      AppMethodBeat.o(118603);
    }
    while (true)
    {
      return localThrowable;
      if ((localObject instanceof ay))
      {
        localThrowable = (Throwable)new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(localObject)).toString());
        AppMethodBeat.o(118603);
        throw localThrowable;
      }
      if ((localObject instanceof q))
      {
        localThrowable = ((q)localObject).cause;
        break;
      }
      localThrowable = null;
      break;
      label143: AppMethodBeat.o(118603);
    }
  }

  protected boolean elw()
  {
    return false;
  }

  public <R> R fold(R paramR, a.f.a.m<? super R, ? super e.b, ? extends R> paramm)
  {
    AppMethodBeat.i(118619);
    j.p(paramm, "operation");
    j.p(paramm, "operation");
    paramR = e.b.a.a((e.b)this, paramR, paramm);
    AppMethodBeat.o(118619);
    return paramR;
  }

  public <E extends e.b> E get(e.c<E> paramc)
  {
    AppMethodBeat.i(118620);
    j.p(paramc, "key");
    j.p(paramc, "key");
    paramc = e.b.a.a((e.b)this, paramc);
    AppMethodBeat.o(118620);
    return paramc;
  }

  public final e.c<?> getKey()
  {
    return (e.c)o.BQx;
  }

  public boolean isActive()
  {
    AppMethodBeat.i(118585);
    Object localObject = elt();
    boolean bool;
    if (((localObject instanceof ay)) && (((ay)localObject).isActive()))
    {
      bool = true;
      AppMethodBeat.o(118585);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118585);
    }
  }

  public a.c.e minusKey(e.c<?> paramc)
  {
    AppMethodBeat.i(118621);
    j.p(paramc, "key");
    j.p(paramc, "key");
    paramc = e.b.a.b((e.b)this, paramc);
    AppMethodBeat.o(118621);
    return paramc;
  }

  public a.c.e plus(a.c.e parame)
  {
    AppMethodBeat.i(118618);
    j.p(parame, "context");
    j.p(parame, "context");
    parame = e.b.a.a((e.b)this, parame);
    AppMethodBeat.o(118618);
    return parame;
  }

  public final boolean start()
  {
    AppMethodBeat.i(118593);
    Object localObject;
    int i;
    while (true)
    {
      localObject = elt();
      if (!(localObject instanceof ar))
        break label90;
      if (((ar)localObject).csi)
        break label129;
      if (BPt.compareAndSet(this, localObject, bh.elA()))
        break;
      i = -1;
      switch (i)
      {
      default:
      case 0:
      case 1:
      }
    }
    AppMethodBeat.o(118593);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      ekU();
      i = 1;
      break;
      label90: if ((localObject instanceof ax))
      {
        if (!BPt.compareAndSet(this, localObject, ((ax)localObject).BQt))
        {
          i = -1;
          break;
        }
        ekU();
        i = 1;
        break;
      }
      label129: i = 0;
      break;
      AppMethodBeat.o(118593);
    }
  }

  public String toString()
  {
    AppMethodBeat.i(118614);
    String str = ekV() + '{' + ej(elt()) + "}@" + af.ee(this);
    AppMethodBeat.o(118614);
    return str;
  }

  public void u(Throwable paramThrowable)
  {
    AppMethodBeat.i(118611);
    j.p(paramThrowable, "exception");
    AppMethodBeat.o(118611);
    throw paramThrowable;
  }

  public final boolean y(Throwable paramThrowable)
  {
    AppMethodBeat.i(118600);
    boolean bool;
    if (ei(paramThrowable))
    {
      bool = true;
      AppMethodBeat.o(118600);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(118600);
    }
  }

  protected void z(Throwable paramThrowable)
  {
    AppMethodBeat.i(118612);
    j.p(paramThrowable, "exception");
    AppMethodBeat.o(118612);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bg
 * JD-Core Version:    0.6.2
 */