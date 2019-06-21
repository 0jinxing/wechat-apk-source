package a.i.b.a.c.d.b;

import a.f.b.j;
import a.i.b.a.c.e.a.aa;
import a.i.b.a.c.e.b.b;
import a.i.b.a.c.j.a.n;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.p;
import a.i.b.a.c.l.w;
import a.i.b.a.c.l.x;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g
  implements n
{
  public static final g Brt;

  static
  {
    AppMethodBeat.i(120264);
    Brt = new g();
    AppMethodBeat.o(120264);
  }

  public final w a(a.aa paramaa, String paramString, ad paramad1, ad paramad2)
  {
    AppMethodBeat.i(120263);
    j.p(paramaa, "proto");
    j.p(paramString, "flexibleId");
    j.p(paramad1, "lowerBound");
    j.p(paramad2, "upperBound");
    if ((j.j(paramString, "kotlin.jvm.PlatformType") ^ true))
    {
      paramaa = p.awn("Error java flexible type with id: " + paramString + ". (" + paramad1 + ".." + paramad2 + ')');
      j.o(paramaa, "ErrorUtils.createErrorTy…owerBound..$upperBound)\")");
      paramaa = (w)paramaa;
      AppMethodBeat.o(120263);
    }
    while (true)
    {
      return paramaa;
      if (paramaa.c(b.BxF))
      {
        paramaa = (w)new a.i.b.a.c.d.a.c.b.g(paramad1, paramad2);
        AppMethodBeat.o(120263);
      }
      else
      {
        paramaa = (w)x.a(paramad1, paramad2);
        AppMethodBeat.o(120263);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.g
 * JD-Core Version:    0.6.2
 */