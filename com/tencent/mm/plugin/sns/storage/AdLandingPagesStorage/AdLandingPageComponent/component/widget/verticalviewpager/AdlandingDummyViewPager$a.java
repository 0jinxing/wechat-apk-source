package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.Set;

final class AdlandingDummyViewPager$a
  implements ViewPager.OnPageChangeListener
{
  private AdlandingDummyViewPager$a(AdlandingDummyViewPager paramAdlandingDummyViewPager)
  {
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
    AppMethodBeat.i(37591);
    if (paramInt == 0)
      this.rcS.rcT = this.rcS.getScrollX();
    Iterator localIterator = AdlandingDummyViewPager.a(this.rcS).iterator();
    while (localIterator.hasNext())
      ((ViewPager.OnPageChangeListener)localIterator.next()).onPageScrollStateChanged(paramInt);
    AppMethodBeat.o(37591);
  }

  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    AppMethodBeat.i(37589);
    Iterator localIterator = AdlandingDummyViewPager.a(this.rcS).iterator();
    while (localIterator.hasNext())
      ((ViewPager.OnPageChangeListener)localIterator.next()).onPageScrolled(paramInt1, paramFloat, paramInt2);
    AppMethodBeat.o(37589);
  }

  public final void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(37590);
    Iterator localIterator = AdlandingDummyViewPager.a(this.rcS).iterator();
    while (localIterator.hasNext())
      ((ViewPager.OnPageChangeListener)localIterator.next()).onPageSelected(paramInt);
    AppMethodBeat.o(37590);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager.a
 * JD-Core Version:    0.6.2
 */