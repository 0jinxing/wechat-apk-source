package kotlinx.coroutines.a;

import a.c.e;
import a.c.e.b;
import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import kotlinx.coroutines.bq;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"ZERO", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "restoreState", "Lkotlinx/coroutines/internal/ThreadState;", "updateState", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"})
public final class o
{
  private static final m BRI;
  private static final a.f.a.m<Object, e.b, Object> BRJ;
  private static final a.f.a.m<bq<?>, e.b, bq<?>> BRK;
  private static final a.f.a.m<s, e.b, s> BRL;
  private static final a.f.a.m<s, e.b, s> BRM;

  static
  {
    AppMethodBeat.i(118395);
    BRI = new m("ZERO");
    BRJ = (a.f.a.m)o.a.BRN;
    BRK = (a.f.a.m)o.b.BRO;
    BRL = (a.f.a.m)o.d.BRQ;
    BRM = (a.f.a.m)o.c.BRP;
    AppMethodBeat.o(118395);
  }

  public static final void a(e parame, Object paramObject)
  {
    AppMethodBeat.i(118394);
    j.p(parame, "context");
    if (paramObject == BRI)
      AppMethodBeat.o(118394);
    while (true)
    {
      return;
      if ((paramObject instanceof s))
      {
        ((s)paramObject).i = 0;
        parame.fold(paramObject, BRM);
        AppMethodBeat.o(118394);
      }
      else
      {
        Object localObject = parame.fold(null, BRK);
        if (localObject == null)
        {
          parame = new v("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
          AppMethodBeat.o(118394);
          throw parame;
        }
        ((bq)localObject).a(parame, paramObject);
        AppMethodBeat.o(118394);
      }
    }
  }

  public static final Object b(e parame, Object paramObject)
  {
    AppMethodBeat.i(118393);
    j.p(parame, "context");
    if (paramObject == null)
      paramObject = d(parame);
    while (true)
    {
      if (paramObject == Integer.valueOf(0))
      {
        parame = BRI;
        AppMethodBeat.o(118393);
      }
      while (true)
      {
        return parame;
        if ((paramObject instanceof Integer))
        {
          parame = parame.fold(new s(parame, ((Number)paramObject).intValue()), BRL);
          AppMethodBeat.o(118393);
        }
        else
        {
          if (paramObject == null)
          {
            parame = new v("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AppMethodBeat.o(118393);
            throw parame;
          }
          parame = ((bq)paramObject).c(parame);
          AppMethodBeat.o(118393);
        }
      }
    }
  }

  public static final Object d(e parame)
  {
    AppMethodBeat.i(118392);
    j.p(parame, "context");
    parame = parame.fold(Integer.valueOf(0), BRJ);
    if (parame == null)
      j.dWJ();
    AppMethodBeat.o(118392);
    return parame;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.a.o
 * JD-Core Version:    0.6.2
 */