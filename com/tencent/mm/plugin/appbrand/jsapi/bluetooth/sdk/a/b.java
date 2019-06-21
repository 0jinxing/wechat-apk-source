package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public final class b
  implements e
{
  public Handler awA;
  public Queue<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a> hEb;
  com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a hEc;
  public List<com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a> hEd;

  public b()
  {
    AppMethodBeat.i(94232);
    this.awA = new Handler(Looper.getMainLooper());
    AppMethodBeat.o(94232);
  }

  public final void aCQ()
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(94233);
        if ((this.hEc != null) && (!this.hEc.bcp))
        {
          AppMethodBeat.o(94233);
          return;
        }
        if ((this.hEb == null) || (this.hEb.size() <= 0))
          break label150;
        this.hEc = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a)this.hEb.poll());
        if (this.hEc == null)
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.d.a.w("MicroMsg.Ble.BleConnectDispatcher", "curSerialAction is null, err", new Object[0]);
          AppMethodBeat.o(94233);
          continue;
        }
      }
      finally
      {
      }
      if (this.hEc.hDP)
      {
        Handler localHandler = this.awA;
        b.2 local2 = new com/tencent/mm/plugin/appbrand/jsapi/bluetooth/sdk/a/b$2;
        local2.<init>(this);
        localHandler.postDelayed(local2, this.hEc.hEy);
        AppMethodBeat.o(94233);
      }
      else
      {
        this.hEc.aCS();
        label150: AppMethodBeat.o(94233);
      }
    }
  }

  public final void onCharacteristicChanged(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic)
  {
    AppMethodBeat.i(94238);
    if (this.hEd != null)
    {
      paramBluetoothGatt = this.hEd.iterator();
      while (paramBluetoothGatt.hasNext())
        paramBluetoothGatt.next();
    }
    AppMethodBeat.o(94238);
  }

  public final void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    AppMethodBeat.i(94236);
    if (this.hEc != null)
      this.hEc.onCharacteristicRead(paramBluetoothGatt, paramBluetoothGattCharacteristic, paramInt);
    if (this.hEd != null)
    {
      Iterator localIterator = this.hEd.iterator();
      while (localIterator.hasNext())
      {
        paramBluetoothGattCharacteristic = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a)localIterator.next();
        if (paramBluetoothGattCharacteristic.bcp)
          paramBluetoothGattCharacteristic.onServicesDiscovered(paramBluetoothGatt, paramInt);
      }
    }
    AppMethodBeat.o(94236);
  }

  public final void onCharacteristicWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    AppMethodBeat.i(94237);
    if (this.hEc != null)
      this.hEc.onCharacteristicWrite(paramBluetoothGatt, paramBluetoothGattCharacteristic, paramInt);
    if (this.hEd != null)
    {
      Iterator localIterator = this.hEd.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a locala = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a)localIterator.next();
        if (locala.bcp)
          locala.onCharacteristicWrite(paramBluetoothGatt, paramBluetoothGattCharacteristic, paramInt);
      }
    }
    AppMethodBeat.o(94237);
  }

  public final void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94234);
    if (this.hEc != null)
      this.hEc.onConnectionStateChange(paramBluetoothGatt, paramInt1, paramInt2);
    if (this.hEd != null)
    {
      Iterator localIterator = this.hEd.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a locala = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a)localIterator.next();
        if (locala.bcp)
          locala.onConnectionStateChange(paramBluetoothGatt, paramInt1, paramInt2);
      }
    }
    AppMethodBeat.o(94234);
  }

  public final void onDescriptorRead(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    AppMethodBeat.i(94239);
    if (this.hEd != null)
    {
      paramBluetoothGatt = this.hEd.iterator();
      while (paramBluetoothGatt.hasNext())
        paramBluetoothGatt.next();
    }
    AppMethodBeat.o(94239);
  }

  public final void onDescriptorWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    AppMethodBeat.i(94240);
    if (this.hEc != null)
      this.hEc.onDescriptorWrite(paramBluetoothGatt, paramBluetoothGattDescriptor, paramInt);
    if (this.hEd != null)
    {
      Iterator localIterator = this.hEd.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a locala = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a)localIterator.next();
        if (locala.bcp)
          locala.onDescriptorWrite(paramBluetoothGatt, paramBluetoothGattDescriptor, paramInt);
      }
    }
    AppMethodBeat.o(94240);
  }

  public final void onMtuChanged(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94243);
    if (this.hEd != null)
    {
      paramBluetoothGatt = this.hEd.iterator();
      while (paramBluetoothGatt.hasNext())
        paramBluetoothGatt.next();
    }
    AppMethodBeat.o(94243);
  }

  public final void onReadRemoteRssi(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94242);
    if (this.hEd != null)
    {
      Iterator localIterator = this.hEd.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a locala = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a)localIterator.next();
        if (locala.bcp)
          locala.onServicesDiscovered(paramBluetoothGatt, paramInt2);
      }
    }
    AppMethodBeat.o(94242);
  }

  public final void onReliableWriteCompleted(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    AppMethodBeat.i(94241);
    if (this.hEd != null)
    {
      paramBluetoothGatt = this.hEd.iterator();
      while (paramBluetoothGatt.hasNext())
        paramBluetoothGatt.next();
    }
    AppMethodBeat.o(94241);
  }

  public final void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    AppMethodBeat.i(94235);
    if (this.hEc != null)
      this.hEc.onServicesDiscovered(paramBluetoothGatt, paramInt);
    if (this.hEd != null)
    {
      Iterator localIterator = this.hEd.iterator();
      while (localIterator.hasNext())
      {
        com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a locala = (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.c.a)localIterator.next();
        if (locala.bcp)
          locala.onServicesDiscovered(paramBluetoothGatt, paramInt);
      }
    }
    AppMethodBeat.o(94235);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.b
 * JD-Core Version:    0.6.2
 */