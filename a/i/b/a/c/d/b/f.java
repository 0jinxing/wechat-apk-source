package a.i.b.a.c.d.b;

import a.aa;
import a.f.b.j;
import a.i.b.a.c.f.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
  implements a.i.b.a.c.j.a.f
{
  private final m BmS;
  private final e BmT;

  public f(m paramm, e parame)
  {
    AppMethodBeat.i(120262);
    this.BmS = paramm;
    this.BmT = parame;
    AppMethodBeat.o(120262);
  }

  public final a.i.b.a.c.j.a.e g(a parama)
  {
    AppMethodBeat.i(120261);
    j.p(parama, "classId");
    n localn = this.BmS.b(parama);
    if (localn == null)
    {
      parama = null;
      AppMethodBeat.o(120261);
    }
    while (true)
    {
      return parama;
      boolean bool = j.j(localn.dWY(), parama);
      if ((aa.AUz) && (!bool))
      {
        parama = (Throwable)new AssertionError("Class with incorrect id found: expected " + parama + ", actual " + localn.dWY());
        AppMethodBeat.o(120261);
        throw parama;
      }
      parama = this.BmT.a(localn);
      AppMethodBeat.o(120261);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.f
 * JD-Core Version:    0.6.2
 */