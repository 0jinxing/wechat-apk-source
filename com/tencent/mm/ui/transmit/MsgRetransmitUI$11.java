package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.y.a;

final class MsgRetransmitUI$11
  implements Runnable
{
  MsgRetransmitUI$11(MsgRetransmitUI paramMsgRetransmitUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35074);
    o.alq().a(this.zJr.fileName, new MsgRetransmitUI.11.1(this));
    AppMethodBeat.o(35074);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.11
 * JD-Core Version:    0.6.2
 */