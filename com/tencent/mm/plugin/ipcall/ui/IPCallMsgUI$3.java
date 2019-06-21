package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.p.a;

final class IPCallMsgUI$3
  implements p.a
{
  IPCallMsgUI$3(IPCallMsgUI paramIPCallMsgUI)
  {
  }

  public final void apt()
  {
    AppMethodBeat.i(22188);
    if (IPCallMsgUI.b(this.nDt).getCount() == 0)
    {
      IPCallMsgUI.a(this.nDt).setVisibility(8);
      IPCallMsgUI.c(this.nDt).setVisibility(0);
      AppMethodBeat.o(22188);
    }
    while (true)
    {
      return;
      IPCallMsgUI.a(this.nDt).setVisibility(0);
      IPCallMsgUI.c(this.nDt).setVisibility(8);
      AppMethodBeat.o(22188);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI.3
 * JD-Core Version:    0.6.2
 */