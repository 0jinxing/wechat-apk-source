package android.support.v4.view;

import android.view.View;
import android.view.View.OnClickListener;

final class PagerTabStrip$2
  implements View.OnClickListener
{
  PagerTabStrip$2(PagerTabStrip paramPagerTabStrip)
  {
  }

  public final void onClick(View paramView)
  {
    this.MH.MI.setCurrentItem(this.MH.MI.getCurrentItem() + 1);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.view.PagerTabStrip.2
 * JD-Core Version:    0.6.2
 */