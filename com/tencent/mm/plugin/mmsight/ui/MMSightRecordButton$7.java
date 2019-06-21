package com.tencent.mm.plugin.mmsight.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MMSightRecordButton$7 extends AnimatorListenerAdapter
{
  MMSightRecordButton$7(MMSightRecordButton paramMMSightRecordButton, long paramLong)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(55099);
    if ((MMSightRecordButton.g(this.oBq) > 0L) && (this.oBt <= 500L))
    {
      ab.i("MicroMsg.MMSightRecordButton", "on Simple Tap, isDispatchSimpleTap: %s, isDispatchLongPress: %s", new Object[] { Boolean.valueOf(MMSightRecordButton.a(this.oBq)), Boolean.valueOf(MMSightRecordButton.b(this.oBq)) });
      MMSightRecordButton.h(this.oBq);
      if ((MMSightRecordButton.b(this.oBq)) || (MMSightRecordButton.i(this.oBq) == null))
        break label187;
      MMSightRecordButton.i(this.oBq).bnX();
      AppMethodBeat.o(55099);
    }
    while (true)
    {
      return;
      if (MMSightRecordButton.b(this.oBq))
      {
        ab.i("MicroMsg.MMSightRecordButton", "on Long Press finish");
        if (MMSightRecordButton.d(this.oBq) != null)
        {
          MMSightRecordButton.d(this.oBq).bnU();
          AppMethodBeat.o(55099);
        }
      }
      else
      {
        ab.i("MicroMsg.MMSightRecordButton", "error action up");
        if (MMSightRecordButton.j(this.oBq) != null)
          MMSightRecordButton.j(this.oBq).bQu();
        label187: AppMethodBeat.o(55099);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.7
 * JD-Core Version:    0.6.2
 */