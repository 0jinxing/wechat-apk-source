package a.i.b.a.c.h;

import a.f.b.j;
import a.i.b.a.c.b.au;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c$k$a
  implements c.k
{
  public static final a BBZ;

  static
  {
    AppMethodBeat.i(121731);
    BBZ = new a();
    AppMethodBeat.o(121731);
  }

  public final void a(au paramau, int paramInt1, int paramInt2, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121730);
    j.p(paramau, "parameter");
    j.p(paramStringBuilder, "builder");
    if (paramInt1 != paramInt2 - 1)
      paramStringBuilder.append(", ");
    AppMethodBeat.o(121730);
  }

  public final void a(au paramau, StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121729);
    j.p(paramau, "parameter");
    j.p(paramStringBuilder, "builder");
    AppMethodBeat.o(121729);
  }

  public final void e(StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121727);
    j.p(paramStringBuilder, "builder");
    paramStringBuilder.append("(");
    AppMethodBeat.o(121727);
  }

  public final void f(StringBuilder paramStringBuilder)
  {
    AppMethodBeat.i(121728);
    j.p(paramStringBuilder, "builder");
    paramStringBuilder.append(")");
    AppMethodBeat.o(121728);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.h.c.k.a
 * JD-Core Version:    0.6.2
 */