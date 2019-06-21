package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandXWebDownloadProxyUI$3
  implements DialogInterface.OnCancelListener
{
  AppBrandXWebDownloadProxyUI$3(AppBrandXWebDownloadProxyUI paramAppBrandXWebDownloadProxyUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(133172);
    ab.i("MicroMsg.AppBrandXWebDownloadProxyUI", "cancle loading download background");
    paramDialogInterface = new Intent();
    this.iJB.setResult(2, paramDialogInterface);
    this.iJB.finish();
    AppMethodBeat.o(133172);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI.3
 * JD-Core Version:    0.6.2
 */