package com.tencent.mm.plugin.sns.ui.previewimageview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class DynamicGridView$9 extends AnimatorListenerAdapter
{
  DynamicGridView$9(DynamicGridView paramDynamicGridView, View paramView)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(40354);
    DynamicGridView.a(this.rLT, false);
    DynamicGridView.b(this.rLT);
    if ((DynamicGridView.c(this.rLT) != null) && (DynamicGridView.d(this.rLT) != null))
      DynamicGridView.d(this.rLT).cvd();
    DynamicGridView.a(this.rLT, this.rLY);
    AppMethodBeat.o(40354);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(40353);
    DynamicGridView.a(this.rLT, true);
    DynamicGridView.b(this.rLT);
    AppMethodBeat.o(40353);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView.9
 * JD-Core Version:    0.6.2
 */