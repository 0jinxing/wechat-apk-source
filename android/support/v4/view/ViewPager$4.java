package android.support.v4.view;

import android.graphics.Rect;
import android.view.View;

final class ViewPager$4
  implements o
{
  private final Rect mTempRect = new Rect();

  ViewPager$4(ViewPager paramViewPager)
  {
  }

  public final aa a(View paramView, aa paramaa)
  {
    paramView = s.a(paramView, paramaa);
    if (paramView.isConsumed());
    while (true)
    {
      return paramView;
      paramaa = this.mTempRect;
      paramaa.left = paramView.getSystemWindowInsetLeft();
      paramaa.top = paramView.getSystemWindowInsetTop();
      paramaa.right = paramView.getSystemWindowInsetRight();
      paramaa.bottom = paramView.getSystemWindowInsetBottom();
      int i = 0;
      int j = this.Np.getChildCount();
      while (i < j)
      {
        aa localaa = s.b(this.Np.getChildAt(i), paramView);
        paramaa.left = Math.min(localaa.getSystemWindowInsetLeft(), paramaa.left);
        paramaa.top = Math.min(localaa.getSystemWindowInsetTop(), paramaa.top);
        paramaa.right = Math.min(localaa.getSystemWindowInsetRight(), paramaa.right);
        paramaa.bottom = Math.min(localaa.getSystemWindowInsetBottom(), paramaa.bottom);
        i++;
      }
      paramView = paramView.f(paramaa.left, paramaa.top, paramaa.right, paramaa.bottom);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.view.ViewPager.4
 * JD-Core Version:    0.6.2
 */