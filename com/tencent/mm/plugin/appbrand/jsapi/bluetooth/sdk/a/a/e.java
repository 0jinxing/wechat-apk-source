package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.f;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b;
import java.util.UUID;

@TargetApi(18)
public final class e extends com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a
{
  private final String hEq;
  private final String hEr;

  public e(String paramString1, String paramString2)
  {
    this.hEq = paramString1;
    this.hEr = paramString2;
  }

  public final void aCR()
  {
    AppMethodBeat.i(94270);
    BluetoothGatt localBluetoothGatt = this.hEt.hEl;
    if (localBluetoothGatt == null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, bluetoothGatt is null", new Object[] { this });
      a(j.hET);
      done();
      AppMethodBeat.o(94270);
    }
    while (true)
    {
      return;
      if (!b.AX(this.hEq))
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, serviceId is illegal", new Object[] { this });
        a(j.hER);
        done();
        AppMethodBeat.o(94270);
      }
      else
      {
        Object localObject = localBluetoothGatt.getService(UUID.fromString(this.hEq));
        if (localObject == null)
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, gattService is null", new Object[] { this });
          a(j.hER);
          done();
          AppMethodBeat.o(94270);
        }
        else if (!b.AX(this.hEr))
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", new Object[] { this });
          a(j.hES);
          done();
          AppMethodBeat.o(94270);
        }
        else
        {
          localObject = ((BluetoothGattService)localObject).getCharacteristic(UUID.fromString(this.hEr));
          if (localObject == null)
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, gattCharacteristic is null", new Object[] { this });
            a(j.hES);
            done();
            AppMethodBeat.o(94270);
          }
          else if (!b.og(((BluetoothGattCharacteristic)localObject).getProperties()))
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, not support read", new Object[] { this });
            a(j.hEU);
            done();
            AppMethodBeat.o(94270);
          }
          else if (!localBluetoothGatt.readCharacteristic((BluetoothGattCharacteristic)localObject))
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.readCharacteristic fail", new Object[] { this });
            a(j.hEV);
            done();
            AppMethodBeat.o(94270);
          }
          else
          {
            a(j.hEL);
            AppMethodBeat.o(94270);
          }
        }
      }
    }
  }

  public final String getName()
  {
    return "ReadCharacteristicAction";
  }

  public final void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    AppMethodBeat.i(94271);
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.Action", "action:%s onCharacteristicRead status:%s", new Object[] { this, f.od(paramInt) });
    done();
    AppMethodBeat.o(94271);
  }

  public final String toString()
  {
    AppMethodBeat.i(94272);
    String str = "ReadCharacteristicAction{serviceId='" + this.hEq + '\'' + ", characteristicId='" + this.hEr + '\'' + ", debug=" + this.aJe + ", mainThread=" + this.hDP + ", serial=" + this.hDR + '}';
    AppMethodBeat.o(94272);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a.e
 * JD-Core Version:    0.6.2
 */