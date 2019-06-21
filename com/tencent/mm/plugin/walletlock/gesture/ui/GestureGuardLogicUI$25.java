package com.tencent.mm.plugin.walletlock.gesture.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class GestureGuardLogicUI$25
  implements GestureGuardLogicUI.a
{
  GestureGuardLogicUI$25(GestureGuardLogicUI paramGestureGuardLogicUI, a parama)
  {
  }

  public final void onDone()
  {
    AppMethodBeat.i(51611);
    GestureGuardLogicUI.f(this.tVW).postDelayed(new GestureGuardLogicUI.25.1(this), 500L);
    AppMethodBeat.o(51611);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.25
 * JD-Core Version:    0.6.2
 */