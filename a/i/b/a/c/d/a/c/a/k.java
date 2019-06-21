package a.i.b.a.c.d.a.c.a;

import a.a.ad;
import a.a.v;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.au;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.c.ai;
import a.i.b.a.c.b.t;
import a.i.b.a.c.b.w.a;
import a.i.b.a.c.d.a.b.e;
import a.i.b.a.c.d.a.c.m;
import a.i.b.a.c.d.a.e.n;
import a.i.b.a.c.d.a.e.q;
import a.i.b.a.c.d.a.e.x;
import a.i.b.a.c.d.a.p;
import a.i.b.a.c.i.b.s;
import a.i.b.a.c.i.e.c.a;
import a.o;
import a.u;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class k extends a.i.b.a.c.i.e.i
{
  private final a.i.b.a.c.k.c<a.i.b.a.c.f.f, Collection<al>> BhE;
  private final a.i.b.a.c.k.c<a.i.b.a.c.f.f, List<ah>> BhF;
  private final a.i.b.a.c.k.f<Collection<a.i.b.a.c.b.l>> BhG;
  final a.i.b.a.c.d.a.c.h Bnn;
  final a.i.b.a.c.k.f<b> BoC;
  private final a.i.b.a.c.k.f BoD;
  private final a.i.b.a.c.k.f BoE;
  private final a.i.b.a.c.k.f BoF;

  public k(a.i.b.a.c.d.a.c.h paramh)
  {
    this.Bnn = paramh;
    this.BhG = this.Bnn.Bnv.Baf.a((a.f.a.a)new k.c(this), (List)v.AUP);
    this.BoC = this.Bnn.Bnv.Baf.i((a.f.a.a)new k.e(this));
    this.BhE = this.Bnn.Bnv.Baf.f((a.f.a.b)new k.g(this));
    this.BoD = this.Bnn.Bnv.Baf.i((a.f.a.a)new k.f(this));
    this.BoE = this.Bnn.Bnv.Baf.i((a.f.a.a)new k.i(this));
    this.BoF = this.Bnn.Bnv.Baf.i((a.f.a.a)new k.d(this));
    this.BhF = this.Bnn.Bnv.Baf.f((a.f.a.b)new k.h(this));
  }

  protected static k.b a(a.i.b.a.c.d.a.c.h paramh, t paramt, List<? extends a.i.b.a.c.d.a.e.y> paramList)
  {
    a.f.b.j.p(paramh, "c");
    a.f.b.j.p(paramt, "function");
    a.f.b.j.p(paramList, "jValueParameters");
    Set localSet = (Set)new LinkedHashSet();
    Object localObject1 = a.a.j.p((Iterable)paramList);
    Collection localCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    Iterator localIterator = ((Iterable)localObject1).iterator();
    boolean bool = false;
    int i;
    a.i.b.a.c.d.a.e.y localy;
    a.i.b.a.c.b.a.g localg;
    a.i.b.a.c.d.a.c.b.a locala;
    Object localObject2;
    Object localObject3;
    if (localIterator.hasNext())
    {
      localObject1 = (a.a.y)localIterator.next();
      i = ((a.a.y)localObject1).index;
      localy = (a.i.b.a.c.d.a.e.y)((a.a.y)localObject1).value;
      localg = a.i.b.a.c.d.a.c.f.a(paramh, (a.i.b.a.c.d.a.e.d)localy);
      locala = a.i.b.a.c.d.a.c.b.d.a(a.i.b.a.c.d.a.a.l.Bmw, false, null, 3);
      localObject1 = p.Blx;
      a.f.b.j.o(localObject1, "JvmAnnotationNames.PARAMETER_NAME_FQ_NAME");
      localObject1 = localg.i((a.i.b.a.c.f.b)localObject1);
      if (localObject1 != null)
      {
        localObject2 = a.i.b.a.c.i.c.a.m((a.i.b.a.c.b.a.c)localObject1);
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (!(localObject2 instanceof s))
            localObject1 = null;
          localObject1 = (s)localObject1;
          if (localObject1 != null)
            localObject1 = (String)((s)localObject1).getValue();
        }
      }
      while (localy.ecc())
      {
        localObject3 = localy.ebT();
        localObject2 = localObject3;
        if (!(localObject3 instanceof a.i.b.a.c.d.a.e.f))
          localObject2 = null;
        localObject2 = (a.i.b.a.c.d.a.e.f)localObject2;
        if (localObject2 == null)
        {
          throw ((Throwable)new AssertionError("Vararg parameter should be an array: ".concat(String.valueOf(localy))));
          localObject1 = null;
        }
        else
        {
          localObject2 = paramh.Bnu.a((a.i.b.a.c.d.a.e.f)localObject2, locala, true);
          localObject2 = u.I(localObject2, paramh.Bnv.BcH.dZD().l((a.i.b.a.c.l.w)localObject2));
          label320: localObject3 = (a.i.b.a.c.l.w)((o)localObject2).first;
          localObject2 = (a.i.b.a.c.l.w)((o)localObject2).second;
          if ((!a.f.b.j.j(paramt.dZg().name, "equals")) || (paramList.size() != 1) || (!a.f.b.j.j(paramh.Bnv.BcH.dZD().dXN(), localObject3)))
            break label488;
          localObject1 = a.i.b.a.c.f.f.avX("other");
        }
      }
    }
    while (true)
    {
      a.f.b.j.o(localObject1, "if (function.name.asStri…(\"p$index\")\n            }");
      localCollection.add(new ai((a.i.b.a.c.b.a)paramt, null, i, localg, (a.i.b.a.c.f.f)localObject1, (a.i.b.a.c.l.w)localObject3, false, false, false, (a.i.b.a.c.l.w)localObject2, (am)paramh.Bnv.BmZ.a((a.i.b.a.c.d.a.e.l)localy)));
      break;
      localObject2 = u.I(paramh.Bnu.a(localy.ebT(), locala), null);
      break label320;
      label488: if (localObject1 != null)
      {
        if (((CharSequence)localObject1).length() > 0);
        for (int j = 1; ; j = 0)
        {
          if ((j == 0) || (!localSet.add(localObject1)))
            break label541;
          localObject1 = a.i.b.a.c.f.f.avX((String)localObject1);
          break;
        }
      }
      label541: localObject1 = localy.dZg();
      if (localObject1 == null)
        bool = true;
      if (localObject1 == null)
      {
        localObject1 = a.i.b.a.c.f.f.avX("p".concat(String.valueOf(i)));
        continue;
        return new k.b(a.a.j.m((Iterable)localCollection), bool);
      }
    }
  }

  protected static a.i.b.a.c.l.w a(q paramq, a.i.b.a.c.d.a.c.h paramh)
  {
    a.f.b.j.p(paramq, "method");
    a.f.b.j.p(paramh, "c");
    boolean bool = paramq.ebU().ebH();
    a.i.b.a.c.d.a.c.b.a locala = a.i.b.a.c.d.a.c.b.d.a(a.i.b.a.c.d.a.a.l.Bmw, bool, null, 2);
    return paramh.Bnu.a(paramq.ebV(), locala);
  }

  private static boolean a(n paramn)
  {
    if ((paramn.ebY()) && (paramn.isStatic()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  protected final e a(q paramq)
  {
    a.f.b.j.p(paramq, "method");
    Object localObject1 = a.i.b.a.c.d.a.c.f.a(this.Bnn, (a.i.b.a.c.d.a.e.d)paramq);
    e locale = e.a(ebu(), (a.i.b.a.c.b.a.g)localObject1, paramq.dZg(), (am)this.Bnn.Bnv.BmZ.a((a.i.b.a.c.d.a.e.l)paramq));
    a.f.b.j.o(locale, "JavaMethodDescriptor.cre….source(method)\n        )");
    a.i.b.a.c.d.a.c.h localh = a.i.b.a.c.d.a.c.a.a(this.Bnn, (a.i.b.a.c.b.l)locale, (x)paramq, 0);
    Object localObject2 = (Iterable)paramq.dYS();
    localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (a.i.b.a.c.d.a.e.w)((Iterator)localObject2).next();
      localObject3 = localh.Bnw.a((a.i.b.a.c.d.a.e.w)localObject3);
      if (localObject3 == null)
        a.f.b.j.dWJ();
      ((Collection)localObject1).add(localObject3);
    }
    localObject1 = (List)localObject1;
    localObject2 = a(localh, (t)locale, paramq.dYV());
    Object localObject3 = a(paramq, (List)localObject1, a(paramq, localh), ((k.b)localObject2).BoH);
    localObject1 = ((a)localObject3).Bms;
    boolean bool2;
    if (localObject1 != null)
    {
      Object localObject4 = (a.i.b.a.c.b.a)locale;
      Object localObject5 = a.i.b.a.c.b.a.g.BfJ;
      localObject1 = a.i.b.a.c.i.c.a((a.i.b.a.c.b.a)localObject4, (a.i.b.a.c.l.w)localObject1, g.a.eai());
      ak localak = dYR();
      List localList = ((a)localObject3).BeK;
      localObject5 = ((a)localObject3).Bmt;
      localObject4 = ((a)localObject3).Bji;
      Object localObject6 = a.i.b.a.c.b.w.BeG;
      boolean bool1 = paramq.ebX();
      if (paramq.ebY())
        break label417;
      bool2 = true;
      label297: localObject6 = w.a.an(bool1, bool2);
      az localaz = paramq.dYf();
      if (((a)localObject3).Bms == null)
        break label423;
      paramq = ad.a(u.I(e.BmA, a.a.j.fJ(((k.b)localObject2).BoH)));
      label340: locale.a((ak)localObject1, localak, localList, (List)localObject5, (a.i.b.a.c.l.w)localObject4, (a.i.b.a.c.b.w)localObject6, localaz, paramq);
      locale.ao(((a)localObject3).Bia, ((k.b)localObject2).BoI);
      if (((Collection)((a)localObject3).BoG).isEmpty())
        break label430;
    }
    label417: label423: label430: for (int i = 1; ; i = 0)
    {
      if (i != 0)
        localh.Bnv.BmU.ebl();
      return locale;
      localObject1 = null;
      break;
      bool2 = false;
      break label297;
      paramq = ad.emptyMap();
      break label340;
    }
  }

  protected abstract a a(q paramq, List<? extends ar> paramList, a.i.b.a.c.l.w paramw, List<? extends au> paramList1);

  public Collection<ah> a(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    if (!eav().contains(paramf));
    for (paramf = (Collection)v.AUP; ; paramf = (Collection)this.BhF.am(paramf))
      return paramf;
  }

  public Collection<a.i.b.a.c.b.l> a(a.i.b.a.c.i.e.d paramd, a.f.a.b<? super a.i.b.a.c.f.f, Boolean> paramb)
  {
    a.f.b.j.p(paramd, "kindFilter");
    a.f.b.j.p(paramb, "nameFilter");
    return (Collection)this.BhG.invoke();
  }

  protected final List<a.i.b.a.c.b.l> a(a.i.b.a.c.i.e.d paramd, a.f.a.b<? super a.i.b.a.c.f.f, Boolean> paramb, a.i.b.a.c.c.a.a parama)
  {
    a.f.b.j.p(paramd, "kindFilter");
    a.f.b.j.p(paramb, "nameFilter");
    a.f.b.j.p(parama, "location");
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    Object localObject = a.i.b.a.c.i.e.d.BFX;
    a.i.b.a.c.f.f localf;
    if (paramd.UI(a.i.b.a.c.i.e.d.ejK()))
    {
      localObject = c(paramd, paramb).iterator();
      while (((Iterator)localObject).hasNext())
      {
        localf = (a.i.b.a.c.f.f)((Iterator)localObject).next();
        if (((Boolean)paramb.am(localf)).booleanValue())
          a.i.b.a.c.n.a.b((Collection)localLinkedHashSet, c(localf, parama));
      }
    }
    localObject = a.i.b.a.c.i.e.d.BFX;
    if ((paramd.UI(a.i.b.a.c.i.e.d.ejH())) && (!paramd.BFz.contains(c.a.BFw)))
    {
      localObject = b(paramd, paramb).iterator();
      while (((Iterator)localObject).hasNext())
      {
        localf = (a.i.b.a.c.f.f)((Iterator)localObject).next();
        if (((Boolean)paramb.am(localf)).booleanValue())
          localLinkedHashSet.addAll(b(localf, parama));
      }
    }
    localObject = a.i.b.a.c.i.e.d.BFX;
    if ((paramd.UI(a.i.b.a.c.i.e.d.ejI())) && (!paramd.BFz.contains(c.a.BFw)))
    {
      localObject = a(paramd).iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramd = (a.i.b.a.c.f.f)((Iterator)localObject).next();
        if (((Boolean)paramb.am(paramd)).booleanValue())
          localLinkedHashSet.addAll(a(paramd, parama));
      }
    }
    return a.a.j.m((Iterable)localLinkedHashSet);
  }

  protected abstract Set<a.i.b.a.c.f.f> a(a.i.b.a.c.i.e.d paramd);

  protected abstract void a(a.i.b.a.c.f.f paramf, Collection<ah> paramCollection);

  protected abstract void a(Collection<al> paramCollection, a.i.b.a.c.f.f paramf);

  protected boolean a(e parame)
  {
    a.f.b.j.p(parame, "receiver$0");
    return true;
  }

  public Collection<al> b(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    if (!eau().contains(paramf));
    for (paramf = (Collection)v.AUP; ; paramf = (Collection)this.BhE.am(paramf))
      return paramf;
  }

  protected abstract Set<a.i.b.a.c.f.f> b(a.i.b.a.c.i.e.d paramd, a.f.a.b<? super a.i.b.a.c.f.f, Boolean> paramb);

  protected abstract Set<a.i.b.a.c.f.f> c(a.i.b.a.c.i.e.d paramd, a.f.a.b<? super a.i.b.a.c.f.f, Boolean> paramb);

  protected abstract ak dYR();

  public final Set<a.i.b.a.c.f.f> eau()
  {
    return (Set)a.i.b.a.c.k.h.a(this.BoD, eQB[0]);
  }

  public final Set<a.i.b.a.c.f.f> eav()
  {
    return (Set)a.i.b.a.c.k.h.a(this.BoE, eQB[1]);
  }

  protected abstract b ebt();

  protected abstract a.i.b.a.c.b.l ebu();

  public String toString()
  {
    return "Lazy scope for " + ebu();
  }

  protected static final class a
  {
    final List<ar> BeK;
    final boolean Bia;
    final a.i.b.a.c.l.w Bji;
    final a.i.b.a.c.l.w Bms;
    final List<au> Bmt;
    final List<String> BoG;

    public a(a.i.b.a.c.l.w paramw1, a.i.b.a.c.l.w paramw2, List<? extends au> paramList, List<? extends ar> paramList1, boolean paramBoolean, List<String> paramList2)
    {
      AppMethodBeat.i(119986);
      this.Bji = paramw1;
      this.Bms = paramw2;
      this.Bmt = paramList;
      this.BeK = paramList1;
      this.Bia = paramBoolean;
      this.BoG = paramList2;
      AppMethodBeat.o(119986);
    }

    public final boolean equals(Object paramObject)
    {
      boolean bool = false;
      AppMethodBeat.i(119989);
      int i;
      if (this != paramObject)
      {
        if (!(paramObject instanceof a))
          break label125;
        paramObject = (a)paramObject;
        if ((!a.f.b.j.j(this.Bji, paramObject.Bji)) || (!a.f.b.j.j(this.Bms, paramObject.Bms)) || (!a.f.b.j.j(this.Bmt, paramObject.Bmt)) || (!a.f.b.j.j(this.BeK, paramObject.BeK)))
          break label125;
        if (this.Bia == paramObject.Bia)
        {
          i = 1;
          if ((i == 0) || (!a.f.b.j.j(this.BoG, paramObject.BoG)))
            break label125;
        }
      }
      else
      {
        AppMethodBeat.o(119989);
        bool = true;
      }
      while (true)
      {
        return bool;
        i = 0;
        break;
        label125: AppMethodBeat.o(119989);
      }
    }

    public final int hashCode()
    {
      int i = 0;
      AppMethodBeat.i(119988);
      Object localObject = this.Bji;
      int j;
      int k;
      label36: int m;
      if (localObject != null)
      {
        j = localObject.hashCode();
        localObject = this.Bms;
        if (localObject == null)
          break label139;
        k = localObject.hashCode();
        localObject = this.Bmt;
        if (localObject == null)
          break label145;
        m = localObject.hashCode();
        label51: localObject = this.BeK;
        if (localObject == null)
          break label151;
      }
      label139: label145: label151: for (int n = localObject.hashCode(); ; n = 0)
      {
        int i1 = this.Bia;
        int i2 = i1;
        if (i1 != 0)
          i2 = 1;
        localObject = this.BoG;
        if (localObject != null)
          i = localObject.hashCode();
        AppMethodBeat.o(119988);
        return (i2 + (n + (m + (k + j * 31) * 31) * 31) * 31) * 31 + i;
        j = 0;
        break;
        k = 0;
        break label36;
        m = 0;
        break label51;
      }
    }

    public final String toString()
    {
      AppMethodBeat.i(119987);
      String str = "MethodSignatureData(returnType=" + this.Bji + ", receiverType=" + this.Bms + ", valueParameters=" + this.Bmt + ", typeParameters=" + this.BeK + ", hasStableParameterNames=" + this.Bia + ", errors=" + this.BoG + ")";
      AppMethodBeat.o(119987);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.a.k
 * JD-Core Version:    0.6.2
 */