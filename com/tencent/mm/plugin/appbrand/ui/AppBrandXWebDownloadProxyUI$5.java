package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandXWebDownloadProxyUI$5
  implements DialogInterface.OnClickListener
{
  AppBrandXWebDownloadProxyUI$5(AppBrandXWebDownloadProxyUI paramAppBrandXWebDownloadProxyUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(133175);
    h.pYm.a(366L, 3L, 1L, false);
    ab.i("MicroMsg.AppBrandXWebDownloadProxyUI", "user cancel");
    paramDialogInterface = new Intent();
    this.iJB.setResult(2, paramDialogInterface);
    this.iJB.finish();
    AppMethodBeat.o(133175);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI.5
 * JD-Core Version:    0.6.2
 */