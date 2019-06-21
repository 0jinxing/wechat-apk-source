package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.v.a;
import com.tencent.mm.pluginsdk.ui.tools.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;

final class AppBrandTBSDownloadProxyUI$5
  implements DialogInterface.OnClickListener
{
  AppBrandTBSDownloadProxyUI$5(AppBrandTBSDownloadProxyUI paramAppBrandTBSDownloadProxyUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(133104);
    com.tencent.mm.plugin.report.service.h.pYm.a(366L, 2L, 1L, false);
    v.a.ov(false);
    m.kT(2);
    if ((this.iIJ.isFinishing()) || (this.iIJ.uiu))
      AppMethodBeat.o(133104);
    while (true)
    {
      return;
      paramDialogInterface = this.iIJ;
      AppCompatActivity localAppCompatActivity = this.iIJ.mController.ylL;
      this.iIJ.mController.ylL.getString(2131297061);
      paramDialogInterface.tipDialog = com.tencent.mm.ui.base.h.b(localAppCompatActivity, this.iIJ.mController.ylL.getString(2131296866), true, null);
      this.iIJ.tipDialog.setOnCancelListener(new AppBrandTBSDownloadProxyUI.5.1(this));
      AppBrandTBSDownloadProxyUI.b(this.iIJ);
      AppBrandTBSDownloadProxyUI.c(this.iIJ);
      AppMethodBeat.o(133104);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandTBSDownloadProxyUI.5
 * JD-Core Version:    0.6.2
 */