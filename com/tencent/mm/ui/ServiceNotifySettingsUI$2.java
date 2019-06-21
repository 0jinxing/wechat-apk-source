package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ServiceNotifySettingsUI$2
  implements DialogInterface.OnCancelListener
{
  ServiceNotifySettingsUI$2(ServiceNotifySettingsUI paramServiceNotifySettingsUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(29851);
    this.ypY.finish();
    AppMethodBeat.o(29851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ServiceNotifySettingsUI.2
 * JD-Core Version:    0.6.2
 */