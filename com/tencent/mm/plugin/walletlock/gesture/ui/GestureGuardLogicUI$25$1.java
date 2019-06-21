package com.tencent.mm.plugin.walletlock.gesture.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView;
import com.tencent.mm.sdk.platformtools.ak;

final class GestureGuardLogicUI$25$1
  implements Runnable
{
  GestureGuardLogicUI$25$1(GestureGuardLogicUI.25 param25)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(51610);
    GestureGuardLogicUI.f(this.tWb.tVW).removeCallbacks(this);
    this.tWb.tWa.tWe.cTT();
    GestureGuardLogicUI.a(this.tWb.tVW, 16);
    GestureGuardLogicUI.g(this.tWb.tVW);
    GestureGuardLogicUI.h(this.tWb.tVW);
    AppMethodBeat.o(51610);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.25.1
 * JD-Core Version:    0.6.2
 */