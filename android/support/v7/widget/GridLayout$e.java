package android.support.v7.widget;

import android.support.v4.view.u;
import android.view.View;

class GridLayout$e
{
  public int aku;
  public int akv;
  public int akw;

  GridLayout$e()
  {
    reset();
  }

  protected void V(int paramInt1, int paramInt2)
  {
    this.aku = Math.max(this.aku, paramInt1);
    this.akv = Math.max(this.akv, paramInt2);
  }

  protected int a(GridLayout paramGridLayout, View paramView, GridLayout.a parama, int paramInt, boolean paramBoolean)
  {
    return this.aku - parama.k(paramView, paramInt, u.d(paramGridLayout));
  }

  protected final void a(GridLayout paramGridLayout, View paramView, GridLayout.i parami, GridLayout.d paramd, int paramInt)
  {
    int i = this.akw;
    if ((parami.akS == GridLayout.ajw) && (parami.weight == 0.0F));
    for (int j = 0; ; j = 2)
    {
      this.akw = (j & i);
      j = parami.ag(paramd.ajQ).k(paramView, paramInt, u.d(paramGridLayout));
      V(j, paramInt - j);
      return;
    }
  }

  protected int ac(boolean paramBoolean)
  {
    if ((!paramBoolean) && (GridLayout.bN(this.akw)));
    for (int i = 100000; ; i = this.aku + this.akv)
      return i;
  }

  protected void reset()
  {
    this.aku = -2147483648;
    this.akv = -2147483648;
    this.akw = 2;
  }

  public String toString()
  {
    return "Bounds{before=" + this.aku + ", after=" + this.akv + '}';
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.GridLayout.e
 * JD-Core Version:    0.6.2
 */