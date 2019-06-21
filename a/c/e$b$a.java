package a.c;

import a.f.a.m;
import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13})
public final class e$b$a
{
  public static <E extends e.b> E a(e.b paramb, e.c<E> paramc)
  {
    AppMethodBeat.i(56373);
    j.p(paramc, "key");
    if (j.j(paramb.getKey(), paramc))
      AppMethodBeat.o(56373);
    while (true)
    {
      return paramb;
      paramb = null;
      AppMethodBeat.o(56373);
    }
  }

  public static e a(e.b paramb, e parame)
  {
    AppMethodBeat.i(56376);
    j.p(parame, "context");
    paramb = e.a.a((e)paramb, parame);
    AppMethodBeat.o(56376);
    return paramb;
  }

  public static <R> R a(e.b paramb, R paramR, m<? super R, ? super e.b, ? extends R> paramm)
  {
    AppMethodBeat.i(56374);
    j.p(paramm, "operation");
    paramb = paramm.m(paramR, paramb);
    AppMethodBeat.o(56374);
    return paramb;
  }

  public static e b(e.b paramb, e.c<?> paramc)
  {
    AppMethodBeat.i(56375);
    j.p(paramc, "key");
    if (j.j(paramb.getKey(), paramc))
    {
      paramb = (e)f.AVg;
      AppMethodBeat.o(56375);
    }
    while (true)
    {
      return paramb;
      paramb = (e)paramb;
      AppMethodBeat.o(56375);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.c.e.b.a
 * JD-Core Version:    0.6.2
 */