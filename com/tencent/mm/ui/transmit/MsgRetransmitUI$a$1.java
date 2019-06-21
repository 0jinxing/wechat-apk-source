package com.tencent.mm.ui.transmit;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MsgRetransmitUI$a$1
  implements Runnable
{
  MsgRetransmitUI$a$1(MsgRetransmitUI.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35086);
    if ((this.zJH.zJD) && ((this.zJH.context instanceof Activity)))
      ((Activity)this.zJH.context).finish();
    AppMethodBeat.o(35086);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.a.1
 * JD-Core Version:    0.6.2
 */