package a.i.b.a.c.d.a.c.a;

import a.a.x;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.e;
import a.i.b.a.c.d.a.b.i;
import a.i.b.a.c.d.a.e.g;
import a.i.b.a.c.n.b.b;
import a.i.b.a.c.n.b.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class l extends m
{
  private final g BnJ;
  private final f BoM;

  public l(a.i.b.a.c.d.a.c.h paramh, g paramg, f paramf)
  {
    super(paramh);
    AppMethodBeat.i(120018);
    this.BnJ = paramg;
    this.BoM = paramf;
    AppMethodBeat.o(120018);
  }

  private static <R> Set<R> a(e parame, Set<R> paramSet, a.f.a.b<? super a.i.b.a.c.i.e.h, ? extends Collection<? extends R>> paramb)
  {
    AppMethodBeat.i(120016);
    a.i.b.a.c.n.b.a((Collection)a.a.j.listOf(parame), (b.b)l.d.BoP, (b.c)new l.e(parame, paramSet, paramb));
    AppMethodBeat.o(120016);
    return paramSet;
  }

  private final ah f(ah paramah)
  {
    AppMethodBeat.i(120017);
    Object localObject = paramah.dYZ();
    a.f.b.j.o(localObject, "this.kind");
    if (((b.a)localObject).dZa())
      AppMethodBeat.o(120017);
    while (true)
    {
      return paramah;
      paramah = paramah.dYX();
      a.f.b.j.o(paramah, "this.overriddenDescriptors");
      localObject = (Iterable)paramah;
      paramah = (Collection)new ArrayList(a.a.j.d((Iterable)localObject));
      Iterator localIterator = ((Iterable)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (ah)localIterator.next();
        a.f.b.j.o(localObject, "it");
        paramah.add(f((ah)localObject));
      }
      paramah = (Iterable)paramah;
      a.f.b.j.p(paramah, "receiver$0");
      paramah = (ah)a.a.j.fN(a.a.j.m((Iterable)a.a.j.q(paramah)));
      AppMethodBeat.o(120017);
    }
  }

  protected final Set<a.i.b.a.c.f.f> a(a.i.b.a.c.i.e.d paramd)
  {
    AppMethodBeat.i(120011);
    a.f.b.j.p(paramd, "kindFilter");
    paramd = a.a.j.q((Iterable)((b)this.BoC.invoke()).ebo());
    a((e)this.BoM, paramd, (a.f.a.b)c.BoO);
    AppMethodBeat.o(120011);
    return paramd;
  }

  protected final void a(a.i.b.a.c.f.f paramf, Collection<ah> paramCollection)
  {
    AppMethodBeat.i(120015);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(paramCollection, "result");
    paramf = a((e)this.BoM, (Set)new LinkedHashSet(), (a.f.a.b)new l.b(paramf));
    int i;
    if (!paramCollection.isEmpty())
    {
      i = 1;
      if (i == 0)
        break label115;
      paramf = a.i.b.a.c.d.a.a.a.b((Collection)paramf, paramCollection, (e)this.BoM, this.Bnn.Bnv.BmV);
      a.f.b.j.o(paramf, "resolveOverridesForStati…rorReporter\n            )");
      paramCollection.addAll(paramf);
      AppMethodBeat.o(120015);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label115: paramf = (Iterable)paramf;
      Map localMap = (Map)new LinkedHashMap();
      Iterator localIterator = paramf.iterator();
      while (localIterator.hasNext())
      {
        Object localObject1 = localIterator.next();
        ah localah = f((ah)localObject1);
        localObject2 = localMap.get(localah);
        paramf = (a.i.b.a.c.f.f)localObject2;
        if (localObject2 == null)
        {
          paramf = new ArrayList();
          localMap.put(localah, paramf);
        }
        ((List)paramf).add(localObject1);
      }
      paramf = (Collection)new ArrayList();
      Object localObject2 = localMap.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
        a.a.j.a(paramf, (Iterable)a.i.b.a.c.d.a.a.a.b((Collection)((Map.Entry)((Iterator)localObject2).next()).getValue(), paramCollection, (e)this.BoM, this.Bnn.Bnv.BmV));
      paramCollection.addAll((Collection)paramf);
      AppMethodBeat.o(120015);
    }
  }

  protected final void a(Collection<al> paramCollection, a.i.b.a.c.f.f paramf)
  {
    AppMethodBeat.i(120014);
    a.f.b.j.p(paramCollection, "result");
    a.f.b.j.p(paramf, "name");
    Object localObject = i.s((e)this.BoM);
    if (localObject == null)
    {
      localObject = (Set)x.AUR;
      localObject = a.i.b.a.c.d.a.a.a.b((Collection)localObject, paramCollection, (e)this.BoM, this.Bnn.Bnv.BmV);
      a.f.b.j.o(localObject, "resolveOverridesForStati…components.errorReporter)");
      paramCollection.addAll((Collection)localObject);
      if (!this.BnJ.isEnum())
        break label193;
      if (!a.f.b.j.j(paramf, a.i.b.a.c.i.d.BDR))
        break label157;
      paramf = a.i.b.a.c.i.c.w((e)this.BoM);
      a.f.b.j.o(paramf, "createEnumValueOfMethod(ownerDescriptor)");
      paramCollection.add(paramf);
      AppMethodBeat.o(120014);
    }
    while (true)
    {
      return;
      localObject = a.a.j.o((Iterable)((l)localObject).b(paramf, (a.i.b.a.c.c.a.a)a.i.b.a.c.c.a.c.BjT));
      break;
      label157: if (a.f.b.j.j(paramf, a.i.b.a.c.i.d.BDQ))
      {
        paramf = a.i.b.a.c.i.c.v((e)this.BoM);
        a.f.b.j.o(paramf, "createEnumValuesMethod(ownerDescriptor)");
        paramCollection.add(paramf);
      }
      label193: AppMethodBeat.o(120014);
    }
  }

  protected final Set<a.i.b.a.c.f.f> b(a.i.b.a.c.i.e.d paramd, a.f.a.b<? super a.i.b.a.c.f.f, Boolean> paramb)
  {
    AppMethodBeat.i(120010);
    a.f.b.j.p(paramd, "kindFilter");
    Set localSet = a.a.j.q((Iterable)((b)this.BoC.invoke()).ebn());
    paramd = i.s((e)this.BoM);
    if (paramd != null);
    for (paramd = paramd.eau(); ; paramd = null)
    {
      paramb = paramd;
      if (paramd == null)
        paramb = (Set)x.AUR;
      localSet.addAll((Collection)paramb);
      if (this.BnJ.isEnum())
        localSet.addAll((Collection)a.a.j.listOf(new a.i.b.a.c.f.f[] { a.i.b.a.c.i.d.BDR, a.i.b.a.c.i.d.BDQ }));
      AppMethodBeat.o(120010);
      return localSet;
    }
  }

  public final a.i.b.a.c.b.h c(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(120013);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    AppMethodBeat.o(120013);
    return null;
  }

  protected final Set<a.i.b.a.c.f.f> c(a.i.b.a.c.i.e.d paramd, a.f.a.b<? super a.i.b.a.c.f.f, Boolean> paramb)
  {
    AppMethodBeat.i(120012);
    a.f.b.j.p(paramd, "kindFilter");
    paramd = (Set)x.AUR;
    AppMethodBeat.o(120012);
    return paramd;
  }

  static final class c extends a.f.b.k
    implements a.f.a.b<a.i.b.a.c.i.e.h, Set<? extends a.i.b.a.c.f.f>>
  {
    public static final c BoO;

    static
    {
      AppMethodBeat.i(120003);
      BoO = new c();
      AppMethodBeat.o(120003);
    }

    c()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.a.l
 * JD-Core Version:    0.6.2
 */