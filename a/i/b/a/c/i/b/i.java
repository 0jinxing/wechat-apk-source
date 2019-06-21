package a.i.b.a.c.i.b;

import a.f.b.j;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.s;
import a.i.b.a.c.b.y;
import a.i.b.a.c.f.a;
import a.i.b.a.c.i.d;
import a.i.b.a.c.l.p;
import a.i.b.a.c.l.w;
import a.o;
import a.u;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i extends f<o<? extends a, ? extends a.i.b.a.c.f.f>>
{
  private final a BER;
  public final a.i.b.a.c.f.f BES;

  public i(a parama, a.i.b.a.c.f.f paramf)
  {
    super(u.I(parama, paramf));
    AppMethodBeat.i(122089);
    this.BER = parama;
    this.BES = paramf;
    AppMethodBeat.o(122089);
  }

  public final w b(y paramy)
  {
    AppMethodBeat.i(122087);
    j.p(paramy, "module");
    paramy = s.a(paramy, this.BER);
    if (paramy != null)
      if (d.y((l)paramy))
      {
        if (paramy == null)
          break label66;
        paramy = paramy.dZf();
        if (paramy == null)
          break label66;
        paramy = (w)paramy;
        AppMethodBeat.o(122087);
      }
    while (true)
    {
      return paramy;
      paramy = null;
      break;
      label66: paramy = p.awn("Containing class for error-class based enum entry " + this.BER + '.' + this.BES);
      j.o(paramy, "ErrorUtils.createErrorTy…mClassId.$enumEntryName\")");
      paramy = (w)paramy;
      AppMethodBeat.o(122087);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(122088);
    String str = this.BER.ehB() + '.' + this.BES;
    AppMethodBeat.o(122088);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.b.i
 * JD-Core Version:    0.6.2
 */