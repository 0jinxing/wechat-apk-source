package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AdLandingViewPager$e extends DataSetObserver
{
  private AdLandingViewPager$e(AdLandingViewPager paramAdLandingViewPager)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(37510);
    this.rcP.dataSetChanged();
    AppMethodBeat.o(37510);
  }

  public final void onInvalidated()
  {
    AppMethodBeat.i(37511);
    this.rcP.dataSetChanged();
    AppMethodBeat.o(37511);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager.e
 * JD-Core Version:    0.6.2
 */