package a.i.b.a.c.b.c;

import a.f.b.j;
import a.i.b.a.c.b.a.g.a;
import a.i.b.a.c.b.ab;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.n;
import a.i.b.a.c.b.y;
import a.i.b.a.c.f.b;
import a.i.b.a.c.f.c;
import a.v;

public abstract class x extends k
  implements ab
{
  public final b BfP;

  public x(y paramy, b paramb)
  {
    super(locall, g.a.eai(), paramb.ByQ.ehL(), am.BeR);
    this.BfP = paramb;
  }

  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    j.p(paramn, "visitor");
    return paramn.a((ab)this, paramD);
  }

  public am dYo()
  {
    am localam = am.BeR;
    j.o(localam, "SourceElement.NO_SOURCE");
    return localam;
  }

  public final y dZE()
  {
    l locall = super.dXW();
    if (locall == null)
      throw new v("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
    return (y)locall;
  }

  public final b dZF()
  {
    return this.BfP;
  }

  public String toString()
  {
    return "package " + this.BfP;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.x
 * JD-Core Version:    0.6.2
 */