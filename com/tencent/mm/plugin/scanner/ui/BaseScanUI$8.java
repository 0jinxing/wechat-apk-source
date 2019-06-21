package com.tencent.mm.plugin.scanner.ui;

import android.hardware.Camera.Parameters;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.plugin.scanner.a.m;
import com.tencent.mm.plugin.scanner.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class BaseScanUI$8
  implements View.OnClickListener
{
  BaseScanUI$8(BaseScanUI paramBaseScanUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(138462);
    if (BaseScanUI.a(this.qbV) != null)
    {
      m.pZK.BV(2);
      if (!BaseScanUI.a(this.qbV).otY)
      {
        paramView = BaseScanUI.a(this.qbV);
        ab.i("MicroMsg.scanner.ScanCamera", "openFlash, camera: %s, isPreviewing: %s", new Object[] { paramView.erH, Boolean.valueOf(paramView.lUE) });
        if ((paramView.erH == null) || (!paramView.lUE));
      }
    }
    while (true)
    {
      try
      {
        paramView.otY = true;
        Camera.Parameters localParameters = paramView.erH.getParameters();
        if ((!bo.ek(localParameters.getSupportedFlashModes())) && (localParameters.getSupportedFlashModes().contains("torch")))
        {
          localParameters.setFlashMode("torch");
          paramView.erH.setParameters(localParameters);
          ab.i("MicroMsg.scanner.ScanCamera", "open flash");
          paramView = BaseScanUI.h(this.qbV);
          ab.i("MicroMsg.ScannerFlashSwitcher", "openFlashStatus");
          paramView.qgm.setImageResource(2131231886);
          AppMethodBeat.o(138462);
          return;
        }
        ab.i("MicroMsg.scanner.ScanCamera", "camera not support flash!!");
        continue;
      }
      catch (Exception paramView)
      {
        ab.printErrStackTrace("MicroMsg.scanner.ScanCamera", paramView, "openFlash error: %s", new Object[] { paramView.getMessage() });
        continue;
      }
      BaseScanUI.a(this.qbV).bPs();
      BaseScanUI.h(this.qbV).chJ();
      AppMethodBeat.o(138462);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.8
 * JD-Core Version:    0.6.2
 */