package com.tencent.mm.plugin.shake.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeReportUI$16
  implements DialogInterface.OnCancelListener
{
  ShakeReportUI$16(ShakeReportUI paramShakeReportUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(24794);
    paramDialogInterface.dismiss();
    ShakeReportUI.b(this.qwj, true);
    ShakeReportUI.L(this.qwj);
    ShakeReportUI.M(this.qwj).setText("");
    AppMethodBeat.o(24794);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.16
 * JD-Core Version:    0.6.2
 */