package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.j;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.b;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

@TargetApi(18)
public final class f extends com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a
{
  private final String hEq;
  private final String hEr;
  private final String value;

  public f(String paramString1, String paramString2, String paramString3)
  {
    this.hEq = paramString1;
    this.hEr = paramString2;
    this.value = paramString3;
  }

  public final void aCR()
  {
    AppMethodBeat.i(94273);
    BluetoothGatt localBluetoothGatt = this.hEt.hEl;
    if (localBluetoothGatt == null)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, bluetoothGatt is null", new Object[] { this });
      a(j.hET);
      done();
      AppMethodBeat.o(94273);
    }
    while (true)
    {
      return;
      if (!b.AX(this.hEq))
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, serviceId is illegal", new Object[] { this });
        a(j.hER);
        done();
        AppMethodBeat.o(94273);
      }
      else
      {
        Object localObject = localBluetoothGatt.getService(UUID.fromString(this.hEq));
        if (localObject == null)
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, gattService is null", new Object[] { this });
          a(j.hER);
          done();
          AppMethodBeat.o(94273);
        }
        else if (!b.AX(this.hEr))
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, characteristicId is illegal", new Object[] { this });
          a(j.hES);
          done();
          AppMethodBeat.o(94273);
        }
        else
        {
          BluetoothGattCharacteristic localBluetoothGattCharacteristic = ((BluetoothGattService)localObject).getCharacteristic(UUID.fromString(this.hEr));
          if (localBluetoothGattCharacteristic == null)
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, gattCharacteristic is null", new Object[] { this });
            a(j.hES);
            done();
            AppMethodBeat.o(94273);
          }
          else if ((!b.oh(localBluetoothGattCharacteristic.getProperties())) && (!b.oi(localBluetoothGattCharacteristic.getProperties())))
          {
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s, not support write & writeNoResponse", new Object[] { this });
            a(j.hEU);
            done();
            AppMethodBeat.o(94273);
          }
          else
          {
            byte[] arrayOfByte = Base64.decode(this.value, 2);
            if ((arrayOfByte == null) || (arrayOfByte.length == 0))
              com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.BleHelper", "data is null", new Object[0]);
            int k;
            for (localObject = new byte[0]; ; localObject = new byte[0])
            {
              localBluetoothGattCharacteristic.setValue((byte[])localObject);
              com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.Action", "dataToWrite's length:%d", new Object[] { Integer.valueOf(localObject.length) });
              if (this.aJe)
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.Action", "dataToWrite:%s", new Object[] { Arrays.toString((byte[])localObject) });
              if (localBluetoothGatt.writeCharacteristic(localBluetoothGattCharacteristic))
                break label643;
              com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.e("MicroMsg.Ble.Action", "action:%s bluetoothGatt.writeCharacteristic fail", new Object[] { this });
              a(j.hEV);
              done();
              AppMethodBeat.o(94273);
              break;
              i = arrayOfByte.length;
              j = i;
              if (arrayOfByte.length < i)
              {
                com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.BleHelper", "data length is shorter then print command length", new Object[0]);
                j = arrayOfByte.length;
              }
              localObject = new StringBuilder();
              for (i = 0; i < j; i++)
              {
                k = arrayOfByte[i] & 0xFF;
                if (k < 16)
                  ((StringBuilder)localObject).append("0");
                ((StringBuilder)localObject).append(Integer.toHexString(k));
              }
              localObject = ((StringBuilder)localObject).toString().toUpperCase(Locale.US);
              com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.d("MicroMsg.Ble.BleHelper", "write data = %s", new Object[] { localObject });
              if ((localObject != null) && (!((String)localObject).equals("")))
                break label557;
            }
            label557: int i = ((String)localObject).toUpperCase().length() / 2;
            char[] arrayOfChar = ((String)localObject).toCharArray();
            arrayOfByte = new byte[i];
            for (int j = 0; ; j++)
            {
              localObject = arrayOfByte;
              if (j >= i)
                break;
              k = j * 2;
              int m = (byte)"0123456789ABCDEF".indexOf(arrayOfChar[k]);
              arrayOfByte[j] = ((byte)(byte)((byte)"0123456789ABCDEF".indexOf(arrayOfChar[(k + 1)]) | m << 4));
            }
            label643: if ((!b.oh(localBluetoothGattCharacteristic.getProperties())) && (b.oi(localBluetoothGattCharacteristic.getProperties())))
            {
              a(j.hEL);
              done();
            }
            AppMethodBeat.o(94273);
          }
        }
      }
    }
  }

  public final String getName()
  {
    return "WriteCharacteristicAction";
  }

  public final void onCharacteristicWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    AppMethodBeat.i(94274);
    com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.i("MicroMsg.Ble.Action", "action:%s onCharacteristicWrite status:%s", new Object[] { this, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.f.od(paramInt) });
    if (paramInt == 0)
      a(j.hEL);
    done();
    AppMethodBeat.o(94274);
  }

  public final String toString()
  {
    AppMethodBeat.i(94275);
    String str = "WriteCharacteristicAction{serviceId='" + this.hEq + '\'' + ", characteristicId='" + this.hEr + '\'' + ", value='" + this.value + '\'' + ", debug=" + this.aJe + ", mainThread=" + this.hDP + ", serial=" + this.hDR + '}';
    AppMethodBeat.o(94275);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a.f
 * JD-Core Version:    0.6.2
 */