package a.i.b.a.c.i.e;

import a.a.x;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.i;
import a.i.b.a.c.b.l;
import a.i.b.a.c.f.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class b
  implements h
{
  public static final b.a BFu;
  private final List<h> BFt;
  private final String ByG;

  static
  {
    AppMethodBeat.i(122175);
    BFu = new b.a((byte)0);
    AppMethodBeat.o(122175);
  }

  public b(String paramString, List<? extends h> paramList)
  {
    AppMethodBeat.i(122174);
    this.ByG = paramString;
    this.BFt = paramList;
    AppMethodBeat.o(122174);
  }

  public final Collection<ah> a(f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122169);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    Object localObject = this.BFt;
    if (((List)localObject).isEmpty())
    {
      paramf = (Collection)x.AUR;
      AppMethodBeat.o(122169);
      return paramf;
    }
    Iterator localIterator = ((List)localObject).iterator();
    for (localObject = null; localIterator.hasNext(); localObject = a.i.b.a.c.m.b.a.b((Collection)localObject, ((h)localIterator.next()).a(paramf, parama)));
    if (localObject == null);
    for (paramf = (Collection)x.AUR; ; paramf = (f)localObject)
    {
      AppMethodBeat.o(122169);
      break;
    }
  }

  public final Collection<l> a(d paramd, a.f.a.b<? super f, Boolean> paramb)
  {
    AppMethodBeat.i(122171);
    a.f.b.j.p(paramd, "kindFilter");
    a.f.b.j.p(paramb, "nameFilter");
    Object localObject = this.BFt;
    if (((List)localObject).isEmpty())
    {
      paramd = (Collection)x.AUR;
      AppMethodBeat.o(122171);
      return paramd;
    }
    Iterator localIterator = ((List)localObject).iterator();
    for (localObject = null; localIterator.hasNext(); localObject = a.i.b.a.c.m.b.a.b((Collection)localObject, ((h)localIterator.next()).a(paramd, paramb)));
    if (localObject == null);
    for (paramd = (Collection)x.AUR; ; paramd = (d)localObject)
    {
      AppMethodBeat.o(122171);
      break;
    }
  }

  public final Collection<al> b(f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122170);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    Object localObject = this.BFt;
    if (((List)localObject).isEmpty())
    {
      paramf = (Collection)x.AUR;
      AppMethodBeat.o(122170);
      return paramf;
    }
    Iterator localIterator = ((List)localObject).iterator();
    for (localObject = null; localIterator.hasNext(); localObject = a.i.b.a.c.m.b.a.b((Collection)localObject, ((h)localIterator.next()).b(paramf, parama)));
    if (localObject == null);
    for (paramf = (Collection)x.AUR; ; paramf = (f)localObject)
    {
      AppMethodBeat.o(122170);
      break;
    }
  }

  public final a.i.b.a.c.b.h c(f paramf, a.i.b.a.c.c.a.a parama)
  {
    AppMethodBeat.i(122168);
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    Iterator localIterator = this.BFt.iterator();
    Object localObject = null;
    while (localIterator.hasNext())
    {
      a.i.b.a.c.b.h localh = ((h)localIterator.next()).c(paramf, parama);
      if (localh != null)
        if (((localh instanceof i)) && (((i)localh).dYk()))
        {
          if (localObject == null)
            localObject = localh;
        }
        else
        {
          AppMethodBeat.o(122168);
          localObject = localh;
        }
    }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(122168);
    }
  }

  public final Set<f> eau()
  {
    AppMethodBeat.i(122172);
    Object localObject1 = (Iterable)this.BFt;
    Object localObject2 = (Collection)new LinkedHashSet();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      a.a.j.a((Collection)localObject2, (Iterable)((h)((Iterator)localObject1).next()).eau());
    localObject2 = (Set)localObject2;
    AppMethodBeat.o(122172);
    return localObject2;
  }

  public final Set<f> eav()
  {
    AppMethodBeat.i(122173);
    Object localObject1 = (Iterable)this.BFt;
    Object localObject2 = (Collection)new LinkedHashSet();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      a.a.j.a((Collection)localObject2, (Iterable)((h)((Iterator)localObject1).next()).eav());
    localObject2 = (Set)localObject2;
    AppMethodBeat.o(122173);
    return localObject2;
  }

  public final String toString()
  {
    return this.ByG;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.e.b
 * JD-Core Version:    0.6.2
 */