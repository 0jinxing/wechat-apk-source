package android.support.design.widget;

import android.view.View;
import android.view.ViewGroup.OnHierarchyChangeListener;

final class CoordinatorLayout$c
  implements ViewGroup.OnHierarchyChangeListener
{
  CoordinatorLayout$c(CoordinatorLayout paramCoordinatorLayout)
  {
  }

  public final void onChildViewAdded(View paramView1, View paramView2)
  {
    if (this.pG.pD != null)
      this.pG.pD.onChildViewAdded(paramView1, paramView2);
  }

  public final void onChildViewRemoved(View paramView1, View paramView2)
  {
    this.pG.X(2);
    if (this.pG.pD != null)
      this.pG.pD.onChildViewRemoved(paramView1, paramView2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.design.widget.CoordinatorLayout.c
 * JD-Core Version:    0.6.2
 */