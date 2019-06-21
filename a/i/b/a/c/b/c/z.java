package a.i.b.a.c.b.c;

import a.i.b.a.c.b.a.a;
import a.i.b.a.c.b.ag;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.ai;
import a.i.b.a.c.b.aj;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.n;
import a.i.b.a.c.b.r;
import a.i.b.a.c.b.t;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.c.a;
import a.i.b.a.c.l.as;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.k;
import a.i.b.a.c.n.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class z extends ak
  implements ah
{
  protected List<ar> BeK;
  private a.i.b.a.c.b.ak BhO;
  protected a.i.b.a.c.b.ak BhP;
  public az BhQ;
  protected final boolean BhV;
  private final boolean BhW;
  private final boolean Bhu;
  protected final a.i.b.a.c.b.w Bhv;
  protected Collection<? extends ah> BiW;
  private final ah BiX;
  protected final boolean BiY;
  private final boolean BiZ;
  public final b.a Bif;
  protected final boolean Bja;
  public aa Bjb;
  protected aj Bjc;
  protected boolean Bjd;
  protected r Bje;
  protected r Bjf;

  protected z(l paraml, ah paramah, a.i.b.a.c.b.a.g paramg, a.i.b.a.c.b.w paramw, az paramaz, boolean paramBoolean1, f paramf, b.a parama, am paramam, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7)
  {
    super(paraml, paramg, paramf, paramBoolean1, paramam);
    AppMethodBeat.i(119538);
    this.BiW = null;
    this.Bhv = paramw;
    this.BhQ = paramaz;
    paraml = paramah;
    if (paramah == null)
      paraml = this;
    this.BiX = paraml;
    this.Bif = parama;
    this.BiY = paramBoolean2;
    this.BiZ = paramBoolean3;
    this.BhV = paramBoolean4;
    this.BhW = paramBoolean5;
    this.Bhu = paramBoolean6;
    this.Bja = paramBoolean7;
    AppMethodBeat.o(119538);
  }

  private static az a(az paramaz, b.a parama)
  {
    AppMethodBeat.i(119547);
    if ((parama == b.a.Bek) && (ay.b(paramaz.eag())))
    {
      paramaz = ay.Bfd;
      AppMethodBeat.o(119547);
    }
    while (true)
    {
      return paramaz;
      AppMethodBeat.o(119547);
    }
  }

  public static z a(l paraml, a.i.b.a.c.b.a.g paramg, a.i.b.a.c.b.w paramw, az paramaz, f paramf, b.a parama, am paramam)
  {
    AppMethodBeat.i(119539);
    paraml = new z(paraml, null, paramg, paramw, paramaz, true, paramf, parama, paramam, false, false, false, false, false, false);
    AppMethodBeat.o(119539);
    return paraml;
  }

  private static t a(a.i.b.a.c.l.au paramau, ag paramag)
  {
    AppMethodBeat.i(119548);
    if (paramag.dZq() != null)
    {
      paramau = paramag.dZq().c(paramau);
      AppMethodBeat.o(119548);
    }
    while (true)
    {
      return paramau;
      paramau = null;
      AppMethodBeat.o(119548);
    }
  }

  private z.a eaH()
  {
    AppMethodBeat.i(119545);
    z.a locala = new z.a(this);
    AppMethodBeat.o(119545);
    return locala;
  }

  protected final ah a(z.a parama)
  {
    AppMethodBeat.i(119546);
    z localz = a(parama.Bjg, parama.Bhv, parama.BhQ, parama.BiX, parama.Bif, parama.BgZ);
    Object localObject1;
    Object localObject2;
    a.i.b.a.c.l.au localau;
    Object localObject3;
    if (parama.Biv == null)
    {
      localObject1 = this.BeK;
      localObject2 = new ArrayList(((List)localObject1).size());
      localau = k.a((List)localObject1, parama.Bik, localz, (List)localObject2);
      localObject3 = localau.c(dZS(), ba.BKj);
      if (localObject3 != null)
        break label110;
      parama = null;
      AppMethodBeat.o(119546);
    }
    while (true)
    {
      return parama;
      localObject1 = parama.Biv;
      break;
      label110: localObject1 = parama.BhP;
      Object localObject4;
      if (localObject1 != null)
      {
        localObject4 = ((a.i.b.a.c.b.ak)localObject1).e(localau);
        localObject1 = localObject4;
        if (localObject4 == null)
        {
          parama = null;
          AppMethodBeat.o(119546);
        }
      }
      else
      {
        localObject1 = null;
        if (this.BhO != null)
        {
          localObject4 = localau.c(this.BhO.dZS(), ba.BKi);
          if (localObject4 == null)
          {
            parama = null;
            AppMethodBeat.o(119546);
          }
          else
          {
            localObject4 = new ac(localz, new a.i.b.a.c.i.e.a.b(localz, (a.i.b.a.c.l.w)localObject4, this.BhO.dZO()), this.BhO.dYn());
            localz.a((a.i.b.a.c.l.w)localObject3, (List)localObject2, (a.i.b.a.c.b.ak)localObject1, (a.i.b.a.c.b.ak)localObject4);
            if (this.Bjb == null)
            {
              localObject1 = null;
              if (localObject1 != null)
              {
                localObject4 = this.Bjb.dYT();
                ((y)localObject1).Big = a(localau, this.Bjb);
                if (localObject4 == null)
                  break label538;
              }
            }
          }
        }
        else
        {
          label538: for (localObject4 = localau.c((a.i.b.a.c.l.w)localObject4, ba.BKj); ; localObject4 = null)
          {
            ((aa)localObject1).K((a.i.b.a.c.l.w)localObject4);
            if (this.Bjc != null)
              break label544;
            localObject4 = null;
            if (localObject4 == null)
              break label704;
            localObject3 = p.a((t)localObject4, this.Bjc.dYV(), localau, false, false, null);
            localObject2 = localObject3;
            if (localObject3 == null)
            {
              localz.Bjd = true;
              localObject2 = Collections.singletonList(ab.a((aj)localObject4, a.G(parama.Bjg).dXL(), ((a.i.b.a.c.b.au)this.Bjc.dYV().get(0)).dYn()));
            }
            if (((List)localObject2).size() == 1)
              break label674;
            parama = new IllegalStateException();
            AppMethodBeat.o(119546);
            throw parama;
            localObject4 = null;
            break;
            localObject2 = this.Bjb.dYn();
            localObject4 = parama.Bhv;
            localObject5 = a(this.Bjb.BhQ, parama.Bif);
            bool1 = this.Bjb.isDefault;
            bool2 = this.Bjb.Bhu;
            bool3 = this.Bjb.BhT;
            localObject3 = parama.Bif;
            if (parama.BiX == null);
            for (localObject1 = null; ; localObject1 = parama.BiX.dZI())
            {
              localObject1 = new aa(localz, (a.i.b.a.c.b.a.g)localObject2, (a.i.b.a.c.b.w)localObject4, (az)localObject5, bool1, bool2, bool3, (b.a)localObject3, (ai)localObject1, am.BeR);
              break;
            }
          }
          label544: localObject2 = this.Bjc.dYn();
          Object localObject5 = parama.Bhv;
          az localaz = a(this.Bjc.dYf(), parama.Bif);
          boolean bool2 = this.Bjc.isDefault();
          boolean bool1 = this.Bjc.dYm();
          boolean bool3 = this.Bjc.dYj();
          localObject3 = parama.Bif;
          if (parama.BiX == null);
          for (localObject4 = null; ; localObject4 = parama.BiX.dZJ())
          {
            localObject4 = new ab(localz, (a.i.b.a.c.b.a.g)localObject2, (a.i.b.a.c.b.w)localObject5, localaz, bool2, bool1, bool3, (b.a)localObject3, (aj)localObject4, am.BeR);
            break;
          }
          label674: ((y)localObject4).Big = a(localau, this.Bjc);
          ((ab)localObject4).a((a.i.b.a.c.b.au)((List)localObject2).get(0));
          label704: if (this.Bje == null)
          {
            localObject2 = null;
            if (this.Bjf != null)
              break label813;
          }
          label813: for (localObject3 = null; ; localObject3 = new o(this.Bjf.dYn(), localz))
          {
            localz.a((aa)localObject1, (aj)localObject4, (r)localObject2, (r)localObject3);
            if (!parama.Bir)
              break label840;
            localObject1 = i.ekD();
            parama = dYX().iterator();
            while (parama.hasNext())
              ((Collection)localObject1).add(((ah)parama.next()).d(localau));
            localObject2 = new o(this.Bje.dYn(), localz);
            break;
          }
          localz.k((Collection)localObject1);
          label840: if ((eab()) && (this.BjD != null))
            localz.a(this.BjD);
          AppMethodBeat.o(119546);
          parama = localz;
        }
      }
    }
  }

  protected z a(l paraml, a.i.b.a.c.b.w paramw, az paramaz, ah paramah, b.a parama, f paramf)
  {
    AppMethodBeat.i(119549);
    paraml = new z(paraml, paramah, dYn(), paramw, paramaz, this.BjC, paramf, parama, am.BeR, this.BiY, eab(), this.BhV, this.BhW, dYm(), this.Bja);
    AppMethodBeat.o(119549);
    return paraml;
  }

  public <V> V a(a.a<V> parama)
  {
    return null;
  }

  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    AppMethodBeat.i(119550);
    paramn = paramn.a(this, paramD);
    AppMethodBeat.o(119550);
    return paramn;
  }

  public final void a(aa paramaa, aj paramaj)
  {
    AppMethodBeat.i(119541);
    a(paramaa, paramaj, null, null);
    AppMethodBeat.o(119541);
  }

  public final void a(aa paramaa, aj paramaj, r paramr1, r paramr2)
  {
    this.Bjb = paramaa;
    this.Bjc = paramaj;
    this.Bje = paramr1;
    this.Bjf = paramr2;
  }

  public final void a(a.i.b.a.c.l.w paramw, List<? extends ar> paramList, a.i.b.a.c.b.ak paramak1, a.i.b.a.c.b.ak paramak2)
  {
    AppMethodBeat.i(119540);
    N(paramw);
    this.BeK = new ArrayList(paramList);
    this.BhO = paramak2;
    this.BhP = paramak1;
    AppMethodBeat.o(119540);
  }

  public final ah d(a.i.b.a.c.l.au paramau)
  {
    AppMethodBeat.i(119544);
    if (paramau.Bik.isEmpty())
    {
      AppMethodBeat.o(119544);
      paramau = this;
    }
    while (true)
    {
      return paramau;
      z.a locala = eaH();
      locala.Bik = paramau.Bik;
      paramau = locala.i(dZL()).eaJ();
      AppMethodBeat.o(119544);
    }
  }

  public final a.i.b.a.c.b.ak dYQ()
  {
    return this.BhO;
  }

  public final a.i.b.a.c.b.ak dYR()
  {
    return this.BhP;
  }

  public final List<ar> dYS()
  {
    return this.BeK;
  }

  public final a.i.b.a.c.l.w dYT()
  {
    AppMethodBeat.i(119542);
    a.i.b.a.c.l.w localw = dZS();
    AppMethodBeat.o(119542);
    return localw;
  }

  public final Collection<? extends ah> dYX()
  {
    AppMethodBeat.i(119552);
    Object localObject;
    if (this.BiW != null)
    {
      localObject = this.BiW;
      AppMethodBeat.o(119552);
    }
    while (true)
    {
      return localObject;
      localObject = Collections.emptyList();
      AppMethodBeat.o(119552);
    }
  }

  public final b.a dYZ()
  {
    return this.Bif;
  }

  public final a.i.b.a.c.b.w dYd()
  {
    return this.Bhv;
  }

  public final az dYf()
  {
    return this.BhQ;
  }

  public final boolean dYk()
  {
    return this.BhV;
  }

  public final boolean dYl()
  {
    return this.BhW;
  }

  public boolean dYm()
  {
    return this.Bhu;
  }

  public final aj dZJ()
  {
    return this.Bjc;
  }

  public final List<ag> dZK()
  {
    AppMethodBeat.i(119543);
    ArrayList localArrayList = new ArrayList(2);
    if (this.Bjb != null)
      localArrayList.add(this.Bjb);
    if (this.Bjc != null)
      localArrayList.add(this.Bjc);
    AppMethodBeat.o(119543);
    return localArrayList;
  }

  public final ah dZL()
  {
    AppMethodBeat.i(119551);
    Object localObject;
    if (this.BiX == this)
    {
      AppMethodBeat.o(119551);
      localObject = this;
    }
    while (true)
    {
      return localObject;
      localObject = this.BiX.dZL();
      AppMethodBeat.o(119551);
    }
  }

  public final r dZM()
  {
    return this.Bje;
  }

  public final r dZN()
  {
    return this.Bjf;
  }

  public boolean eab()
  {
    return this.BiZ;
  }

  public final boolean eac()
  {
    return this.BiY;
  }

  public final boolean ead()
  {
    return this.Bja;
  }

  public final void k(Collection<? extends a.i.b.a.c.b.b> paramCollection)
  {
    this.BiW = paramCollection;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.z
 * JD-Core Version:    0.6.2
 */