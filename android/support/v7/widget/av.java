package android.support.v7.widget;

import android.view.View;

public abstract class av extends RecyclerView.f
{
  public boolean arN = true;

  public final void B(RecyclerView.v paramv)
  {
    E(paramv);
    m(paramv);
  }

  public final void C(RecyclerView.v paramv)
  {
    G(paramv);
    m(paramv);
  }

  public void D(RecyclerView.v paramv)
  {
  }

  public void E(RecyclerView.v paramv)
  {
  }

  public void F(RecyclerView.v paramv)
  {
  }

  public void G(RecyclerView.v paramv)
  {
  }

  public abstract boolean a(RecyclerView.v paramv, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public abstract boolean a(RecyclerView.v paramv1, RecyclerView.v paramv2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public boolean a(RecyclerView.v paramv1, RecyclerView.v paramv2, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    int i = paramc1.left;
    int j = paramc1.top;
    int k;
    if (paramv2.kh())
      k = paramc1.left;
    for (int m = paramc1.top; ; m = paramc2.top)
    {
      return a(paramv1, paramv2, i, j, k, m);
      k = paramc2.left;
    }
  }

  public abstract boolean b(RecyclerView.v paramv);

  public abstract boolean c(RecyclerView.v paramv);

  public boolean d(RecyclerView.v paramv, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    int i = paramc1.left;
    int j = paramc1.top;
    paramc1 = paramv.apJ;
    int k;
    int m;
    if (paramc2 == null)
    {
      k = paramc1.getLeft();
      if (paramc2 != null)
        break label107;
      m = paramc1.getTop();
      label37: if ((paramv.isRemoved()) || ((i == k) && (j == m)))
        break label116;
      paramc1.layout(k, m, paramc1.getWidth() + k, paramc1.getHeight() + m);
    }
    label107: label116: for (boolean bool = a(paramv, i, j, k, m); ; bool = b(paramv))
    {
      return bool;
      k = paramc2.left;
      break;
      m = paramc2.top;
      break label37;
    }
  }

  public boolean e(RecyclerView.v paramv, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    if ((paramc1 != null) && ((paramc1.left != paramc2.left) || (paramc1.top != paramc2.top)));
    for (boolean bool = a(paramv, paramc1.left, paramc1.top, paramc2.left, paramc2.top); ; bool = c(paramv))
      return bool;
  }

  public boolean f(RecyclerView.v paramv, RecyclerView.f.c paramc1, RecyclerView.f.c paramc2)
  {
    if ((paramc1.left != paramc2.left) || (paramc1.top != paramc2.top));
    for (boolean bool = a(paramv, paramc1.left, paramc1.top, paramc2.left, paramc2.top); ; bool = false)
    {
      return bool;
      C(paramv);
    }
  }

  public final void kQ()
  {
    this.arN = false;
  }

  public final boolean o(RecyclerView.v paramv)
  {
    if ((!this.arN) || (paramv.kq()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.av
 * JD-Core Version:    0.6.2
 */