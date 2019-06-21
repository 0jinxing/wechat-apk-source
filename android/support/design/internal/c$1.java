package android.support.design.internal;

import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.view.View;
import android.view.View.OnClickListener;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    paramView = (NavigationMenuItemView)paramView;
    this.lT.o(true);
    paramView = paramView.getItemData();
    boolean bool = this.lT.lo.a(paramView, this.lT, 0);
    if ((paramView != null) && (paramView.isCheckable()) && (bool))
      this.lT.lM.d(paramView);
    this.lT.o(false);
    this.lT.n(false);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.design.internal.c.1
 * JD-Core Version:    0.6.2
 */