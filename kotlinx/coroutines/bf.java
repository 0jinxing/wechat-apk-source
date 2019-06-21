package kotlinx.coroutines;

import a.f.b.j;
import a.l;
import a.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/JobNode;", "J", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CompletionHandlerBase;", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/Incomplete;", "job", "(Lkotlinx/coroutines/Job;)V", "isActive", "", "()Z", "Lkotlinx/coroutines/Job;", "list", "Lkotlinx/coroutines/NodeList;", "getList", "()Lkotlinx/coroutines/NodeList;", "dispose", "", "kotlinx-coroutines-core"})
public abstract class bf<J extends bc> extends t
  implements ap, ay
{
  public final J BQz;

  public bf(J paramJ)
  {
    this.BQz = paramJ;
  }

  public final void dispose()
  {
    Object localObject1 = this.BQz;
    if (localObject1 == null)
      throw new v("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
    localObject1 = (bg)localObject1;
    j.p(this, "node");
    Object localObject2;
    do
    {
      localObject2 = ((bg)localObject1).elt();
      if (!(localObject2 instanceof bf))
        break;
    }
    while ((localObject2 == this) && (!bg.BPt.compareAndSet(localObject1, localObject2, bh.elA())));
    while (true)
    {
      return;
      if (((localObject2 instanceof ay)) && (((ay)localObject2).ell() != null))
        aQp();
    }
  }

  public final bk ell()
  {
    return null;
  }

  public final boolean isActive()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bf
 * JD-Core Version:    0.6.2
 */