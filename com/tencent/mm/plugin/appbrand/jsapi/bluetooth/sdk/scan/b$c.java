package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter.Builder;
import android.bluetooth.le.ScanSettings.Builder;
import android.support.v4.f.m;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.List<Lcom.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanFilterCompat;>;

@SuppressLint({"MissingPermission"})
@TargetApi(21)
final class b$c
  implements b.e
{
  static final m<e, b.d> hFn;

  static
  {
    AppMethodBeat.i(94299);
    hFn = new m();
    AppMethodBeat.o(94299);
  }

  public final boolean a(BluetoothAdapter paramBluetoothAdapter, e parame)
  {
    AppMethodBeat.i(94298);
    parame = (b.d)hFn.remove(parame);
    boolean bool;
    if (parame == null)
    {
      AppMethodBeat.o(94298);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (paramBluetoothAdapter.getBluetoothLeScanner() == null)
      {
        ab.e("MicroMsg.ble.BleScannerCompat", "bluetoothscanner is null, return");
        AppMethodBeat.o(94298);
        bool = false;
      }
      else
      {
        paramBluetoothAdapter.getBluetoothLeScanner().stopScan(parame);
        bool = true;
        AppMethodBeat.o(94298);
      }
    }
  }

  public final boolean a(BluetoothAdapter paramBluetoothAdapter, List<ScanFilterCompat> paramList, ScanSettingsCompat paramScanSettingsCompat, e parame)
  {
    AppMethodBeat.i(94297);
    if (paramList != null)
    {
      localObject = new ArrayList(paramList.size());
      Iterator localIterator = paramList.iterator();
      while (true)
      {
        paramList = (List<ScanFilterCompat>)localObject;
        if (!localIterator.hasNext())
          break;
        paramList = (ScanFilterCompat)localIterator.next();
        ScanFilter.Builder localBuilder = new ScanFilter.Builder();
        if (paramList.mDeviceName != null)
          localBuilder.setDeviceName(paramList.mDeviceName);
        if (paramList.hFL != null)
          localBuilder.setServiceUuid(paramList.hFL, paramList.hFM);
        if (paramList.hFK != null)
          localBuilder.setDeviceAddress(paramList.hFK);
        if (paramList.hFN != null)
          localBuilder.setServiceData(paramList.hFN, paramList.hFO, paramList.hFP);
        if (paramList.hFQ < 0)
          localBuilder.setManufacturerData(paramList.hFQ, paramList.hFR, paramList.hFS);
        ((List)localObject).add(localBuilder.build());
      }
    }
    paramList = null;
    if (paramScanSettingsCompat == null)
    {
      paramBluetoothAdapter = new IllegalStateException("Scan settings are null");
      AppMethodBeat.o(94297);
      throw paramBluetoothAdapter;
    }
    paramScanSettingsCompat = new ScanSettings.Builder().setReportDelay(paramScanSettingsCompat.hGg).setScanMode(paramScanSettingsCompat.hGe).build();
    boolean bool;
    if (paramBluetoothAdapter.getBluetoothLeScanner() == null)
    {
      ab.e("MicroMsg.ble.BleScannerCompat", "bluetoothscanner is null, return");
      bool = false;
      AppMethodBeat.o(94297);
      return bool;
    }
    Object localObject = paramBluetoothAdapter.getBluetoothLeScanner();
    paramBluetoothAdapter = (b.d)hFn.get(parame);
    if (paramBluetoothAdapter != null);
    while (true)
    {
      ((BluetoothLeScanner)localObject).startScan(paramList, paramScanSettingsCompat, paramBluetoothAdapter);
      bool = true;
      AppMethodBeat.o(94297);
      break;
      paramBluetoothAdapter = new b.d(parame);
      hFn.put(parame, paramBluetoothAdapter);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.b.c
 * JD-Core Version:    0.6.2
 */