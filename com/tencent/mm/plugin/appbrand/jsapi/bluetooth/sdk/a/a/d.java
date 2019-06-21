package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.f;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b;
import java.util.UUID;

@TargetApi(18)
public final class d extends com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a
{
  private final boolean enable;
  private final String hEq;
  private final String hEr;

  public d(String paramString1, String paramString2, boolean paramBoolean)
  {
    this.hEq = paramString1;
    this.hEr = paramString2;
    this.enable = paramBoolean;
  }

  public final void aCR()
  {
    AppMethodBeat.i(94267);
    BluetoothGatt localBluetoothGatt = this.hEt.hEl;
    if (localBluetoothGatt == null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, bluetoothGatt is null", new Object[] { this });
      a(j.hET);
      done();
      AppMethodBeat.o(94267);
    }
    while (true)
    {
      return;
      if (!b.AX(this.hEq))
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, serviceId is illegal", new Object[] { this });
        a(j.hER);
        done();
        AppMethodBeat.o(94267);
      }
      else
      {
        Object localObject = localBluetoothGatt.getService(UUID.fromString(this.hEq));
        if (localObject == null)
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, gattService is null", new Object[] { this });
          a(j.hER);
          done();
          AppMethodBeat.o(94267);
        }
        else if (!b.AX(this.hEr))
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", new Object[] { this });
          a(j.hES);
          done();
          AppMethodBeat.o(94267);
        }
        else
        {
          localObject = ((BluetoothGattService)localObject).getCharacteristic(UUID.fromString(this.hEr));
          if (localObject == null)
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, gattCharacteristic is null", new Object[] { this });
            a(j.hES);
            done();
            AppMethodBeat.o(94267);
          }
          else if (!b.oj(((BluetoothGattCharacteristic)localObject).getProperties()))
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, not support notify", new Object[] { this });
            a(j.hEU);
            done();
            AppMethodBeat.o(94267);
          }
          else if (!localBluetoothGatt.setCharacteristicNotification((BluetoothGattCharacteristic)localObject, this.enable))
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.setCharacteristicNotification fail", new Object[] { this });
            a(j.hEV);
            done();
            AppMethodBeat.o(94267);
          }
          else
          {
            BluetoothGattDescriptor localBluetoothGattDescriptor = ((BluetoothGattCharacteristic)localObject).getDescriptor(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.b.a.hEs);
            if (localBluetoothGattDescriptor == null)
            {
              com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s gattCharacteristic.getDescriptor fail", new Object[] { this });
              a(j.hEX);
              done();
              AppMethodBeat.o(94267);
            }
            else
            {
              if (this.enable);
              for (localObject = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE; ; localObject = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE)
              {
                if (localBluetoothGattDescriptor.setValue((byte[])localObject))
                  break label433;
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s gattDescriptor.setValue fail", new Object[] { this });
                a(j.hEY);
                done();
                AppMethodBeat.o(94267);
                break;
              }
              label433: if (!localBluetoothGatt.writeDescriptor(localBluetoothGattDescriptor))
              {
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.writeDescriptor fail", new Object[] { this });
                a(j.hEZ);
                done();
                AppMethodBeat.o(94267);
              }
              else
              {
                a(j.hEL);
                AppMethodBeat.o(94267);
              }
            }
          }
        }
      }
    }
  }

  public final String getName()
  {
    return "NotifyCharacteristicAction";
  }

  public final void onDescriptorWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    AppMethodBeat.i(94268);
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.Action", "action:%s onDescriptorWrite status:%s", new Object[] { this, f.od(paramInt) });
    done();
    AppMethodBeat.o(94268);
  }

  public final String toString()
  {
    AppMethodBeat.i(94269);
    String str = "NotifyCharacteristicAction{serviceId='" + this.hEq + '\'' + ", characteristicId='" + this.hEr + '\'' + ", enable=" + this.enable + ", debug=" + this.aJe + ", mainThread=" + this.hDP + ", serial=" + this.hDR + '}';
    AppMethodBeat.o(94269);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a.d
 * JD-Core Version:    0.6.2
 */