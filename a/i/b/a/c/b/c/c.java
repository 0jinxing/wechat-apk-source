package a.i.b.a.c.b.c;

import a.i.b.a.c.b.a;
import a.i.b.a.c.b.a.a;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.ay;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.n;
import a.i.b.a.c.f.f;
import a.i.b.a.c.i.e.a.h;
import a.i.b.a.c.l.as;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.w;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class c extends j
  implements ak
{
  private static final f Bhe = f.avZ("<this>");

  public c(g paramg)
  {
    super(paramg, Bhe);
  }

  public final <V> V a(a.a<V> parama)
  {
    return null;
  }

  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    return paramn.a(this, paramD);
  }

  public final ak dYQ()
  {
    return null;
  }

  public final ak dYR()
  {
    return null;
  }

  public final List<ar> dYS()
  {
    return Collections.emptyList();
  }

  public final w dYT()
  {
    return dZS();
  }

  public final List<a.i.b.a.c.b.au> dYV()
  {
    return Collections.emptyList();
  }

  public final boolean dYW()
  {
    return false;
  }

  public final Collection<? extends a> dYX()
  {
    return Collections.emptySet();
  }

  public final az dYf()
  {
    return ay.Bfb;
  }

  public final am dYo()
  {
    return am.BeR;
  }

  public final w dZS()
  {
    return dZO().dZS();
  }

  public final ak e(a.i.b.a.c.l.au paramau)
  {
    if (paramau.Bik.isEmpty())
      paramau = this;
    while (true)
    {
      return paramau;
      if ((dXW() instanceof a.i.b.a.c.b.e));
      for (w localw = paramau.c(dZS(), ba.BKj); ; localw = paramau.c(dZS(), ba.BKh))
      {
        if (localw != null)
          break label60;
        paramau = null;
        break;
      }
      label60: paramau = this;
      if (localw != dZS())
        paramau = new ac(dXW(), new h(localw), dYn());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.c
 * JD-Core Version:    0.6.2
 */