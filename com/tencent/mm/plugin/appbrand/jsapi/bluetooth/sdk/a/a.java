package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(18)
public final class a extends BluetoothGattCallback
{
  public e hEa;

  public a(e parame)
  {
    this.hEa = parame;
  }

  public final void onCharacteristicChanged(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic)
  {
    AppMethodBeat.i(94224);
    this.hEa.onCharacteristicChanged(paramBluetoothGatt, paramBluetoothGattCharacteristic);
    AppMethodBeat.o(94224);
  }

  public final void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    AppMethodBeat.i(94222);
    this.hEa.onCharacteristicRead(paramBluetoothGatt, paramBluetoothGattCharacteristic, paramInt);
    AppMethodBeat.o(94222);
  }

  public final void onCharacteristicWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt)
  {
    AppMethodBeat.i(94223);
    this.hEa.onCharacteristicWrite(paramBluetoothGatt, paramBluetoothGattCharacteristic, paramInt);
    AppMethodBeat.o(94223);
  }

  public final void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94220);
    this.hEa.onConnectionStateChange(paramBluetoothGatt, paramInt1, paramInt2);
    AppMethodBeat.o(94220);
  }

  public final void onDescriptorRead(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    AppMethodBeat.i(94225);
    this.hEa.onDescriptorRead(paramBluetoothGatt, paramBluetoothGattDescriptor, paramInt);
    AppMethodBeat.o(94225);
  }

  public final void onDescriptorWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt)
  {
    AppMethodBeat.i(94226);
    this.hEa.onDescriptorWrite(paramBluetoothGatt, paramBluetoothGattDescriptor, paramInt);
    AppMethodBeat.o(94226);
  }

  public final void onMtuChanged(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94229);
    this.hEa.onMtuChanged(paramBluetoothGatt, paramInt1, paramInt2);
    AppMethodBeat.o(94229);
  }

  public final void onReadRemoteRssi(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94228);
    this.hEa.onReadRemoteRssi(paramBluetoothGatt, paramInt1, paramInt2);
    AppMethodBeat.o(94228);
  }

  public final void onReliableWriteCompleted(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    AppMethodBeat.i(94227);
    this.hEa.onReliableWriteCompleted(paramBluetoothGatt, paramInt);
    AppMethodBeat.o(94227);
  }

  public final void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt)
  {
    AppMethodBeat.i(94221);
    this.hEa.onServicesDiscovered(paramBluetoothGatt, paramInt);
    AppMethodBeat.o(94221);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.a
 * JD-Core Version:    0.6.2
 */