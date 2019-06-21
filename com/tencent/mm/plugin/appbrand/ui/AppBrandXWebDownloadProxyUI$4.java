package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;
import com.tencent.xweb.k;

final class AppBrandXWebDownloadProxyUI$4
  implements DialogInterface.OnClickListener
{
  AppBrandXWebDownloadProxyUI$4(AppBrandXWebDownloadProxyUI paramAppBrandXWebDownloadProxyUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(133174);
    com.tencent.mm.plugin.report.service.h.pYm.a(366L, 2L, 1L, false);
    if ((this.iJB.isFinishing()) || (this.iJB.uiu))
      AppMethodBeat.o(133174);
    while (true)
    {
      return;
      paramDialogInterface = this.iJB;
      AppCompatActivity localAppCompatActivity = this.iJB.mController.ylL;
      this.iJB.mController.ylL.getString(2131297061);
      paramDialogInterface.tipDialog = com.tencent.mm.ui.base.h.b(localAppCompatActivity, this.iJB.mController.ylL.getString(2131296866), true, null);
      this.iJB.tipDialog.setOnCancelListener(new AppBrandXWebDownloadProxyUI.4.1(this));
      k.dTY();
      AppBrandXWebDownloadProxyUI.a(this.iJB);
      AppMethodBeat.o(133174);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandXWebDownloadProxyUI.4
 * JD-Core Version:    0.6.2
 */