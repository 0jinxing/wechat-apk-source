package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView;

final class GestureGuardLogicUI$4
  implements DialogInterface.OnCancelListener
{
  GestureGuardLogicUI$4(GestureGuardLogicUI paramGestureGuardLogicUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(51589);
    GestureGuardLogicUI.l(this.tVW)[GestureGuardLogicUI.m(this.tVW)].tWe.cTT();
    if ((GestureGuardLogicUI.n(this.tVW) != null) && (!GestureGuardLogicUI.n(this.tVW).bqV))
      g.Rg().c(GestureGuardLogicUI.n(this.tVW));
    AppMethodBeat.o(51589);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.4
 * JD-Core Version:    0.6.2
 */