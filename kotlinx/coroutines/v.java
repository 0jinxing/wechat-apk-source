package kotlinx.coroutines;

import a.c.d;
import a.c.e;
import a.c.e.c;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.a.n;
import kotlinx.coroutines.c.c;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"COROUTINES_SCHEDULER_PROPERTY_NAME", "", "COROUTINE_ID", "Ljava/util/concurrent/atomic/AtomicLong;", "DEBUG_THREAD_NAME_SEPARATOR", "useCoroutinesScheduler", "", "getUseCoroutinesScheduler", "()Z", "coroutineName", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "createDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "resetCoroutineId", "", "withCoroutineContext", "T", "context", "countOrElement", "", "block", "Lkotlin/Function0;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "newCoroutineContext", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"})
public final class v
{
  private static final AtomicLong BPH;
  private static final boolean BPI;

  static
  {
    AppMethodBeat.i(118503);
    BPH = new AtomicLong();
    Object localObject = n.awA("kotlinx.coroutines.scheduler");
    if (localObject == null);
    while (true)
    {
      boolean bool = true;
      label27: BPI = bool;
      AppMethodBeat.o(118503);
      return;
      switch (((String)localObject).hashCode())
      {
      default:
      case 0:
      case 109935:
      case 3551:
      }
      do
      {
        do
        {
          do
          {
            localObject = (Throwable)new IllegalStateException(("System property 'kotlinx.coroutines.scheduler' has unrecognized value '" + (String)localObject + '\'').toString());
            AppMethodBeat.o(118503);
            throw ((Throwable)localObject);
          }
          while (!((String)localObject).equals(""));
          break;
        }
        while (!((String)localObject).equals("off"));
        bool = false;
        break label27;
      }
      while (!((String)localObject).equals("on"));
    }
  }

  public static final e a(ac paramac, e parame)
  {
    AppMethodBeat.i(118501);
    j.p(paramac, "receiver$0");
    j.p(parame, "context");
    parame = paramac.ekT().plus(parame);
    if (af.ela())
    {
      paramac = parame.plus((e)new aa(BPH.incrementAndGet()));
      if ((parame == ao.elj()) || (parame.get((e.c)d.AVd) != null))
        break label106;
      paramac = paramac.plus((e)ao.elj());
      AppMethodBeat.o(118501);
    }
    while (true)
    {
      return paramac;
      paramac = parame;
      break;
      label106: AppMethodBeat.o(118501);
    }
  }

  public static final String a(e parame)
  {
    AppMethodBeat.i(118502);
    j.p(parame, "receiver$0");
    if (!af.ela())
    {
      AppMethodBeat.o(118502);
      parame = null;
    }
    while (true)
    {
      return parame;
      aa localaa = (aa)parame.get((e.c)aa.BPL);
      if (localaa == null)
      {
        AppMethodBeat.o(118502);
        parame = null;
      }
      else
      {
        parame = (ab)parame.get((e.c)ab.BPM);
        if (parame != null)
        {
          String str = parame.name;
          parame = str;
          if (str != null);
        }
        else
        {
          parame = "coroutine";
        }
        parame = parame + '#' + localaa.id;
        AppMethodBeat.o(118502);
      }
    }
  }

  public static final w ekZ()
  {
    if (BPI);
    for (w localw = (w)c.BSC; ; localw = (w)p.BPE)
      return localw;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.v
 * JD-Core Version:    0.6.2
 */