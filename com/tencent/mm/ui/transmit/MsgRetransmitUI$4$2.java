package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;

final class MsgRetransmitUI$4$2
  implements DialogInterface.OnClickListener
{
  MsgRetransmitUI$4$2(MsgRetransmitUI.4 param4)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(35065);
    if (MsgRetransmitUI.b(this.zJs.zJr) != null)
      MsgRetransmitUI.b(this.zJs.zJr).show();
    AppMethodBeat.o(35065);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.4.2
 * JD-Core Version:    0.6.2
 */