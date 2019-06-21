package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum ExdeviceConnectWifiUI$b
{
  static
  {
    AppMethodBeat.i(19895);
    lAo = new b("NORMAL", 0);
    lAp = new b("NO_WIFI_CONNECTED", 1);
    lAq = new b("SETTING", 2);
    lAr = new b("FINISH", 3);
    lAs = new b("TIMEOUT", 4);
    lAt = new b[] { lAo, lAp, lAq, lAr, lAs };
    AppMethodBeat.o(19895);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.b
 * JD-Core Version:    0.6.2
 */