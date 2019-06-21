package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.g;
import com.tencent.mm.ai.m;
import com.tencent.mm.ui.widget.a.c;

final class MsgRetransmitUI$2
  implements g
{
  MsgRetransmitUI$2(MsgRetransmitUI paramMsgRetransmitUI)
  {
  }

  public final void a(int paramInt1, int paramInt2, m paramm)
  {
    AppMethodBeat.i(35062);
    if ((MsgRetransmitUI.b(this.zJr) == null) || (paramInt2 == 0))
      AppMethodBeat.o(35062);
    while (true)
    {
      return;
      paramInt1 = (int)(paramInt1 * 100L / paramInt2);
      MsgRetransmitUI.b(this.zJr).setMessage(this.zJr.getString(2131301512, new Object[] { Integer.valueOf(MsgRetransmitUI.c(this.zJr)), Integer.valueOf(MsgRetransmitUI.d(this.zJr)), Integer.valueOf(paramInt1) }));
      AppMethodBeat.o(35062);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.2
 * JD-Core Version:    0.6.2
 */