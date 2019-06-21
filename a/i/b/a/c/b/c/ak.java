package a.i.b.a.c.b.c;

import a.i.b.a.c.b.am;
import a.i.b.a.c.b.l;

public abstract class ak extends aj
{
  protected final boolean BjC;
  protected a.i.b.a.c.k.g<a.i.b.a.c.i.b.f<?>> BjD;

  static
  {
    if (!ak.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public ak(l paraml, a.i.b.a.c.b.a.g paramg, a.i.b.a.c.f.f paramf, boolean paramBoolean, am paramam)
  {
    super(paraml, paramg, paramf, null, paramam);
    this.BjC = paramBoolean;
  }

  public final void a(a.i.b.a.c.k.g<a.i.b.a.c.i.b.f<?>> paramg)
  {
    assert (!this.BjC) : ("Constant value for variable initializer should be recorded only for final variables: " + this.BgZ);
    this.BjD = paramg;
  }

  public final boolean dZZ()
  {
    return this.BjC;
  }

  public final a.i.b.a.c.i.b.f<?> eaa()
  {
    if (this.BjD != null);
    for (a.i.b.a.c.i.b.f localf = (a.i.b.a.c.i.b.f)this.BjD.invoke(); ; localf = null)
      return localf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.ak
 * JD-Core Version:    0.6.2
 */