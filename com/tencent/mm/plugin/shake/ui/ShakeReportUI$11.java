package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeReportUI$11
  implements Runnable
{
  ShakeReportUI$11(ShakeReportUI paramShakeReportUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24789);
    if (ShakeReportUI.r(this.qwj) != null)
      ShakeReportUI.r(this.qwj).setVisibility(8);
    AppMethodBeat.o(24789);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.11
 * JD-Core Version:    0.6.2
 */