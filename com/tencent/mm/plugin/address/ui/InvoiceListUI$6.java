package com.tencent.mm.plugin.address.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class InvoiceListUI$6
  implements DialogInterface.OnClickListener
{
  InvoiceListUI$6(InvoiceListUI paramInvoiceListUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(16863);
    ab.i("MicroMsg.InvoiceListUI", "dismiss DisclaimerDailog...");
    paramDialogInterface.dismiss();
    AppMethodBeat.o(16863);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.InvoiceListUI.6
 * JD-Core Version:    0.6.2
 */