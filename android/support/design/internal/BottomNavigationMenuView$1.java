package android.support.design.internal;

import android.support.v7.view.menu.h;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

final class BottomNavigationMenuView$1
  implements View.OnClickListener
{
  BottomNavigationMenuView$1(BottomNavigationMenuView paramBottomNavigationMenuView)
  {
  }

  public final void onClick(View paramView)
  {
    paramView = ((BottomNavigationItemView)paramView).getItemData();
    if (!BottomNavigationMenuView.b(this.lp).a(paramView, BottomNavigationMenuView.a(this.lp), 0))
      paramView.setChecked(true);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.design.internal.BottomNavigationMenuView.1
 * JD-Core Version:    0.6.2
 */