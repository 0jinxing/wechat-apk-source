package a.i.b.a.c.l;

import a.f.b.j;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.h.c;
import a.i.b.a.c.h.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class s extends q
  implements aw
{
  private final q BJC;
  private final w BJD;

  public s(q paramq, w paramw)
  {
    super(paramq.BJx, paramq.BJy);
    AppMethodBeat.i(122590);
    this.BJC = paramq;
    this.BJD = paramw;
    AppMethodBeat.o(122590);
  }

  public final String a(c paramc, i parami)
  {
    AppMethodBeat.i(122588);
    j.p(paramc, "renderer");
    j.p(parami, "options");
    if (parami.eiT())
    {
      paramc = paramc.b(this.BJD);
      AppMethodBeat.o(122588);
    }
    while (true)
    {
      return paramc;
      paramc = this.BJC.a(paramc, parami);
      AppMethodBeat.o(122588);
    }
  }

  public final az b(g paramg)
  {
    AppMethodBeat.i(122586);
    j.p(paramg, "newAnnotations");
    paramg = ax.b(this.BJC.b(paramg), this.BJD);
    AppMethodBeat.o(122586);
    return paramg;
  }

  public final ad eby()
  {
    AppMethodBeat.i(122589);
    ad localad = this.BJC.eby();
    AppMethodBeat.o(122589);
    return localad;
  }

  public final w ekl()
  {
    return this.BJD;
  }

  public final az rK(boolean paramBoolean)
  {
    AppMethodBeat.i(122587);
    az localaz = ax.b(this.BJC.rK(paramBoolean), (w)this.BJD.ekn().rK(paramBoolean));
    AppMethodBeat.o(122587);
    return localaz;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.l.s
 * JD-Core Version:    0.6.2
 */