package com.tencent.mm.plugin.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FingerPrintEntranceUI$2
  implements DialogInterface.OnClickListener
{
  FingerPrintEntranceUI$2(FingerPrintEntranceUI paramFingerPrintEntranceUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41656);
    this.msM.finish();
    AppMethodBeat.o(41656);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintEntranceUI.2
 * JD-Core Version:    0.6.2
 */