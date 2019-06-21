package a.i.b.a.c.b.c;

import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.e;
import a.i.b.a.c.b.n;
import a.i.b.a.c.i.e.h;
import a.i.b.a.c.i.e.l;
import a.i.b.a.c.k.i;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.as;
import a.i.b.a.c.l.au;

public abstract class a
  implements e
{
  public final a.i.b.a.c.f.f BgZ;
  protected final a.i.b.a.c.k.f<ad> Bha;
  private final a.i.b.a.c.k.f<h> Bhb;
  private final a.i.b.a.c.k.f<ak> Bhc;

  static
  {
    if (!a.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public a(i parami, a.i.b.a.c.f.f paramf)
  {
    this.BgZ = paramf;
    this.Bha = parami.i(new a.1(this));
    this.Bhb = parami.i(new a.2(this));
    this.Bhc = parami.i(new a.3(this));
  }

  public h a(as paramas)
  {
    if (paramas.isEmpty());
    for (paramas = dXZ(); ; paramas = new l(dXZ(), paramas))
    {
      return paramas;
      paramas = au.d(paramas);
    }
  }

  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    return paramn.a(this, paramD);
  }

  public final ad dZf()
  {
    return (ad)this.Bha.invoke();
  }

  public final a.i.b.a.c.f.f dZg()
  {
    return this.BgZ;
  }

  public h dZk()
  {
    return (h)this.Bhb.invoke();
  }

  public final ak dZl()
  {
    return (ak)this.Bhc.invoke();
  }

  public final e dZm()
  {
    return this;
  }

  public e g(au paramau)
  {
    if (paramau.Bik.isEmpty());
    for (paramau = this; ; paramau = new s(this, paramau))
      return paramau;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.a
 * JD-Core Version:    0.6.2
 */