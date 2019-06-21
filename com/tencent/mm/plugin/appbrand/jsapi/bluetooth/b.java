package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Handler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.b.1;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.c.1;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.c.2;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b extends g.c
{
  private String appId;
  com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b hDu;
  b.a hDv;

  public b(String paramString)
  {
    this.appId = paramString;
  }

  public final List<e> AV(String paramString)
  {
    AppMethodBeat.i(94175);
    Object localObject1;
    if (this.hDu != null)
    {
      localObject1 = this.hDu;
      if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject1).hDY != null)
      {
        localObject1 = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject1).hDY;
        if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.c)localObject1).hEg.get(paramString) != null)
        {
          localObject1 = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.c)localObject1).hEg.get(paramString);
          if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEl != null)
            break label83;
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleConnectWorker", "[getServices] bluetoothGatt is null, err", new Object[0]);
        }
      }
      AppMethodBeat.o(94175);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      label83: if (bo.isNullOrNil(((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).ceI))
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleConnectWorker", "[getServices] deviceId is null, err", new Object[0]);
        break;
      }
      if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEm == null)
      {
        Object localObject2 = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEl.getServices();
        if (localObject2 == null)
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.BleConnectWorker", "[getServices] bluetoothGattServices is null, err", new Object[0]);
          break;
        }
        ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEm = new ArrayList();
        paramString = new ArrayList();
        Iterator localIterator = ((List)localObject2).iterator();
        while (localIterator.hasNext())
        {
          BluetoothGattService localBluetoothGattService = (BluetoothGattService)localIterator.next();
          localObject2 = new e();
          ((e)localObject2).eCq = localBluetoothGattService.getUuid().toString().toUpperCase();
          if (localBluetoothGattService.getType() == 0);
          for (boolean bool = true; ; bool = false)
          {
            ((e)localObject2).hEK = bool;
            if ((!((e)localObject2).eCq.equals("00001800-0000-1000-8000-00805F9B34FB")) && (!((e)localObject2).eCq.equals("00001801-0000-1000-8000-00805F9B34FB")))
              break label270;
            paramString.add(localObject2);
            break;
          }
          label270: ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEm.add(localObject2);
        }
        if (paramString.size() > 0)
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEm.addAll(paramString);
      }
      paramString = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEm;
      AppMethodBeat.o(94175);
      continue;
      AppMethodBeat.o(94175);
      paramString = null;
    }
  }

  public final void a(String paramString, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a parama, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.b paramb)
  {
    AppMethodBeat.i(94174);
    if (this.hDu != null)
    {
      Object localObject1 = this.hDu;
      if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject1).hDY != null)
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.c localc = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject1).hDY;
        Object localObject2 = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localc.hEg.get(paramString);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d(localc.context, paramString);
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "init deviceId:%s", new Object[] { ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).ceI });
          if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEk == null)
          {
            ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEk = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.b();
            localObject2 = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEk;
            ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.b)localObject2).hEb = new ConcurrentLinkedQueue();
            ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.b)localObject2).hEd = new ArrayList();
          }
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEk = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEk;
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEn = new ConcurrentHashMap();
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEi = new c.1(localc);
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEh = new c.2(localc);
          localc.hEg.put(paramString, localObject1);
        }
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "deviceId:%s aciton:%s", new Object[] { ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).ceI, parama });
        parama.a((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1);
        parama.a(((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEk);
        parama.hEv = paramb;
        paramString = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject1).hEk;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleConnectDispatcher", "doAction %s", new Object[] { parama });
        if (parama.hDR)
        {
          paramString.hEb.add(parama);
          paramString.aCQ();
          AppMethodBeat.o(94174);
        }
      }
    }
    while (true)
    {
      return;
      if (parama.hDP)
      {
        paramString.awA.postDelayed(new b.1(paramString, parama), parama.hEy);
        AppMethodBeat.o(94174);
      }
      else
      {
        parama.aCS();
        AppMethodBeat.o(94174);
      }
    }
  }

  public final List<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.d> aCO()
  {
    ArrayList localArrayList = null;
    AppMethodBeat.i(94173);
    if (this.hDu != null)
    {
      Object localObject = this.hDu;
      if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject).hDY != null)
      {
        localObject = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject).hDY;
        localArrayList = new ArrayList();
        Iterator localIterator = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.c)localObject).hEg.values().iterator();
        while (localIterator.hasNext())
        {
          localObject = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localIterator.next();
          if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject).hEl != null)
            localArrayList.add(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.d(bo.nullAsNil(((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject).hEl.getDevice().getName()), ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localObject).ceI));
        }
        AppMethodBeat.o(94173);
      }
    }
    while (true)
    {
      return localArrayList;
      AppMethodBeat.o(94173);
      continue;
      AppMethodBeat.o(94173);
    }
  }

  public final List<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.c> ca(String paramString1, String paramString2)
  {
    AppMethodBeat.i(94176);
    Object localObject;
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d locald;
    if (this.hDu != null)
    {
      localObject = this.hDu;
      if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject).hDY != null)
      {
        localObject = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b)localObject).hDY;
        if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.c)localObject).hEg.get(paramString1) != null)
        {
          locald = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.c)localObject).hEg.get(paramString1);
          if (locald.hEl != null)
            break label88;
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleConnectWorker", "[getCharacteristics] bluetoothGatt is null, err", new Object[0]);
        }
      }
      AppMethodBeat.o(94176);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      label88: if (bo.isNullOrNil(paramString2))
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleConnectWorker", "[getCharacteristics] serviceId is null, err", new Object[0]);
        break;
      }
      if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.AX(paramString2))
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleConnectWorker", "[getCharacteristics] serviceId is illegal, err", new Object[0]);
        break;
      }
      localObject = (List)locald.hEn.get(paramString2);
      paramString1 = (String)localObject;
      if (localObject == null)
      {
        paramString1 = locald.hEl.getService(UUID.fromString(paramString2));
        if (paramString1 == null)
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.BleConnectWorker", "[getCharacteristics] bluetoothGattServices is null, err", new Object[0]);
          break;
        }
        localObject = paramString1.getCharacteristics();
        if (localObject == null)
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.BleConnectWorker", "[getCharacteristics] characteristics is null, err", new Object[0]);
          break;
        }
        paramString1 = new ArrayList();
        Iterator localIterator = ((List)localObject).iterator();
        while (localIterator.hasNext())
        {
          BluetoothGattCharacteristic localBluetoothGattCharacteristic = (BluetoothGattCharacteristic)localIterator.next();
          localObject = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.c();
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.c)localObject).eCq = localBluetoothGattCharacteristic.getUuid().toString().toUpperCase();
          int i = localBluetoothGattCharacteristic.getProperties();
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.c)localObject).hEC = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.og(i);
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.c)localObject).hED = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.oh(i);
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.c)localObject).hEE = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.oi(i);
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.c)localObject).flq = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.oj(i);
          ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.c)localObject).hEF = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.ok(i);
          paramString1.add(localObject);
        }
        locald.hEn.put(paramString2, paramString1);
      }
      AppMethodBeat.o(94176);
      continue;
      AppMethodBeat.o(94176);
      paramString1 = null;
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(94177);
    a.AU(this.appId);
    AppMethodBeat.o(94177);
  }

  public final void uninit()
  {
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b localb;
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.c localc;
    try
    {
      AppMethodBeat.i(94178);
      if (this.hDu == null)
        break label398;
      localb = this.hDu;
      if (localb.hDY == null)
        break label252;
      localc = localb.hDY;
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleConnectMgr", "uninit", new Object[0]);
      if (localc.hEg == null)
        break label252;
      Iterator localIterator = localc.hEg.values().iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d locald = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d)localIterator.next();
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleConnectWorker", "uninit deviceId:%s", new Object[] { locald.ceI });
        locald.dW(true);
        if (locald.hEk != null)
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.b localb1 = locald.hEk;
          if (localb1.hEb != null)
          {
            localb1.hEb.clear();
            localb1.hEb = null;
          }
          if (localb1.hEd != null)
          {
            localb1.hEd.clear();
            localb1.hEd = null;
          }
          locald.hEk = null;
        }
        if (locald.hEm != null)
        {
          locald.hEm.clear();
          locald.hEm = null;
        }
        if (locald.hEn != null)
        {
          locald.hEn.clear();
          locald.hEn = null;
        }
      }
    }
    finally
    {
    }
    localc.hEg.clear();
    localc.hEg = null;
    label252: if (localb.hDZ != null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.a locala = localb.hDZ;
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.BleScanWorker", "uninit", new Object[0]);
      locala.cnu.set(false);
      locala.aCU();
      if (locala.hFg != null)
        locala.hFg.clear();
      if (locala.hFi != null)
        locala.hFi.clear();
      if ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCY() != null) && (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCY().isDiscovering()))
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCY().cancelDiscovery();
      if ((locala.hDr != null) && (locala.context != null))
      {
        ab.i("MicroMsg.Ble.BleScanWorker", "bluetoothStateListener uninit");
        locala.context.unregisterReceiver(locala.hDr);
        locala.hDr = null;
      }
      locala.hFe = null;
      locala.context = null;
    }
    this.hDu = null;
    label398: AppMethodBeat.o(94178);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.b
 * JD-Core Version:    0.6.2
 */