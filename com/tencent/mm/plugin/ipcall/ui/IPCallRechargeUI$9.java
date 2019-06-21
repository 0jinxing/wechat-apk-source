package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.ipcall.a.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.q;

final class IPCallRechargeUI$9
  implements h.c
{
  IPCallRechargeUI$9(IPCallRechargeUI paramIPCallRechargeUI)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(22260);
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(22260);
      IPCallRechargeUI localIPCallRechargeUI;
      while (true)
      {
        return;
        ab.i("MicroMsg.IPCallRechargeUI", "start restore");
        IPCallRechargeUI.i(this.nEu).start();
        com.tencent.mm.plugin.report.service.h.pYm.a(257L, 14L, 1L, true);
        localObject = new Intent();
        ((Intent)localObject).putExtra("key_action_type", 200002);
        ((Intent)localObject).putExtra("key_force_google", true);
        d.b(this.nEu, "wallet_index", ".ui.WalletIapUI", (Intent)localObject, 2002);
        localIPCallRechargeUI = this.nEu;
        if (!localIPCallRechargeUI.isFinishing())
          break;
        ab.i("MicroMsg.IPCallRechargeUI", "[showLoadingDialog] acitivity is finished.");
        AppMethodBeat.o(22260);
      }
      Object localObject = localIPCallRechargeUI.mController.ylL;
      localIPCallRechargeUI.getString(2131297061);
      localIPCallRechargeUI.nBv = com.tencent.mm.ui.base.h.b((Context)localObject, localIPCallRechargeUI.getString(2131300739), false, null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI.9
 * JD-Core Version:    0.6.2
 */