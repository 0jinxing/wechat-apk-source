package a.i.b.a.c.b.c;

import a.i.b.a.c.b.a.a;
import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.ag;
import a.i.b.a.c.b.ah;
import a.i.b.a.c.b.ak;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.az;
import a.i.b.a.c.b.b;
import a.i.b.a.c.b.b.a;
import a.i.b.a.c.b.t;
import a.i.b.a.c.b.t.a;
import a.i.b.a.c.b.w;
import a.i.b.a.c.f.f;
import a.i.b.a.c.l.au;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class y extends k
  implements ag
{
  public final ah BhL;
  public az BhQ;
  public final boolean BhT;
  public final boolean Bhu;
  public final w Bhv;
  private final b.a Bif;
  public t Big = null;
  public boolean isDefault;

  static
  {
    if (!y.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      $assertionsDisabled = bool;
      return;
    }
  }

  public y(w paramw, az paramaz, ah paramah, g paramg, f paramf, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, b.a parama, am paramam)
  {
    super(paramah.dXW(), paramg, paramf, paramam);
    this.Bhv = paramw;
    this.BhQ = paramaz;
    this.BhL = paramah;
    this.isDefault = paramBoolean1;
    this.Bhu = paramBoolean2;
    this.BhT = paramBoolean3;
    this.Bif = parama;
  }

  public final <V> V a(a.a<V> parama)
  {
    return null;
  }

  public final t c(au paramau)
  {
    throw new UnsupportedOperationException();
  }

  public final ak dYQ()
  {
    return this.BhL.dYQ();
  }

  public final ak dYR()
  {
    return this.BhL.dYR();
  }

  public final List<ar> dYS()
  {
    return Collections.emptyList();
  }

  public final boolean dYW()
  {
    return false;
  }

  public final b.a dYZ()
  {
    return this.Bif;
  }

  public final w dYd()
  {
    return this.Bhv;
  }

  public final az dYf()
  {
    return this.BhQ;
  }

  public final boolean dYj()
  {
    return this.BhT;
  }

  public final boolean dYk()
  {
    return false;
  }

  public final boolean dYl()
  {
    return false;
  }

  public final boolean dYm()
  {
    return this.Bhu;
  }

  public final boolean dYx()
  {
    return false;
  }

  public final ah dZH()
  {
    return this.BhL;
  }

  public final t dZq()
  {
    return this.Big;
  }

  public final boolean dZr()
  {
    return false;
  }

  public final boolean dZs()
  {
    return false;
  }

  public final boolean dZt()
  {
    return false;
  }

  public final boolean dZu()
  {
    return false;
  }

  public final boolean dZv()
  {
    return false;
  }

  public final t.a<? extends t> dZw()
  {
    throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
  }

  public abstract ag eaG();

  public final boolean isDefault()
  {
    return this.isDefault;
  }

  public final void k(Collection<? extends b> paramCollection)
  {
    assert (paramCollection.isEmpty()) : "Overridden accessors should be empty";
  }

  protected final Collection<ag> rJ(boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList(0);
    Iterator localIterator = this.BhL.dYX().iterator();
    label84: 
    while (localIterator.hasNext())
    {
      Object localObject = (ah)localIterator.next();
      if (paramBoolean);
      for (localObject = ((ah)localObject).dZI(); ; localObject = ((ah)localObject).dZJ())
      {
        if (localObject == null)
          break label84;
        localArrayList.add(localObject);
        break;
      }
    }
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.y
 * JD-Core Version:    0.6.2
 */