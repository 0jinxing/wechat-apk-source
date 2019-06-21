package com.tencent.mm.plugin.wallet_index.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class OrderHandlerUI$2
  implements DialogInterface.OnClickListener
{
  OrderHandlerUI$2(OrderHandlerUI paramOrderHandlerUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(48231);
    paramDialogInterface.dismiss();
    this.tRN.finish();
    AppMethodBeat.o(48231);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.ui.OrderHandlerUI.2
 * JD-Core Version:    0.6.2
 */