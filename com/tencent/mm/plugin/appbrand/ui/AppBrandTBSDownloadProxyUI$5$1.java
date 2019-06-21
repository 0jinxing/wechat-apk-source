package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandTBSDownloadProxyUI$5$1
  implements DialogInterface.OnCancelListener
{
  AppBrandTBSDownloadProxyUI$5$1(AppBrandTBSDownloadProxyUI.5 param5)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(133103);
    ab.i("MicroMsg.AppBrandTBSDownloadProxyUI", "cancel loading download background");
    paramDialogInterface = new Intent();
    this.iIL.iIJ.setResult(2, paramDialogInterface);
    this.iIL.iIJ.finish();
    AppMethodBeat.o(133103);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandTBSDownloadProxyUI.5.1
 * JD-Core Version:    0.6.2
 */