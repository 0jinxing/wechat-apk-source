package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AppUpdaterUI$8
  implements DialogInterface.OnCancelListener
{
  AppUpdaterUI$8(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(28823);
    AppUpdaterUI.g(this.xvL);
    AppMethodBeat.o(28823);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppUpdaterUI.8
 * JD-Core Version:    0.6.2
 */