package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandXWebDownloadProxyUI$4$1
  implements DialogInterface.OnCancelListener
{
  AppBrandXWebDownloadProxyUI$4$1(AppBrandXWebDownloadProxyUI.4 param4)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(133173);
    ab.i("MicroMsg.AppBrandXWebDownloadProxyUI", "cancel loading download background");
    paramDialogInterface = new Intent();
    this.iJC.iJB.setResult(2, paramDialogInterface);
    this.iJC.iJB.finish();
    AppMethodBeat.o(133173);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI.4.1
 * JD-Core Version:    0.6.2
 */