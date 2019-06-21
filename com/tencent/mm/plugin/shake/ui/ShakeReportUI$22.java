package com.tencent.mm.plugin.shake.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.i.d;

final class ShakeReportUI$22
  implements Runnable
{
  ShakeReportUI$22(ShakeReportUI paramShakeReportUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24800);
    if (ShakeReportUI.f(this.qwj) != null)
      ShakeReportUI.f(this.qwj).diJ();
    AppMethodBeat.o(24800);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.22
 * JD-Core Version:    0.6.2
 */