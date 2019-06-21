package com.tencent.mm.plugin.mmsight.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMSightRecordButton$2 extends AnimatorListenerAdapter
{
  MMSightRecordButton$2(MMSightRecordButton paramMMSightRecordButton)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(55093);
    MMSightRecordButton.a(this.oBq, false);
    if (this.oBs != null)
      this.oBs.onAnimationEnd(paramAnimator);
    AppMethodBeat.o(55093);
  }

  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(55092);
    MMSightRecordButton.a(this.oBq, true);
    if (this.oBs != null)
      this.oBs.onAnimationStart(paramAnimator);
    AppMethodBeat.o(55092);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.2
 * JD-Core Version:    0.6.2
 */