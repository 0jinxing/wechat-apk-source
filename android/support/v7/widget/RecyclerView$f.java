package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

public abstract class RecyclerView$f
{
  RecyclerView.f.b aor = null;
  private ArrayList<RecyclerView.f.a> aos = new ArrayList();
  public long aot = 120L;
  public long aou = 120L;
  public long aov = 250L;
  public long aow = 250L;

  static int l(RecyclerView.v paramv)
  {
    int i = RecyclerView.v.A(paramv) & 0xE;
    int j;
    if (paramv.kq())
      j = 4;
    while (true)
    {
      return j;
      j = i;
      if ((i & 0x4) == 0)
      {
        int k = paramv.apL;
        int m = paramv.kj();
        j = i;
        if (k != -1)
        {
          j = i;
          if (m != -1)
          {
            j = i;
            if (k != m)
              j = i | 0x800;
          }
        }
      }
    }
  }

  public RecyclerView.f.c a(RecyclerView.s params, RecyclerView.v paramv, int paramInt, List<Object> paramList)
  {
    return new RecyclerView.f.c().c(paramv, 0);
  }

  public final boolean a(RecyclerView.f.a parama)
  {
    boolean bool = isRunning();
    if (parama != null)
    {
      if (bool)
        break label21;
      parama.jT();
    }
    while (true)
    {
      return bool;
      label21: this.aos.add(parama);
    }
  }

  public abstract boolean a(RecyclerView.v paramv1, RecyclerView.v paramv2, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2);

  public boolean a(RecyclerView.v paramv, List<Object> paramList)
  {
    return o(paramv);
  }

  public abstract void d(RecyclerView.v paramv);

  public abstract boolean d(RecyclerView.v paramv, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2);

  public abstract boolean e(RecyclerView.v paramv, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2);

  public abstract boolean f(RecyclerView.v paramv, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2);

  public abstract void hX();

  public abstract void hZ();

  public abstract boolean isRunning();

  public final void jS()
  {
    int i = this.aos.size();
    for (int j = 0; j < i; j++)
      ((RecyclerView.f.a)this.aos.get(j)).jT();
    this.aos.clear();
  }

  public final void m(RecyclerView.v paramv)
  {
    n(paramv);
    if (this.aor != null)
      this.aor.n(paramv);
  }

  public void n(RecyclerView.v paramv)
  {
  }

  public boolean o(RecyclerView.v paramv)
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.f
 * JD-Core Version:    0.6.2
 */