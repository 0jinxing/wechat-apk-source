package kotlinx.coroutines.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "E", "", "capacity", "", "singleConsumer", "", "(IZ)V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/Core;", "_state", "Lkotlinx/atomicfu/AtomicLong;", "array", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "isEmpty", "()Z", "mask", "size", "getSize", "()I", "addLast", "element", "(Ljava/lang/Object;)I", "allocateNextCopy", "state", "", "allocateOrGetNextCopy", "close", "fillPlaceholder", "index", "(ILjava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "map", "", "R", "transform", "Lkotlin/Function1;", "markFrozen", "next", "removeFirstOrNull", "removeFirstOrNullIf", "predicate", "removeSlowPath", "oldHead", "newHead", "Companion", "Placeholder", "kotlinx-coroutines-core"})
public final class j<E>
{
  public static final m BRD;
  public static final j.a BRE;
  private static final AtomicReferenceFieldUpdater BRq;
  private final AtomicReferenceArray<Object> BRB;
  private final boolean BRC;
  private volatile Object BRp;
  private final int capacity;
  private final int mask;

  static
  {
    AppMethodBeat.i(118408);
    BRE = new j.a((byte)0);
    BRD = new m("REMOVE_FROZEN");
    BRq = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "BRp");
    BRA = AtomicLongFieldUpdater.newUpdater(j.class, "BRz");
    AppMethodBeat.o(118408);
  }

  public j(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(118406);
    this.capacity = paramInt;
    this.BRC = paramBoolean;
    this.mask = (this.capacity - 1);
    this.BRp = null;
    this.BRz = 0L;
    this.BRB = new AtomicReferenceArray(this.capacity);
    if (this.mask <= 1073741823);
    Throwable localThrowable;
    for (paramInt = 1; paramInt == 0; paramInt = 0)
    {
      localThrowable = (Throwable)new IllegalStateException("Check failed.".toString());
      AppMethodBeat.o(118406);
      throw localThrowable;
    }
    if ((this.capacity & this.mask) == 0);
    for (paramInt = i; paramInt == 0; paramInt = 0)
    {
      localThrowable = (Throwable)new IllegalStateException("Check failed.".toString());
      AppMethodBeat.o(118406);
      throw localThrowable;
    }
    AppMethodBeat.o(118406);
  }

  private final long elP()
  {
    AppMethodBeat.i(118403);
    long l1 = this.BRz;
    long l2;
    if ((l1 & 0x0) != 0L)
    {
      AppMethodBeat.o(118403);
      l2 = l1;
    }
    while (true)
    {
      return l2;
      l2 = l1 | 0x0;
      if (!BRA.compareAndSet(this, l1, l2))
        break;
      AppMethodBeat.o(118403);
    }
  }

  private final j<E> nZ(long paramLong)
  {
    AppMethodBeat.i(118404);
    while (true)
    {
      j localj = (j)this.BRp;
      if (localj != null)
      {
        AppMethodBeat.o(118404);
        return localj;
      }
      BRq.compareAndSet(this, null, oa(paramLong));
    }
  }

  private final j<E> oa(long paramLong)
  {
    AppMethodBeat.i(118405);
    j localj = new j(this.capacity * 2, this.BRC);
    int i = (int)((0x3FFFFFFF & paramLong) >> 0);
    int j = (int)((0xC0000000 & paramLong) >> 30);
    while ((this.mask & i) != (this.mask & j))
    {
      AtomicReferenceArray localAtomicReferenceArray = localj.BRB;
      int k = localj.mask;
      Object localObject1 = this.BRB.get(this.mask & i);
      Object localObject2 = localObject1;
      if (localObject1 == null)
        localObject2 = new j.b(i);
      localAtomicReferenceArray.set(i & k, localObject2);
      i++;
    }
    localj.BRz = (0xFFFFFFFF & paramLong);
    AppMethodBeat.o(118405);
    return localj;
  }

  private final j<E> u(int paramInt, E paramE)
  {
    AppMethodBeat.i(118401);
    Object localObject = this.BRB.get(this.mask & paramInt);
    if (((localObject instanceof j.b)) && (((j.b)localObject).index == paramInt))
    {
      this.BRB.set(this.mask & paramInt, paramE);
      AppMethodBeat.o(118401);
      paramE = this;
    }
    while (true)
    {
      return paramE;
      paramE = null;
      AppMethodBeat.o(118401);
    }
  }

  public final j<E> elO()
  {
    AppMethodBeat.i(118402);
    j localj = nZ(elP());
    AppMethodBeat.o(118402);
    return localj;
  }

  public final int eo(E paramE)
  {
    AppMethodBeat.i(118400);
    a.f.b.j.p(paramE, "element");
    long l = this.BRz;
    int i;
    if ((0x0 & l) != 0L)
    {
      i = j.a.ob(l);
      AppMethodBeat.o(118400);
    }
    while (true)
    {
      return i;
      i = (int)((0x3FFFFFFF & l) >> 0);
      int j = (int)((0xC0000000 & l) >> 30);
      int k = this.mask;
      if ((j + 2 & k) == (i & k))
      {
        AppMethodBeat.o(118400);
        i = 1;
      }
      else
      {
        if ((!this.BRC) && (this.BRB.get(j & k) != null))
        {
          if ((this.capacity >= 1024) && ((j - i & 0x3FFFFFFF) <= this.capacity >> 1))
            break;
          AppMethodBeat.o(118400);
          i = 1;
          continue;
        }
        if (!BRA.compareAndSet(this, l, j.a.L(l, j + 1 & 0x3FFFFFFF)))
          break;
        this.BRB.set(j & k, paramE);
        Object localObject = (j)this;
        j localj;
        do
        {
          if ((((j)localObject).BRz & 0x0) == 0L)
            break;
          localj = ((j)localObject).elO().u(j, paramE);
          localObject = localj;
        }
        while (localj != null);
        AppMethodBeat.o(118400);
        i = 0;
      }
    }
  }

  public final boolean isEmpty()
  {
    boolean bool = false;
    long l = this.BRz;
    if ((int)((0x3FFFFFFF & l) >> 0) == (int)((l & 0xC0000000) >> 30))
      bool = true;
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a.j
 * JD-Core Version:    0.6.2
 */