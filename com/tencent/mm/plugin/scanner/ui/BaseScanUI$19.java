package com.tencent.mm.plugin.scanner.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.t;
import com.tencent.mm.plugin.scanner.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class BaseScanUI$19 extends ak
{
  BaseScanUI$19(BaseScanUI paramBaseScanUI)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(138475);
    h localh;
    if ((BaseScanUI.a(this.qbV) != null) && (BaseScanUI.r(this.qbV)) && (!BaseScanUI.M(this.qbV)) && (paramMessage.what == 0))
    {
      BaseScanUI.a(this.qbV, System.currentTimeMillis());
      localh = BaseScanUI.a(this.qbV);
      paramMessage = this.qbV;
      if ((localh.erH == null) || (!localh.lUE));
    }
    while (true)
    {
      try
      {
        localh.cib();
        localh.erH.autoFocus(paramMessage);
        AppMethodBeat.o(138475);
        return;
      }
      catch (RuntimeException paramMessage)
      {
        ab.w("MicroMsg.scanner.ScanCamera", "autoFocus() " + paramMessage.getMessage());
      }
      AppMethodBeat.o(138475);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.BaseScanUI.19
 * JD-Core Version:    0.6.2
 */