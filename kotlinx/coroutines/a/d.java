package kotlinx.coroutines.a;

import a.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/internal/AtomicOp;", "T", "Lkotlinx/coroutines/internal/OpDescriptor;", "()V", "_consensus", "Lkotlinx/atomicfu/AtomicRef;", "", "isDecided", "", "()Z", "complete", "", "affected", "failure", "(Ljava/lang/Object;Ljava/lang/Object;)V", "decide", "decision", "perform", "prepare", "(Ljava/lang/Object;)Ljava/lang/Object;", "tryDecide", "kotlinx-coroutines-core"})
public abstract class d<T> extends k
{
  private static final AtomicReferenceFieldUpdater BRj = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "BRi");
  private volatile Object BRi = c.elG();

  public abstract void M(T paramT, Object paramObject);

  public abstract Object ek(T paramT);

  public final Object el(Object paramObject)
  {
    Object localObject1 = this.BRi;
    Object localObject2 = localObject1;
    if (localObject1 == c.elG())
    {
      localObject2 = ek(paramObject);
      if (localObject2 != c.elG());
      for (int i = 1; i == 0; i = 0)
        throw ((Throwable)new IllegalStateException("Check failed.".toString()));
      if (!BRj.compareAndSet(this, c.elG(), localObject2))
        break label79;
    }
    while (true)
    {
      M(paramObject, localObject2);
      return localObject2;
      label79: localObject2 = this.BRi;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a.d
 * JD-Core Version:    0.6.2
 */