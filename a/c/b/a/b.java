package a.c.b.a;

import a.c.c;
import a.c.e;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlin/coroutines/jvm/internal/CompletedContinuation;", "Lkotlin/coroutines/Continuation;", "", "()V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "resumeWith", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"})
public final class b
  implements c<Object>
{
  public static final b AVq;

  static
  {
    AppMethodBeat.i(56383);
    AVq = new b();
    AppMethodBeat.o(56383);
  }

  public final e dWv()
  {
    AppMethodBeat.i(56381);
    Throwable localThrowable = (Throwable)new IllegalStateException("This continuation is already complete".toString());
    AppMethodBeat.o(56381);
    throw localThrowable;
  }

  public final void dn(Object paramObject)
  {
    AppMethodBeat.i(56382);
    paramObject = (Throwable)new IllegalStateException("This continuation is already complete".toString());
    AppMethodBeat.o(56382);
    throw paramObject;
  }

  public final String toString()
  {
    return "This continuation is already complete";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.c.b.a.b
 * JD-Core Version:    0.6.2
 */