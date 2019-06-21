package android.support.constraint.a.a;

import android.support.constraint.a.c;
import java.util.ArrayList;

public class q extends f
{
  protected ArrayList<f> kx = new ArrayList();

  public final void a(c paramc)
  {
    super.a(paramc);
    int i = this.kx.size();
    for (int j = 0; j < i; j++)
      ((f)this.kx.get(j)).a(paramc);
  }

  public final void aU()
  {
    super.aU();
    if (this.kx == null);
    while (true)
    {
      return;
      int i = this.kx.size();
      for (int j = 0; j < i; j++)
      {
        f localf = (f)this.kx.get(j);
        localf.setOffset(aO(), aP());
        if (!(localf instanceof g))
          localf.aU();
      }
    }
  }

  public void aZ()
  {
    aU();
    if (this.kx == null);
    while (true)
    {
      return;
      int i = this.kx.size();
      for (int j = 0; j < i; j++)
      {
        f localf = (f)this.kx.get(j);
        if ((localf instanceof q))
          ((q)localf).aZ();
      }
    }
  }

  public final void bh()
  {
    this.kx.clear();
  }

  public final void e(f paramf)
  {
    this.kx.add(paramf);
    if (paramf.iG != null)
      ((q)paramf.iG).f(paramf);
    paramf.iG = this;
  }

  public final void f(f paramf)
  {
    this.kx.remove(paramf);
    paramf.iG = null;
  }

  public void reset()
  {
    this.kx.clear();
    super.reset();
  }

  public final void setOffset(int paramInt1, int paramInt2)
  {
    super.setOffset(paramInt1, paramInt2);
    paramInt2 = this.kx.size();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
      ((f)this.kx.get(paramInt1)).setOffset(aQ(), aR());
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.constraint.a.a.q
 * JD-Core Version:    0.6.2
 */