package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ScanSettingsCompat$a
{
  private int hGe = 0;
  private final int hGf = 1;
  private long hGg = 0L;

  public final ScanSettingsCompat aCW()
  {
    AppMethodBeat.i(94337);
    ScanSettingsCompat localScanSettingsCompat = new ScanSettingsCompat(this.hGe, this.hGg, (byte)0);
    AppMethodBeat.o(94337);
    return localScanSettingsCompat;
  }

  public final a of(int paramInt)
  {
    AppMethodBeat.i(94336);
    if ((paramInt < 0) || (paramInt > 2))
    {
      IllegalArgumentException localIllegalArgumentException = new IllegalArgumentException("invalid scan mode ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(94336);
      throw localIllegalArgumentException;
    }
    this.hGe = paramInt;
    AppMethodBeat.o(94336);
    return this;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanSettingsCompat.a
 * JD-Core Version:    0.6.2
 */