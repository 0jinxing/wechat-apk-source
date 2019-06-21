package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakeReportUI$13
  implements Runnable
{
  ShakeReportUI$13(ShakeReportUI paramShakeReportUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(24791);
    if (ShakeReportUI.F(this.qwj) != null)
      ShakeReportUI.F(this.qwj).setVisibility(8);
    if (ShakeReportUI.G(this.qwj) != null)
      ShakeReportUI.G(this.qwj).setVisibility(8);
    if (ShakeReportUI.H(this.qwj) != null)
      ShakeReportUI.H(this.qwj).setVisibility(0);
    if ((!ShakeReportUI.I(this.qwj)) && (!ShakeReportUI.C(this.qwj)))
      ShakeReportUI.J(this.qwj);
    AppMethodBeat.o(24791);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeReportUI.13
 * JD-Core Version:    0.6.2
 */