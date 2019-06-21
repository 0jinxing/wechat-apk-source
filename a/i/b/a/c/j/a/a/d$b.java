package a.i.b.a.c.j.a.a;

import a.i.b.a.c.b.aa.b;
import a.i.b.a.c.b.ap;
import a.i.b.a.c.b.ap.a;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.e;
import a.i.b.a.c.e.a.aa;
import a.i.b.a.c.e.a.c;
import a.i.b.a.c.f.c;
import a.i.b.a.c.j.a.k;
import a.i.b.a.c.j.a.m;
import a.i.b.a.c.l.an;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

final class d$b extends a.i.b.a.c.l.b
{
  private final a.i.b.a.c.k.f<List<ar>> Bod;

  public d$b()
  {
    super(localObject.BHj.Brl.Baf);
    AppMethodBeat.i(122366);
    this.Bod = localObject.BHj.Brl.Baf.i((a.f.a.a)new d.b.a(this));
    AppMethodBeat.o(122366);
  }

  public final Collection<a.i.b.a.c.l.w> dYr()
  {
    AppMethodBeat.i(122363);
    Object localObject1 = this.BHY.BGD;
    Object localObject2 = this.BHY.BHj.AWr;
    a.f.b.j.p(localObject1, "receiver$0");
    a.f.b.j.p(localObject2, "typeTable");
    Object localObject3 = ((a.c)localObject1).Btq;
    int i;
    if (!((Collection)localObject3).isEmpty())
    {
      i = 1;
      if (i == 0)
        break label161;
    }
    while (true)
    {
      localObject4 = localObject3;
      if (localObject3 != null)
        break label172;
      localObject3 = ((a.c)localObject1).Btr;
      a.f.b.j.o(localObject3, "supertypeIdList");
      localObject4 = (Iterable)localObject3;
      localObject3 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject4));
      localObject1 = ((Iterable)localObject4).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject4 = (Integer)((Iterator)localObject1).next();
        a.f.b.j.o(localObject4, "it");
        ((Collection)localObject3).add(((a.i.b.a.c.e.a.h)localObject2).Uk(((Integer)localObject4).intValue()));
      }
      i = 0;
      break;
      label161: localObject3 = null;
    }
    Object localObject4 = (List)localObject3;
    label172: localObject4 = (Iterable)localObject4;
    localObject3 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject4));
    localObject4 = ((Iterable)localObject4).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject2 = (a.aa)((Iterator)localObject4).next();
      ((Collection)localObject3).add(this.BHY.BHj.BHb.r((a.aa)localObject2));
    }
    localObject2 = a.a.j.b((Collection)localObject3, (Iterable)this.BHY.BHj.Brl.BGX.l((e)this.BHY));
    localObject3 = (Iterable)localObject2;
    localObject1 = (Collection)new ArrayList();
    Object localObject5 = ((Iterable)localObject3).iterator();
    while (((Iterator)localObject5).hasNext())
    {
      localObject4 = ((a.i.b.a.c.l.w)((Iterator)localObject5).next()).ejw().dYs();
      localObject3 = localObject4;
      if (!(localObject4 instanceof aa.b))
        localObject3 = null;
      localObject3 = (aa.b)localObject3;
      if (localObject3 != null)
        ((Collection)localObject1).add(localObject3);
    }
    localObject3 = (List)localObject1;
    if (!((Collection)localObject3).isEmpty())
    {
      i = 1;
      if (i == 0)
        break label548;
      localObject4 = this.BHY.BHj.Brl.BmV;
      localObject1 = (e)this.BHY;
      localObject3 = (Iterable)localObject3;
      localObject5 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject3));
      Iterator localIterator = ((Iterable)localObject3).iterator();
      label452: if (!localIterator.hasNext())
        break label535;
      aa.b localb = (aa.b)localIterator.next();
      localObject3 = a.i.b.a.c.i.c.a.c((a.i.b.a.c.b.h)localb);
      if (localObject3 != null)
      {
        localObject3 = ((a.i.b.a.c.f.a)localObject3).ehE();
        if (localObject3 != null)
        {
          localObject3 = ((a.i.b.a.c.f.b)localObject3).ByQ.ByV;
          if (localObject3 != null)
            break label566;
        }
      }
      localObject3 = localb.BgZ.name;
    }
    label535: label548: label566: 
    while (true)
    {
      ((Collection)localObject5).add(localObject3);
      break label452;
      i = 0;
      break;
      ((m)localObject4).a((e)localObject1, (List)localObject5);
      localObject3 = (Collection)a.a.j.m((Iterable)localObject2);
      AppMethodBeat.o(122363);
      return localObject3;
    }
  }

  public final boolean dYu()
  {
    return true;
  }

  public final ap dYv()
  {
    return (ap)ap.a.BeT;
  }

  public final List<ar> getParameters()
  {
    AppMethodBeat.i(122364);
    List localList = (List)this.Bod.invoke();
    AppMethodBeat.o(122364);
    return localList;
  }

  public final String toString()
  {
    AppMethodBeat.i(122365);
    String str = this.BHY.BgZ.toString();
    a.f.b.j.o(str, "name.toString()");
    AppMethodBeat.o(122365);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.j.a.a.d.b
 * JD-Core Version:    0.6.2
 */