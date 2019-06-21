package com.tencent.mm.plugin.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.a;

final class FingerPrintAuthUI$5
  implements DialogInterface.OnClickListener
{
  FingerPrintAuthUI$5(FingerPrintAuthUI paramFingerPrintAuthUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41637);
    a.b(this.msI, new Bundle(), -1);
    AppMethodBeat.o(41637);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI.5
 * JD-Core Version:    0.6.2
 */