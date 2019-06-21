package kotlinx.coroutines;

import a.c.e;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"handlers", "", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleCoroutineExceptionImpl", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"})
public final class y
{
  private static final List<x> xEL;

  static
  {
    AppMethodBeat.i(118477);
    ServiceLoader localServiceLoader = ServiceLoader.load(x.class, x.class.getClassLoader());
    a.f.b.j.o(localServiceLoader, "ServiceLoader.load(servi…serviceClass.classLoader)");
    xEL = a.a.j.m((Iterable)localServiceLoader);
    AppMethodBeat.o(118477);
  }

  public static final void a(e parame, Throwable paramThrowable)
  {
    AppMethodBeat.i(118476);
    a.f.b.j.p(parame, "context");
    a.f.b.j.p(paramThrowable, "exception");
    Iterator localIterator = xEL.iterator();
    while (localIterator.hasNext())
    {
      x localx = (x)localIterator.next();
      try
      {
        localx.handleException(parame, paramThrowable);
      }
      catch (Throwable localThrowable)
      {
        Thread localThread = Thread.currentThread();
        a.f.b.j.o(localThread, "currentThread");
        localThread.getUncaughtExceptionHandler().uncaughtException(localThread, z.b(paramThrowable, localThrowable));
      }
    }
    parame = Thread.currentThread();
    a.f.b.j.o(parame, "currentThread");
    parame.getUncaughtExceptionHandler().uncaughtException(parame, paramThrowable);
    AppMethodBeat.o(118476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.y
 * JD-Core Version:    0.6.2
 */