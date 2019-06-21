package com.tencent.mm.plugin.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FingerPrintAuthTransparentUI$10
  implements DialogInterface.OnClickListener
{
  FingerPrintAuthTransparentUI$10(FingerPrintAuthTransparentUI paramFingerPrintAuthTransparentUI, CheckBox paramCheckBox)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41606);
    FingerPrintAuthTransparentUI.b(this.msC, this.msk.isChecked());
    AppMethodBeat.o(41606);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthTransparentUI.10
 * JD-Core Version:    0.6.2
 */