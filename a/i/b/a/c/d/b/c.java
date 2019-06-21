package a.i.b.a.c.d.b;

import a.f.b.j;
import a.i.b.a.c.b.aa;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.s;
import a.i.b.a.c.b.y;
import a.i.b.a.c.i.b.f;
import a.i.b.a.c.k.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class c extends a<a.i.b.a.c.b.a.c, f<?>>
{
  private final y BcH;
  private final aa Bcm;
  private final a.i.b.a.c.j.a.c Brc;

  public c(y paramy, aa paramaa, i parami, m paramm)
  {
    super(parami, paramm);
    AppMethodBeat.i(120248);
    this.BcH = paramy;
    this.Bcm = paramaa;
    this.Brc = new a.i.b.a.c.j.a.c(this.BcH, this.Bcm);
    AppMethodBeat.o(120248);
  }

  private final e f(a.i.b.a.c.f.a parama)
  {
    AppMethodBeat.i(120247);
    parama = s.a(this.BcH, parama, this.Bcm);
    AppMethodBeat.o(120247);
    return parama;
  }

  protected final n.a a(a.i.b.a.c.f.a parama, am paramam, List<a.i.b.a.c.b.a.c> paramList)
  {
    AppMethodBeat.i(120246);
    j.p(parama, "annotationClassId");
    j.p(paramam, "source");
    j.p(paramList, "result");
    parama = (n.a)new c.a(this, f(parama), paramList, paramam);
    AppMethodBeat.o(120246);
    return parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.b.c
 * JD-Core Version:    0.6.2
 */