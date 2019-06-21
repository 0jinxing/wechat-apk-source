package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.j;

final class MsgRetransmitUI$7
  implements DialogInterface.OnCancelListener
{
  MsgRetransmitUI$7(MsgRetransmitUI paramMsgRetransmitUI, j paramj)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(35069);
    this.yTe.dhb();
    this.zJr.zJq = true;
    this.zJr.finish();
    AppMethodBeat.o(35069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.7
 * JD-Core Version:    0.6.2
 */