package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DynamicGridView$10 extends AnimatorListenerAdapter
{
  DynamicGridView$10(DynamicGridView paramDynamicGridView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40356);
    DynamicGridView.b(this.rLT, false);
    DynamicGridView.b(this.rLT);
    AppMethodBeat.o(40356);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40355);
    DynamicGridView.b(this.rLT, true);
    DynamicGridView.b(this.rLT);
    AppMethodBeat.o(40355);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.10
 * JD-Core Version:    0.6.2
 */