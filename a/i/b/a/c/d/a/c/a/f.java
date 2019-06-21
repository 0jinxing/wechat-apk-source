package a.i.b.a.c.d.a.c.a;

import a.a.aj;
import a.a.v;
import a.aa;
import a.f.b.j;
import a.f.b.k;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.w;
import a.i.b.a.c.b.w.a;
import a.i.b.a.c.d.a.e.x;
import a.i.b.a.c.d.a.n;
import a.i.b.a.c.k.i;
import a.i.b.a.c.l.an;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public final class f extends a.i.b.a.c.b.c.g
  implements a.i.b.a.c.d.a.b.d
{
  private static final Set<String> Bob;
  public static final f.a Boc;
  private final boolean BeM;
  private final a.i.b.a.c.b.a.g Bfn;
  private final az BhQ;
  private final w Bhv;
  private final a.i.b.a.c.b.f Bhw;
  public final a.i.b.a.c.d.a.e.g BnJ;
  final f.b BnV;
  public final g BnW;
  private final a.i.b.a.c.i.e.f BnX;
  private final l BnY;
  private final a.i.b.a.c.k.f<List<ar>> BnZ;
  public final a.i.b.a.c.d.a.c.h Bnn;
  private final e Boa;

  static
  {
    AppMethodBeat.i(119901);
    Boc = new f.a((byte)0);
    Bob = aj.setOf(new String[] { "equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString" });
    AppMethodBeat.o(119901);
  }

  public f(a.i.b.a.c.d.a.c.h paramh, a.i.b.a.c.b.l paraml, a.i.b.a.c.d.a.e.g paramg, e parame)
  {
    super(paramh.Bnv.Baf, paraml, paramg.dZg(), (am)paramh.Bnv.BmZ.a((a.i.b.a.c.d.a.e.l)paramg));
    AppMethodBeat.i(119900);
    this.BnJ = paramg;
    this.Boa = parame;
    this.Bnn = a.i.b.a.c.d.a.c.a.a(paramh, (a.i.b.a.c.b.g)this, (x)this.BnJ, 4);
    boolean bool2 = aa.AUz;
    if (this.BnJ.ebH())
    {
      paramh = a.i.b.a.c.b.f.Bev;
      this.Bhw = paramh;
      if (!this.BnJ.ebH())
        break label360;
      paramh = w.BeB;
      this.Bhv = paramh;
      this.BhQ = this.BnJ.dYf();
      if ((this.BnJ.ebG() == null) || (this.BnJ.isStatic()))
        break label429;
    }
    label391: label423: label429: for (bool2 = bool1; ; bool2 = false)
    {
      this.BeM = bool2;
      this.BnV = new f.b(this);
      this.BnW = new g(this.Bnn, (e)this, this.BnJ);
      this.BnX = new a.i.b.a.c.i.e.f((a.i.b.a.c.i.e.h)this.BnW);
      this.BnY = new l(this.Bnn, this.BnJ, this);
      this.Bfn = a.i.b.a.c.d.a.c.f.a(this.Bnn, (a.i.b.a.c.d.a.e.d)this.BnJ);
      this.BnZ = this.Bnn.Bnv.Baf.i((a.f.a.a)new c(this));
      AppMethodBeat.o(119900);
      return;
      if (this.BnJ.isInterface())
      {
        paramh = a.i.b.a.c.b.f.Bes;
        break;
      }
      if (this.BnJ.isEnum())
      {
        paramh = a.i.b.a.c.b.f.Bet;
        break;
      }
      paramh = a.i.b.a.c.b.f.Ber;
      break;
      label360: paramh = w.BeG;
      if ((this.BnJ.ebX()) || (this.BnJ.isInterface()))
      {
        bool2 = true;
        if (this.BnJ.ebY())
          break label423;
      }
      for (boolean bool3 = true; ; bool3 = false)
      {
        paramh = w.a.an(bool2, bool3);
        break;
        bool2 = false;
        break label391;
      }
    }
  }

  public final a.i.b.a.c.i.e.h dXX()
  {
    return (a.i.b.a.c.i.e.h)this.BnY;
  }

  public final an dXY()
  {
    return (an)this.BnV;
  }

  public final e dYa()
  {
    return null;
  }

  public final a.i.b.a.c.b.f dYc()
  {
    return this.Bhw;
  }

  public final w dYd()
  {
    return this.Bhv;
  }

  public final a.i.b.a.c.b.d dYe()
  {
    return null;
  }

  public final az dYf()
  {
    AppMethodBeat.i(119895);
    if ((j.j(this.BhQ, ay.BeW)) && (this.BnJ.ebG() == null));
    for (az localaz = n.Blg; ; localaz = this.BhQ)
    {
      j.o(localaz, "if (visibility == Visibi…ISIBILITY else visibility");
      AppMethodBeat.o(119895);
      return localaz;
    }
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

  public final a.i.b.a.c.b.a.g dYn()
  {
    return this.Bfn;
  }

  public final Collection<e> dYp()
  {
    return (Collection)v.AUP;
  }

  public final List<ar> dYq()
  {
    AppMethodBeat.i(119898);
    List localList = (List)this.BnZ.invoke();
    AppMethodBeat.o(119898);
    return localList;
  }

  public final a.i.b.a.c.i.e.h dZk()
  {
    return (a.i.b.a.c.i.e.h)this.BnX;
  }

  public final List<a.i.b.a.c.b.d> ebr()
  {
    AppMethodBeat.i(119896);
    List localList = (List)this.BnW.Bog.invoke();
    AppMethodBeat.o(119896);
    return localList;
  }

  public final String toString()
  {
    AppMethodBeat.i(119899);
    String str = "Lazy Java class " + a.i.b.a.c.i.c.a.q((a.i.b.a.c.b.l)this);
    AppMethodBeat.o(119899);
    return str;
  }

  static final class c extends k
    implements a.f.a.a<List<? extends ar>>
  {
    c(f paramf)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.a.f
 * JD-Core Version:    0.6.2
 */