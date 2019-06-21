package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.a.a;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

public class AppBarLayout$ScrollingViewBehavior extends HeaderScrollingViewBehavior
{
  public AppBarLayout$ScrollingViewBehavior()
  {
  }

  public AppBarLayout$ScrollingViewBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.a.ScrollingViewBehavior_Layout);
    this.qV = paramContext.getDimensionPixelSize(0, 0);
    paramContext.recycle();
  }

  private static AppBarLayout e(List<View> paramList)
  {
    int i = paramList.size();
    int j = 0;
    View localView;
    if (j < i)
    {
      localView = (View)paramList.get(j);
      if (!(localView instanceof AppBarLayout));
    }
    for (paramList = (AppBarLayout)localView; ; paramList = null)
    {
      return paramList;
      j++;
      break;
    }
  }

  public final boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, Rect paramRect, boolean paramBoolean)
  {
    boolean bool = true;
    AppBarLayout localAppBarLayout = e(paramCoordinatorLayout.p(paramView));
    if (localAppBarLayout != null)
    {
      paramRect.offset(paramView.getLeft(), paramView.getTop());
      paramView = this.qS;
      paramView.set(0, 0, paramCoordinatorLayout.getWidth(), paramCoordinatorLayout.getHeight());
      if (!paramView.contains(paramRect))
        if (!paramBoolean)
        {
          paramBoolean = true;
          localAppBarLayout.d(false, paramBoolean, true);
        }
    }
    for (paramBoolean = bool; ; paramBoolean = false)
    {
      return paramBoolean;
      paramBoolean = false;
      break;
    }
  }

  public final boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2)
  {
    paramCoordinatorLayout = ((CoordinatorLayout.d)paramView2.getLayoutParams()).pH;
    if ((paramCoordinatorLayout instanceof AppBarLayout.Behavior))
    {
      paramCoordinatorLayout = (AppBarLayout.Behavior)paramCoordinatorLayout;
      int i = paramView2.getBottom();
      int j = paramView1.getTop();
      s.q(paramView1, AppBarLayout.Behavior.a(paramCoordinatorLayout) + (i - j) + this.qU - r(paramView2));
    }
    return false;
  }

  public final boolean e(View paramView)
  {
    return paramView instanceof AppBarLayout;
  }

  final float f(View paramView)
  {
    int i;
    int j;
    int k;
    float f;
    if ((paramView instanceof AppBarLayout))
    {
      paramView = (AppBarLayout)paramView;
      i = paramView.getTotalScrollRange();
      j = paramView.getDownNestedPreScrollRange();
      paramView = ((CoordinatorLayout.d)paramView.getLayoutParams()).pH;
      if ((paramView instanceof AppBarLayout.Behavior))
      {
        k = ((AppBarLayout.Behavior)paramView).bz();
        if ((j == 0) || (i + k > j))
          break label73;
        f = 0.0F;
      }
    }
    while (true)
    {
      return f;
      k = 0;
      break;
      label73: j = i - j;
      if (j != 0)
        f = k / j + 1.0F;
      else
        f = 0.0F;
    }
  }

  final int g(View paramView)
  {
    if ((paramView instanceof AppBarLayout));
    for (int i = ((AppBarLayout)paramView).getTotalScrollRange(); ; i = super.g(paramView))
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.widget.AppBarLayout.ScrollingViewBehavior
 * JD-Core Version:    0.6.2
 */