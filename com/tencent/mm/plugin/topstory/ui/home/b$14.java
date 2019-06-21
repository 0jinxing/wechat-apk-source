package com.tencent.mm.plugin.topstory.ui.home;

import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.e;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.ui.widget.TopStoryViewPager;
import com.tencent.mm.sdk.platformtools.ab;

final class b$14
  implements ViewPager.OnPageChangeListener
{
  b$14(b paramb, TabLayout paramTabLayout)
  {
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
    AppMethodBeat.i(1598);
    ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "onPageScrollStateChanged:".concat(String.valueOf(paramInt)));
    if (paramInt == 0)
      if (this.sCf.sBZ)
      {
        paramInt = this.sCf.sBW;
        this.sCf.sBU.postDelayed(new b.14.1(this, paramInt), 100L);
        AppMethodBeat.o(1598);
      }
    while (true)
    {
      return;
      this.sCf.sBZ = true;
      AppMethodBeat.o(1598);
    }
  }

  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(1597);
    ab.i("MicroMsg.TopStory.TopStoryUIComponentImpl", "onPageSelected:".concat(String.valueOf(paramInt)));
    this.sCf.al(paramInt, true);
    if (!this.sCs.ac(paramInt).isSelected())
      this.sCs.ac(paramInt).select();
    AppMethodBeat.o(1597);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.b.14
 * JD-Core Version:    0.6.2
 */