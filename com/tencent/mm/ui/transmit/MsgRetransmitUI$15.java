package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.storage.bi;

final class MsgRetransmitUI$15
  implements Runnable
{
  MsgRetransmitUI$15(MsgRetransmitUI paramMsgRetransmitUI, String paramString, j.b paramb, byte[] paramArrayOfByte, bi parambi)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35079);
    MsgRetransmitUI.a(this.zJr, this.cgl, this.zJv, this.zJw, this.fkD);
    AppMethodBeat.o(35079);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.15
 * JD-Core Version:    0.6.2
 */