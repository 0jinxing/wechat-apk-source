package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.support.v4.f.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

@TargetApi(18)
final class b$a
  implements b.e
{
  static final m<e, b.b> hFn;

  static
  {
    AppMethodBeat.i(94294);
    hFn = new m();
    AppMethodBeat.o(94294);
  }

  public final boolean a(BluetoothAdapter paramBluetoothAdapter, e parame)
  {
    AppMethodBeat.i(94293);
    parame = (b.b)hFn.remove(parame);
    boolean bool;
    if (parame == null)
    {
      bool = false;
      AppMethodBeat.o(94293);
    }
    while (true)
    {
      return bool;
      paramBluetoothAdapter.stopLeScan(parame);
      bool = true;
      AppMethodBeat.o(94293);
    }
  }

  public final boolean a(BluetoothAdapter paramBluetoothAdapter, List<ScanFilterCompat> paramList, ScanSettingsCompat paramScanSettingsCompat, e parame)
  {
    AppMethodBeat.i(94292);
    paramScanSettingsCompat = (b.b)hFn.get(parame);
    if (paramScanSettingsCompat != null)
      paramList = paramScanSettingsCompat;
    while (true)
    {
      boolean bool = paramBluetoothAdapter.startLeScan(paramList);
      AppMethodBeat.o(94292);
      return bool;
      paramList = new b.b(paramList, parame);
      hFn.put(parame, paramList);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.b.a
 * JD-Core Version:    0.6.2
 */