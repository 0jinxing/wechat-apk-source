package kotlinx.coroutines;

import a.f.a.a;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.a.b;
import kotlinx.coroutines.a.p;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/UndispatchedEventLoop;", "", "()V", "threadLocalEventLoop", "Lkotlinx/coroutines/internal/ThreadLocalWithInitialValue;", "Lkotlinx/coroutines/UndispatchedEventLoop$EventLoop;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "execute", "", "continuation", "Lkotlinx/coroutines/DispatchedContinuation;", "contState", "mode", "", "doYield", "block", "Lkotlin/Function0;", "", "resumeUndispatched", "task", "Lkotlinx/coroutines/DispatchedTask;", "runEventLoop", "eventLoop", "EventLoop", "kotlinx-coroutines-core"})
public final class bu
{
  public static final p<bu.a> BQS;
  public static final bu BQT;

  static
  {
    AppMethodBeat.i(118499);
    BQT = new bu();
    BQS = new p((a)bu.b.BQV);
    AppMethodBeat.o(118499);
  }

  public static boolean a(an<?> paraman)
  {
    AppMethodBeat.i(118498);
    j.p(paraman, "task");
    bu.a locala = (bu.a)BQS.get();
    boolean bool;
    if (locala.csi)
    {
      locala.BQU.addLast(paraman);
      AppMethodBeat.o(118498);
      bool = true;
    }
    while (true)
    {
      return bool;
      j.o(locala, "eventLoop");
      try
      {
        locala.csi = true;
        am.a(paraman, paraman.ekR(), 3);
        while (true)
        {
          paraman = (Runnable)locala.BQU.elE();
          if (paraman == null)
          {
            locala.csi = false;
            AppMethodBeat.o(118498);
            bool = false;
            break;
          }
          paraman.run();
        }
      }
      catch (Throwable localThrowable)
      {
        locala.BQU.clear();
        paraman = new kotlinx/coroutines/ak;
        paraman.<init>("Unexpected exception in undispatched event loop, clearing pending tasks", localThrowable);
        paraman = (Throwable)paraman;
        AppMethodBeat.o(118498);
        throw paraman;
      }
      finally
      {
        locala.csi = false;
        AppMethodBeat.o(118498);
      }
    }
    throw paraman;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bu
 * JD-Core Version:    0.6.2
 */