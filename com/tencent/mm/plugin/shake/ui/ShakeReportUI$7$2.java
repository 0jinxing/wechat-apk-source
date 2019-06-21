package com.tencent.mm.plugin.shake.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeReportUI$7$2
  implements DialogInterface.OnCancelListener
{
  ShakeReportUI$7$2(ShakeReportUI.7 param7)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(24783);
    ShakeReportUI.b(this.qwm.qwj, true);
    AppMethodBeat.o(24783);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.7.2
 * JD-Core Version:    0.6.2
 */