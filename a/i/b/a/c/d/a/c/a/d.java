package a.i.b.a.c.d.a.c.a;

import a.a.x;
import a.f.b.v;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.l;
import a.i.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class d
  implements a.i.b.a.c.i.e.h
{
  final j BnN;
  private final a.i.b.a.c.k.f BnO;
  private final h BnP;
  private final a.i.b.a.c.d.a.c.h Bnn;

  static
  {
    AppMethodBeat.i(119864);
    eQB = new k[] { (k)v.a(new a.f.b.t(v.aN(d.class), "kotlinScopes", "getKotlinScopes()Ljava/util/List;")) };
    AppMethodBeat.o(119864);
  }

  public d(a.i.b.a.c.d.a.c.h paramh, a.i.b.a.c.d.a.e.t paramt, h paramh1)
  {
    AppMethodBeat.i(119873);
    this.Bnn = paramh;
    this.BnP = paramh1;
    this.BnN = new j(this.Bnn, paramt, this.BnP);
    this.BnO = this.Bnn.Bnv.Baf.i((a.f.a.a)new d.a(this));
    AppMethodBeat.o(119873);
  }

  private void d(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(119872);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    a.i.b.a.c.c.a.a(this.Bnn.Bnv.Bnc, parama, (ab)this.BnP, paramf);
    AppMethodBeat.o(119872);
  }

  private final List<a.i.b.a.c.i.e.h> ebp()
  {
    AppMethodBeat.i(119865);
    List localList = (List)a.i.b.a.c.k.h.a(this.BnO, eQB[0]);
    AppMethodBeat.o(119865);
    return localList;
  }

  public final Collection<ah> a(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(119867);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    d(paramf, parama);
    Object localObject1 = this.BnN;
    Object localObject2 = ebp();
    localObject1 = ((a.i.b.a.c.i.e.h)localObject1).a(paramf, parama);
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
      localObject1 = a.i.b.a.c.m.b.a.b((Collection)localObject1, ((a.i.b.a.c.i.e.h)((Iterator)localObject2).next()).a(paramf, parama));
    if (localObject1 == null);
    for (paramf = (Collection)x.AUR; ; paramf = (a.i.b.a.c.f.f)localObject1)
    {
      AppMethodBeat.o(119867);
      return paramf;
    }
  }

  public final Collection<l> a(a.i.b.a.c.i.e.d paramd, a.f.a.b<? super a.i.b.a.c.f.f, Boolean> paramb)
  {
    AppMethodBeat.i(119869);
    a.f.b.j.p(paramd, "kindFilter");
    a.f.b.j.p(paramb, "nameFilter");
    Object localObject1 = this.BnN;
    Object localObject2 = ebp();
    localObject1 = ((a.i.b.a.c.i.e.h)localObject1).a(paramd, paramb);
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
      localObject1 = a.i.b.a.c.m.b.a.b((Collection)localObject1, ((a.i.b.a.c.i.e.h)((Iterator)localObject2).next()).a(paramd, paramb));
    if (localObject1 == null)
      localObject1 = (Collection)x.AUR;
    while (true)
    {
      AppMethodBeat.o(119869);
      return localObject1;
    }
  }

  public final Collection<al> b(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(119868);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    d(paramf, parama);
    Object localObject1 = this.BnN;
    Object localObject2 = ebp();
    localObject1 = ((a.i.b.a.c.i.e.h)localObject1).b(paramf, parama);
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
      localObject1 = a.i.b.a.c.m.b.a.b((Collection)localObject1, ((a.i.b.a.c.i.e.h)((Iterator)localObject2).next()).b(paramf, parama));
    if (localObject1 == null);
    for (paramf = (Collection)x.AUR; ; paramf = (a.i.b.a.c.f.f)localObject1)
    {
      AppMethodBeat.o(119868);
      return paramf;
    }
  }

  public final a.i.b.a.c.b.h c(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(119866);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    d(paramf, parama);
    Object localObject = this.BnN.e(paramf, parama);
    if (localObject != null)
    {
      paramf = (a.i.b.a.c.b.h)localObject;
      AppMethodBeat.o(119866);
    }
    while (true)
    {
      return paramf;
      Iterator localIterator = ebp().iterator();
      localObject = null;
      while (true)
        if (localIterator.hasNext())
        {
          a.i.b.a.c.b.h localh = ((a.i.b.a.c.i.e.h)localIterator.next()).c(paramf, parama);
          if (localh != null)
            if (((localh instanceof a.i.b.a.c.b.i)) && (((a.i.b.a.c.b.i)localh).dYk()))
            {
              if (localObject == null)
                localObject = localh;
            }
            else
            {
              AppMethodBeat.o(119866);
              paramf = localh;
              break;
            }
        }
      AppMethodBeat.o(119866);
      paramf = (a.i.b.a.c.f.f)localObject;
    }
  }

  public final Set<a.i.b.a.c.f.f> eau()
  {
    AppMethodBeat.i(119870);
    Object localObject1 = (Iterable)ebp();
    Object localObject2 = (Collection)new LinkedHashSet();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      a.a.j.a((Collection)localObject2, (Iterable)((a.i.b.a.c.i.e.h)((Iterator)localObject1).next()).eau());
    ((Set)localObject2).addAll((Collection)this.BnN.eau());
    localObject2 = (Set)localObject2;
    AppMethodBeat.o(119870);
    return localObject2;
  }

  public final Set<a.i.b.a.c.f.f> eav()
  {
    AppMethodBeat.i(119871);
    Object localObject1 = (Iterable)ebp();
    Object localObject2 = (Collection)new LinkedHashSet();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      a.a.j.a((Collection)localObject2, (Iterable)((a.i.b.a.c.i.e.h)((Iterator)localObject1).next()).eav());
    ((Set)localObject2).addAll((Collection)this.BnN.eav());
    localObject2 = (Set)localObject2;
    AppMethodBeat.o(119871);
    return localObject2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.d.a.c.a.d
 * JD-Core Version:    0.6.2
 */