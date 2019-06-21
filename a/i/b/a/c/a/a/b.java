package a.i.b.a.c.a.a;

import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.c.a;
import a.i.b.a.c.b.w;
import a.i.b.a.c.k.i;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ba;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b extends a
{
  final int AVt;
  private final i Baf;
  private final b.a BcK;
  private final d BcL;
  private final a.i.b.a.c.b.ab BcM;
  final b.b BcN;
  final List<ar> parameters;

  public b(i parami, a.i.b.a.c.b.ab paramab, b.b paramb, int paramInt)
  {
    super(parami, paramb.SN(paramInt));
    AppMethodBeat.i(119154);
    this.Baf = parami;
    this.BcM = paramab;
    this.BcN = paramb;
    this.AVt = paramInt;
    this.BcK = new b.a(this);
    this.BcL = new d(this.Baf, this);
    paramab = new ArrayList();
    parami = new b.1(this, paramab);
    Object localObject = (Iterable)new a.h.d(1, this.AVt);
    paramb = (Collection)new ArrayList(a.a.j.d((Iterable)localObject));
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      paramInt = ((a.a.ab)localObject).nextInt();
      parami.a(ba.BKi, "P".concat(String.valueOf(paramInt)));
      paramb.add(y.AUy);
    }
    parami.a(ba.BKj, "R");
    this.parameters = a.a.j.m((Iterable)paramab);
    AppMethodBeat.o(119154);
  }

  public final an dXY()
  {
    return (an)this.BcK;
  }

  public final a.i.b.a.c.b.f dYc()
  {
    return a.i.b.a.c.b.f.Bes;
  }

  public final w dYd()
  {
    return w.BeE;
  }

  public final az dYf()
  {
    AppMethodBeat.i(119150);
    az localaz = ay.Bfa;
    a.f.b.j.o(localaz, "Visibilities.PUBLIC");
    AppMethodBeat.o(119150);
    return localaz;
  }

  public final boolean dYg()
  {
    return false;
  }

  public final boolean dYh()
  {
    return false;
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

  public final g dYn()
  {
    AppMethodBeat.i(119151);
    Object localObject = g.BfJ;
    localObject = g.a.eai();
    AppMethodBeat.o(119151);
    return localObject;
  }

  public final am dYo()
  {
    AppMethodBeat.i(119152);
    am localam = am.BeR;
    a.f.b.j.o(localam, "SourceElement.NO_SOURCE");
    AppMethodBeat.o(119152);
    return localam;
  }

  public final List<ar> dYq()
  {
    return this.parameters;
  }

  public final String toString()
  {
    AppMethodBeat.i(119153);
    String str = this.BgZ.name;
    a.f.b.j.o(str, "name.asString()");
    AppMethodBeat.o(119153);
    return str;
  }

  public static final class b$a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.a.b
 * JD-Core Version:    0.6.2
 */