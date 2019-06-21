package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.bluetooth.BluetoothDevice;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.i;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a$2 extends e
{
  public a$2(a parama)
  {
  }

  public final void a(int paramInt, ScanResultCompat paramScanResultCompat)
  {
    int i = 0;
    AppMethodBeat.i(94286);
    if (paramScanResultCompat.getDevice() == null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleScanWorker", "[onScanResult]result is null, err", new Object[0]);
      AppMethodBeat.o(94286);
    }
    while (true)
    {
      return;
      if (!this.hFl.cnu.get())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleScanWorker", "[onScanResult]not init, err", new Object[0]);
        AppMethodBeat.o(94286);
      }
      else
      {
        if (this.hFl.hFg != null)
          break;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.BleScanWorker", "[onScanResult]may be close, err", new Object[0]);
        AppMethodBeat.o(94286);
      }
    }
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.d("MicroMsg.Ble.BleScanWorker", "callbackType:%d, result:%s", new Object[] { Integer.valueOf(paramInt), paramScanResultCompat });
    String str = paramScanResultCompat.getDevice().getAddress();
    if (this.hFl.hFg.containsKey(str))
    {
      paramInt = i;
      if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.hDK.hDL);
    }
    else
    {
      paramInt = 1;
    }
    paramScanResultCompat = new d(paramScanResultCompat);
    if (paramInt != 0)
    {
      if (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.hDK.eCL <= 0)
        break label223;
      if (this.hFl.hFi != null)
        this.hFl.hFi.add(paramScanResultCompat);
    }
    while (true)
    {
      this.hFl.hFg.put(str, paramScanResultCompat);
      AppMethodBeat.o(94286);
      break;
      label223: if (this.hFl.hFk != null)
        this.hFl.hFk.a(paramScanResultCompat);
    }
  }

  public final void onScanFailed(int paramInt)
  {
    AppMethodBeat.i(94287);
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleScanWorker", "[onScanResult]onScanFailed, errorCode:%d", new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(94287);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a.2
 * JD-Core Version:    0.6.2
 */