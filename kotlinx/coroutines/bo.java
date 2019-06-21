package kotlinx.coroutines;

import a.c.c;
import a.c.e;
import a.f.b.j;
import a.l;
import a.p;
import a.q;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.a.o;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"MODE_ATOMIC_DEFAULT", "", "MODE_ATOMIC_DEFAULT$annotations", "()V", "MODE_CANCELLABLE", "MODE_CANCELLABLE$annotations", "MODE_DIRECT", "MODE_DIRECT$annotations", "MODE_IGNORE", "MODE_IGNORE$annotations", "MODE_UNDISPATCHED", "MODE_UNDISPATCHED$annotations", "isCancellableMode", "", "(I)Z", "isDispatchedMode", "resumeMode", "", "T", "Lkotlin/coroutines/Continuation;", "value", "mode", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;I)V", "resumeUninterceptedMode", "resumeUninterceptedWithExceptionMode", "exception", "", "resumeWithExceptionMode", "kotlinx-coroutines-core"})
public final class bo
{
  public static final boolean UY(int paramInt)
  {
    boolean bool = true;
    if (paramInt == 1);
    while (true)
    {
      return bool;
      bool = false;
    }
  }

  public static final <T> void a(c<? super T> paramc, T paramT, int paramInt)
  {
    AppMethodBeat.i(118527);
    j.p(paramc, "receiver$0");
    Object localObject1;
    switch (paramInt)
    {
    default:
      paramc = (Throwable)new IllegalStateException("Invalid mode ".concat(String.valueOf(paramInt)).toString());
      AppMethodBeat.o(118527);
      throw paramc;
    case 0:
      localObject1 = p.AUp;
      paramc.dn(p.dl(paramT));
      AppMethodBeat.o(118527);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return;
      am.a(paramc, paramT);
      AppMethodBeat.o(118527);
      continue;
      am.b(paramc, paramT);
      AppMethodBeat.o(118527);
      continue;
      Object localObject2 = (al)paramc;
      localObject1 = ((al)localObject2).dWv();
      paramc = o.b((e)localObject1, ((al)localObject2).BPZ);
      try
      {
        c localc = ((al)localObject2).BQb;
        localObject2 = p.AUp;
        localc.dn(p.dl(paramT));
        paramT = y.AUy;
        o.a((e)localObject1, paramc);
        AppMethodBeat.o(118527);
      }
      finally
      {
        o.a((e)localObject1, paramc);
        AppMethodBeat.o(118527);
      }
    }
  }

  public static final <T> void a(c<? super T> paramc, Throwable paramThrowable, int paramInt)
  {
    AppMethodBeat.i(118528);
    j.p(paramc, "receiver$0");
    j.p(paramThrowable, "exception");
    Object localObject1;
    switch (paramInt)
    {
    default:
      paramc = (Throwable)new IllegalStateException("Invalid mode ".concat(String.valueOf(paramInt)).toString());
      AppMethodBeat.o(118528);
      throw paramc;
    case 0:
      localObject1 = p.AUp;
      paramc.dn(p.dl(q.n(paramThrowable)));
      AppMethodBeat.o(118528);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return;
      am.a(paramc, paramThrowable);
      AppMethodBeat.o(118528);
      continue;
      am.b(paramc, paramThrowable);
      AppMethodBeat.o(118528);
      continue;
      Object localObject2 = (al)paramc;
      paramc = ((al)localObject2).dWv();
      localObject1 = o.b(paramc, ((al)localObject2).BPZ);
      try
      {
        c localc = ((al)localObject2).BQb;
        localObject2 = p.AUp;
        localc.dn(p.dl(q.n(paramThrowable)));
        paramThrowable = y.AUy;
        o.a(paramc, localObject1);
        AppMethodBeat.o(118528);
      }
      finally
      {
        o.a(paramc, localObject1);
        AppMethodBeat.o(118528);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.bo
 * JD-Core Version:    0.6.2
 */