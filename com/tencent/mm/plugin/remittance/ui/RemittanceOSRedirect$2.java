package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RemittanceOSRedirect$2
  implements DialogInterface.OnClickListener
{
  RemittanceOSRedirect$2(RemittanceOSRedirect paramRemittanceOSRedirect)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(45086);
    this.pWp.finish();
    AppMethodBeat.o(45086);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceOSRedirect.2
 * JD-Core Version:    0.6.2
 */