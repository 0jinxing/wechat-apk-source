package a.i.b.a.c.i.e;

import a.a.v;
import a.f.a.b;
import a.f.b.j;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.t;
import a.i.b.a.c.k.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class e extends i
{
  private final a.i.b.a.c.k.f BFY;
  protected final a.i.b.a.c.b.e BFZ;

  public e(a.i.b.a.c.k.i parami, a.i.b.a.c.b.e parame)
  {
    this.BFZ = parame;
    this.BFY = parami.i((a.f.a.a)new e.a(this));
  }

  private final List<l> ejM()
  {
    return (List)h.a(this.BFY, eQB[0]);
  }

  public final Collection<ah> a(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    j.p(paramf, "name");
    j.p(parama, "location");
    Object localObject1 = (Iterable)ejM();
    parama = (Collection)new ArrayList();
    Object localObject2 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = ((Iterator)localObject2).next();
      if ((localObject1 instanceof ah))
        parama.add(localObject1);
    }
    localObject1 = (Iterable)parama;
    parama = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      if (j.j(((ah)localObject2).dZg(), paramf))
        parama.add(localObject2);
    }
    return (Collection)parama;
  }

  public final Collection<l> a(d paramd, b<? super a.i.b.a.c.f.f, Boolean> paramb)
  {
    j.p(paramd, "kindFilter");
    j.p(paramb, "nameFilter");
    if (!paramd.UI(d.BFM.BFy));
    for (paramd = (Collection)v.AUP; ; paramd = (Collection)ejM())
      return paramd;
  }

  public final Collection<al> b(a.i.b.a.c.f.f paramf, a.i.b.a.c.c.a.a parama)
  {
    j.p(paramf, "name");
    j.p(parama, "location");
    Object localObject1 = (Iterable)ejM();
    parama = (Collection)new ArrayList();
    Object localObject2 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = ((Iterator)localObject2).next();
      if ((localObject1 instanceof al))
        parama.add(localObject1);
    }
    localObject1 = (Iterable)parama;
    parama = (Collection)new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = ((Iterator)localObject1).next();
      if (j.j(((al)localObject2).dZg(), paramf))
        parama.add(localObject2);
    }
    return (Collection)parama;
  }

  protected abstract List<t> dYw();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.e.e
 * JD-Core Version:    0.6.2
 */