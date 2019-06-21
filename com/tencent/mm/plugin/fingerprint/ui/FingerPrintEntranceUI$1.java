package com.tencent.mm.plugin.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class FingerPrintEntranceUI$1
  implements DialogInterface.OnClickListener
{
  FingerPrintEntranceUI$1(FingerPrintEntranceUI paramFingerPrintEntranceUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41655);
    ab.i("MicroMsg.FingerPrintEntranceUI", "user click the button to set system fingerprint");
    FingerPrintEntranceUI.a(this.msM);
    this.msM.finish();
    AppMethodBeat.o(41655);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI.1
 * JD-Core Version:    0.6.2
 */