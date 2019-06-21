package android.support.design.widget;

import android.support.v4.f.i;
import android.support.v4.view.aa;
import android.support.v4.view.o;
import android.support.v4.view.s;
import android.view.View;

final class CollapsingToolbarLayout$1
  implements o
{
  CollapsingToolbarLayout$1(CollapsingToolbarLayout paramCollapsingToolbarLayout)
  {
  }

  public final aa a(View paramView, aa paramaa)
  {
    CollapsingToolbarLayout localCollapsingToolbarLayout = this.ph;
    paramView = null;
    if (s.al(localCollapsingToolbarLayout))
      paramView = paramaa;
    if (!i.equals(localCollapsingToolbarLayout.mp, paramView))
    {
      localCollapsingToolbarLayout.mp = paramView;
      localCollapsingToolbarLayout.requestLayout();
    }
    return paramaa.et();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.widget.CollapsingToolbarLayout.1
 * JD-Core Version:    0.6.2
 */