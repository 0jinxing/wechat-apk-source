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

public final class u extends x<Integer>
{
  public u(int paramInt)
  {
    super(Integer.valueOf(paramInt));
    AppMethodBeat.i(122119);
    AppMethodBeat.o(122119);
  }

  public final w b(y paramy)
  {
    AppMethodBeat.i(122117);
    j.p(paramy, "module");
    a locala = g.Bag.BbD;
    j.o(locala, "KotlinBuiltIns.FQ_NAMES.uInt");
    paramy = s.a(paramy, locala);
    if (paramy != null)
    {
      paramy = paramy.dZf();
      if (paramy != null)
      {
        paramy = (w)paramy;
        AppMethodBeat.o(122117);
      }
    }
    while (true)
    {
      return paramy;
      paramy = p.awn("Unsigned type UInt not found");
      j.o(paramy, "ErrorUtils.createErrorTy…ned type UInt not found\")");
      paramy = (w)paramy;
      AppMethodBeat.o(122117);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(122118);
    String str = ((Number)getValue()).intValue() + ".toUInt()";
    AppMethodBeat.o(122118);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.b.u
 * JD-Core Version:    0.6.2
 */