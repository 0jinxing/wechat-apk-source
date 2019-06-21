package a.i.b.a.c.i.b;

import a.f.b.j;
import a.i.b.a.c.a.g;
import a.i.b.a.c.a.g.a;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.s;
import a.i.b.a.c.b.y;
import a.i.b.a.c.f.a;
import a.i.b.a.c.l.p;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class v extends x<Long>
{
  public v(long paramLong)
  {
    super(Long.valueOf(paramLong));
    AppMethodBeat.i(122122);
    AppMethodBeat.o(122122);
  }

  public final w b(y paramy)
  {
    AppMethodBeat.i(122120);
    j.p(paramy, "module");
    a locala = g.Bag.BbE;
    j.o(locala, "KotlinBuiltIns.FQ_NAMES.uLong");
    paramy = s.a(paramy, locala);
    if (paramy != null)
    {
      paramy = paramy.dZf();
      if (paramy != null)
      {
        paramy = (w)paramy;
        AppMethodBeat.o(122120);
      }
    }
    while (true)
    {
      return paramy;
      paramy = p.awn("Unsigned type ULong not found");
      j.o(paramy, "ErrorUtils.createErrorTy…ed type ULong not found\")");
      paramy = (w)paramy;
      AppMethodBeat.o(122120);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(122121);
    String str = ((Number)getValue()).longValue() + ".toULong()";
    AppMethodBeat.o(122121);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.b.v
 * JD-Core Version:    0.6.2
 */