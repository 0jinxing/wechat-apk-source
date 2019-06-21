package a.i.b.a.c.i.e;

import a.a.v;
import a.f.a.b;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.aw;
import a.i.b.a.c.b.l;
import a.i.b.a.c.c.a.a;
import a.i.b.a.c.f.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class i
  implements h
{
  public Collection<ah> a(f paramf, a parama)
  {
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    return (Collection)v.AUP;
  }

  public Collection<l> a(d paramd, b<? super f, Boolean> paramb)
  {
    a.f.b.j.p(paramd, "kindFilter");
    a.f.b.j.p(paramb, "nameFilter");
    return (Collection)v.AUP;
  }

  public Collection<al> b(f paramf, a parama)
  {
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    return (Collection)v.AUP;
  }

  public a.i.b.a.c.b.h c(f paramf, a parama)
  {
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    return null;
  }

  public void d(f paramf, a parama)
  {
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    j localj = (j)this;
    a.f.b.j.p(paramf, "name");
    a.f.b.j.p(parama, "location");
    localj.b(paramf, parama);
  }

  public Set<f> eau()
  {
    Object localObject1 = (Iterable)a(d.BFS, a.i.b.a.c.n.d.eku());
    Collection localCollection = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      if ((localObject2 instanceof al))
        localCollection.add(localObject2);
    }
    localObject1 = (Iterable)localCollection;
    localCollection = (Collection)new LinkedHashSet();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      localCollection.add(((al)((Iterator)localObject1).next()).dZg());
    return (Set)localCollection;
  }

  public Set<f> eav()
  {
    Object localObject1 = (Iterable)a(d.BFT, a.i.b.a.c.n.d.eku());
    Collection localCollection = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      if ((localObject2 instanceof aw))
        localCollection.add(localObject2);
    }
    localObject1 = (Iterable)localCollection;
    localCollection = (Collection)new LinkedHashSet();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      localCollection.add(((aw)((Iterator)localObject1).next()).dZg());
    return (Set)localCollection;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.e.i
 * JD-Core Version:    0.6.2
 */