package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AppUpdaterUI$13
  implements DialogInterface.OnCancelListener
{
  AppUpdaterUI$13(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(28828);
    ab.d("MicroMsg.AppUpdaterUI", "click cancel button");
    AppUpdaterUI.a(this.xvL, 12);
    AppUpdaterUI.i(this.xvL);
    AppMethodBeat.o(28828);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppUpdaterUI.13
 * JD-Core Version:    0.6.2
 */