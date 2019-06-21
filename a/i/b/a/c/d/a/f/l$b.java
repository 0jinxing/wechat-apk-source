package a.i.b.a.c.d.a.f;

import a.aa;
import a.f.a.m;
import a.f.b.k;
import a.i.b.a.c.b.a.i;
import a.i.b.a.c.b.au;
import a.i.b.a.c.d.a.a.a;
import a.i.b.a.c.l.av;
import a.i.b.a.c.l.ax;
import a.i.b.a.c.l.t;
import a.i.b.a.c.l.w;
import a.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collection<+La.i.b.a.c.l.w;>;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class l$b
{
  private final a.i.b.a.c.b.a.a Bqk;
  private final w Bql;
  private final Collection<w> Bqm;
  private final boolean Bqn;
  private final a.i.b.a.c.d.a.c.h Bqo;
  private final a.a Bqp;

  public l$b(a.i.b.a.c.b.a.a parama, w paramw, Collection<? extends w> paramCollection, boolean paramBoolean, a.i.b.a.c.d.a.c.h paramh, a.a parama1)
  {
    AppMethodBeat.i(120164);
    this.Bqk = paramw;
    this.Bql = paramCollection;
    this.Bqm = paramBoolean;
    this.Bqn = paramh;
    this.Bqo = parama1;
    this.Bqp = localObject;
    AppMethodBeat.o(120164);
  }

  private static d S(w paramw)
  {
    e locale = null;
    AppMethodBeat.i(120159);
    Object localObject1;
    Object localObject2;
    w localw;
    label67: int i;
    if (t.ai(paramw))
    {
      localObject1 = t.aj(paramw);
      localObject1 = new o(((a.i.b.a.c.l.q)localObject1).BJx, ((a.i.b.a.c.l.q)localObject1).BJy);
      localObject2 = (w)((o)localObject1).first;
      localw = (w)((o)localObject1).second;
      localObject1 = a.i.b.a.c.a.b.c.Bdq;
      if (!((w)localObject2).eci())
        break label138;
      localObject1 = g.BpL;
      a.f.b.j.p(localObject2, "type");
      localObject2 = av.aD((w)localObject2);
      if ((localObject2 == null) || (!a.i.b.a.c.a.b.c.i((a.i.b.a.c.b.e)localObject2)))
        break label158;
      i = 1;
      label92: if (i == 0)
        break label164;
      locale = e.BpH;
    }
    label138: label158: label164: label207: 
    while (true)
    {
      paramw = new d((g)localObject1, locale, paramw.ekn() instanceof f);
      AppMethodBeat.o(120159);
      return paramw;
      localObject1 = new o(paramw, paramw);
      break;
      if (!localw.eci())
      {
        localObject1 = g.BpM;
        break label67;
      }
      localObject1 = null;
      break label67;
      i = 0;
      break label92;
      a.f.b.j.p(localw, "type");
      localObject2 = av.aD(localw);
      if ((localObject2 != null) && (a.i.b.a.c.a.b.c.h((a.i.b.a.c.b.e)localObject2)));
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label207;
        locale = e.BpI;
        break;
      }
    }
  }

  private final List<p> T(w paramw)
  {
    AppMethodBeat.i(120162);
    ArrayList localArrayList = new ArrayList(1);
    new l.b.f(localArrayList).a(paramw, this.Bqo);
    paramw = (List)localArrayList;
    AppMethodBeat.o(120162);
    return paramw;
  }

  private final d a(w paramw, Collection<? extends w> paramCollection, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(120163);
    Object localObject1 = (Iterable)paramCollection;
    Object localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      ((Collection)localObject2).add(S((w)((Iterator)localObject1).next()));
    List localList = (List)localObject2;
    localObject1 = (Iterable)localList;
    localObject2 = (Collection)new ArrayList();
    Object localObject3 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = ((d)((Iterator)localObject3).next()).BpC;
      if (localObject1 != null)
        ((Collection)localObject2).add(localObject1);
    }
    localObject3 = a.a.j.o((Iterable)localObject2);
    localObject1 = (Iterable)localList;
    localObject2 = (Collection)new ArrayList();
    Object localObject4 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject1 = ((d)((Iterator)localObject4).next()).BpB;
      if (localObject1 != null)
        ((Collection)localObject2).add(localObject1);
    }
    localObject4 = a.a.j.o((Iterable)localObject2);
    paramCollection = (Iterable)paramCollection;
    localObject1 = (Collection)new ArrayList();
    Object localObject5 = paramCollection.iterator();
    if (((Iterator)localObject5).hasNext())
    {
      paramCollection = (w)((Iterator)localObject5).next();
      a.f.b.j.p(paramCollection, "receiver$0");
      localObject2 = ax.aG(paramCollection);
      if (localObject2 != null)
        break label731;
    }
    while (true)
    {
      paramCollection = S(paramCollection).BpB;
      if (paramCollection == null)
        break;
      ((Collection)localObject1).add(paramCollection);
      break;
      localObject5 = a.a.j.o((Iterable)localObject1);
      paramd = a(paramw, paramBoolean, paramd);
      int i;
      label372: label381: g localg;
      label402: label452: label459: label480: label488: int j;
      if (!paramd.BpE)
      {
        i = 1;
        if (i == 0)
          break label638;
        paramw = paramd;
        if (paramw == null)
          break label643;
        paramCollection = paramw.BpB;
        localg = paramd.BpB;
        if ((!this.Bqn) || (!paramBoolean))
          break label648;
        bool = true;
        localObject2 = n.a((Set)localObject4, paramCollection, bool);
        if (localObject2 == null)
          break label676;
        localObject1 = this.Bqk;
        paramw = (w)localObject1;
        if (!(localObject1 instanceof au))
          paramw = null;
        paramw = (au)paramw;
        if (paramw == null)
          break label654;
        paramw = paramw.dZV();
        if (paramw == null)
          break label659;
        i = 1;
        if ((i == 0) || (!paramBoolean) || (localObject2 != g.BpL))
          break label665;
        i = 1;
        if (i != 0)
          break label671;
        paramw = (w)localObject2;
        localObject2 = (e)n.a((Set)localObject3, e.BpI, e.BpH, paramd.BpC, bool);
        if ((localg == paramCollection) && (!(a.f.b.j.j(localObject5, localObject4) ^ true)))
          break label681;
        i = 1;
        label531: if (!paramd.BpD)
        {
          paramCollection = (Iterable)localList;
          if (((Collection)paramCollection).isEmpty())
            break label687;
          paramCollection = paramCollection.iterator();
          while (paramCollection.hasNext())
            if (((d)paramCollection.next()).BpD)
            {
              j = 1;
              label590: if (j == 0)
                break label693;
            }
        }
      }
      label643: label648: label654: label659: label665: label671: label676: label681: label687: label693: for (paramBoolean = true; ; paramBoolean = false)
      {
        if ((paramw != null) || (i == 0))
          break label699;
        paramw = n.a(n.a((Set)localObject5, localg, bool), (e)localObject2, true, paramBoolean);
        AppMethodBeat.o(120163);
        return paramw;
        i = 0;
        break;
        label638: paramw = null;
        break label372;
        paramCollection = null;
        break label381;
        bool = false;
        break label402;
        paramw = null;
        break label452;
        i = 0;
        break label459;
        i = 0;
        break label480;
        paramw = null;
        break label488;
        paramw = null;
        break label488;
        i = 0;
        break label531;
        j = 0;
        break label590;
      }
      label699: if (paramw == null);
      for (boolean bool = true; ; bool = false)
      {
        paramw = n.a(paramw, (e)localObject2, bool, paramBoolean);
        AppMethodBeat.o(120163);
        break;
      }
      label731: paramCollection = (Collection<? extends w>)localObject2;
    }
  }

  private final d a(w paramw, boolean paramBoolean, d paramd)
  {
    g localg = null;
    AppMethodBeat.i(120160);
    Object localObject1;
    Object localObject2;
    l.b.e locale;
    if ((paramBoolean) && (this.Bqk != null))
    {
      localObject1 = i.a(this.Bqk.dYn(), paramw.dYn());
      localObject2 = new d((a.i.b.a.c.b.a.g)localObject1);
      locale = l.b.e.Bqw;
      if (paramBoolean)
      {
        paramd = this.Bqo.ebm();
        if (paramd == null)
          break label281;
        paramd = paramd.b(this.Bqp);
      }
      label79: localObject1 = (Iterable)localObject1;
      l locall = this.Bqq;
      Iterator localIterator = ((Iterable)localObject1).iterator();
      while (localIterator.hasNext())
      {
        localObject1 = locall.i((a.i.b.a.c.b.a.c)localIterator.next());
        if (localObject1 != null)
        {
          label133: if (localObject1 != null)
            break label314;
          if ((paramd == null) || (paramd.BpB == null))
            break label292;
          paramd = new h(paramd.BpB, paramd.BpE);
        }
      }
    }
    while (true)
    {
      label165: if (paramd != null)
      {
        localObject1 = paramd.BpP;
        label175: localObject2 = (e)locale.m(((d)localObject2).b(a.i.b.a.c.d.a.q.ebg(), e.BpH), ((d)localObject2).b(a.i.b.a.c.d.a.q.ebh(), e.BpI));
        if (paramd != null)
          localg = paramd.BpP;
        if ((localg != g.BpM) || (!a.i.b.a.c.l.c.a.aE(paramw)))
          break label303;
        paramBoolean = true;
        label234: if ((paramd == null) || (paramd.BpQ != true))
          break label308;
      }
      label281: label292: label303: label308: for (boolean bool = true; ; bool = false)
      {
        paramw = new d((g)localObject1, (e)localObject2, paramBoolean, bool);
        AppMethodBeat.o(120160);
        return paramw;
        localObject1 = paramw.dYn();
        break;
        paramd = null;
        break label79;
        localObject1 = null;
        break label133;
        paramd = null;
        break label165;
        localObject1 = null;
        break label175;
        paramBoolean = false;
        break label234;
      }
      label314: paramd = (d)localObject1;
    }
  }

  private final a.f.a.b<Integer, d> ecn()
  {
    AppMethodBeat.i(120161);
    Object localObject1 = (Iterable)this.Bqm;
    Object localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      ((Collection)localObject2).add(T((w)((Iterator)localObject1).next()));
    List localList = (List)localObject2;
    localObject1 = T(this.Bql);
    Object localObject3;
    int i;
    label163: label171: label179: label187: int k;
    if (this.Bqn)
    {
      localObject2 = (Iterable)this.Bqm;
      if ((!(localObject2 instanceof Collection)) || (!((Collection)localObject2).isEmpty()))
      {
        localObject2 = ((Iterable)localObject2).iterator();
        if (((Iterator)localObject2).hasNext())
        {
          localObject3 = (w)((Iterator)localObject2).next();
          if (!a.i.b.a.c.l.a.c.BKs.d((w)localObject3, this.Bql))
          {
            i = 1;
            if (i == 0)
              break label267;
            i = 1;
            if (i == 0)
              break label275;
            i = 1;
            if (i == 0)
              break label281;
            j = 1;
            localObject3 = new d[j];
            k = localObject3.length;
          }
        }
      }
    }
    for (int j = 0; ; j++)
    {
      if (j >= k)
        break label441;
      boolean bool;
      if (j == 0)
      {
        bool = true;
        label217: if ((!bool) && (i != 0))
          break label298;
      }
      label267: label275: label281: label298: for (int m = 1; ; m = 0)
      {
        if ((!aa.AUz) || (m != 0))
          break label304;
        localObject2 = (Throwable)new AssertionError("Only head type constructors should be computed");
        AppMethodBeat.o(120161);
        throw ((Throwable)localObject2);
        i = 0;
        break label163;
        break;
        i = 0;
        break label171;
        i = 0;
        break label179;
        j = ((List)localObject1).size();
        break label187;
        bool = false;
        break label217;
      }
      label304: localObject2 = (p)((List)localObject1).get(j);
      w localw = ((p)localObject2).AYl;
      d locald = ((p)localObject2).BqG;
      localObject2 = (Iterable)localList;
      Collection localCollection = (Collection)new ArrayList();
      Iterator localIterator = ((Iterable)localObject2).iterator();
      label410: 
      while (localIterator.hasNext())
      {
        localObject2 = (p)a.a.j.x((List)localIterator.next(), j);
        if (localObject2 != null);
        for (localObject2 = ((p)localObject2).AYl; ; localObject2 = null)
        {
          if (localObject2 == null)
            break label410;
          localCollection.add(localObject2);
          break;
        }
      }
      localObject3[j] = a(localw, (Collection)(List)localCollection, locald, bool);
    }
    label441: localObject2 = (a.f.a.b)new l.b.a((d[])localObject3);
    AppMethodBeat.o(120161);
    return localObject2;
  }

  public final l.a a(r paramr)
  {
    AppMethodBeat.i(120158);
    a.f.a.b localb = ecn();
    boolean bool;
    if (paramr != null)
    {
      paramr = (a.f.a.b)new l.b.b(paramr, localb);
      bool = av.b(this.Bql, (a.f.a.b)l.b.c.Bqu);
      w localw = this.Bql;
      Object localObject = paramr;
      if (paramr == null)
        localObject = localb;
      paramr = s.a(localw, (a.f.a.b)localObject);
      if (paramr == null)
        break label94;
      paramr = new l.a(paramr, true, bool);
      AppMethodBeat.o(120158);
    }
    while (true)
    {
      return paramr;
      paramr = null;
      break;
      label94: paramr = new l.a(this.Bql, false, bool);
      AppMethodBeat.o(120158);
    }
  }

  static final class d extends k
    implements m<List<? extends a.i.b.a.c.f.b>, T, T>
  {
    d(a.i.b.a.c.b.a.g paramg)
    {
      super();
    }

    public final <T> T b(List<a.i.b.a.c.f.b> paramList, T paramT)
    {
      AppMethodBeat.i(120153);
      a.f.b.j.p(paramList, "receiver$0");
      a.f.b.j.p(paramT, "qualifier");
      paramList = (Iterable)paramList;
      int i;
      if ((!(paramList instanceof Collection)) || (!((Collection)paramList).isEmpty()))
      {
        Iterator localIterator = paramList.iterator();
        if (localIterator.hasNext())
        {
          paramList = (a.i.b.a.c.f.b)localIterator.next();
          if (this.Bqv.i(paramList) != null)
          {
            i = 1;
            label83: if (i == 0)
              break label107;
            i = 1;
            label91: if (i == 0)
              break label115;
            AppMethodBeat.o(120153);
          }
        }
      }
      while (true)
      {
        return paramT;
        i = 0;
        break label83;
        label107: break;
        i = 0;
        break label91;
        label115: paramT = null;
        AppMethodBeat.o(120153);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.f.l.b
 * JD-Core Version:    0.6.2
 */