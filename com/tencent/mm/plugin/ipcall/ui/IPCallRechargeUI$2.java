package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;

final class IPCallRechargeUI$2
  implements DialogInterface.OnClickListener
{
  IPCallRechargeUI$2(IPCallRechargeUI paramIPCallRechargeUI, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22252);
    h.pYm.a(257L, 3L, 1L, true);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("rawUrl", this.nEv);
    paramDialogInterface.putExtra("showShare", false);
    d.b(this.nEu, "webview", ".ui.tools.WebViewUI", paramDialogInterface);
    AppMethodBeat.o(22252);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI.2
 * JD-Core Version:    0.6.2
 */