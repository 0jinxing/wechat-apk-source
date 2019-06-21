package a.i.b.a.c.i.e;

import a.f.a.b;
import a.f.b.j;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.al;
import a.i.b.a.c.b.l;
import a.i.b.a.c.f.f;
import java.util.Collection;
import java.util.Set;

public abstract class a
  implements h
{
  public Collection<ah> a(f paramf, a.i.b.a.c.c.a.a parama)
  {
    j.p(paramf, "name");
    j.p(parama, "location");
    return ejA().a(paramf, parama);
  }

  public Collection<l> a(d paramd, b<? super f, Boolean> paramb)
  {
    j.p(paramd, "kindFilter");
    j.p(paramb, "nameFilter");
    return ejA().a(paramd, paramb);
  }

  public Collection<al> b(f paramf, a.i.b.a.c.c.a.a parama)
  {
    j.p(paramf, "name");
    j.p(parama, "location");
    return ejA().b(paramf, parama);
  }

  public final a.i.b.a.c.b.h c(f paramf, a.i.b.a.c.c.a.a parama)
  {
    j.p(paramf, "name");
    j.p(parama, "location");
    return ejA().c(paramf, parama);
  }

  public final Set<f> eau()
  {
    return ejA().eau();
  }

  public final Set<f> eav()
  {
    return ejA().eav();
  }

  protected abstract h ejA();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.i.e.a
 * JD-Core Version:    0.6.2
 */