package com.tencent.mm.plugin.sns.ui;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.b;

final class SnsAdNativeLandingPagesUI$13
  implements ContentFragment.a
{
  SnsAdNativeLandingPagesUI$13(SnsAdNativeLandingPagesUI paramSnsAdNativeLandingPagesUI)
  {
  }

  public final void n(ContentFragment paramContentFragment)
  {
    AppMethodBeat.i(38643);
    if (paramContentFragment.rdo != null);
    for (paramContentFragment = paramContentFragment.rdo.iJP; ; paramContentFragment = null)
    {
      if (paramContentFragment != null)
        paramContentFragment.getViewTreeObserver().addOnPreDrawListener(new SnsAdNativeLandingPagesUI.13.1(this, paramContentFragment));
      AppMethodBeat.o(38643);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.13
 * JD-Core Version:    0.6.2
 */