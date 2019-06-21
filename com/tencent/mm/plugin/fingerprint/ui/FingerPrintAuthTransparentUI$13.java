package com.tencent.mm.plugin.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FingerPrintAuthTransparentUI$13
  implements DialogInterface.OnCancelListener
{
  FingerPrintAuthTransparentUI$13(FingerPrintAuthTransparentUI paramFingerPrintAuthTransparentUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(41609);
    paramDialogInterface.dismiss();
    FingerPrintAuthTransparentUI.bxS();
    this.msC.finish();
    AppMethodBeat.o(41609);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.13
 * JD-Core Version:    0.6.2
 */