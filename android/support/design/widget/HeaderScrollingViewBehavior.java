package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.c.a;
import android.support.v4.view.aa;
import android.support.v4.view.d;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View>
{
  final Rect qS = new Rect();
  final Rect qT = new Rect();
  int qU = 0;
  int qV;

  public HeaderScrollingViewBehavior()
  {
  }

  public HeaderScrollingViewBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramView.getLayoutParams().height;
    View localView;
    boolean bool;
    if ((i == -1) || (i == -2))
    {
      localView = f(paramCoordinatorLayout.p(paramView));
      if (localView != null)
        if ((s.al(localView)) && (!s.al(paramView)))
        {
          s.e(paramView, true);
          if (s.al(paramView))
          {
            paramView.requestLayout();
            bool = true;
          }
        }
    }
    while (true)
    {
      return bool;
      int j = View.MeasureSpec.getSize(paramInt3);
      paramInt3 = j;
      if (j == 0)
        paramInt3 = paramCoordinatorLayout.getHeight();
      int k = localView.getMeasuredHeight();
      int m = g(localView);
      if (i == -1);
      for (j = 1073741824; ; j = -2147483648)
      {
        paramCoordinatorLayout.a(paramView, paramInt1, paramInt2, View.MeasureSpec.makeMeasureSpec(m + (paramInt3 - k), j), paramInt4);
        bool = true;
        break;
      }
      bool = false;
    }
  }

  protected final void d(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    View localView = f(paramCoordinatorLayout.p(paramView));
    if (localView != null)
    {
      CoordinatorLayout.d locald = (CoordinatorLayout.d)paramView.getLayoutParams();
      Rect localRect = this.qS;
      localRect.set(paramCoordinatorLayout.getPaddingLeft() + locald.leftMargin, localView.getBottom() + locald.topMargin, paramCoordinatorLayout.getWidth() - paramCoordinatorLayout.getPaddingRight() - locald.rightMargin, paramCoordinatorLayout.getHeight() + localView.getBottom() - paramCoordinatorLayout.getPaddingBottom() - locald.bottomMargin);
      aa localaa = paramCoordinatorLayout.getLastWindowInsets();
      if ((localaa != null) && (s.al(paramCoordinatorLayout)) && (!s.al(paramView)))
      {
        localRect.left += localaa.getSystemWindowInsetLeft();
        localRect.right -= localaa.getSystemWindowInsetRight();
      }
      paramCoordinatorLayout = this.qT;
      int i = locald.gravity;
      int j = i;
      if (i == 0)
        j = 8388659;
      d.apply(j, paramView.getMeasuredWidth(), paramView.getMeasuredHeight(), localRect, paramCoordinatorLayout, paramInt);
      paramInt = r(localView);
      paramView.layout(paramCoordinatorLayout.left, paramCoordinatorLayout.top - paramInt, paramCoordinatorLayout.right, paramCoordinatorLayout.bottom - paramInt);
    }
    for (this.qU = (paramCoordinatorLayout.top - localView.getBottom()); ; this.qU = 0)
    {
      return;
      super.d(paramCoordinatorLayout, paramView, paramInt);
    }
  }

  float f(View paramView)
  {
    return 1.0F;
  }

  abstract View f(List<View> paramList);

  int g(View paramView)
  {
    return paramView.getMeasuredHeight();
  }

  final int r(View paramView)
  {
    int i = 0;
    if (this.qV == 0);
    while (true)
    {
      return i;
      i = a.clamp((int)(f(paramView) * this.qV), 0, this.qV);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.widget.HeaderScrollingViewBehavior
 * JD-Core Version:    0.6.2
 */