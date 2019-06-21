package kotlinx.coroutines.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.a.j;
import kotlinx.coroutines.a.j.a;
import kotlinx.coroutines.a.j.b;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/scheduling/GlobalQueue;", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "Lkotlinx/coroutines/scheduling/Task;", "()V", "removeFirstBlockingModeOrNull", "kotlinx-coroutines-core"})
public final class e extends kotlinx.coroutines.a.i<i>
{
  public final i emi()
  {
    AppMethodBeat.i(118356);
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
          break label269;
        localObject1 = (i)localObject1;
        AppMethodBeat.o(118356);
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
            if (((i)localObject1).eml() == l.BSQ);
            for (int j = 1; ; j = 0)
            {
              if (j != 0)
                break label183;
              localObject1 = null;
              break;
            }
            label183: j = i + 1 & 0x3FFFFFFF;
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
      label269: kotlinx.coroutines.a.i.BRy.compareAndSet(this, localj, localj.elO());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.c.e
 * JD-Core Version:    0.6.2
 */