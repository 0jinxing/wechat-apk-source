package a.i.b.a.c.i.a.a;

import a.a.v;
import a.aa;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.l.a.f;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.List;

public final class b
  implements an
{
  public final ap BEG;
  public f BEJ;

  public b(ap paramap)
  {
    AppMethodBeat.i(122059);
    this.BEG = paramap;
    if (this.BEG.ekq() != ba.BKh);
    for (int i = 1; (aa.AUz) && (i == 0); i = 0)
    {
      paramap = (Throwable)new AssertionError("Only nontrivial projections can be captured, not: " + this.BEG);
      AppMethodBeat.o(122059);
      throw paramap;
    }
    AppMethodBeat.o(122059);
  }

  public final boolean dYu()
  {
    return false;
  }

  public final g dZD()
  {
    AppMethodBeat.i(122058);
    g localg = this.BEG.dZS().ejw().dZD();
    a.f.b.j.o(localg, "typeProjection.type.constructor.builtIns");
    AppMethodBeat.o(122058);
    return localg;
  }

  public final Collection<w> eap()
  {
    AppMethodBeat.i(122056);
    if (this.BEG.ekq() == ba.BKj);
    for (Object localObject = this.BEG.dZS(); ; localObject = (w)dZD().dXN())
    {
      a.f.b.j.o(localObject, "if (typeProjection.proje… builtIns.nullableAnyType");
      localObject = (Collection)a.a.j.listOf(localObject);
      AppMethodBeat.o(122056);
      return localObject;
    }
  }

  public final List<ar> getParameters()
  {
    return (List)v.AUP;
  }

  public final String toString()
  {
    AppMethodBeat.i(122057);
    String str = "CapturedTypeConstructor(" + this.BEG + ')';
    AppMethodBeat.o(122057);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.a.a.b
 * JD-Core Version:    0.6.2
 */