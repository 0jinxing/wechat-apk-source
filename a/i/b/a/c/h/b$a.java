package a.i.b.a.c.h;

import a.f.b.j;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.h;
import a.i.b.a.c.b.l;
import a.i.b.a.c.i.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$a
  implements b
{
  public static final a BBD;

  static
  {
    AppMethodBeat.i(121700);
    BBD = new a();
    AppMethodBeat.o(121700);
  }

  public final String a(h paramh, c paramc)
  {
    AppMethodBeat.i(121699);
    j.p(paramh, "classifier");
    j.p(paramc, "renderer");
    if ((paramh instanceof ar))
    {
      paramh = ((ar)paramh).dZg();
      j.o(paramh, "classifier.name");
      paramh = paramc.b(paramh, false);
      AppMethodBeat.o(121699);
    }
    while (true)
    {
      return paramh;
      paramh = d.n((l)paramh);
      j.o(paramh, "DescriptorUtils.getFqName(classifier)");
      paramh = paramc.f(paramh);
      AppMethodBeat.o(121699);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.h.b.a
 * JD-Core Version:    0.6.2
 */