package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.e.f;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class IPCallPackageUI$4
  implements DialogInterface.OnClickListener
{
  IPCallPackageUI$4(IPCallPackageUI paramIPCallPackageUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22222);
    paramDialogInterface = IPCallPackageUI.b(this.nDQ);
    paramDialogInterface.nyX += 1;
    IPCallPackageUI.b(this.nDQ).finish();
    paramDialogInterface = new Intent();
    paramDialogInterface.setClass(this.nDQ.mController.ylL, IPCallRechargeUI.class);
    this.nDQ.startActivity(paramDialogInterface);
    this.nDQ.finish();
    AppMethodBeat.o(22222);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI.4
 * JD-Core Version:    0.6.2
 */