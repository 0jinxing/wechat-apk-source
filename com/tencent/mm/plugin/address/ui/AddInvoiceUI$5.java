package com.tencent.mm.plugin.address.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AddInvoiceUI$5
  implements DialogInterface.OnClickListener
{
  AddInvoiceUI$5(AddInvoiceUI paramAddInvoiceUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(16791);
    this.gJA.setResult(0);
    this.gJA.finish();
    AppMethodBeat.o(16791);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.AddInvoiceUI.5
 * JD-Core Version:    0.6.2
 */