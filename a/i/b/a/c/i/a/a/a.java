package a.i.b.a.c.i.a.a;

import a.a.v;
import a.f.b.j;
import a.i.b.a.c.i.e.h;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.ak;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.p;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class a extends ad
  implements ak
{
  private final ap BEG;
  private final b BEH;
  private final boolean BEI;
  private final a.i.b.a.c.b.a.g Bfn;

  private a(ap paramap, b paramb, boolean paramBoolean, a.i.b.a.c.b.a.g paramg)
  {
    AppMethodBeat.i(122054);
    this.BEG = paramap;
    this.BEH = paramb;
    this.BEI = paramBoolean;
    this.Bfn = paramg;
    AppMethodBeat.o(122054);
  }

  private final w b(ba paramba, w paramw)
  {
    AppMethodBeat.i(122045);
    if (this.BEG.ekq() == paramba)
      paramw = this.BEG.dZS();
    j.o(paramw, "if (typeProjection.proje…jection.type else default");
    AppMethodBeat.o(122045);
    return paramw;
  }

  private a e(a.i.b.a.c.b.a.g paramg)
  {
    AppMethodBeat.i(122051);
    j.p(paramg, "newAnnotations");
    paramg = new a(this.BEG, this.BEH, this.BEI, paramg);
    AppMethodBeat.o(122051);
    return paramg;
  }

  private a rY(boolean paramBoolean)
  {
    AppMethodBeat.i(122048);
    a locala;
    if (paramBoolean == this.BEI)
    {
      AppMethodBeat.o(122048);
      locala = this;
    }
    while (true)
    {
      return locala;
      locala = new a(this.BEG, this.BEH, paramBoolean, this.Bfn);
      AppMethodBeat.o(122048);
    }
  }

  public final boolean ad(w paramw)
  {
    AppMethodBeat.i(122046);
    j.p(paramw, "type");
    boolean bool;
    if (this.BEH == paramw.ejw())
    {
      bool = true;
      AppMethodBeat.o(122046);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(122046);
    }
  }

  public final h dXR()
  {
    AppMethodBeat.i(122042);
    h localh = p.cw("No member resolution should be done on captured type, it used only during constraint system resolution", true);
    j.o(localh, "ErrorUtils.createErrorSc…system resolution\", true)");
    AppMethodBeat.o(122042);
    return localh;
  }

  public final a.i.b.a.c.b.a.g dYn()
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

  public final w eju()
  {
    AppMethodBeat.i(122043);
    ba localba = ba.BKj;
    Object localObject = a.i.b.a.c.l.c.a.aL(this).dXN();
    j.o(localObject, "builtIns.nullableAnyType");
    localObject = b(localba, (w)localObject);
    AppMethodBeat.o(122043);
    return localObject;
  }

  public final w ejv()
  {
    AppMethodBeat.i(122044);
    Object localObject = ba.BKi;
    ad localad = a.i.b.a.c.l.c.a.aL(this).dXL();
    j.o(localad, "builtIns.nothingType");
    localObject = b((ba)localObject, (w)localad);
    AppMethodBeat.o(122044);
    return localObject;
  }

  public final String toString()
  {
    AppMethodBeat.i(122047);
    StringBuilder localStringBuilder = new StringBuilder("Captured(").append(this.BEG).append(')');
    if (this.BEI);
    for (String str = "?"; ; str = "")
    {
      str = str;
      AppMethodBeat.o(122047);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.a.a.a
 * JD-Core Version:    0.6.2
 */