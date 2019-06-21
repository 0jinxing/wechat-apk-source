package a.c;

import a.f.a.m;
import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/coroutines/CoroutineContext;", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "minusKey", "plus", "context", "Element", "Key", "kotlin-stdlib"})
public abstract interface e
{
  public abstract <R> R fold(R paramR, m<? super R, ? super e.b, ? extends R> paramm);

  public abstract <E extends e.b> E get(c<E> paramc);

  public abstract e minusKey(c<?> paramc);

  public abstract e plus(e parame);

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"})
  public static abstract interface c<E extends e.b>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.c.e
 * JD-Core Version:    0.6.2
 */