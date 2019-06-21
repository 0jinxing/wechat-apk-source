package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ExdeviceConnectWifiUI$13
  implements View.OnClickListener
{
  ExdeviceConnectWifiUI$13(ExdeviceConnectWifiUI paramExdeviceConnectWifiUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(19889);
    ab.i("MicroMsg.exdevice.ExdeviceConnectWifiUI", "onClick connectBtn.");
    ExdeviceConnectWifiUI.k(this.lAf);
    AppMethodBeat.o(19889);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.13
 * JD-Core Version:    0.6.2
 */