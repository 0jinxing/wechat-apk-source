package android.support.v4.view;

import android.view.View;
import android.view.View.OnClickListener;

final class PagerTabStrip$1
  implements View.OnClickListener
{
  PagerTabStrip$1(PagerTabStrip paramPagerTabStrip)
  {
  }

  public final void onClick(View paramView)
  {
    this.MH.MI.setCurrentItem(this.MH.MI.getCurrentItem() - 1);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.view.PagerTabStrip.1
 * JD-Core Version:    0.6.2
 */