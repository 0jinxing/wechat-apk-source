package a.i.b.a.c.m;

import a.f.b.j;
import a.i.b.a.c.a.g;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.t;
import a.i.b.a.c.i.c.a;
import a.i.b.a.c.l.w;

public abstract class k
  implements b
{
  private final a.f.a.b<g, w> BMz;
  private final String description;
  private final String name;

  private k(String paramString, a.f.a.b<? super g, ? extends w> paramb)
  {
    this.name = paramString;
    this.BMz = paramb;
    this.description = ("must return " + this.name);
  }

  public final String getDescription()
  {
    return this.description;
  }

  public final boolean h(t paramt)
  {
    j.p(paramt, "functionDescriptor");
    return j.j(paramt.dYT(), (w)this.BMz.am(a.G((l)paramt)));
  }

  public final String i(t paramt)
  {
    j.p(paramt, "functionDescriptor");
    return b.a.a(this, paramt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.m.k
 * JD-Core Version:    0.6.2
 */