package com.b.a.a;

import android.net.wifi.WifiManager;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ac extends e
{
  private final WifiManager bJj;

  ac(WifiManager paramWifiManager, Handler paramHandler)
  {
    super(paramHandler);
    this.bJj = paramWifiManager;
  }

  final void vZ()
  {
    AppMethodBeat.i(55615);
    this.bJj.startScan();
    AppMethodBeat.o(55615);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.b.a.a.ac
 * JD-Core Version:    0.6.2
 */