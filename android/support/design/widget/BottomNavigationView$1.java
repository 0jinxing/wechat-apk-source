package android.support.design.widget;

import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.view.MenuItem;

final class BottomNavigationView$1
  implements h.a
{
  BottomNavigationView$1(BottomNavigationView paramBottomNavigationView)
  {
  }

  public final boolean a(h paramh, MenuItem paramMenuItem)
  {
    boolean bool = true;
    if ((BottomNavigationView.a(this.nb) != null) && (paramMenuItem.getItemId() == this.nb.getSelectedItemId()))
      BottomNavigationView.a(this.nb);
    while (true)
    {
      return bool;
      if ((BottomNavigationView.b(this.nb) == null) || (BottomNavigationView.b(this.nb).bK()))
        bool = false;
    }
  }

  public final void b(h paramh)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.design.widget.BottomNavigationView.1
 * JD-Core Version:    0.6.2
 */