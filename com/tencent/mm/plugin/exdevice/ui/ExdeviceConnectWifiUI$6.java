package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class ExdeviceConnectWifiUI$6
  implements Runnable
{
  ExdeviceConnectWifiUI$6(ExdeviceConnectWifiUI paramExdeviceConnectWifiUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(19878);
    if ((ExdeviceConnectWifiUI.g(this.lAf) != null) && (ExdeviceConnectWifiUI.g(this.lAf).isShowing()))
      ExdeviceConnectWifiUI.g(this.lAf).dismiss();
    AppMethodBeat.o(19878);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.6
 * JD-Core Version:    0.6.2
 */