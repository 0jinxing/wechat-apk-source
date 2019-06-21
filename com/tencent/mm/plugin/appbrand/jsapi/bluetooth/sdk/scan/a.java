package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.i;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a
{
  public AtomicBoolean cnu;
  public Context context;
  public BroadcastReceiver hDr;
  public e hFe;
  public ScanSettingsCompat hFf;
  public Map<String, d> hFg;
  public AtomicBoolean hFh;
  public List<d> hFi;
  Runnable hFj;
  i hFk;
  final Handler mHandler;

  public a(Context paramContext)
  {
    AppMethodBeat.i(94289);
    this.hFh = new AtomicBoolean(false);
    this.cnu = new AtomicBoolean(false);
    this.mHandler = new Handler();
    this.hFj = new a.1(this);
    this.context = paramContext;
    AppMethodBeat.o(94289);
  }

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.b paramb, List<ScanFilterCompat> paramList, i parami)
  {
    BluetoothAdapter localBluetoothAdapter;
    while (true)
    {
      try
      {
        AppMethodBeat.i(94290);
        if (!this.cnu.get())
        {
          paramb.a(j.hEV);
          AppMethodBeat.o(94290);
          return;
        }
        if (this.hFh.get())
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.BleScanWorker", "already scan", new Object[0]);
          paramb.a(j.hEL);
          AppMethodBeat.o(94290);
          continue;
        }
      }
      finally
      {
      }
      localBluetoothAdapter = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCY();
      if ((localBluetoothAdapter != null) && (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ()))
        break;
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleScanWorker", "BluetoothAdapter is null, err", new Object[0]);
      paramb.a(j.hEO);
      AppMethodBeat.o(94290);
    }
    boolean bool1;
    label148: Object localObject;
    boolean bool2;
    if (Build.VERSION.SDK_INT >= 23)
    {
      if ((!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.AW("android.permission.ACCESS_COARSE_LOCATION")) && (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.AW("android.permission.ACCESS_FINE_LOCATION")))
        break label420;
      bool1 = true;
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleScanWorker", "checkLocationPermission :%b", new Object[] { Boolean.valueOf(bool1) });
      localObject = (LocationManager)ah.getContext().getSystemService("location");
      if (localObject == null)
        break label449;
      bool2 = ((LocationManager)localObject).isProviderEnabled("gps");
      bool1 = ((LocationManager)localObject).isProviderEnabled("network");
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("isGPSEnable ");
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleHelper", bool2 + ", isNetworkEnable:" + bool1, new Object[0]);
    }
    while (true)
    {
      if ((bool2) && (bool1));
      for (bool1 = true; ; bool1 = false)
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleScanWorker", "checkGpsEnable:%b", new Object[] { Boolean.valueOf(bool1) });
        this.hFh.set(true);
        localObject = paramList;
        if (paramList != null)
        {
          localObject = paramList;
          if (paramList.size() == 0)
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.BleScanWorker", "scanFilterCompats size:%d", new Object[] { Integer.valueOf(paramList.size()) });
            localObject = null;
          }
        }
        bool1 = b.a(localBluetoothAdapter, (List)localObject, this.hFf, this.hFe);
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleScanWorker", "startBleScan isOk:%b", new Object[] { Boolean.valueOf(bool1) });
        if (!bool1)
          break label432;
        this.hFk = parami;
        if (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.hDK.eCL > 0)
          this.mHandler.postDelayed(this.hFj, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.hDK.eCL);
        paramb.a(j.hEL);
        AppMethodBeat.o(94290);
        break;
        label420: bool1 = false;
        break label148;
      }
      label432: paramb.a(j.hEV);
      AppMethodBeat.o(94290);
      break;
      label449: bool1 = false;
      bool2 = false;
    }
  }

  public final j aCU()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(94291);
        j localj;
        if (!this.cnu.get())
        {
          localj = j.hEN;
          AppMethodBeat.o(94291);
          return localj;
        }
        if (!this.hFh.get())
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.BleScanWorker", "not scan", new Object[0]);
          localj = j.hEL;
          AppMethodBeat.o(94291);
          continue;
        }
      }
      finally
      {
      }
      Object localObject2 = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCY();
      if ((localObject2 == null) || (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ()))
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleScanWorker", "BluetoothAdapter is null, err", new Object[0]);
        localObject2 = j.hEO;
        AppMethodBeat.o(94291);
      }
      else
      {
        this.hFh.set(false);
        b.a((BluetoothAdapter)localObject2, this.hFe);
        localObject2 = j.hEL;
        AppMethodBeat.o(94291);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a
 * JD-Core Version:    0.6.2
 */