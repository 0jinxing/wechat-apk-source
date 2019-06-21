package a.i.b.a.c.b.c;

import a.i.b.a.c.b.a.g;
import a.i.b.a.c.b.am;
import a.i.b.a.c.b.ap;
import a.i.b.a.c.b.ar;
import a.i.b.a.c.b.l;
import a.i.b.a.c.b.n;
import a.i.b.a.c.k.i;
import a.i.b.a.c.l.ad;
import a.i.b.a.c.l.an;
import a.i.b.a.c.l.ba;
import a.i.b.a.c.l.w;
import java.util.List;

public abstract class e extends k
  implements ar
{
  private final a.i.b.a.c.k.f<ad> Bha;
  final ba Bhj;
  final boolean Bhk;
  private final a.i.b.a.c.k.f<an> Bhl;
  private final int index;

  protected e(i parami, l paraml, g paramg, a.i.b.a.c.f.f paramf, ba paramba, boolean paramBoolean, int paramInt, am paramam, ap paramap)
  {
    super(paraml, paramg, paramf, paramam);
    this.Bhj = paramba;
    this.Bhk = paramBoolean;
    this.index = paramInt;
    this.Bhl = parami.i(new e.1(this, parami, paramap));
    this.Bha = parami.i(new e.2(this, parami, paramf));
  }

  protected abstract void J(w paramw);

  public final <R, D> R a(n<R, D> paramn, D paramD)
  {
    return paramn.a(this, paramD);
  }

  public final List<w> dWP()
  {
    return ((e.a)dXY()).ekh();
  }

  public final an dXY()
  {
    return (an)this.Bhl.invoke();
  }

  public final boolean dZb()
  {
    return false;
  }

  public final ar dZc()
  {
    return (ar)super.ean();
  }

  public final ad dZf()
  {
    return (ad)this.Bha.invoke();
  }

  public final ba dZh()
  {
    return this.Bhj;
  }

  public final boolean dZi()
  {
    return this.Bhk;
  }

  protected abstract List<w> eaq();

  public final int getIndex()
  {
    return this.index;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     a.i.b.a.c.b.c.e
 * JD-Core Version:    0.6.2
 */