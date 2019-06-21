package a.i.b.a.c.e.a;

import a.f.b.j;
import a.i.b.a.c.g.i.c;
import a.i.b.a.c.g.i.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class f
{
  public static final <M extends i.c<M>, T> T a(i.c<M> paramc, i.f<M, T> paramf)
  {
    AppMethodBeat.i(121081);
    j.p(paramc, "receiver$0");
    j.p(paramf, "extension");
    if (paramc.c(paramf))
    {
      paramc = paramc.e(paramf);
      AppMethodBeat.o(121081);
    }
    while (true)
    {
      return paramc;
      paramc = null;
      AppMethodBeat.o(121081);
    }
  }

  public static final <M extends i.c<M>, T> T a(i.c<M> paramc, i.f<M, List<T>> paramf, int paramInt)
  {
    AppMethodBeat.i(121082);
    j.p(paramc, "receiver$0");
    j.p(paramf, "extension");
    if (paramInt < paramc.d(paramf))
    {
      paramc = paramc.a(paramf, paramInt);
      AppMethodBeat.o(121082);
    }
    while (true)
    {
      return paramc;
      paramc = null;
      AppMethodBeat.o(121082);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.e.a.f
 * JD-Core Version:    0.6.2
 */