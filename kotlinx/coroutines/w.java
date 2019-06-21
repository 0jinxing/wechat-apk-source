package kotlinx.coroutines;

import a.c.a;
import a.c.c;
import a.c.d;
import a.c.e;
import a.c.e.b;
import a.c.e.c;
import a.c.f;
import a.f.b.j;
import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "interceptContinuation", "Lkotlin/coroutines/Continuation;", "T", "continuation", "isDispatchNeeded", "", "plus", "other", "toString", "", "kotlinx-coroutines-core"})
public abstract class w extends a
  implements d
{
  public w()
  {
    super((e.c)d.AVd);
  }

  public final <T> c<T> a(c<? super T> paramc)
  {
    j.p(paramc, "continuation");
    return (c)new al(this, paramc);
  }

  public abstract void a(e parame, Runnable paramRunnable);

  public final void b(c<?> paramc)
  {
    j.p(paramc, "continuation");
    j.p(paramc, "continuation");
  }

  public boolean b(e parame)
  {
    j.p(parame, "context");
    return true;
  }

  public <E extends e.b> E get(e.c<E> paramc)
  {
    j.p(paramc, "key");
    j.p(paramc, "key");
    if (paramc == d.AVd);
    for (paramc = (e.b)this; ; paramc = null)
      return paramc;
  }

  public e minusKey(e.c<?> paramc)
  {
    j.p(paramc, "key");
    j.p(paramc, "key");
    if (paramc == d.AVd);
    for (paramc = (e)f.AVg; ; paramc = (e)this)
      return paramc;
  }

  public String toString()
  {
    return af.ef(this) + '@' + af.ee(this);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.w
 * JD-Core Version:    0.6.2
 */