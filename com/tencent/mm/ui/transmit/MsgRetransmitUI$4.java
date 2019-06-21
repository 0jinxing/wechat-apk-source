package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

final class MsgRetransmitUI$4
  implements DialogInterface.OnCancelListener
{
  MsgRetransmitUI$4(MsgRetransmitUI paramMsgRetransmitUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(35066);
    h.a(this.zJr, 2131301506, 2131297061, 2131297088, 2131296990, new MsgRetransmitUI.4.1(this), new MsgRetransmitUI.4.2(this));
    AppMethodBeat.o(35066);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.4
 * JD-Core Version:    0.6.2
 */