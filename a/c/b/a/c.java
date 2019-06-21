package a.c.b.a;

import a.c.d;
import a.c.e;
import a.c.e.b;
import a.c.e.c;
import a.f.b.j;
import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "_context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "intercepted", "releaseIntercepted", "", "kotlin-stdlib"})
public abstract class c extends a
{
  private transient a.c.c<Object> AVr;
  private final e AVs;

  public c(a.c.c<Object> paramc)
  {
  }

  public c(a.c.c<Object> paramc, e parame)
  {
    super(paramc);
    this.AVs = parame;
  }

  public final e dWv()
  {
    e locale = this.AVs;
    if (locale == null)
      j.dWJ();
    return locale;
  }

  protected final void dWw()
  {
    a.c.c localc = this.AVr;
    if ((localc != null) && (localc != (c)this))
    {
      e.b localb = dWv().get((e.c)d.AVd);
      if (localb == null)
        j.dWJ();
      ((d)localb).b(localc);
    }
    this.AVr = ((a.c.c)b.AVq);
  }

  public final a.c.c<Object> dWx()
  {
    a.c.c localc = this.AVr;
    Object localObject = localc;
    if (localc == null)
    {
      localObject = (d)dWv().get((e.c)d.AVd);
      if (localObject == null)
        break label52;
    }
    label52: for (localObject = ((d)localObject).a((a.c.c)this); ; localObject = (a.c.c)this)
    {
      this.AVr = ((a.c.c)localObject);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.c.b.a.c
 * JD-Core Version:    0.6.2
 */