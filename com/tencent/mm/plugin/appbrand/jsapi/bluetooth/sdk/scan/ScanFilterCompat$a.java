package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.os.ParcelUuid;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ScanFilterCompat$a
{
  String hFK;
  ParcelUuid hFL;
  ParcelUuid hFN;
  byte[] hFO;
  byte[] hFP;
  int hFQ = -1;
  byte[] hFR;
  byte[] hFS;
  ParcelUuid hFU;
  String mDeviceName;

  public final a a(ParcelUuid paramParcelUuid)
  {
    this.hFL = paramParcelUuid;
    this.hFU = null;
    return this;
  }

  public final ScanFilterCompat aCV()
  {
    AppMethodBeat.i(94313);
    ScanFilterCompat localScanFilterCompat = new ScanFilterCompat(this.mDeviceName, this.hFK, this.hFL, this.hFU, this.hFN, this.hFO, this.hFP, this.hFQ, this.hFR, this.hFS, (byte)0);
    AppMethodBeat.o(94313);
    return localScanFilterCompat;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat.a
 * JD-Core Version:    0.6.2
 */