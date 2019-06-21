package kotlinx.coroutines.a;

import a.f.b.j;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "()V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "_removedRef", "Lkotlinx/coroutines/internal/Removed;", "isRemoved", "", "()Z", "next", "getNext", "()Ljava/lang/Object;", "nextNode", "Lkotlinx/coroutines/internal/Node;", "getNextNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "prev", "getPrev", "prevNode", "getPrevNode", "addLast", "", "node", "addLastIf", "condition", "Lkotlin/Function0;", "addLastIfPrev", "predicate", "Lkotlin/Function1;", "addLastIfPrevAndIf", "addNext", "addOneIfEmpty", "correctPrev", "op", "Lkotlinx/coroutines/internal/OpDescriptor;", "describeAddLast", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "T", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "describeRemove", "Lkotlinx/coroutines/internal/AtomicDesc;", "describeRemoveFirst", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "findHead", "finishAdd", "finishRemove", "helpDelete", "helpRemove", "makeCondAddOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "markPrev", "remove", "removeFirstIfIsInstanceOf", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "removeFirstOrNull", "removed", "toString", "", "tryCondAddNext", "", "condAdd", "validateNode", "validateNode$kotlinx_coroutines_core", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "RemoveFirstDesc", "kotlinx-coroutines-core"})
public class h
{
  static final AtomicReferenceFieldUpdater BRq;
  static final AtomicReferenceFieldUpdater BRs;
  private static final AtomicReferenceFieldUpdater BRu;
  volatile Object BRp;
  volatile Object BRr;
  private volatile Object BRt;

  static
  {
    AppMethodBeat.i(118424);
    BRq = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "BRp");
    BRs = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "BRr");
    BRu = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "BRt");
    AppMethodBeat.o(118424);
  }

  public h()
  {
    AppMethodBeat.i(118422);
    this.BRp = this;
    this.BRr = this;
    this.BRt = null;
    AppMethodBeat.o(118422);
  }

  private final void c(h paramh)
  {
    AppMethodBeat.i(118417);
    while (true)
    {
      Object localObject = paramh.BRr;
      if (((localObject instanceof l)) || (elJ() != paramh))
        AppMethodBeat.o(118417);
      while (true)
      {
        return;
        if (!BRs.compareAndSet(paramh, localObject, this))
          break;
        if ((elJ() instanceof l))
        {
          if (localObject == null)
          {
            paramh = new v("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            AppMethodBeat.o(118417);
            throw paramh;
          }
          paramh.d((h)localObject);
        }
        AppMethodBeat.o(118417);
      }
    }
  }

  private final h d(h paramh)
  {
    Object localObject1 = null;
    AppMethodBeat.i(118420);
    Object localObject2 = null;
    Object localObject3 = paramh.BRp;
    if (localObject3 == null)
      AppMethodBeat.o(118420);
    while (true)
    {
      return paramh;
      if ((localObject3 instanceof k))
      {
        ((k)localObject3).el(paramh);
        break;
      }
      if ((localObject3 instanceof l))
      {
        if (localObject2 != null)
        {
          paramh.elM();
          BRq.compareAndSet(localObject2, paramh, ((l)localObject3).BRF);
          paramh = (h)localObject2;
          localObject2 = null;
          break;
        }
        paramh = g.em(paramh.BRr);
        break;
      }
      Object localObject4 = this.BRr;
      if ((localObject4 instanceof l))
      {
        AppMethodBeat.o(118420);
        paramh = localObject1;
      }
      else
      {
        if (localObject3 != (h)this)
        {
          if (localObject3 == null)
          {
            paramh = new v("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            AppMethodBeat.o(118420);
            throw paramh;
          }
          localObject3 = (h)localObject3;
          localObject2 = paramh;
          paramh = (h)localObject3;
          break;
        }
        if (localObject4 == paramh)
        {
          AppMethodBeat.o(118420);
          paramh = localObject1;
        }
        else
        {
          if ((!BRs.compareAndSet(this, localObject4, paramh)) || ((paramh.BRr instanceof l)))
            break;
          AppMethodBeat.o(118420);
          paramh = localObject1;
        }
      }
    }
  }

  private final l elI()
  {
    AppMethodBeat.i(118410);
    l locall1 = (l)this.BRt;
    l locall2 = locall1;
    if (locall1 == null)
    {
      locall2 = new l(this);
      BRu.lazySet(this, locall2);
    }
    AppMethodBeat.o(118410);
    return locall2;
  }

  private final h elM()
  {
    AppMethodBeat.i(118418);
    Object localObject1 = this.BRr;
    if ((localObject1 instanceof l))
    {
      localObject2 = ((l)localObject1).BRF;
      AppMethodBeat.o(118418);
      label30: return localObject2;
    }
    if (localObject1 == (h)this);
    for (Object localObject2 = elN(); ; localObject2 = (h)localObject1)
    {
      localObject2 = ((h)localObject2).elI();
      if (!BRs.compareAndSet(this, localObject1, localObject2))
        break;
      localObject2 = (h)localObject1;
      AppMethodBeat.o(118418);
      break label30;
      if (localObject1 == null)
      {
        localObject2 = new v("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        AppMethodBeat.o(118418);
        throw ((Throwable)localObject2);
      }
    }
  }

  private final h elN()
  {
    AppMethodBeat.i(118419);
    Object localObject = (h)this;
    while (true)
    {
      if ((localObject instanceof f))
      {
        AppMethodBeat.o(118419);
        return localObject;
      }
      localObject = g.em(((h)localObject).elJ());
      if (localObject != (h)this);
      for (int i = 1; i == 0; i = 0)
      {
        localObject = (Throwable)new IllegalStateException("Cannot loop to this while looking for list head".toString());
        AppMethodBeat.o(118419);
        throw ((Throwable)localObject);
      }
    }
  }

  public final int a(h paramh1, h paramh2, h.a parama)
  {
    AppMethodBeat.i(118415);
    j.p(paramh1, "node");
    j.p(paramh2, "next");
    j.p(parama, "condAdd");
    BRs.lazySet(paramh1, this);
    BRq.lazySet(paramh1, paramh2);
    parama.BRv = paramh2;
    int i;
    if (!BRq.compareAndSet(this, paramh2, parama))
    {
      i = 0;
      AppMethodBeat.o(118415);
    }
    while (true)
    {
      return i;
      if (parama.el(this) == null)
      {
        i = 1;
        AppMethodBeat.o(118415);
      }
      else
      {
        i = 2;
        AppMethodBeat.o(118415);
      }
    }
  }

  public boolean aQp()
  {
    AppMethodBeat.i(118416);
    Object localObject1;
    boolean bool;
    do
    {
      localObject1 = elJ();
      if ((localObject1 instanceof l))
        AppMethodBeat.o(118416);
      for (bool = false; ; bool = false)
      {
        return bool;
        if (localObject1 != (h)this)
          break;
        AppMethodBeat.o(118416);
      }
      if (localObject1 == null)
      {
        localObject2 = new v("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        AppMethodBeat.o(118416);
        throw ((Throwable)localObject2);
      }
      localObject2 = ((h)localObject1).elI();
    }
    while (!BRq.compareAndSet(this, localObject1, localObject2));
    h localh1 = (h)localObject1;
    Object localObject2 = elM();
    Object localObject3 = this.BRp;
    if (localObject3 == null)
    {
      localObject2 = new v("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
      AppMethodBeat.o(118416);
      throw ((Throwable)localObject2);
    }
    while (true)
    {
      h localh2 = ((l)localObject3).BRF;
      label269: 
      do
        while (true)
        {
          localObject3 = localh2.elJ();
          if ((localObject3 instanceof l))
          {
            localh2.elM();
            break;
          }
          localObject3 = ((h)localObject2).elJ();
          if ((localObject3 instanceof l))
          {
            if (localObject1 != null)
            {
              ((h)localObject2).elM();
              BRq.compareAndSet(localObject1, localObject2, ((l)localObject3).BRF);
              localObject2 = localObject1;
              localObject1 = null;
            }
            else
            {
              localObject2 = g.em(((h)localObject2).BRr);
            }
          }
          else
          {
            if (localObject3 == (h)this)
              break label269;
            if (localObject3 == null)
            {
              localObject2 = new v("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
              AppMethodBeat.o(118416);
              throw ((Throwable)localObject2);
            }
            localObject3 = (h)localObject3;
            if (localObject3 == localh2)
              break label282;
            localObject1 = localObject2;
            localObject2 = localObject3;
          }
        }
      while (!BRq.compareAndSet(localObject2, this, localh2));
      label282: localh1.d(g.em(this.BRr));
      bool = true;
      AppMethodBeat.o(118416);
      break;
      localObject1 = null;
    }
  }

  public final boolean b(h paramh)
  {
    AppMethodBeat.i(118414);
    j.p(paramh, "node");
    BRs.lazySet(paramh, this);
    BRq.lazySet(paramh, this);
    boolean bool;
    if (elJ() != (h)this)
    {
      bool = false;
      AppMethodBeat.o(118414);
    }
    while (true)
    {
      return bool;
      if (!BRq.compareAndSet(this, this, paramh))
        break;
      paramh.c(this);
      bool = true;
      AppMethodBeat.o(118414);
    }
  }

  public final Object elJ()
  {
    AppMethodBeat.i(118411);
    while (true)
    {
      Object localObject = this.BRp;
      if (!(localObject instanceof k))
      {
        AppMethodBeat.o(118411);
        return localObject;
      }
      ((k)localObject).el(this);
    }
  }

  public final h elK()
  {
    AppMethodBeat.i(138672);
    h localh = g.em(elJ());
    AppMethodBeat.o(138672);
    return localh;
  }

  public final Object elL()
  {
    AppMethodBeat.i(118413);
    while (true)
    {
      Object localObject = this.BRr;
      if ((localObject instanceof l))
        AppMethodBeat.o(118413);
      while (true)
      {
        return localObject;
        if (localObject == null)
        {
          localObject = new v("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
          AppMethodBeat.o(118413);
          throw ((Throwable)localObject);
        }
        if (((h)localObject).elJ() != (h)this)
          break;
        AppMethodBeat.o(118413);
      }
      d((h)localObject);
    }
  }

  public String toString()
  {
    AppMethodBeat.i(118421);
    String str = getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    AppMethodBeat.o(118421);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a.h
 * JD-Core Version:    0.6.2
 */