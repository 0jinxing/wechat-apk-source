package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MsgRetransmitUI$16
  implements DialogInterface.OnClickListener
{
  MsgRetransmitUI$16(MsgRetransmitUI paramMsgRetransmitUI, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(35080);
    MsgRetransmitUI.a(this.zJr, this.zJr.getIntent(), this.eiH);
    AppMethodBeat.o(35080);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.16
 * JD-Core Version:    0.6.2
 */