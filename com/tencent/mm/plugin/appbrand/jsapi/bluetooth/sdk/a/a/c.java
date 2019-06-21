package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.f;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b;
import java.util.UUID;

@TargetApi(18)
public final class c extends com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a
{
  private final boolean enable;
  private final String hEq;
  private final String hEr;

  public c(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.hEq = paramString1;
    this.hEr = paramString2;
    this.enable = paramBoolean;
  }

  public final void aCR()
  {
    AppMethodBeat.i(94264);
    BluetoothGatt localBluetoothGatt = this.hEt.hEl;
    if (localBluetoothGatt == null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, bluetoothGatt is null", new Object[] { this });
      a(j.hET);
      done();
      AppMethodBeat.o(94264);
    }
    while (true)
    {
      return;
      Object localObject = localBluetoothGatt.getService(UUID.fromString(this.hEq));
      if (localObject == null)
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, gattService is null", new Object[] { this });
        a(j.hER);
        done();
        AppMethodBeat.o(94264);
      }
      else if (!b.AX(this.hEr))
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", new Object[] { this });
        a(j.hES);
        done();
        AppMethodBeat.o(94264);
      }
      else
      {
        localObject = ((BluetoothGattService)localObject).getCharacteristic(UUID.fromString(this.hEr));
        if (localObject == null)
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, gattCharacteristic is null", new Object[] { this });
          a(j.hES);
          done();
          AppMethodBeat.o(94264);
        }
        else if (!b.ok(((BluetoothGattCharacteristic)localObject).getProperties()))
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, not support indicate", new Object[] { this });
          a(j.hEU);
          done();
          AppMethodBeat.o(94264);
        }
        else if (!localBluetoothGatt.setCharacteristicNotification((BluetoothGattCharacteristic)localObject, this.enable))
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.setCharacteristicNotification fail", new Object[] { this });
          a(j.hEV);
          done();
          AppMethodBeat.o(94264);
        }
        else
        {
          BluetoothGattDescriptor localBluetoothGattDescriptor = ((BluetoothGattCharacteristic)localObject).getDescriptor(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b.a.hEs);
          if (localBluetoothGattDescriptor == null)
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s gattCharacteristic.getDescriptor fail", new Object[] { this });
            a(j.hEX);
            done();
            AppMethodBeat.o(94264);
          }
          else
          {
            if (this.enable);
            for (localObject = BluetoothGattDescriptor.ENABLE_INDICATION_VALUE; ; localObject = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)
            {
              if (localBluetoothGattDescriptor.setValue((byte[])localObject))
                break label389;
              com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s gattDescriptor.setValue fail", new Object[] { this });
              a(j.hEY);
              done();
              AppMethodBeat.o(94264);
              break;
            }
            label389: if (!localBluetoothGatt.writeDescriptor(localBluetoothGattDescriptor))
            {
              com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.writeDescriptor fail", new Object[] { this });
              a(j.hEZ);
              done();
              AppMethodBeat.o(94264);
            }
            else
            {
              a(j.hEL);
              AppMethodBeat.o(94264);
            }
          }
        }
      }
    }
  }

  public final String getName()
  {
    return "IndicateCharacteristicAction";
  }

  public final void onDescriptorWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    AppMethodBeat.i(94265);
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.Action", "action:%s onDescriptorWrite status:%s", new Object[] { this, f.od(paramInt) });
    done();
    AppMethodBeat.o(94265);
  }

  public final String toString()
  {
    AppMethodBeat.i(94266);
    String str = "IndicateCharacteristicAction{serviceId='" + this.hEq + '\'' + ", characteristicId='" + this.hEr + '\'' + ", enable=" + this.enable + ", debug=" + this.aJe + ", mainThread=" + this.hDP + ", serial=" + this.hDR + '}';
    AppMethodBeat.o(94266);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a.c
 * JD-Core Version:    0.6.2
 */