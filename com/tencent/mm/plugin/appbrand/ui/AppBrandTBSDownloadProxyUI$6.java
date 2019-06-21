package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.v.a;
import com.tencent.mm.sdk.platformtools.ab;

final class AppBrandTBSDownloadProxyUI$6
  implements DialogInterface.OnClickListener
{
  AppBrandTBSDownloadProxyUI$6(AppBrandTBSDownloadProxyUI paramAppBrandTBSDownloadProxyUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(133105);
    h.pYm.a(366L, 3L, 1L, false);
    ab.i("MicroMsg.AppBrandTBSDownloadProxyUI", "user cancel");
    v.a.ov(false);
    paramDialogInterface = new Intent();
    this.iIJ.setResult(2, paramDialogInterface);
    this.iIJ.finish();
    AppMethodBeat.o(133105);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandTBSDownloadProxyUI.6
 * JD-Core Version:    0.6.2
 */