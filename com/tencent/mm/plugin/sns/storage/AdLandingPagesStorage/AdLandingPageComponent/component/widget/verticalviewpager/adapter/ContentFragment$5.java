package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ContentFragment$5 extends AnimatorListenerAdapter
{
  ContentFragment$5(ContentFragment paramContentFragment)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(37621);
    ab.d("ContentFragment", "onAnimationEnd show nextBtn");
    ContentFragment.a(this.rdr).rdy = false;
    AppMethodBeat.o(37621);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(37620);
    ab.d("ContentFragment", "onAnimationStart show nextBtn");
    ContentFragment.a(this.rdr).rdy = true;
    AppMethodBeat.o(37620);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.5
 * JD-Core Version:    0.6.2
 */