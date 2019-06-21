package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;

final class MsgRetransmitUI$3
  implements DialogInterface.OnClickListener
{
  MsgRetransmitUI$3(MsgRetransmitUI paramMsgRetransmitUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(35063);
    if (MsgRetransmitUI.b(this.zJr) != null)
      MsgRetransmitUI.b(this.zJr).cancel();
    AppMethodBeat.o(35063);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.3
 * JD-Core Version:    0.6.2
 */