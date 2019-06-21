package a.i.b.a.c.j.a.a;

import a.a.ad;
import a.a.v;
import a.f.a.b;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.aq;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.l;
import a.i.b.a.c.e.a.ab;
import a.i.b.a.c.e.a.o;
import a.i.b.a.c.e.a.u;
import a.i.b.a.c.g.q;
import a.i.b.a.c.j.a.r;
import a.i.b.a.c.k.c;
import a.y;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class g extends a.i.b.a.c.i.e.i
{
  final a.i.b.a.c.j.a.k BHj;
  private final Map<a.i.b.a.c.f.f, byte[]> BIm;
  private final Map<a.i.b.a.c.f.f, byte[]> BIn;
  private final Map<a.i.b.a.c.f.f, byte[]> BIo;
  private final a.i.b.a.c.k.d<a.i.b.a.c.f.f, aq> BIp;
  private final a.i.b.a.c.k.f BIq;
  private final a.i.b.a.c.k.f BIr;
  private final c<a.i.b.a.c.f.f, Collection<al>> BhE;
  private final c<a.i.b.a.c.f.f, Collection<ah>> BhF;
  private final a.i.b.a.c.k.f BoD;

  protected g(a.i.b.a.c.j.a.k paramk, Collection<a.o> paramCollection, Collection<a.u> paramCollection1, Collection<a.ab> paramCollection2, a.f.a.a<? extends Collection<a.i.b.a.c.f.f>> parama)
  {
    this.BHj = paramk;
    paramk = (Iterable)paramCollection;
    Object localObject1 = (Map)new LinkedHashMap();
    Object localObject2 = paramk.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = ((Iterator)localObject2).next();
      paramk = (q)localObject3;
      a.i.b.a.c.f.f localf = r.b(this.BHj.AWq, ((a.o)paramk).Buf);
      paramCollection = ((Map)localObject1).get(localf);
      paramk = paramCollection;
      if (paramCollection == null)
      {
        paramk = new ArrayList();
        ((Map)localObject1).put(localf, paramk);
      }
      ((List)paramk).add(localObject3);
    }
    this.BIm = bd((Map)localObject1);
    paramk = (Iterable)paramCollection1;
    paramCollection1 = (Map)new LinkedHashMap();
    Object localObject3 = paramk.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = ((Iterator)localObject3).next();
      paramk = (q)localObject1;
      localObject2 = r.b(this.BHj.AWq, ((a.u)paramk).Buf);
      paramCollection = paramCollection1.get(localObject2);
      paramk = paramCollection;
      if (paramCollection == null)
      {
        paramk = new ArrayList();
        paramCollection1.put(localObject2, paramk);
      }
      ((List)paramk).add(localObject1);
    }
    this.BIn = bd(paramCollection1);
    paramk = (Iterable)paramCollection2;
    paramCollection1 = (Map)new LinkedHashMap();
    paramCollection2 = paramk.iterator();
    while (paramCollection2.hasNext())
    {
      localObject1 = paramCollection2.next();
      paramk = (q)localObject1;
      localObject3 = r.b(this.BHj.AWq, ((a.ab)paramk).Buf);
      paramCollection = paramCollection1.get(localObject3);
      paramk = paramCollection;
      if (paramCollection == null)
      {
        paramk = new ArrayList();
        paramCollection1.put(localObject3, paramk);
      }
      ((List)paramk).add(localObject1);
    }
    this.BIo = bd(paramCollection1);
    this.BhE = this.BHj.Brl.Baf.f((b)new g.e(this));
    this.BhF = this.BHj.Brl.Baf.f((b)new f(this));
    this.BIp = this.BHj.Brl.Baf.g((b)new g.g(this));
    this.BoD = this.BHj.Brl.Baf.i((a.f.a.a)new d(this));
    this.BIq = this.BHj.Brl.Baf.i((a.f.a.a)new g.h(this));
    this.BIr = this.BHj.Brl.Baf.i((a.f.a.a)new g.a(parama));
  }

  private final e C(a.i.b.a.c.f.f paramf)
  {
    return this.BHj.Brl.i(A(paramf));
  }

  private final void a(Collection<l> paramCollection, a.i.b.a.c.i.e.d paramd, b<? super a.i.b.a.c.f.f, Boolean> paramb, a.i.b.a.c.c.a.a parama)
  {
    Object localObject1 = a.i.b.a.c.i.e.d.BFX;
    Object localObject2;
    if (paramd.UI(a.i.b.a.c.i.e.d.ejI()))
    {
      localObject2 = (Collection)eav();
      localObject1 = new ArrayList();
      Object localObject3 = ((Collection)localObject2).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = (a.i.b.a.c.f.f)((Iterator)localObject3).next();
        if (((Boolean)paramb.am(localObject2)).booleanValue())
          ((ArrayList)localObject1).addAll(a((a.i.b.a.c.f.f)localObject2, parama));
      }
      localObject3 = (List)localObject1;
      localObject2 = a.i.b.a.c.i.g.a.BEk;
      a.f.b.j.o(localObject2, "MemberComparator.NameAnd…MemberComparator.INSTANCE");
      a.a.j.a((List)localObject3, (Comparator)localObject2);
      paramCollection.addAll((Collection)localObject1);
    }
    localObject1 = a.i.b.a.c.i.e.d.BFX;
    if (paramd.UI(a.i.b.a.c.i.e.d.ejH()))
    {
      localObject1 = (Collection)eau();
      paramd = new ArrayList();
      localObject2 = ((Collection)localObject1).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (a.i.b.a.c.f.f)((Iterator)localObject2).next();
        if (((Boolean)paramb.am(localObject1)).booleanValue())
          paramd.addAll(b((a.i.b.a.c.f.f)localObject1, parama));
      }
      parama = (List)paramd;
      paramb = a.i.b.a.c.i.g.a.BEk;
      a.f.b.j.o(paramb, "MemberComparator.NameAnd…MemberComparator.INSTANCE");
      a.a.j.a(parama, (Comparator)paramb);
      paramCollection.addAll((Collection)paramd);
    }
  }

  private static Map<a.i.b.a.c.f.f, byte[]> bd(Map<a.i.b.a.c.f.f, ? extends Collection<? extends a.i.b.a.c.g.a>> paramMap)
  {
    Map localMap = (Map)new LinkedHashMap(ad.SI(paramMap.size()));
    Iterator localIterator = ((Iterable)paramMap.entrySet()).iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = localIterator.next();
      paramMap = ((Map.Entry)localObject1).getKey();
      Object localObject2 = (Map.Entry)localObject1;
      localObject1 = new ByteArrayOutputStream();
      Object localObject3 = (Iterable)((Map.Entry)localObject2).getValue();
      localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject3));
      localObject3 = ((Iterable)localObject3).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        ((a.i.b.a.c.g.a)((Iterator)localObject3).next()).c((OutputStream)localObject1);
        ((Collection)localObject2).add(y.AUy);
      }
      localMap.put(paramMap, ((ByteArrayOutputStream)localObject1).toByteArray());
    }
    return localMap;
  }

  private final Set<a.i.b.a.c.f.f> eka()
  {
    return this.BIo.keySet();
  }

  protected abstract a.i.b.a.c.f.a A(a.i.b.a.c.f.f paramf);

  protected boolean D(a.i.b.a.c.f.f paramf)
  {
    a.f.b.j.p(paramf, "name");
    return ekb().contains(paramf);
  }

  public Collection<ah> a(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    if (!eav().contains(paramf));
    for (paramf = (Collection)v.AUP; ; paramf = (Collection)this.BhF.am(paramf))
      return paramf;
  }

  protected void a(a.i.b.a.c.f.f paramf, Collection<ah> paramCollection)
  {
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(paramCollection, "descriptors");
  }

  public Collection<al> b(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    if (!eau().contains(paramf));
    for (paramf = (Collection)v.AUP; ; paramf = (Collection)this.BhE.am(paramf))
      return paramf;
  }

  protected final Collection<l> b(a.i.b.a.c.i.e.d paramd, b<? super a.i.b.a.c.f.f, Boolean> paramb, a.i.b.a.c.c.a.a parama)
  {
    a.f.b.j.p(paramd, "kindFilter");
    a.f.b.j.p(paramb, "nameFilter");
    a.f.b.j.p(parama, "location");
    ArrayList localArrayList = new ArrayList(0);
    Object localObject = a.i.b.a.c.i.e.d.BFX;
    if (paramd.UI(a.i.b.a.c.i.e.d.ejE()))
      c((Collection)localArrayList, paramb);
    a((Collection)localArrayList, paramd, paramb, parama);
    parama = a.i.b.a.c.i.e.d.BFX;
    if (paramd.UI(a.i.b.a.c.i.e.d.ejK()))
    {
      localObject = ekb().iterator();
      while (((Iterator)localObject).hasNext())
      {
        parama = (a.i.b.a.c.f.f)((Iterator)localObject).next();
        if (((Boolean)paramb.am(parama)).booleanValue())
          a.i.b.a.c.n.a.b((Collection)localArrayList, C(parama));
      }
    }
    parama = a.i.b.a.c.i.e.d.BFX;
    if (paramd.UI(a.i.b.a.c.i.e.d.ejF()))
    {
      parama = eka().iterator();
      while (parama.hasNext())
      {
        paramd = (a.i.b.a.c.f.f)parama.next();
        if (((Boolean)paramb.am(paramd)).booleanValue())
          a.i.b.a.c.n.a.b((Collection)localArrayList, this.BIp.am(paramd));
      }
    }
    return (Collection)a.i.b.a.c.n.a.at(localArrayList);
  }

  protected void b(a.i.b.a.c.f.f paramf, Collection<al> paramCollection)
  {
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(paramCollection, "functions");
  }

  public a.i.b.a.c.b.h c(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    if (D(paramf))
      paramf = (a.i.b.a.c.b.h)C(paramf);
    while (true)
    {
      return paramf;
      if (eka().contains(paramf))
        paramf = (a.i.b.a.c.b.h)this.BIp.am(paramf);
      else
        paramf = null;
    }
  }

  protected abstract void c(Collection<l> paramCollection, b<? super a.i.b.a.c.f.f, Boolean> paramb);

  public final Set<a.i.b.a.c.f.f> eau()
  {
    return (Set)a.i.b.a.c.k.h.a(this.BoD, eQB[0]);
  }

  public final Set<a.i.b.a.c.f.f> eav()
  {
    return (Set)a.i.b.a.c.k.h.a(this.BIq, eQB[1]);
  }

  protected abstract Set<a.i.b.a.c.f.f> ejY();

  protected abstract Set<a.i.b.a.c.f.f> ejZ();

  public final Set<a.i.b.a.c.f.f> ekb()
  {
    return (Set)a.i.b.a.c.k.h.a(this.BIr, eQB[2]);
  }

  static final class d extends a.f.b.k
    implements a.f.a.a<Set<? extends a.i.b.a.c.f.f>>
  {
    d(g paramg)
    {
      super();
    }
  }

  static final class f extends a.f.b.k
    implements b<a.i.b.a.c.f.f, Collection<? extends ah>>
  {
    f(g paramg)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.a.g
 * JD-Core Version:    0.6.2
 */