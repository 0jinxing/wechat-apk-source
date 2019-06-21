package com.tencent.mm.plugin.shake.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeReportUI$23
  implements DialogInterface.OnClickListener
{
  ShakeReportUI$23(ShakeReportUI paramShakeReportUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(24801);
    ShakeReportUI.P(this.qwj);
    this.qwj.finish();
    AppMethodBeat.o(24801);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.23
 * JD-Core Version:    0.6.2
 */