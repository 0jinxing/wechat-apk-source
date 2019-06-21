package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sandbox.monitor.c;
import com.tencent.mm.sdk.platformtools.ab;

final class AppUpdaterUI$12
  implements DialogInterface.OnClickListener
{
  AppUpdaterUI$12(AppUpdaterUI paramAppUpdaterUI, c paramc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(28827);
    ab.d("MicroMsg.AppUpdaterUI", "click download button");
    AppUpdaterUI.a(this.xvL, 11);
    if (this.xvO != null)
      this.xvO.deleteTempFile();
    paramDialogInterface = AppUpdaterUI.e(this.xvL);
    paramDialogInterface.xwW = true;
    paramDialogInterface.dnC();
    AppMethodBeat.o(28827);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppUpdaterUI.12
 * JD-Core Version:    0.6.2
 */