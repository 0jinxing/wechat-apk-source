package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sandbox.monitor.c;
import com.tencent.mm.sdk.platformtools.ab;

final class AppInstallerUI$2
  implements DialogInterface.OnClickListener
{
  AppInstallerUI$2(AppInstallerUI paramAppInstallerUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(28798);
    ab.d("MicroMsg.AppInstallerUI", "getBtn (ok button) is click");
    if (AppInstallerUI.b(this.xvE) == 2)
      i.aq(this.xvE, 3);
    paramDialogInterface = c.RP(AppInstallerUI.c(this.xvE));
    ab.d("MicroMsg.AppInstallerUI", paramDialogInterface);
    if (paramDialogInterface != null)
    {
      j.a.xxg.aB(1, true);
      com.tencent.mm.plugin.report.service.h.pYm.a(405L, 72L, 1L, true);
      AppInstallerUI.a(this.xvE, paramDialogInterface);
      AppMethodBeat.o(28798);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(405L, 73L, 1L, true);
      ab.e("MicroMsg.AppInstallerUI", "pack not found!");
      com.tencent.mm.ui.base.h.bQ(this.xvE, this.xvE.getString(2131304160));
      i.dnB();
      this.xvE.finish();
      AppMethodBeat.o(28798);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppInstallerUI.2
 * JD-Core Version:    0.6.2
 */