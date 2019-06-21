package android.support.design.widget;

import android.support.v4.f.i;
import android.support.v4.view.aa;
import android.support.v4.view.o;
import android.support.v4.view.s;
import android.view.View;

final class AppBarLayout$1
  implements o
{
  AppBarLayout$1(AppBarLayout paramAppBarLayout)
  {
  }

  public final aa a(View paramView, aa paramaa)
  {
    AppBarLayout localAppBarLayout = this.mu;
    paramView = null;
    if (s.al(localAppBarLayout))
      paramView = paramaa;
    if (!i.equals(localAppBarLayout.mp, paramView))
    {
      localAppBarLayout.mp = paramView;
      localAppBarLayout.by();
    }
    return paramaa;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.design.widget.AppBarLayout.1
 * JD-Core Version:    0.6.2
 */