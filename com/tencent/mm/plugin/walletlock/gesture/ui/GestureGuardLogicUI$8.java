package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView;

final class GestureGuardLogicUI$8
  implements DialogInterface.OnCancelListener
{
  GestureGuardLogicUI$8(GestureGuardLogicUI paramGestureGuardLogicUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(51593);
    GestureGuardLogicUI.l(this.tVW)[GestureGuardLogicUI.m(this.tVW)].tWe.cTT();
    if ((GestureGuardLogicUI.p(this.tVW) != null) && (!GestureGuardLogicUI.p(this.tVW).bqV))
      g.Rg().c(GestureGuardLogicUI.p(this.tVW));
    AppMethodBeat.o(51593);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.8
 * JD-Core Version:    0.6.2
 */