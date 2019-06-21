package a.i.b.a.c.a;

import a.a.aj;
import a.i.b.a.c.a.a.b.b;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.ai;
import a.i.b.a.c.b.b.a.a;
import a.i.b.a.c.b.b.c.b;
import a.i.b.a.c.b.c.v;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.q;
import a.i.b.a.c.b.s;
import a.i.b.a.c.b.y;
import a.i.b.a.c.i.d;
import a.i.b.a.c.k.i;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ap;
import a.i.b.a.c.l.ar;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class g
{
  public static final a.i.b.a.c.f.f AZU;
  public static final a.i.b.a.c.f.b AZV;
  private static final a.i.b.a.c.f.b AZW;
  public static final a.i.b.a.c.f.b AZX;
  public static final a.i.b.a.c.f.b AZY;
  public static final a.i.b.a.c.f.b AZZ;
  public static final Set<a.i.b.a.c.f.b> Baa;
  public static final g.a Bag;
  public static final a.i.b.a.c.f.f Bah;
  public v Bab;
  private final a.i.b.a.c.k.f<g.c> Bac;
  public final a.i.b.a.c.k.f<g.b> Bad;
  private final a.i.b.a.c.k.c<a.i.b.a.c.f.f, e> Bae;
  protected final i Baf;

  static
  {
    if (!g.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      Object localObject = a.i.b.a.c.f.f.avX("kotlin");
      AZU = (a.i.b.a.c.f.f)localObject;
      localObject = a.i.b.a.c.f.b.s((a.i.b.a.c.f.f)localObject);
      AZV = (a.i.b.a.c.f.b)localObject;
      AZW = ((a.i.b.a.c.f.b)localObject).q(a.i.b.a.c.f.f.avX("annotation"));
      AZX = AZV.q(a.i.b.a.c.f.f.avX("collections"));
      AZY = AZV.q(a.i.b.a.c.f.f.avX("ranges"));
      AZZ = AZV.q(a.i.b.a.c.f.f.avX("text"));
      Baa = aj.setOf(new a.i.b.a.c.f.b[] { AZV, AZX, AZY, AZW, j.dXT(), AZV.q(a.i.b.a.c.f.f.avX("internal")), d.BDS });
      Bag = new g.a();
      Bah = a.i.b.a.c.f.f.avZ("<built-ins module>");
      return;
    }
  }

  protected g(i parami)
  {
    this.Baf = parami;
    this.Bad = parami.i(new g.1(this));
    this.Bac = parami.i(new a.f.a.a()
    {
    });
    this.Bae = parami.f(new a.f.a.b()
    {
    });
  }

  public static boolean A(w paramw)
  {
    return a(paramw, Bag.Bam);
  }

  public static boolean B(w paramw)
  {
    if ((A(paramw)) && (paramw.eci()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean C(w paramw)
  {
    return B(paramw);
  }

  public static boolean D(w paramw)
  {
    return b(paramw, Bag.Baq);
  }

  public static boolean E(w paramw)
  {
    if ((paramw != null) && (b(paramw, Bag.Bas)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static String SK(int paramInt)
  {
    return "Function".concat(String.valueOf(paramInt));
  }

  public static a.i.b.a.c.f.a SL(int paramInt)
  {
    return new a.i.b.a.c.f.a(AZV, a.i.b.a.c.f.f.avX(SK(paramInt)));
  }

  public static e a(a.i.b.a.c.f.f paramf, ab paramab)
  {
    Object localObject = paramab.dXR().c(paramf, a.i.b.a.c.c.a.c.BjI);
    assert ((localObject == null) || ((localObject instanceof e))) : ("Must be a class descriptor " + paramf + ", but was " + localObject);
    localObject = (e)localObject;
    if (localObject == null)
      throw new AssertionError("Built-in class " + paramab.dZF().q(paramf).ByQ.ByV + " is not found");
    return localObject;
  }

  private static boolean a(a.i.b.a.c.b.h paramh, a.i.b.a.c.f.c paramc)
  {
    if ((paramh.dZg().equals(paramc.ehK())) && (paramc.equals(d.n(paramh))));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean a(w paramw, a.i.b.a.c.f.c paramc)
  {
    paramw = paramw.ejw().dYs();
    if (((paramw instanceof e)) && (a(paramw, paramc)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean b(l paraml)
  {
    boolean bool = false;
    if (d.a(paraml, c.class, false) != null)
      bool = true;
    return bool;
  }

  public static boolean b(a.i.b.a.c.f.c paramc)
  {
    if (Bag.BbI.get(paramc) != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean b(w paramw, a.i.b.a.c.f.c paramc)
  {
    if ((!paramw.eci()) && (a(paramw, paramc)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private e c(a.i.b.a.c.f.f paramf)
  {
    return (e)this.Bae.am(paramf);
  }

  public static a.i.b.a.c.f.b c(h paramh)
  {
    return AZV.q(paramh.BbZ);
  }

  public static boolean c(e parame)
  {
    if ((a(parame, Bag.Bat)) || (e(parame) != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean c(l paraml)
  {
    if (paraml != null)
      if (!(paraml instanceof ab));
    for (boolean bool = ((ab)paraml).dZF().r(AZU); ; bool = false)
    {
      return bool;
      paraml = paraml.dXW();
      break;
    }
  }

  private static boolean c(w paramw, a.i.b.a.c.f.c paramc)
  {
    if ((a(paramw, paramc)) && (!paramw.eci()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static h d(l paraml)
  {
    if (Bag.BbF.contains(paraml.dZg()));
    for (paraml = (h)Bag.BbH.get(d.n(paraml)); ; paraml = null)
      return paraml;
  }

  public static boolean d(e parame)
  {
    if (d(parame) != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static h e(l paraml)
  {
    if (Bag.BbG.contains(paraml.dZg()));
    for (paraml = (h)Bag.BbI.get(d.n(paraml)); ; paraml = null)
      return paraml;
  }

  public static boolean e(e parame)
  {
    if ((a(parame, Bag.Bam)) || (a(parame, Bag.Ban)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean f(e parame)
  {
    return a(parame, Bag.Bam);
  }

  public static boolean f(l paraml)
  {
    boolean bool;
    if (paraml.dZd().dYn().j(Bag.BaK))
      bool = true;
    while (true)
    {
      return bool;
      if ((paraml instanceof ah))
      {
        bool = ((ah)paraml).dZZ();
        ai localai = ((ah)paraml).dZI();
        paraml = ((ah)paraml).dZJ();
        if ((localai != null) && (f(localai)) && ((!bool) || ((paraml != null) && (f(paraml)))))
          bool = true;
        else
          bool = false;
      }
      else
      {
        bool = false;
      }
    }
  }

  public static boolean g(e parame)
  {
    return a(parame, Bag.Bbo);
  }

  public static boolean n(w paramw)
  {
    return a(paramw, Bag.Bat);
  }

  public static boolean o(w paramw)
  {
    paramw = paramw.ejw().dYs();
    if ((paramw != null) && (e(paramw) != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean p(w paramw)
  {
    int i;
    if (!paramw.eci())
    {
      paramw = paramw.ejw().dYs();
      if (((paramw instanceof e)) && (d((e)paramw)))
      {
        i = 1;
        if (i == 0)
          break label49;
      }
    }
    label49: for (boolean bool = true; ; bool = false)
    {
      return bool;
      i = 0;
      break;
    }
  }

  public static boolean q(w paramw)
  {
    return c(paramw, Bag.Bau);
  }

  public static boolean r(w paramw)
  {
    return c(paramw, Bag.Bav);
  }

  public static boolean s(w paramw)
  {
    return c(paramw, Bag.Bay);
  }

  public static boolean t(w paramw)
  {
    return c(paramw, Bag.Baw);
  }

  public static boolean u(w paramw)
  {
    return c(paramw, Bag.Baz);
  }

  public static boolean v(w paramw)
  {
    return c(paramw, Bag.Bax);
  }

  public static boolean w(w paramw)
  {
    if ((a(paramw, Bag.BaA)) && (!paramw.eci()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean x(w paramw)
  {
    if ((a(paramw, Bag.BaB)) && (!paramw.eci()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean y(w paramw)
  {
    if ((z(paramw)) && (!av.aB(paramw)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean z(w paramw)
  {
    return a(paramw, Bag.Ban);
  }

  public final e SM(int paramInt)
  {
    a.i.b.a.c.f.f localf = a.i.b.a.c.f.f.avX(b.b.BcS.BcX + paramInt);
    return c(d.BDS.q(localf));
  }

  public final ad a(h paramh)
  {
    return avB(paramh.BbZ.name).dZf();
  }

  public final ad a(ba paramba, w paramw)
  {
    paramba = Collections.singletonList(new ar(paramba, paramw));
    paramw = a.i.b.a.c.b.a.g.BfJ;
    return a.i.b.a.c.l.x.a(a.i.b.a.c.b.a.g.a.eai(), avB("Array"), paramba);
  }

  public final e avB(String paramString)
  {
    return c(a.i.b.a.c.f.f.avX(paramString));
  }

  public final ad b(h paramh)
  {
    return (ad)((g.c)this.Bac.invoke()).BbN.get(paramh);
  }

  public final e c(a.i.b.a.c.f.b paramb)
  {
    e locale = q.a(this.Bab, paramb, a.i.b.a.c.c.a.c.BjI);
    assert (locale != null) : "Can't find built-in class ".concat(String.valueOf(paramb));
    return locale;
  }

  protected final void dXH()
  {
    this.Bab = new v(Bah, this.Baf, this);
    v localv = this.Bab;
    Object localObject = b.AZL;
    localObject = (b)b.a.AZM.getValue();
    dXK();
    dXJ();
    dXI();
    localv.a(((b)localObject).dXE());
    this.Bab.a(new v[] { this.Bab });
  }

  protected a.i.b.a.c.b.b.a dXI()
  {
    return a.a.BgV;
  }

  protected a.i.b.a.c.b.b.c dXJ()
  {
    return c.b.BgX;
  }

  protected Iterable<a.i.b.a.c.b.b.b> dXK()
  {
    return Collections.singletonList(new a.i.b.a.c.a.a.a(this.Baf, this.Bab));
  }

  public final ad dXL()
  {
    return avB("Nothing").dZf();
  }

  public final ad dXM()
  {
    return avB("Any").dZf();
  }

  public final ad dXN()
  {
    return dXM().rL(true);
  }

  public final ad dXO()
  {
    return avB("Unit").dZf();
  }

  public final ad dXP()
  {
    return avB("String").dZf();
  }

  public final w l(w paramw)
  {
    Object localObject1;
    if (n(paramw))
    {
      if (paramw.ejt().size() != 1)
        throw new IllegalStateException();
      localObject1 = ((ap)paramw.ejt().get(0)).dZS();
    }
    Object localObject2;
    do
    {
      return localObject1;
      localObject2 = av.aA(paramw);
      localObject3 = (w)((g.c)this.Bac.invoke()).BbP.get(localObject2);
      localObject1 = localObject3;
    }
    while (localObject3 != null);
    Object localObject3 = d.Y((w)localObject2);
    if (localObject3 != null)
    {
      localObject2 = ((w)localObject2).ejw().dYs();
      if (localObject2 != null)
        break label142;
      localObject3 = null;
    }
    while (true)
    {
      localObject1 = localObject3;
      if (localObject3 != null)
        break;
      throw new IllegalStateException("not array: ".concat(String.valueOf(paramw)));
      label142: localObject1 = m.BcG;
      if (!m.d(((a.i.b.a.c.b.h)localObject2).dZg()))
      {
        localObject3 = null;
      }
      else
      {
        localObject1 = a.i.b.a.c.i.c.a.c((a.i.b.a.c.b.h)localObject2);
        if (localObject1 == null)
        {
          localObject3 = null;
        }
        else
        {
          localObject2 = m.BcG;
          localObject1 = m.c((a.i.b.a.c.f.a)localObject1);
          if (localObject1 == null)
          {
            localObject3 = null;
          }
          else
          {
            localObject3 = s.a((y)localObject3, (a.i.b.a.c.f.a)localObject1);
            if (localObject3 == null)
              localObject3 = null;
            else
              localObject3 = ((e)localObject3).dZf();
          }
        }
      }
    }
  }

  public final ad m(w paramw)
  {
    Object localObject = (ad)((g.c)this.Bac.invoke()).BbO.get(paramw);
    if (localObject != null)
      paramw = (w)localObject;
    while (true)
    {
      return paramw;
      localObject = m.BcG;
      if (m.G(paramw))
      {
        if (av.aB(paramw))
        {
          paramw = null;
        }
        else
        {
          localObject = d.Y(paramw);
          if (localObject == null)
          {
            paramw = null;
          }
          else
          {
            a.i.b.a.c.f.a locala = a.i.b.a.c.i.c.a.c(paramw.ejw().dYs());
            assert (locala != null) : "unsignedClassId should not be null for unsigned type ".concat(String.valueOf(paramw));
            paramw = m.BcG;
            paramw = m.d(locala);
            assert (paramw != null) : "arrayClassId should not be null for unsigned type ".concat(String.valueOf(locala));
            paramw = s.a((y)localObject, paramw);
            if (paramw == null)
              paramw = null;
            else
              paramw = paramw.dZf();
          }
        }
      }
      else
        paramw = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.g
 * JD-Core Version:    0.6.2
 */