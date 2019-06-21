package a.i.b.a.c.d.a.c.a;

import a.a.v;
import a.i.b.a.c.d.a.e.g;
import a.i.b.a.c.d.a.e.n;
import a.i.b.a.c.d.a.e.p;
import a.i.b.a.c.d.a.e.q;
import a.i.b.a.c.f.f;
import a.j.h;
import a.j.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a
  implements b
{
  private final a.f.a.b<q, Boolean> BnG;
  private final Map<f, List<q>> BnH;
  private final Map<f, n> BnI;
  private final g BnJ;
  final a.f.a.b<p, Boolean> BnK;

  public a(g paramg, a.f.a.b<? super p, Boolean> paramb)
  {
    AppMethodBeat.i(119858);
    this.BnJ = paramg;
    this.BnK = paramb;
    this.BnG = ((a.f.a.b)new a.a(this));
    paramg = i.a(a.a.j.t((Iterable)this.BnJ.ebI()), this.BnG);
    Object localObject1 = (Map)new LinkedHashMap();
    Iterator localIterator = paramg.iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = localIterator.next();
      f localf = ((q)localObject2).dZg();
      paramb = ((Map)localObject1).get(localf);
      paramg = paramb;
      if (paramb == null)
      {
        paramg = new ArrayList();
        ((Map)localObject1).put(localf, paramg);
      }
      ((List)paramg).add(localObject2);
    }
    this.BnH = ((Map)localObject1);
    paramb = i.a(a.a.j.t((Iterable)this.BnJ.ebJ()), this.BnK);
    paramg = (Map)new LinkedHashMap();
    localObject1 = paramb.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      paramb = ((Iterator)localObject1).next();
      paramg.put(((n)paramb).dZg(), paramb);
    }
    this.BnI = paramg;
    AppMethodBeat.o(119858);
  }

  public final Set<f> ebn()
  {
    AppMethodBeat.i(119855);
    Object localObject1 = i.a(a.a.j.t((Iterable)this.BnJ.ebI()), this.BnG);
    Object localObject2 = (Collection)new LinkedHashSet();
    localObject1 = ((h)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      ((Collection)localObject2).add(((q)((Iterator)localObject1).next()).dZg());
    localObject2 = (Set)localObject2;
    AppMethodBeat.o(119855);
    return localObject2;
  }

  public final Set<f> ebo()
  {
    AppMethodBeat.i(119857);
    Object localObject1 = i.a(a.a.j.t((Iterable)this.BnJ.ebJ()), this.BnK);
    Object localObject2 = (Collection)new LinkedHashSet();
    localObject1 = ((h)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      ((Collection)localObject2).add(((n)((Iterator)localObject1).next()).dZg());
    localObject2 = (Set)localObject2;
    AppMethodBeat.o(119857);
    return localObject2;
  }

  public final Collection<q> k(f paramf)
  {
    AppMethodBeat.i(119854);
    a.f.b.j.p(paramf, "name");
    paramf = (List)this.BnH.get(paramf);
    if (paramf != null)
    {
      paramf = (Collection)paramf;
      AppMethodBeat.o(119854);
    }
    while (true)
    {
      return paramf;
      paramf = (Collection)v.AUP;
      AppMethodBeat.o(119854);
    }
  }

  public final n l(f paramf)
  {
    AppMethodBeat.i(119856);
    a.f.b.j.p(paramf, "name");
    paramf = (n)this.BnI.get(paramf);
    AppMethodBeat.o(119856);
    return paramf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.a.a
 * JD-Core Version:    0.6.2
 */