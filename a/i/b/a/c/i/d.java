package a.i.b.a.c.i;

import a.i.b.a.c.a.g;
import a.i.b.a.c.a.m;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.ad;
import a.i.b.a.c.b.ag;
import a.i.b.a.c.b.aj;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.aw;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.o;
import a.i.b.a.c.l.av;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class d
{
  public static final a.i.b.a.c.f.f BDQ;
  public static final a.i.b.a.c.f.f BDR;
  public static final a.i.b.a.c.f.b BDS;
  public static final a.i.b.a.c.f.b BDT;
  public static final a.i.b.a.c.f.b BDU;
  public static final a.i.b.a.c.f.b BDV;
  public static final a.i.b.a.c.f.b BDW;
  public static final a.i.b.a.c.f.b BDX;
  public static final a.i.b.a.c.f.b BDY;

  static
  {
    AppMethodBeat.i(121975);
    if (!d.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      BDQ = a.i.b.a.c.f.f.avX("values");
      BDR = a.i.b.a.c.f.f.avX("valueOf");
      a.i.b.a.c.f.b localb = new a.i.b.a.c.f.b("kotlin.coroutines");
      BDS = localb;
      localb = localb.q(a.i.b.a.c.f.f.avX("experimental"));
      BDT = localb;
      BDU = localb.q(a.i.b.a.c.f.f.avX("intrinsics"));
      BDV = BDT.q(a.i.b.a.c.f.f.avX("Continuation"));
      BDW = BDS.q(a.i.b.a.c.f.f.avX("Continuation"));
      BDX = new a.i.b.a.c.f.b("kotlin.Result");
      BDY = new a.i.b.a.c.f.b("kotlin.jvm.JvmName");
      AppMethodBeat.o(121975);
      return;
    }
  }

  public static boolean A(l paraml)
  {
    AppMethodBeat.i(121961);
    boolean bool = a(paraml, a.i.b.a.c.b.f.Bes);
    AppMethodBeat.o(121961);
    return bool;
  }

  public static boolean B(l paraml)
  {
    AppMethodBeat.i(121962);
    boolean bool;
    if ((a(paraml, a.i.b.a.c.b.f.Ber)) || (a(paraml, a.i.b.a.c.b.f.Bet)))
    {
      bool = true;
      AppMethodBeat.o(121962);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121962);
    }
  }

  public static a.i.b.a.c.b.an C(l paraml)
  {
    AppMethodBeat.i(121973);
    if ((paraml instanceof aj))
      paraml = ((aj)paraml).dZH();
    while (true)
    {
      if ((paraml instanceof o))
      {
        paraml = ((o)paraml).dYo().dXz();
        AppMethodBeat.o(121973);
      }
      while (true)
      {
        return paraml;
        paraml = a.i.b.a.c.b.an.BeS;
        AppMethodBeat.o(121973);
      }
    }
  }

  public static a.i.b.a.c.b.y Y(a.i.b.a.c.l.w paramw)
  {
    AppMethodBeat.i(121948);
    paramw = paramw.ejw().dYs();
    if (paramw == null)
    {
      paramw = null;
      AppMethodBeat.o(121948);
    }
    while (true)
    {
      return paramw;
      paramw = t(paramw);
      AppMethodBeat.o(121948);
    }
  }

  public static e Z(a.i.b.a.c.l.w paramw)
  {
    AppMethodBeat.i(138682);
    paramw = b(paramw.ejw());
    AppMethodBeat.o(138682);
    return paramw;
  }

  public static <D extends l> D a(l paraml, Class<D> paramClass)
  {
    AppMethodBeat.i(121946);
    paraml = a(paraml, paramClass, true);
    AppMethodBeat.o(121946);
    return paraml;
  }

  public static <D extends l> D a(l paraml, Class<D> paramClass, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(121947);
    if (paraml == null)
    {
      AppMethodBeat.o(121947);
      paraml = localObject;
      return paraml;
    }
    if (paramBoolean)
      paraml = paraml.dXW();
    while (true)
    {
      if (paraml != null)
      {
        if (paramClass.isInstance(paraml))
        {
          AppMethodBeat.o(121947);
          break;
        }
        paraml = paraml.dXW();
        continue;
      }
      AppMethodBeat.o(121947);
      paraml = localObject;
      break;
    }
  }

  public static <D extends a.i.b.a.c.b.p> D a(D paramD)
  {
    AppMethodBeat.i(121969);
    if ((paramD instanceof a.i.b.a.c.b.b))
    {
      paramD = u((a.i.b.a.c.b.b)paramD);
      AppMethodBeat.o(121969);
    }
    while (true)
    {
      return paramD;
      AppMethodBeat.o(121969);
    }
  }

  private static <D extends a.i.b.a.c.b.a> void a(D paramD, Set<D> paramSet)
  {
    AppMethodBeat.i(121972);
    if (paramSet.contains(paramD))
      AppMethodBeat.o(121972);
    while (true)
    {
      return;
      paramD = paramD.dYU().dYX().iterator();
      while (paramD.hasNext())
      {
        a.i.b.a.c.b.a locala = ((a.i.b.a.c.b.a)paramD.next()).dYU();
        a(locala, paramSet);
        paramSet.add(locala);
      }
      AppMethodBeat.o(121972);
    }
  }

  public static boolean a(aw paramaw, a.i.b.a.c.l.w paramw)
  {
    boolean bool = true;
    AppMethodBeat.i(121970);
    if ((paramaw.dZZ()) || (a.i.b.a.c.l.y.an(paramw)))
    {
      AppMethodBeat.o(121970);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (av.aC(paramw))
      {
        AppMethodBeat.o(121970);
      }
      else
      {
        paramaw = a.i.b.a.c.i.c.a.G(paramaw);
        if ((!g.p(paramw)) && (!a.i.b.a.c.l.a.c.BKs.d(paramaw.dXP(), paramw)) && (!a.i.b.a.c.l.a.c.BKs.d(paramaw.avB("Number").dZf(), paramw)) && (!a.i.b.a.c.l.a.c.BKs.d(paramaw.dXM(), paramw)))
        {
          paramaw = m.BcG;
          if (!m.G(paramw));
        }
        else
        {
          AppMethodBeat.o(121970);
          continue;
        }
        AppMethodBeat.o(121970);
        bool = false;
      }
    }
  }

  private static boolean a(l paraml, a.i.b.a.c.b.f paramf)
  {
    AppMethodBeat.i(121963);
    boolean bool;
    if (((paraml instanceof e)) && (((e)paraml).dYc() == paramf))
    {
      bool = true;
      AppMethodBeat.o(121963);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121963);
    }
  }

  private static boolean a(a.i.b.a.c.l.w paramw, l paraml)
  {
    AppMethodBeat.i(121953);
    paramw = paramw.ejw().dYs();
    boolean bool;
    if (paramw != null)
    {
      paramw = paramw.dZd();
      if (((paramw instanceof a.i.b.a.c.b.h)) && ((paraml instanceof a.i.b.a.c.b.h)) && (((a.i.b.a.c.b.h)paraml).dXY().equals(((a.i.b.a.c.b.h)paramw).dXY())))
      {
        bool = true;
        AppMethodBeat.o(121953);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121953);
    }
  }

  private static e b(a.i.b.a.c.l.an paraman)
  {
    AppMethodBeat.i(121966);
    a.i.b.a.c.b.h localh = paraman.dYs();
    if ((!$assertionsDisabled) && (!(localh instanceof e)))
    {
      paraman = new AssertionError("Classifier descriptor of a type should be of type ClassDescriptor: ".concat(String.valueOf(paraman)));
      AppMethodBeat.o(121966);
      throw paraman;
    }
    paraman = (e)localh;
    AppMethodBeat.o(121966);
    return paraman;
  }

  public static boolean b(e parame1, e parame2)
  {
    AppMethodBeat.i(121951);
    parame1 = parame1.dXY().eap().iterator();
    boolean bool;
    while (parame1.hasNext())
      if (a((a.i.b.a.c.l.w)parame1.next(), parame2.dZm()))
      {
        bool = true;
        AppMethodBeat.o(121951);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121951);
    }
  }

  public static boolean b(a.i.b.a.c.l.w paramw, l paraml)
  {
    AppMethodBeat.i(121954);
    boolean bool;
    if (a(paramw, paraml))
    {
      AppMethodBeat.o(121954);
      bool = true;
    }
    while (true)
    {
      return bool;
      paramw = paramw.ejw().eap().iterator();
      while (true)
        if (paramw.hasNext())
          if (b((a.i.b.a.c.l.w)paramw.next(), paraml))
          {
            AppMethodBeat.o(121954);
            bool = true;
            break;
          }
      bool = false;
      AppMethodBeat.o(121954);
    }
  }

  public static boolean c(e parame1, e parame2)
  {
    AppMethodBeat.i(121952);
    boolean bool = b(parame1.dZf(), parame2.dZm());
    AppMethodBeat.o(121952);
    return bool;
  }

  public static <D extends a.i.b.a.c.b.a> Set<D> d(D paramD)
  {
    AppMethodBeat.i(121971);
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    a(paramD.dYU(), localLinkedHashSet);
    AppMethodBeat.o(121971);
    return localLinkedHashSet;
  }

  public static boolean e(l paraml1, l paraml2)
  {
    AppMethodBeat.i(121945);
    boolean bool = s(paraml1).equals(s(paraml2));
    AppMethodBeat.o(121945);
    return bool;
  }

  public static ak l(l paraml)
  {
    AppMethodBeat.i(121938);
    if ((paraml instanceof e))
    {
      paraml = ((e)paraml).dZl();
      AppMethodBeat.o(121938);
    }
    while (true)
    {
      return paraml;
      paraml = null;
      AppMethodBeat.o(121938);
    }
  }

  public static boolean m(l paraml)
  {
    AppMethodBeat.i(121939);
    int i;
    if (paraml != null)
      if (!w(paraml))
      {
        if (((paraml instanceof a.i.b.a.c.b.p)) && (((a.i.b.a.c.b.p)paraml).dYf() == ay.Bfb))
        {
          i = 1;
          label41: if (i == 0)
            break label60;
        }
      }
      else
        AppMethodBeat.o(121939);
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      i = 0;
      break label41;
      label60: paraml = paraml.dXW();
      break;
      AppMethodBeat.o(121939);
    }
  }

  public static a.i.b.a.c.f.c n(l paraml)
  {
    AppMethodBeat.i(121940);
    a.i.b.a.c.f.b localb = p(paraml);
    if (localb != null)
    {
      paraml = localb.ByQ;
      AppMethodBeat.o(121940);
    }
    while (true)
    {
      return paraml;
      paraml = q(paraml);
      AppMethodBeat.o(121940);
    }
  }

  public static a.i.b.a.c.f.b o(l paraml)
  {
    AppMethodBeat.i(121941);
    a.i.b.a.c.f.b localb = p(paraml);
    if (localb != null)
    {
      AppMethodBeat.o(121941);
      paraml = localb;
    }
    while (true)
    {
      return paraml;
      paraml = q(paraml).ehI();
      AppMethodBeat.o(121941);
    }
  }

  private static a.i.b.a.c.f.b p(l paraml)
  {
    AppMethodBeat.i(121942);
    if (((paraml instanceof a.i.b.a.c.b.y)) || (a.i.b.a.c.l.p.L(paraml)))
    {
      paraml = a.i.b.a.c.f.b.ByP;
      AppMethodBeat.o(121942);
    }
    while (true)
    {
      return paraml;
      if ((paraml instanceof ad))
      {
        paraml = ((ad)paraml).dZF();
        AppMethodBeat.o(121942);
      }
      else if ((paraml instanceof ab))
      {
        paraml = ((ab)paraml).dZF();
        AppMethodBeat.o(121942);
      }
      else
      {
        paraml = null;
        AppMethodBeat.o(121942);
      }
    }
  }

  private static a.i.b.a.c.f.c q(l paraml)
  {
    AppMethodBeat.i(121943);
    l locall = paraml.dXW();
    if ((!$assertionsDisabled) && (locall == null))
    {
      paraml = new AssertionError("Not package/module descriptor doesn't have containing declaration: ".concat(String.valueOf(paraml)));
      AppMethodBeat.o(121943);
      throw paraml;
    }
    paraml = n(locall).t(paraml.dZg());
    AppMethodBeat.o(121943);
    return paraml;
  }

  public static boolean r(l paraml)
  {
    AppMethodBeat.i(121944);
    boolean bool;
    if ((paraml != null) && ((paraml.dXW() instanceof ab)))
    {
      bool = true;
      AppMethodBeat.o(121944);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121944);
    }
  }

  public static a.i.b.a.c.b.y s(l paraml)
  {
    AppMethodBeat.i(121949);
    a.i.b.a.c.b.y localy = t(paraml);
    if ((!$assertionsDisabled) && (localy == null))
    {
      paraml = new AssertionError("Descriptor without a containing module: ".concat(String.valueOf(paraml)));
      AppMethodBeat.o(121949);
      throw paraml;
    }
    AppMethodBeat.o(121949);
    return localy;
  }

  private static a.i.b.a.c.b.y t(l paraml)
  {
    AppMethodBeat.i(121950);
    if (paraml != null)
      if ((paraml instanceof a.i.b.a.c.b.y))
      {
        paraml = (a.i.b.a.c.b.y)paraml;
        AppMethodBeat.o(121950);
      }
    while (true)
    {
      return paraml;
      if ((paraml instanceof ad))
      {
        paraml = ((ad)paraml).dZG();
        AppMethodBeat.o(121950);
      }
      else
      {
        paraml = paraml.dXW();
        break;
        paraml = null;
        AppMethodBeat.o(121950);
      }
    }
  }

  public static <D extends a.i.b.a.c.b.b> D u(D paramD)
  {
    AppMethodBeat.i(121968);
    while (paramD.dYZ() == b.a.Bek)
    {
      Collection localCollection = paramD.dYX();
      if (localCollection.isEmpty())
      {
        paramD = new IllegalStateException("Fake override should have at least one overridden descriptor: ".concat(String.valueOf(paramD)));
        AppMethodBeat.o(121968);
        throw paramD;
      }
      paramD = (a.i.b.a.c.b.b)localCollection.iterator().next();
    }
    AppMethodBeat.o(121968);
    return paramD;
  }

  public static boolean u(l paraml)
  {
    AppMethodBeat.i(121955);
    boolean bool;
    if ((a(paraml, a.i.b.a.c.b.f.Bew)) && (((e)paraml).dYg()))
    {
      bool = true;
      AppMethodBeat.o(121955);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121955);
    }
  }

  public static a.i.b.a.c.b.b v(a.i.b.a.c.b.b paramb)
  {
    AppMethodBeat.i(121974);
    if ((paramb instanceof ag))
    {
      paramb = ((ag)paramb).dZH();
      AppMethodBeat.o(121974);
    }
    while (true)
    {
      return paramb;
      AppMethodBeat.o(121974);
    }
  }

  public static boolean v(l paraml)
  {
    AppMethodBeat.i(121956);
    boolean bool;
    if ((a(paraml, a.i.b.a.c.b.f.Ber)) && (((e)paraml).dYd() == a.i.b.a.c.b.w.BeC))
    {
      bool = true;
      AppMethodBeat.o(121956);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121956);
    }
  }

  private static boolean w(l paraml)
  {
    AppMethodBeat.i(121957);
    boolean bool;
    if ((a(paraml, a.i.b.a.c.b.f.Ber)) && (paraml.dZg().equals(a.i.b.a.c.f.h.Bzc)))
    {
      bool = true;
      AppMethodBeat.o(121957);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(121957);
    }
  }

  public static e x(e parame)
  {
    AppMethodBeat.i(121964);
    Iterator localIterator = parame.dXY().eap().iterator();
    while (localIterator.hasNext())
    {
      parame = b(((a.i.b.a.c.l.w)localIterator.next()).ejw());
      if (parame.dYc() != a.i.b.a.c.b.f.Bes)
        AppMethodBeat.o(121964);
    }
    while (true)
    {
      return parame;
      parame = null;
      AppMethodBeat.o(121964);
    }
  }

  public static boolean x(l paraml)
  {
    AppMethodBeat.i(121958);
    boolean bool = a(paraml, a.i.b.a.c.b.f.Beu);
    AppMethodBeat.o(121958);
    return bool;
  }

  public static az y(e parame)
  {
    AppMethodBeat.i(121967);
    a.i.b.a.c.b.f localf = parame.dYc();
    if ((localf == a.i.b.a.c.b.f.Bet) || (localf.dZn()) || (v(parame)))
    {
      parame = ay.BeW;
      AppMethodBeat.o(121967);
    }
    while (true)
    {
      return parame;
      if (w(parame))
      {
        parame = ay.Bfh;
        AppMethodBeat.o(121967);
      }
      else
      {
        if ((!$assertionsDisabled) && (localf != a.i.b.a.c.b.f.Ber) && (localf != a.i.b.a.c.b.f.Bes) && (localf != a.i.b.a.c.b.f.Bev))
        {
          parame = new AssertionError();
          AppMethodBeat.o(121967);
          throw parame;
        }
        parame = ay.Bfa;
        AppMethodBeat.o(121967);
      }
    }
  }

  public static boolean y(l paraml)
  {
    AppMethodBeat.i(121959);
    boolean bool = a(paraml, a.i.b.a.c.b.f.Bet);
    AppMethodBeat.o(121959);
    return bool;
  }

  public static boolean z(l paraml)
  {
    AppMethodBeat.i(121960);
    boolean bool = a(paraml, a.i.b.a.c.b.f.Bev);
    AppMethodBeat.o(121960);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.d
 * JD-Core Version:    0.6.2
 */