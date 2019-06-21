package a.i.b.a.c.l.a;

import a.a.v;
import a.f.b.j;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.i.e.h;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.az;
import a.i.b.a.c.l.p;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class e extends ad
{
  private final boolean BEI;
  private final a BKv;
  final f BKw;
  final az BKx;
  private final g Bfn;

  public e(a parama, f paramf, az paramaz, g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(122726);
    this.BKv = parama;
    this.BKw = paramf;
    this.BKx = paramaz;
    this.Bfn = paramg;
    this.BEI = paramBoolean;
    AppMethodBeat.o(122726);
  }

  public e(a parama, az paramaz, ap paramap)
  {
    this(parama, new f(paramap), paramaz);
    AppMethodBeat.i(122728);
    AppMethodBeat.o(122728);
  }

  private e k(g paramg)
  {
    AppMethodBeat.i(122720);
    j.p(paramg, "newAnnotations");
    paramg = new e(this.BKv, this.BKw, this.BKx, paramg, this.BEI);
    AppMethodBeat.o(122720);
    return paramg;
  }

  private e sc(boolean paramBoolean)
  {
    AppMethodBeat.i(122723);
    e locale = new e(this.BKv, this.BKw, this.BKx, this.Bfn, paramBoolean);
    AppMethodBeat.o(122723);
    return locale;
  }

  public final h dXR()
  {
    AppMethodBeat.i(122719);
    h localh = p.cw("No member resolution should be done on captured type!", true);
    j.o(localh, "ErrorUtils.createErrorSc…on captured type!\", true)");
    AppMethodBeat.o(122719);
    return localh;
  }

  public final g dYn()
  {
    return this.Bfn;
  }

  public final boolean eci()
  {
    return this.BEI;
  }

  public final List<ap> ejt()
  {
    return (List)v.AUP;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.a.e
 * JD-Core Version:    0.6.2
 */