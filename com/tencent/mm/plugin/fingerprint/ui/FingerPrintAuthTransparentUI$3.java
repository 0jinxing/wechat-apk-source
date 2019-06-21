package com.tencent.mm.plugin.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FingerPrintAuthTransparentUI$3
  implements DialogInterface.OnClickListener
{
  FingerPrintAuthTransparentUI$3(FingerPrintAuthTransparentUI paramFingerPrintAuthTransparentUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41599);
    ab.i("MicroMsg.FingerPrintAuthTransparentUI", "showErrorAlert, finish ui!");
    paramDialogInterface.dismiss();
    this.msC.finish();
    AppMethodBeat.o(41599);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.3
 * JD-Core Version:    0.6.2
 */