package a.i.b.a.c.d.a.c;

import a.f.b.j;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.l;
import a.i.b.a.c.d.a.c.a.n;
import a.i.b.a.c.d.a.e.w;
import a.i.b.a.c.d.a.e.x;
import a.i.b.a.c.k.d;
import a.i.b.a.c.n.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class i
  implements m
{
  final l Bht;
  final int BnA;
  final h Bnn;
  final Map<w, Integer> Bny;
  private final d<w, n> Bnz;

  public i(h paramh, l paraml, x paramx, int paramInt)
  {
    AppMethodBeat.i(119845);
    this.Bnn = paramh;
    this.Bht = paraml;
    this.BnA = paramInt;
    this.Bny = a.x((Iterable)paramx.dYS());
    this.Bnz = this.Bnn.Bnv.Baf.g((a.f.a.b)new i.a(this));
    AppMethodBeat.o(119845);
  }

  public final ar a(w paramw)
  {
    AppMethodBeat.i(119844);
    j.p(paramw, "javaTypeParameter");
    n localn = (n)this.Bnz.am(paramw);
    if (localn != null)
    {
      paramw = (ar)localn;
      AppMethodBeat.o(119844);
    }
    while (true)
    {
      return paramw;
      paramw = this.Bnn.Bnw.a(paramw);
      AppMethodBeat.o(119844);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.i
 * JD-Core Version:    0.6.2
 */