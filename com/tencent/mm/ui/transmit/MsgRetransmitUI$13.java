package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MsgRetransmitUI$13
  implements DialogInterface.OnCancelListener
{
  MsgRetransmitUI$13(MsgRetransmitUI paramMsgRetransmitUI, MsgRetransmitUI.a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(35076);
    this.yMm.zJA = true;
    this.zJr.finish();
    AppMethodBeat.o(35076);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.13
 * JD-Core Version:    0.6.2
 */