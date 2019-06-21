package com.tencent.mm.plugin.mmsight.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMSightRecordButton$1$1 extends AnimatorListenerAdapter
{
  MMSightRecordButton$1$1(MMSightRecordButton.1 param1)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(55090);
    ab.c("MicroMsg.MMSightRecordButton", "call onProgressFinish", new Object[0]);
    if (this.oBr.oBp != null)
      this.oBr.oBp.bnW();
    AppMethodBeat.o(55090);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.1.1
 * JD-Core Version:    0.6.2
 */