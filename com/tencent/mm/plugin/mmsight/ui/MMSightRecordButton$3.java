package com.tencent.mm.plugin.mmsight.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMSightRecordButton$3 extends AnimatorListenerAdapter
{
  MMSightRecordButton$3(MMSightRecordButton paramMMSightRecordButton, AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(55095);
    MMSightRecordButton.a(this.oBq, false);
    if (this.oBs != null)
      this.oBs.onAnimationEnd(paramAnimator);
    AppMethodBeat.o(55095);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(55094);
    MMSightRecordButton.a(this.oBq, true);
    if (this.oBs != null)
      this.oBs.onAnimationStart(paramAnimator);
    AppMethodBeat.o(55094);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.3
 * JD-Core Version:    0.6.2
 */