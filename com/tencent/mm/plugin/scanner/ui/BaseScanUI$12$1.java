package com.tencent.mm.plugin.scanner.ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.scanner.util.h;

final class BaseScanUI$12$1
  implements Runnable
{
  BaseScanUI$12$1(BaseScanUI.12 param12, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(138467);
    if ((g.Rg().acS() == 6) || (g.Rg().acS() == 4))
    {
      if (BaseScanUI.c(this.qbY.qbV))
      {
        AppMethodBeat.o(138467);
        return;
      }
      if ((BaseScanUI.d(this.qbY.qbV) != null) && (BaseScanUI.e(this.qbY.qbV) != null))
      {
        BaseScanUI.d(this.qbY.qbV).setVisibility(8);
        BaseScanUI.e(this.qbY.qbV).setVisibility(8);
      }
      BaseScanUI.a(this.qbY.qbV, true);
      BaseScanUI.b(this.qbY.qbV, false);
      BaseScanUI.f(this.qbY.qbV);
    }
    while (true)
    {
      if (BaseScanUI.i(this.qbY.qbV) != null)
        BaseScanUI.i(this.qbY.qbV).cgN();
      AppMethodBeat.o(138467);
      break;
      if (!BaseScanUI.c(this.qbY.qbV))
      {
        AppMethodBeat.o(138467);
        break;
      }
      if ((BaseScanUI.d(this.qbY.qbV) != null) && (BaseScanUI.e(this.qbY.qbV) != null))
      {
        BaseScanUI.d(this.qbY.qbV).setText(2131302758);
        BaseScanUI.e(this.qbY.qbV).setVisibility(0);
        BaseScanUI.d(this.qbY.qbV).setVisibility(0);
      }
      if ((!BaseScanUI.g(this.qbY.qbV)) && (BaseScanUI.a(this.qbY.qbV) != null) && (BaseScanUI.a(this.qbY.qbV).otY))
        BaseScanUI.a(this.qbY.qbV).bPs();
      if (BaseScanUI.h(this.qbY.qbV) != null)
      {
        BaseScanUI.h(this.qbY.qbV).chJ();
        BaseScanUI.h(this.qbY.qbV).hide();
      }
      BaseScanUI.a(this.qbY.qbV, false);
      BaseScanUI.b(this.qbY.qbV, true);
      this.qbY.qbV.cgZ();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.12.1
 * JD-Core Version:    0.6.2
 */