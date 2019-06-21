package com.tencent.mm.plugin.order.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallOrderTransactionInfoUI$1
  implements DialogInterface.OnClickListener
{
  MallOrderTransactionInfoUI$1(MallOrderTransactionInfoUI paramMallOrderTransactionInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(43877);
    this.per.finish();
    AppMethodBeat.o(43877);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderTransactionInfoUI.1
 * JD-Core Version:    0.6.2
 */