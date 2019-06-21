package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class GestureGuardLogicUI$19
  implements DialogInterface.OnClickListener
{
  GestureGuardLogicUI$19(GestureGuardLogicUI paramGestureGuardLogicUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(51604);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(51604);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.GestureGuardLogicUI.19
 * JD-Core Version:    0.6.2
 */