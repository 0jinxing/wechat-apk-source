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

public final class t extends x<Byte>
{
  public t(byte paramByte)
  {
    super(Byte.valueOf(paramByte));
    AppMethodBeat.i(122116);
    AppMethodBeat.o(122116);
  }

  public final w b(y paramy)
  {
    AppMethodBeat.i(122114);
    j.p(paramy, "module");
    a locala = g.Bag.BbB;
    j.o(locala, "KotlinBuiltIns.FQ_NAMES.uByte");
    paramy = s.a(paramy, locala);
    if (paramy != null)
    {
      paramy = paramy.dZf();
      if (paramy != null)
      {
        paramy = (w)paramy;
        AppMethodBeat.o(122114);
      }
    }
    while (true)
    {
      return paramy;
      paramy = p.awn("Unsigned type UByte not found");
      j.o(paramy, "ErrorUtils.createErrorTy…ed type UByte not found\")");
      paramy = (w)paramy;
      AppMethodBeat.o(122114);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(122115);
    String str = ((Number)getValue()).byteValue() + ".toUByte()";
    AppMethodBeat.o(122115);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.b.t
 * JD-Core Version:    0.6.2
 */