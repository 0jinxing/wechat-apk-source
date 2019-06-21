package com.tencent.mm.ui.transmit;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.j.a;

final class MsgRetransmitUI$6
  implements j.a
{
  MsgRetransmitUI$6(MsgRetransmitUI paramMsgRetransmitUI)
  {
  }

  public final void dhi()
  {
    AppMethodBeat.i(35068);
    if (MsgRetransmitUI.f(this.zJr) != null)
    {
      MsgRetransmitUI.f(this.zJr).dismiss();
      MsgRetransmitUI.g(this.zJr);
    }
    this.zJr.finish();
    AppMethodBeat.o(35068);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.6
 * JD-Core Version:    0.6.2
 */