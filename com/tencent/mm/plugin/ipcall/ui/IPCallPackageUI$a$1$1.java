package com.tencent.mm.plugin.ipcall.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.e.f;
import com.tencent.mm.protocal.protobuf.crx;

final class IPCallPackageUI$a$1$1
  implements DialogInterface.OnClickListener
{
  IPCallPackageUI$a$1$1(IPCallPackageUI.a.1 param1, crx paramcrx)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(22224);
    paramDialogInterface = IPCallPackageUI.b(IPCallPackageUI.a.a(this.nDU.nDS));
    paramDialogInterface.nyT += 1;
    IPCallPackageUI.a(IPCallPackageUI.a.a(this.nDU.nDS), this.nDT.ProductID);
    AppMethodBeat.o(22224);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI.a.1.1
 * JD-Core Version:    0.6.2
 */