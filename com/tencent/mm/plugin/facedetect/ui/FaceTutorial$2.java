package com.tencent.mm.plugin.facedetect.ui;

import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FaceTutorial$2
  implements ViewPager.OnPageChangeListener
{
  FaceTutorial$2(FaceTutorial paramFaceTutorial)
  {
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
  }

  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(517);
    if (this.lYr.MI.getParent() != null)
      this.lYr.MI.getParent().requestDisallowInterceptTouchEvent(true);
    AppMethodBeat.o(517);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceTutorial.2
 * JD-Core Version:    0.6.2
 */