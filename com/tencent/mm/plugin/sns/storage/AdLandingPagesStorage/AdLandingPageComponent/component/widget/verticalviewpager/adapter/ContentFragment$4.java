package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

final class ContentFragment$4
  implements ValueAnimator.AnimatorUpdateListener
{
  ContentFragment$4(ContentFragment paramContentFragment)
  {
  }

  public final void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(37619);
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    ContentFragment.a(this.rdr).rdx.setTranslationY((int)(f * -a.fromDPToPix(this.rdr.getContext(), 5)));
    AppMethodBeat.o(37619);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.adapter.ContentFragment.4
 * JD-Core Version:    0.6.2
 */