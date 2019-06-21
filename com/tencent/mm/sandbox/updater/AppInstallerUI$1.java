package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppInstallerUI$1
  implements DialogInterface.OnCancelListener
{
  AppInstallerUI$1(AppInstallerUI paramAppInstallerUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(28797);
    AppInstallerUI.a(this.xvE);
    AppMethodBeat.o(28797);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppInstallerUI.1
 * JD-Core Version:    0.6.2
 */