package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingControlView;
import com.tencent.mm.sdk.platformtools.ab;

final class o$1
  implements ViewPager.OnPageChangeListener
{
  o$1(o paramo, o.a parama)
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
    AppMethodBeat.i(37163);
    ab.i("MicroMsg.Sns.AdLandingPageGroupListComponent", "onPageSelected %d", new Object[] { Integer.valueOf(paramInt) });
    this.rav.rar.setPage(paramInt);
    o.a(this.rav, paramInt);
    if (this.rav.qZr)
    {
      this.rau.Dn(paramInt);
      this.rau.Do(paramInt);
    }
    AppMethodBeat.o(37163);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.o.1
 * JD-Core Version:    0.6.2
 */