package com.tencent.mm.plugin.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FingerPrintAuthTransparentUI$4
  implements DialogInterface.OnClickListener
{
  FingerPrintAuthTransparentUI$4(FingerPrintAuthTransparentUI paramFingerPrintAuthTransparentUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41600);
    ab.i("MicroMsg.FingerPrintAuthTransparentUI", "try fingerprint auth again!");
    FingerPrintAuthTransparentUI.d(this.msC);
    FingerPrintAuthTransparentUI.a(this.msC, false);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(41600);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.4
 * JD-Core Version:    0.6.2
 */