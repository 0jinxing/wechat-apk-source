package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.support.v4.view.ViewPager.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DummyViewPager$1 extends ViewPager.f
{
  DummyViewPager$1(DummyViewPager paramDummyViewPager)
  {
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
    AppMethodBeat.i(37593);
    super.onPageScrollStateChanged(paramInt);
    if (paramInt == 0)
      this.rcU.rcT = this.rcU.getScrollX();
    AppMethodBeat.o(37593);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager.1
 * JD-Core Version:    0.6.2
 */