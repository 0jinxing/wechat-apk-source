package com.tencent.mm.plugin.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FingerPrintAuthTransparentUI$8
  implements DialogInterface.OnClickListener
{
  FingerPrintAuthTransparentUI$8(FingerPrintAuthTransparentUI paramFingerPrintAuthTransparentUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41604);
    FingerPrintAuthTransparentUI.b(this.msC, false);
    AppMethodBeat.o(41604);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.8
 * JD-Core Version:    0.6.2
 */