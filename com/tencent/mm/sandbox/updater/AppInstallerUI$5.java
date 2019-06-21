package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.widget.a.c;

final class AppInstallerUI$5
  implements DialogInterface.OnClickListener
{
  AppInstallerUI$5(AppInstallerUI paramAppInstallerUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(28801);
    h.pYm.a(405L, 75L, 1L, true);
    if ((AppInstallerUI.e(this.xvE) != null) && (!AppInstallerUI.e(this.xvE).isShowing()))
      AppInstallerUI.e(this.xvE).show();
    AppMethodBeat.o(28801);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppInstallerUI.5
 * JD-Core Version:    0.6.2
 */