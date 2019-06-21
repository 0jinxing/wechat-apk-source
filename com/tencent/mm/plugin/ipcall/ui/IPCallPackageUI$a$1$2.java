package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.e.f;

final class IPCallPackageUI$a$1$2
  implements DialogInterface.OnClickListener
{
  IPCallPackageUI$a$1$2(IPCallPackageUI.a.1 param1)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22225);
    paramDialogInterface = IPCallPackageUI.b(IPCallPackageUI.a.a(this.nDU.nDS));
    paramDialogInterface.nyU += 1;
    IPCallPackageUI.b(IPCallPackageUI.a.a(this.nDU.nDS)).finish();
    AppMethodBeat.o(22225);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI.a.1.2
 * JD-Core Version:    0.6.2
 */