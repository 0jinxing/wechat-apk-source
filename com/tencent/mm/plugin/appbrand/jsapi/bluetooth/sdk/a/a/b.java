package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.os.Build.VERSION;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.f;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;

@TargetApi(18)
public final class b extends com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a
{
  public String ceI;
  public boolean hEo;
  public String hEp = "LE";

  public b(String paramString)
  {
    this.ceI = paramString;
  }

  public final void aCR()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(94259);
    Object localObject = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCY();
    if (localObject == null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.ConnectAction", "action:%s, bluetoothGatt is null", new Object[] { this });
      a(j.hET);
      done();
      AppMethodBeat.o(94259);
    }
    while (true)
    {
      return;
      if ((this.ceI == null) || (!BluetoothAdapter.checkBluetoothAddress(this.ceI)))
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.ConnectAction", "action:%s, unspecified deviceId", new Object[] { this });
        a(j.hFc);
        done();
        AppMethodBeat.o(94259);
      }
      else if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b.aCZ())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.ConnectAction", "bluetooth is not enable.", new Object[0]);
        a(j.hEO);
        done();
        AppMethodBeat.o(94259);
      }
      else
      {
        if (this.hEt.hEl == null)
          break;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.ConnectAction", "already connect, please close", new Object[0]);
        a(j.hFb);
        done();
        AppMethodBeat.o(94259);
      }
    }
    localObject = ((BluetoothAdapter)localObject).getRemoteDevice(this.ceI);
    if (localObject != null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.ConnectAction", "autoConnect:%b transport:%s", new Object[] { Boolean.valueOf(this.hEo), this.hEp });
      String str;
      int i;
      if (Build.VERSION.SDK_INT >= 23)
      {
        str = this.hEp.toUpperCase();
        i = -1;
        switch (str.hashCode())
        {
        default:
          switch (i)
          {
          default:
            label276: localObject = ((BluetoothDevice)localObject).connectGatt(this.hEt.context, this.hEo, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a(this.hEt), 2);
          case 0:
          case 1:
          case 2:
          }
          break;
        case 2425:
        case 2020783:
        case 63463747:
        }
      }
      while (true)
      {
        if (localObject == null)
          break label581;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.ConnectAction", "mBluetoothGatt:%s", new Object[] { localObject });
        str = this.ceI;
        if (Thread.currentThread() == Looper.getMainLooper().getThread())
          bool2 = true;
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.ConnectAction", "create a new connection deviceId=%s mainthread:%b", new Object[] { str, Boolean.valueOf(bool2) });
        this.hEt.hEl = ((BluetoothGatt)localObject);
        AppMethodBeat.o(94259);
        break;
        if (!str.equals("LE"))
          break label276;
        i = 0;
        break label276;
        if (!str.equals("AUTO"))
          break label276;
        i = 1;
        break label276;
        if (!str.equals("BREDR"))
          break label276;
        i = 2;
        break label276;
        localObject = ((BluetoothDevice)localObject).connectGatt(this.hEt.context, this.hEo, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a(this.hEt), 2);
        continue;
        localObject = ((BluetoothDevice)localObject).connectGatt(this.hEt.context, this.hEo, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a(this.hEt), 0);
        continue;
        localObject = ((BluetoothDevice)localObject).connectGatt(this.hEt.context, this.hEo, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a(this.hEt), 1);
        continue;
        localObject = ((BluetoothDevice)localObject).connectGatt(this.hEt.context, this.hEo, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a(this.hEt));
      }
      label581: localObject = this.ceI;
      bool2 = bool1;
      if (Thread.currentThread() == Looper.getMainLooper().getThread())
        bool2 = true;
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.ConnectAction", "Get Gatt fail!, deviceId=%s mainthread:%b", new Object[] { localObject, Boolean.valueOf(bool2) });
    }
    while (true)
    {
      a(j.hEM);
      done();
      AppMethodBeat.o(94259);
      break;
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.ConnectAction", "Device not found, deviceId=%s", new Object[] { this.ceI });
    }
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(94260);
    switch (paramj.errCode)
    {
    default:
    case 10012:
    }
    while (true)
    {
      AppMethodBeat.o(94260);
      return;
      this.hEt.dW(false);
    }
  }

  public final String getName()
  {
    return "ConnectAction";
  }

  public final void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94261);
    String str1;
    String str3;
    if (paramBluetoothGatt != null)
    {
      str1 = paramBluetoothGatt.toString();
      String str2 = f.od(paramInt1);
      if (paramInt2 != 2)
        break label98;
      str3 = "CONNECTED";
      label30: com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.ConnectAction", "[onConnectionStateChange]gatt:%s gattStatus:%s, newState:%s", new Object[] { str1, str2, str3 });
      this.hEt.hEl = paramBluetoothGatt;
      if (paramInt2 != 2)
        break label105;
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.ConnectAction", "Attempting to start service discovery", new Object[0]);
      paramBluetoothGatt.discoverServices();
      AppMethodBeat.o(94261);
    }
    while (true)
    {
      return;
      str1 = "";
      break;
      label98: str3 = "DISCONNECTED";
      break label30;
      label105: if (paramInt2 == 0)
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.ConnectAction", "close", new Object[0]);
        this.hEt.dW(false);
        paramBluetoothGatt = new StringBuilder();
        paramBluetoothGatt.append("fail:connection fail");
        paramBluetoothGatt.append(" ");
        paramBluetoothGatt.append("status:");
        paramBluetoothGatt.append(paramInt1);
        a(new j(10003, paramBluetoothGatt.toString()));
      }
      AppMethodBeat.o(94261);
    }
  }

  public final void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    AppMethodBeat.i(94262);
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.ConnectAction", "[onServicesDiscovered] status:%s", new Object[] { f.od(paramInt) });
    this.hEt.hEl = paramBluetoothGatt;
    if (paramInt == 0)
      a(j.hEL);
    while (true)
    {
      done();
      AppMethodBeat.o(94262);
      return;
      a(j.hFd);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(94263);
    String str = "ConnectAction{deviceId='" + this.ceI + '\'' + ", debug=" + this.aJe + ", mainThread=" + this.hDP + ", serial=" + this.hDR + '}';
    AppMethodBeat.o(94263);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a.b
 * JD-Core Version:    0.6.2
 */