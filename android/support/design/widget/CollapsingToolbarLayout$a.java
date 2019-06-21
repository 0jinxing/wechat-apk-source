package android.support.design.widget;

import android.support.v4.c.a;
import android.support.v4.view.aa;
import android.support.v4.view.s;
import android.view.View;

final class CollapsingToolbarLayout$a
  implements AppBarLayout.a
{
  CollapsingToolbarLayout$a(CollapsingToolbarLayout paramCollapsingToolbarLayout)
  {
  }

  public final void H(int paramInt)
  {
    this.ph.pg = paramInt;
    int i;
    label40: View localView;
    CollapsingToolbarLayout.LayoutParams localLayoutParams;
    p localp;
    if (this.ph.mp != null)
    {
      i = this.ph.mp.getSystemWindowInsetTop();
      j = this.ph.getChildCount();
      k = 0;
      if (k >= j)
        break label160;
      localView = this.ph.getChildAt(k);
      localLayoutParams = (CollapsingToolbarLayout.LayoutParams)localView.getLayoutParams();
      localp = CollapsingToolbarLayout.m(localView);
      switch (localLayoutParams.pi)
      {
      default:
      case 1:
      case 2:
      }
    }
    while (true)
    {
      k++;
      break label40;
      i = 0;
      break;
      localp.G(a.clamp(-paramInt, 0, this.ph.n(localView)));
      continue;
      float f = -paramInt;
      localp.G(Math.round(localLayoutParams.pj * f));
    }
    label160: this.ph.bX();
    if ((this.ph.oY != null) && (i > 0))
      s.R(this.ph);
    int j = this.ph.getHeight();
    int k = s.aa(this.ph);
    this.ph.oU.i(Math.abs(paramInt) / (j - k - i));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.design.widget.CollapsingToolbarLayout.a
 * JD-Core Version:    0.6.2
 */