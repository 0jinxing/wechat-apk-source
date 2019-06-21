package kotlinx.coroutines;

import a.f.b.j;
import a.l;
import java.util.Arrays;
import kotlinx.coroutines.a.q;
import kotlinx.coroutines.a.r;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/EventLoopBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "timeMillis", "", "(J)V", "_heap", "", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "nanoTime", "compareTo", "other", "dispose", "", "rescheduleOnShutdown", "schedule", "delayed", "eventLoop", "Lkotlinx/coroutines/EventLoopBase;", "timeToExecute", "", "now", "toString", "", "kotlinx-coroutines-core"})
public abstract class at$b
  implements Comparable<b>, Runnable, r, ap
{
  private Object BQp;
  private int index = -1;
  public final long nanoTime = bs.elC().nanoTime() + au.nY(1000L);

  public final int a(q<b> paramq, at paramat)
  {
    int i;
    r localr;
    while (true)
    {
      try
      {
        j.p(paramq, "delayed");
        j.p(paramat, "eventLoop");
        paramat = this.BQp;
        localObject = au.elq();
        if (paramat == localObject)
        {
          i = 2;
          return i;
        }
        localr = (r)this;
        try
        {
          j.p(localr, "node");
          if (localr.elp() == null)
          {
            i = 1;
            if (i != 0)
              break;
            paramat = new java/lang/IllegalStateException;
            paramat.<init>("Check failed.".toString());
            throw ((Throwable)paramat);
          }
        }
        finally
        {
        }
      }
      finally
      {
      }
      i = 0;
    }
    localr.a((q)paramq);
    Object localObject = paramq.BRS;
    if (localObject == null)
    {
      paramat = new r[4];
      paramq.BRS = paramat;
    }
    while (true)
    {
      i = paramq.size;
      paramq.size = (i + 1);
      paramat[i] = localr;
      localr.setIndex(i);
      paramq.Vb(i);
      i = 0;
      break;
      paramat = (at)localObject;
      if (paramq.size >= localObject.length)
      {
        paramat = Arrays.copyOf((Object[])localObject, paramq.size * 2);
        j.o(paramat, "java.util.Arrays.copyOf(this, newSize)");
        paramq.BRS = ((r[])paramat);
        paramat = (r[])paramat;
      }
    }
  }

  public final void a(q<?> paramq)
  {
    if (this.BQp != au.elq());
    for (int i = 1; i == 0; i = 0)
      throw ((Throwable)new IllegalArgumentException("Failed requirement.".toString()));
    this.BQp = paramq;
  }

  public final void dispose()
  {
    try
    {
      Object localObject1 = this.BQp;
      Object localObject2 = au.elq();
      if (localObject1 == localObject2);
      while (true)
      {
        return;
        localObject2 = localObject1;
        if (!(localObject1 instanceof q))
          localObject2 = null;
        localObject2 = (q)localObject2;
        if (localObject2 != null)
          ((q)localObject2).a((r)this);
        this.BQp = au.elq();
      }
    }
    finally
    {
    }
  }

  public final q<?> elp()
  {
    Object localObject1 = this.BQp;
    Object localObject2 = localObject1;
    if (!(localObject1 instanceof q))
      localObject2 = null;
    return (q)localObject2;
  }

  public final int getIndex()
  {
    return this.index;
  }

  public final void setIndex(int paramInt)
  {
    this.index = paramInt;
  }

  public String toString()
  {
    return "Delayed[nanos=" + this.nanoTime + ']';
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.at.b
 * JD-Core Version:    0.6.2
 */