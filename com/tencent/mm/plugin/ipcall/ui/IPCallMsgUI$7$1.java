package com.tencent.mm.plugin.ipcall.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class IPCallMsgUI$7$1
  implements Runnable
{
  IPCallMsgUI$7$1(IPCallMsgUI.7 param7)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22192);
    synchronized (IPCallMsgUI.b(this.nDu.nDt))
    {
      ab.v("MicroMsg.IPCallMsgUI", "comment notify");
      IPCallMsgUI.b(this.nDu.nDt).a(null, null);
      AppMethodBeat.o(22192);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI.7.1
 * JD-Core Version:    0.6.2
 */