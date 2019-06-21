package kotlinx.coroutines.a;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "E", "", "singleConsumer", "", "(Z)V", "_cur", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Lkotlinx/coroutines/internal/Core;", "isEmpty", "()Z", "size", "", "getSize", "()I", "addLast", "element", "(Ljava/lang/Object;)Z", "close", "", "map", "", "R", "transform", "Lkotlin/Function1;", "removeFirstOrNull", "()Ljava/lang/Object;", "removeFirstOrNullIf", "predicate", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-coroutines-core"})
public class i<E>
{
  static
  {
    AppMethodBeat.i(118450);
    BRy = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "BRx");
    AppMethodBeat.o(118450);
  }

  public i()
  {
    AppMethodBeat.i(118449);
    this.BRx = new j(8, false);
    AppMethodBeat.o(118449);
  }

  public final void close()
  {
    AppMethodBeat.i(118446);
    while (true)
    {
      j localj = (j)this.BRx;
      long l = localj.BRz;
      if ((l & 0x0) == 0L)
        if ((0x0 & l) == 0L);
      for (int i = 0; ; i = 1)
      {
        if (i == 0)
          break label74;
        AppMethodBeat.o(118446);
        return;
        if (!j.BRA.compareAndSet(localj, l, l | 0x0))
          break;
      }
      label74: BRy.compareAndSet(this, localj, localj.elO());
    }
  }

  public final E elE()
  {
    AppMethodBeat.i(118448);
    while (true)
    {
      j localj = (j)this.BRx;
      long l = localj.BRz;
      Object localObject1;
      if ((0x0 & l) != 0L)
        localObject1 = j.BRD;
      while (true)
      {
        if (localObject1 == j.BRD)
          break label228;
        AppMethodBeat.o(118448);
        return localObject1;
        localObject1 = j.BRE;
        int i = (int)((0x3FFFFFFF & l) >> 0);
        if (((int)((0xC0000000 & l) >> 30) & j.a(localj)) == (j.a(localj) & i))
        {
          localObject1 = null;
        }
        else
        {
          localObject1 = j.b(localj).get(j.a(localj) & i);
          if (localObject1 == null)
          {
            if (!j.c(localj))
              break;
            localObject1 = null;
            continue;
          }
          if ((localObject1 instanceof j.b))
          {
            localObject1 = null;
          }
          else
          {
            int j = i + 1 & 0x3FFFFFFF;
            Object localObject2 = j.BRA;
            Object localObject3 = j.BRE;
            if (((AtomicLongFieldUpdater)localObject2).compareAndSet(localj, l, j.a.K(l, j)))
            {
              j.b(localj).set(j.a(localj) & i, null);
            }
            else
            {
              if (!j.c(localj))
                break;
              localObject3 = localj;
              do
              {
                localObject2 = j.a((j)localObject3, i, j);
                localObject3 = localObject2;
              }
              while (localObject2 != null);
            }
          }
        }
      }
      label228: BRy.compareAndSet(this, localj, localj.elO());
    }
  }

  public final boolean en(E paramE)
  {
    AppMethodBeat.i(118447);
    a.f.b.j.p(paramE, "element");
    while (true)
    {
      j localj = (j)this.BRx;
      boolean bool;
      switch (localj.eo(paramE))
      {
      default:
        break;
      case 0:
        bool = true;
        AppMethodBeat.o(118447);
      case 2:
        while (true)
        {
          return bool;
          bool = false;
          AppMethodBeat.o(118447);
        }
      case 1:
        BRy.compareAndSet(this, localj, localj.elO());
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a.i
 * JD-Core Version:    0.6.2
 */