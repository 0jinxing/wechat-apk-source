package a.i.b.a.c.j.a;

import a.a.aj;
import a.f.a.b;
import a.f.b.j;
import a.i.b.a.c.f.a;
import a.i.b.a.c.f.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Set;

public final class g
{
  private static final Set<a> BGH;
  public static final b BGI;
  private final b<g.a, a.i.b.a.c.b.e> BGG;
  private final i Brl;

  static
  {
    AppMethodBeat.i(122259);
    BGI = new b((byte)0);
    BGH = aj.setOf(a.n(a.i.b.a.c.a.g.Bag.Bao.ehI()));
    AppMethodBeat.o(122259);
  }

  public g(i parami)
  {
    AppMethodBeat.i(122258);
    this.Brl = parami;
    this.BGG = ((b)this.Brl.Baf.g((b)new g.c(this)));
    AppMethodBeat.o(122258);
  }

  public final a.i.b.a.c.b.e a(a parama, e parame)
  {
    AppMethodBeat.i(122256);
    j.p(parama, "classId");
    parama = (a.i.b.a.c.b.e)this.BGG.am(new g.a(parama, parame));
    AppMethodBeat.o(122256);
    return parama;
  }

  public static final class b
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.g
 * JD-Core Version:    0.6.2
 */