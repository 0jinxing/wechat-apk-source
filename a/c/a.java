package a.c;

import a.f.a.m;
import a.f.b.j;
import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)V", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlin-stdlib"})
public abstract class a
  implements e.b
{
  private final e.c<?> key;

  public a(e.c<?> paramc)
  {
    this.key = paramc;
  }

  public <R> R fold(R paramR, m<? super R, ? super e.b, ? extends R> paramm)
  {
    j.p(paramm, "operation");
    return e.b.a.a(this, paramR, paramm);
  }

  public <E extends e.b> E get(e.c<E> paramc)
  {
    j.p(paramc, "key");
    return e.b.a.a(this, paramc);
  }

  public e.c<?> getKey()
  {
    return this.key;
  }

  public e minusKey(e.c<?> paramc)
  {
    j.p(paramc, "key");
    return e.b.a.b(this, paramc);
  }

  public e plus(e parame)
  {
    j.p(parame, "context");
    return e.b.a.a(this, parame);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.c.a
 * JD-Core Version:    0.6.2
 */