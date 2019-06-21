package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MsgRetransmitUI$17
  implements DialogInterface.OnClickListener
{
  MsgRetransmitUI$17(MsgRetransmitUI paramMsgRetransmitUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(35081);
    this.zJr.finish();
    AppMethodBeat.o(35081);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.17
 * JD-Core Version:    0.6.2
 */