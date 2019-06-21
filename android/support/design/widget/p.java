package android.support.design.widget;

import android.support.v4.view.s;
import android.view.View;

final class p
{
  private final View mView;
  int ua;
  private int ub;
  int uc;
  int ud;

  public p(View paramView)
  {
    this.mView = paramView;
  }

  public final boolean G(int paramInt)
  {
    if (this.uc != paramInt)
    {
      this.uc = paramInt;
      cE();
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void cD()
  {
    this.ua = this.mView.getTop();
    this.ub = this.mView.getLeft();
    cE();
  }

  final void cE()
  {
    s.q(this.mView, this.uc - (this.mView.getTop() - this.ua));
    s.r(this.mView, this.ud - (this.mView.getLeft() - this.ub));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.design.widget.p
 * JD-Core Version:    0.6.2
 */