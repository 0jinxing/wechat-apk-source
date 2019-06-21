package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.c;

final class AppUpdaterUI$5
  implements DialogInterface.OnClickListener
{
  AppUpdaterUI$5(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(28818);
    ab.d("MicroMsg.AppUpdaterUI", "update dialog had been canceled");
    if ((AppUpdaterUI.b(this.xvL) != null) && (AppUpdaterUI.b(this.xvL).isShowing()))
      AppUpdaterUI.b(this.xvL).dismiss();
    AppUpdaterUI.a(this.xvL, 6);
    if (AppUpdaterUI.e(this.xvL).xwY)
    {
      h.pYm.a(614L, 59L, 1L, true);
      ab.d("MicroMsg.AppUpdaterUI", "boots download cancel when downloading.");
    }
    AppUpdaterUI.e(this.xvL).cancel();
    AppUpdaterUI.e(this.xvL).aB(2, true);
    AppUpdaterUI.f(this.xvL);
    AppMethodBeat.o(28818);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppUpdaterUI.5
 * JD-Core Version:    0.6.2
 */