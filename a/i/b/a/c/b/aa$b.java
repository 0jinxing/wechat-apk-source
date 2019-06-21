package a.i.b.a.c.b;

import a.a.ab;
import a.a.aj;
import a.a.v;
import a.a.x;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.c.ah;
import a.i.b.a.c.k.i;
import a.i.b.a.c.l.ba;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class aa$b extends a.i.b.a.c.b.c.g
{
  private final List<ar> BeK;
  private final a.i.b.a.c.l.e BeL;
  private final boolean BeM;

  public aa$b(i parami, l paraml, a.i.b.a.c.f.f paramf, boolean paramBoolean, int paramInt)
  {
    super(parami, paraml, paramf, am.BeR);
    AppMethodBeat.i(119287);
    this.BeM = paramBoolean;
    paramf = (Iterable)a.h.e.il(0, paramInt);
    paraml = (Collection)new ArrayList(a.a.j.d(paramf));
    paramf = paramf.iterator();
    while (paramf.hasNext())
    {
      paramInt = ((ab)paramf).nextInt();
      l locall = (l)this;
      g.a locala = a.i.b.a.c.b.a.g.BfJ;
      paraml.add(ah.a(locall, g.a.eai(), ba.BKh, a.i.b.a.c.f.f.avX("T".concat(String.valueOf(paramInt))), paramInt));
    }
    this.BeK = ((List)paraml);
    this.BeL = new a.i.b.a.c.l.e((e)this, this.BeK, (Collection)aj.setOf(a.i.b.a.c.i.c.a.F(this).dZD().dXM()), parami);
    AppMethodBeat.o(119287);
  }

  public final e dYa()
  {
    return null;
  }

  public final Collection<d> dYb()
  {
    return (Collection)x.AUR;
  }

  public final f dYc()
  {
    return f.Ber;
  }

  public final w dYd()
  {
    return w.BeB;
  }

  public final d dYe()
  {
    return null;
  }

  public final az dYf()
  {
    AppMethodBeat.i(119284);
    az localaz = ay.Bfa;
    a.f.b.j.o(localaz, "Visibilities.PUBLIC");
    AppMethodBeat.o(119284);
    return localaz;
  }

  public final boolean dYg()
  {
    return false;
  }

  public final boolean dYh()
  {
    return this.BeM;
  }

  public final boolean dYi()
  {
    return false;
  }

  public final boolean dYj()
  {
    return false;
  }

  public final boolean dYk()
  {
    return false;
  }

  public final boolean dYl()
  {
    return false;
  }

  public final boolean dYm()
  {
    return false;
  }

  public final a.i.b.a.c.b.a.g dYn()
  {
    AppMethodBeat.i(119285);
    Object localObject = a.i.b.a.c.b.a.g.BfJ;
    localObject = g.a.eai();
    AppMethodBeat.o(119285);
    return localObject;
  }

  public final Collection<e> dYp()
  {
    return (Collection)v.AUP;
  }

  public final List<ar> dYq()
  {
    return this.BeK;
  }

  public final String toString()
  {
    AppMethodBeat.i(119286);
    String str = "class " + this.BgZ + " (not found)";
    AppMethodBeat.o(119286);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.aa.b
 * JD-Core Version:    0.6.2
 */