package a.i.b.a.c.a.a;

import a.aa;
import a.i.b.a.c.b.a;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.b;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.c.ad;
import a.i.b.a.c.b.c.p;
import a.i.b.a.c.b.c.p.a;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.t;
import a.i.b.a.c.l.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class f extends ad
{
  public static final f.a BcZ;

  static
  {
    AppMethodBeat.i(119164);
    BcZ = new f.a((byte)0);
    AppMethodBeat.o(119164);
  }

  private f(l paraml, f paramf, b.a parama, boolean paramBoolean)
  {
    super(paraml, localal, g.a.eai(), a.i.b.a.c.m.j.BLT, parama, am.BeR);
    AppMethodBeat.i(119163);
    this.BhR = true;
    this.BhZ = paramBoolean;
    rH(false);
    AppMethodBeat.o(119163);
  }

  private final t fQ(List<a.i.b.a.c.f.f> paramList)
  {
    boolean bool = true;
    AppMethodBeat.i(119162);
    int i = this.BhM.size() - paramList.size();
    if ((i == 0) || (i == 1));
    for (int j = 1; (aa.AUz) && (j == 0); j = 0)
    {
      paramList = (Throwable)new AssertionError("Assertion failed");
      AppMethodBeat.o(119162);
      throw paramList;
    }
    Object localObject1 = this.BhM;
    a.f.b.j.o(localObject1, "valueParameters");
    localObject1 = (Iterable)localObject1;
    Collection localCollection = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    Iterator localIterator = ((Iterable)localObject1).iterator();
    while (localIterator.hasNext())
    {
      a.i.b.a.c.b.au localau = (a.i.b.a.c.b.au)localIterator.next();
      a.f.b.j.o(localau, "it");
      a.i.b.a.c.f.f localf = localau.dZg();
      a.f.b.j.o(localf, "it.name");
      int k = localau.getIndex();
      j = k - i;
      localObject1 = localf;
      if (j >= 0)
      {
        localObject2 = (a.i.b.a.c.f.f)paramList.get(j);
        localObject1 = localf;
        if (localObject2 != null)
          localObject1 = localObject2;
      }
      localCollection.add(localau.a((a)this, (a.i.b.a.c.f.f)localObject1, k));
    }
    Object localObject2 = (List)localCollection;
    localObject1 = h(a.i.b.a.c.l.au.BJW);
    paramList = (Iterable)paramList;
    if (!((Collection)paramList).isEmpty())
    {
      paramList = paramList.iterator();
      if (paramList.hasNext())
        if ((a.i.b.a.c.f.f)paramList.next() == null)
        {
          j = 1;
          label304: if (j == 0)
            break label366;
        }
    }
    while (true)
    {
      ((p.a)localObject1).Bix = Boolean.valueOf(bool);
      paramList = ((p.a)localObject1).fT((List)localObject2).h((b)eaK());
      a.f.b.j.o(paramList, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
      paramList = super.a(paramList);
      if (paramList == null)
        a.f.b.j.dWJ();
      AppMethodBeat.o(119162);
      return paramList;
      j = 0;
      break label304;
      label366: break;
      bool = false;
    }
  }

  public final p a(l paraml, t paramt, b.a parama, a.i.b.a.c.f.f paramf, g paramg, am paramam)
  {
    AppMethodBeat.i(119161);
    a.f.b.j.p(paraml, "newOwner");
    a.f.b.j.p(parama, "kind");
    a.f.b.j.p(paramg, "annotations");
    a.f.b.j.p(paramam, "source");
    paraml = (p)new f(paraml, (f)paramt, parama, dZv());
    AppMethodBeat.o(119161);
    return paraml;
  }

  public final t a(p.a parama)
  {
    AppMethodBeat.i(119160);
    a.f.b.j.p(parama, "configuration");
    parama = (f)super.a(parama);
    if (parama == null)
    {
      parama = null;
      AppMethodBeat.o(119160);
    }
    while (true)
    {
      return parama;
      Object localObject1 = parama.BhM;
      a.f.b.j.o(localObject1, "substituted.valueParameters");
      localObject1 = (Iterable)localObject1;
      if ((!(localObject1 instanceof Collection)) || (!((Collection)localObject1).isEmpty()))
      {
        localObject1 = ((Iterable)localObject1).iterator();
        label75: if (((Iterator)localObject1).hasNext())
        {
          localObject2 = (a.i.b.a.c.b.au)((Iterator)localObject1).next();
          a.f.b.j.o(localObject2, "it");
          localObject2 = ((a.i.b.a.c.b.au)localObject2).dZS();
          a.f.b.j.o(localObject2, "it.type");
          if (a.i.b.a.c.a.f.k((w)localObject2) != null)
          {
            i = 1;
            label123: if (i == 0)
              break label153;
          }
        }
      }
      for (int i = 0; ; i = 1)
      {
        if (i == 0)
          break label161;
        parama = (t)parama;
        AppMethodBeat.o(119160);
        break;
        i = 0;
        break label123;
        label153: break label75;
      }
      label161: localObject1 = parama.BhM;
      a.f.b.j.o(localObject1, "substituted.valueParameters");
      Object localObject2 = (Iterable)localObject1;
      localObject1 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = (a.i.b.a.c.b.au)((Iterator)localObject2).next();
        a.f.b.j.o(localObject3, "it");
        localObject3 = ((a.i.b.a.c.b.au)localObject3).dZS();
        a.f.b.j.o(localObject3, "it.type");
        ((Collection)localObject1).add(a.i.b.a.c.a.f.k((w)localObject3));
      }
      parama = parama.fQ((List)localObject1);
      AppMethodBeat.o(119160);
    }
  }

  public final boolean dYj()
  {
    return false;
  }

  public final boolean dYm()
  {
    return false;
  }

  public final boolean dYx()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.a.a.f
 * JD-Core Version:    0.6.2
 */