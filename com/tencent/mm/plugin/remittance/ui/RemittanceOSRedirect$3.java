package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemittanceOSRedirect$3
  implements DialogInterface.OnClickListener
{
  RemittanceOSRedirect$3(RemittanceOSRedirect paramRemittanceOSRedirect)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45087);
    this.pWp.finish();
    AppMethodBeat.o(45087);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceOSRedirect.3
 * JD-Core Version:    0.6.2
 */