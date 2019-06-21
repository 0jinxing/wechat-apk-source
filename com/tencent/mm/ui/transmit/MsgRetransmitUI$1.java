package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class MsgRetransmitUI$1
  implements Runnable
{
  MsgRetransmitUI$1(MsgRetransmitUI paramMsgRetransmitUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35061);
    ab.i("MicroMsg.MsgRetransmitUI", "test before sendMutiImage");
    MsgRetransmitUI.a(this.zJr, this.eiH);
    AppMethodBeat.o(35061);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.1
 * JD-Core Version:    0.6.2
 */