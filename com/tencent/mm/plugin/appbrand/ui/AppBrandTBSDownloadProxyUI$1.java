package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandTBSDownloadProxyUI$1
  implements DialogInterface.OnCancelListener
{
  AppBrandTBSDownloadProxyUI$1(AppBrandTBSDownloadProxyUI paramAppBrandTBSDownloadProxyUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(133098);
    ab.i("MicroMsg.AppBrandTBSDownloadProxyUI", "cancle loading download background");
    paramDialogInterface = new Intent();
    this.iIJ.setResult(2, paramDialogInterface);
    this.iIJ.finish();
    AppMethodBeat.o(133098);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandTBSDownloadProxyUI.1
 * JD-Core Version:    0.6.2
 */