package kotlinx.coroutines;

import a.a;
import a.c.e;
import a.c.e.c;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CancellationException;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"CoroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handler", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext;", "", "", "handleCoroutineException", "context", "exception", "caller", "Lkotlinx/coroutines/Job;", "handleExceptionViaHandler", "handlerException", "originalException", "thrownException", "kotlinx-coroutines-core"})
public final class z
{
  public static final void a(e parame, Throwable paramThrowable, bc parambc)
  {
    AppMethodBeat.i(118374);
    j.p(parame, "context");
    j.p(paramThrowable, "exception");
    if ((paramThrowable instanceof CancellationException))
      AppMethodBeat.o(118374);
    while (true)
    {
      return;
      bc localbc = (bc)parame.get((e.c)bc.BQx);
      if ((localbc != null) && (localbc != parambc) && (localbc.y(paramThrowable)))
      {
        AppMethodBeat.o(118374);
      }
      else
      {
        b(parame, paramThrowable);
        AppMethodBeat.o(118374);
      }
    }
  }

  public static final Throwable b(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    AppMethodBeat.i(118376);
    j.p(paramThrowable1, "originalException");
    j.p(paramThrowable2, "thrownException");
    if (paramThrowable1 == paramThrowable2)
      AppMethodBeat.o(118376);
    while (true)
    {
      return paramThrowable1;
      paramThrowable2 = new RuntimeException("Exception while trying to handle coroutine exception", paramThrowable2);
      a.a((Throwable)paramThrowable2, paramThrowable1);
      paramThrowable1 = (Throwable)paramThrowable2;
      AppMethodBeat.o(118376);
    }
  }

  public static final void b(e parame, Throwable paramThrowable)
  {
    AppMethodBeat.i(118375);
    j.p(parame, "context");
    j.p(paramThrowable, "exception");
    try
    {
      x localx = (x)parame.get((e.c)x.BPJ);
      if (localx != null)
      {
        localx.handleException(parame, paramThrowable);
        AppMethodBeat.o(118375);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        y.a(parame, b(paramThrowable, localThrowable));
        AppMethodBeat.o(118375);
        continue;
        y.a(parame, paramThrowable);
        AppMethodBeat.o(118375);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.z
 * JD-Core Version:    0.6.2
 */