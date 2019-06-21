package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;

final class IPCallRechargeUI$8
  implements DialogInterface.OnCancelListener
{
  IPCallRechargeUI$8(IPCallRechargeUI paramIPCallRechargeUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(22259);
    try
    {
      if (this.nEu.nEt != null)
        aw.Rg().c(this.nEu.nEt);
      this.nEu.finish();
      AppMethodBeat.o(22259);
      return;
    }
    catch (Exception paramDialogInterface)
    {
      while (true)
      {
        ab.e("MicroMsg.IPCallRechargeUI", "cancel getProductListScene error: %s", new Object[] { paramDialogInterface.getMessage() });
        AppMethodBeat.o(22259);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI.8
 * JD-Core Version:    0.6.2
 */