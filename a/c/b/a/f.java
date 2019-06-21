package a.c.b.a;

import a.c.c;
import a.c.e;
import a.l;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "kotlin-stdlib"})
public abstract class f extends a
{
  public f(c<Object> paramc)
  {
    super(paramc);
    if (paramc != null)
    {
      if (paramc.dWv() == a.c.f.AVg);
      for (int i = 1; i == 0; i = 0)
        throw ((Throwable)new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString()));
    }
  }

  public final e dWv()
  {
    return (e)a.c.f.AVg;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.c.b.a.f
 * JD-Core Version:    0.6.2
 */