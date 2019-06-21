package com.tencent.mm.plugin.fingerprint.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.a;

final class FingerPrintAuthUI$4$1
  implements DialogInterface.OnClickListener
{
  FingerPrintAuthUI$4$1(FingerPrintAuthUI.4 param4)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41635);
    a.b(this.msK.msI, new Bundle(), this.msK.crd);
    AppMethodBeat.o(41635);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI.4.1
 * JD-Core Version:    0.6.2
 */