package com.tencent.mm.plugin.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FingerPrintAuthTransparentUI$2
  implements DialogInterface.OnClickListener
{
  FingerPrintAuthTransparentUI$2(FingerPrintAuthTransparentUI paramFingerPrintAuthTransparentUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41598);
    paramDialogInterface.dismiss();
    ab.i("MicroMsg.FingerPrintAuthTransparentUI", "showSuccessAlert, finish ui!");
    this.msC.finish();
    AppMethodBeat.o(41598);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.2
 * JD-Core Version:    0.6.2
 */