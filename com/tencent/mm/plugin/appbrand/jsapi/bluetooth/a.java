package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.c;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.h;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.a;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.BleScanWorker.3;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanSettingsCompat.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a
{
  public static BroadcastReceiver hDr;
  public static boolean hDs;
  public static a.a hDt;
  private static Map<String, b> map;

  static
  {
    AppMethodBeat.i(94172);
    map = new ConcurrentHashMap();
    hDt = new a.1();
    AppMethodBeat.o(94172);
  }

  public static b AT(String paramString)
  {
    AppMethodBeat.i(94168);
    paramString = (b)map.get(paramString);
    AppMethodBeat.o(94168);
    return paramString;
  }

  public static j AU(String paramString)
  {
    AppMethodBeat.i(94169);
    ab.i("MicroMsg.Ble.BleManager", "close appId:%s", new Object[] { paramString });
    if (!map.containsKey(paramString))
    {
      paramString = j.hEL;
      AppMethodBeat.o(94169);
    }
    while (true)
    {
      return paramString;
      b localb = (b)map.remove(paramString);
      com.tencent.mm.plugin.appbrand.g.b(paramString, localb);
      localb.uninit();
      if (map.size() == 0)
        aCN();
      paramString = j.hEL;
      AppMethodBeat.o(94169);
    }
  }

  public static j a(String paramString, b.a parama, h paramh, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.g paramg)
  {
    AppMethodBeat.i(94167);
    ab.i("MicroMsg.Ble.BleManager", "open appId:%s", new Object[] { paramString });
    int i;
    if ((!d.fP(18)) && (ah.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")))
    {
      i = 1;
      if (i != 0)
        break label74;
      ab.e("MicroMsg.Ble.BleManager", "api version is below 18");
      paramString = j.hEW;
      AppMethodBeat.o(94167);
    }
    while (true)
    {
      return paramString;
      i = 0;
      break;
      label74: b localb;
      Object localObject1;
      Object localObject2;
      if (!map.containsKey(paramString))
      {
        ab.w("MicroMsg.Ble.BleManager", "already open appId:%s", new Object[] { paramString });
        localb = new b(paramString);
        localb.hDu = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b(ah.getContext());
        localObject1 = localb.hDu;
        localObject2 = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject1).hDY;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleConnectMgr", "init", new Object[0]);
        if (((c)localObject2).hEg == null)
          ((c)localObject2).hEg = new ConcurrentHashMap();
        ((c)localObject2).hEg.clear();
        localObject2 = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject1).hDZ;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleScanWorker", "init", new Object[0]);
        ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2).cnu.set(true);
        ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2).hFg = new HashMap();
        ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2).hFi = new ArrayList();
        ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2).hFe = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a.2((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2);
        if (!"middle".equals("low"))
          break label448;
        ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2).hFf = new ScanSettingsCompat.a().of(0).aCW();
      }
      while (true)
      {
        if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2).hDr == null)
        {
          ab.i("MicroMsg.Ble.BleScanWorker", "bluetoothStateListener init");
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2).hDr = new BleScanWorker.3((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2);
          localObject1 = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2).context.registerReceiver(((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2).hDr, (IntentFilter)localObject1);
        }
        localb.hDv = parama;
        if (localb.hDu != null)
        {
          parama = localb.hDu;
          if (parama.hDY != null)
            parama.hDY.hEh = paramh;
        }
        if (localb.hDu != null)
        {
          parama = localb.hDu;
          if (parama.hDY != null)
            parama.hDY.hEi = paramg;
        }
        map.put(paramString, localb);
        com.tencent.mm.plugin.appbrand.g.a(paramString, localb);
        aCM();
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.hGh = hDt;
        if (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ())
          break label535;
        ab.e("MicroMsg.Ble.BleManager", "bluetooth not enable, err");
        paramString = j.hEO;
        AppMethodBeat.o(94167);
        break;
        label448: if ("middle".equals("middle"))
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2).hFf = new ScanSettingsCompat.a().of(1).aCW();
        else if ("middle".equals("high"))
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2).hFf = new ScanSettingsCompat.a().of(2).aCW();
        else
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a)localObject2).hFf = new ScanSettingsCompat.a().of(0).aCW();
      }
      label535: paramString = j.hEL;
      AppMethodBeat.o(94167);
    }
  }

  private static void aCM()
  {
    try
    {
      AppMethodBeat.i(94170);
      if (hDr == null)
      {
        ab.i("MicroMsg.Ble.BleManager", "bluetoothStateListener init");
        Object localObject1 = new com/tencent/mm/plugin/appbrand/jsapi/bluetooth/a$2;
        ((a.2)localObject1).<init>();
        hDr = (BroadcastReceiver)localObject1;
        localObject1 = new android/content/IntentFilter;
        ((IntentFilter)localObject1).<init>("android.bluetooth.adapter.action.STATE_CHANGED");
        ah.getContext().registerReceiver(hDr, (IntentFilter)localObject1);
        hDs = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ();
      }
      AppMethodBeat.o(94170);
      return;
    }
    finally
    {
    }
  }

  private static void aCN()
  {
    try
    {
      AppMethodBeat.i(94171);
      if (hDr != null)
      {
        ab.i("MicroMsg.Ble.BleManager", "bluetoothStateListener uninit");
        ah.getContext().unregisterReceiver(hDr);
        hDr = null;
      }
      AppMethodBeat.o(94171);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.a
 * JD-Core Version:    0.6.2
 */