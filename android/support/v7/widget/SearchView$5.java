package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnLayoutChangeListener;

final class SearchView$5
  implements View.OnLayoutChangeListener
{
  SearchView$5(SearchView paramSearchView)
  {
  }

  public final void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    paramView = this.ary;
    Rect localRect;
    if (paramView.aqK.getWidth() > 1)
    {
      Resources localResources = paramView.getContext().getResources();
      paramInt3 = paramView.aqE.getPaddingLeft();
      localRect = new Rect();
      boolean bool = bk.bW(paramView);
      if (!paramView.arc)
        break label149;
      paramInt1 = localResources.getDimensionPixelSize(2131427949);
      paramInt1 = localResources.getDimensionPixelSize(2131427950) + paramInt1;
      paramView.aqC.getDropDownBackground().getPadding(localRect);
      if (!bool)
        break label154;
    }
    label149: label154: for (paramInt2 = -localRect.left; ; paramInt2 = paramInt3 - (localRect.left + paramInt1))
    {
      paramView.aqC.setDropDownHorizontalOffset(paramInt2);
      paramInt5 = paramView.aqK.getWidth();
      paramInt4 = localRect.left;
      paramInt2 = localRect.right;
      paramView.aqC.setDropDownWidth(paramInt1 + (paramInt5 + paramInt4 + paramInt2) - paramInt3);
      return;
      paramInt1 = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.SearchView.5
 * JD-Core Version:    0.6.2
 */