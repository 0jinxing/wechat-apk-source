package a.i.b.a.c.i.b;

import a.f.b.j;
import a.i.b.a.c.a.g;
import a.i.b.a.c.a.g.a;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.s;
import a.i.b.a.c.b.y;
import a.i.b.a.c.f.a;
import a.i.b.a.c.l.p;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class w extends x<Short>
{
  public w(short paramShort)
  {
    super(Short.valueOf(paramShort));
    AppMethodBeat.i(122125);
    AppMethodBeat.o(122125);
  }

  public final a.i.b.a.c.l.w b(y paramy)
  {
    AppMethodBeat.i(122123);
    j.p(paramy, "module");
    a locala = g.Bag.BbC;
    j.o(locala, "KotlinBuiltIns.FQ_NAMES.uShort");
    paramy = s.a(paramy, locala);
    if (paramy != null)
    {
      paramy = paramy.dZf();
      if (paramy != null)
      {
        paramy = (a.i.b.a.c.l.w)paramy;
        AppMethodBeat.o(122123);
      }
    }
    while (true)
    {
      return paramy;
      paramy = p.awn("Unsigned type UShort not found");
      j.o(paramy, "ErrorUtils.createErrorTy…d type UShort not found\")");
      paramy = (a.i.b.a.c.l.w)paramy;
      AppMethodBeat.o(122123);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(122124);
    String str = ((Number)getValue()).shortValue() + ".toUShort()";
    AppMethodBeat.o(122124);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.b.w
 * JD-Core Version:    0.6.2
 */