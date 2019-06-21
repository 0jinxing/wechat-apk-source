package android.support.design.widget;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import java.lang.ref.WeakReference;

public final class TabLayout$f
  implements ViewPager.OnPageChangeListener
{
  private int mScrollState;
  private final WeakReference<TabLayout> sT;
  private int sU;

  public TabLayout$f(TabLayout paramTabLayout)
  {
    this.sT = new WeakReference(paramTabLayout);
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
    this.sU = this.mScrollState;
    this.mScrollState = paramInt;
  }

  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    boolean bool1 = false;
    TabLayout localTabLayout = (TabLayout)this.sT.get();
    if (localTabLayout != null)
      if ((this.mScrollState == 2) && (this.sU != 1))
        break label69;
    label69: for (boolean bool2 = true; ; bool2 = false)
    {
      if ((this.mScrollState != 2) || (this.sU != 0))
        bool1 = true;
      localTabLayout.a(paramInt1, paramFloat, bool2, bool1);
      return;
    }
  }

  public final void onPageSelected(int paramInt)
  {
    TabLayout localTabLayout = (TabLayout)this.sT.get();
    if ((localTabLayout != null) && (localTabLayout.getSelectedTabPosition() != paramInt) && (paramInt < localTabLayout.getTabCount()))
      if ((this.mScrollState != 0) && ((this.mScrollState != 2) || (this.sU != 0)))
        break label66;
    label66: for (boolean bool = true; ; bool = false)
    {
      localTabLayout.b(localTabLayout.ac(paramInt), bool);
      return;
    }
  }

  final void reset()
  {
    this.mScrollState = 0;
    this.sU = 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     android.support.design.widget.TabLayout.f
 * JD-Core Version:    0.6.2
 */