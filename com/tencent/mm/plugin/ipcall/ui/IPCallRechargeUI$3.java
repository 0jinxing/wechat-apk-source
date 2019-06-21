package com.tencent.mm.plugin.ipcall.ui;

import android.os.Message;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class IPCallRechargeUI$3 extends ak
{
  IPCallRechargeUI$3(IPCallRechargeUI paramIPCallRechargeUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(22253);
    switch (paramMessage.what)
    {
    default:
      ab.w("MicroMsg.IPCallRechargeUI", "unknow message, cannt handle.");
      AppMethodBeat.o(22253);
    case 1002:
    }
    while (true)
    {
      return;
      this.nEu.nEq.setVisibility(0);
      IPCallRechargeUI.k(this.nEu);
      AppMethodBeat.o(22253);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI.3
 * JD-Core Version:    0.6.2
 */