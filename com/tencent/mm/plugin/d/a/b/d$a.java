package com.tencent.mm.plugin.d.a.b;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.UUID;
import junit.framework.Assert;

final class d$a extends ak
{
  private final WeakReference<d> jGh;

  public d$a(Looper paramLooper, d paramd)
  {
    super(paramLooper);
    AppMethodBeat.i(18396);
    this.jGh = new WeakReference(paramd);
    AppMethodBeat.o(18396);
  }

  public final void handleMessage(Message paramMessage)
  {
    boolean bool1 = true;
    int i = 1;
    AppMethodBeat.i(18397);
    d locald = (d)this.jGh.get();
    if (locald == null)
    {
      ab.e("MicroMsg.exdevice.BluetoothLESession", "null == BluetoothLESession");
      AppMethodBeat.o(18397);
      return;
    }
    switch (paramMessage.what)
    {
    default:
    case 0:
    case 4:
    case 5:
    case 6:
    case 1:
    case 3:
    case 7:
    case 8:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(18397);
      break;
      ab.i("MicroMsg.exdevice.BluetoothLESession", "------connectImp------");
      if (1 == locald.jGe)
      {
        ab.w("MicroMsg.exdevice.BluetoothLESession", "Remote device is connected !!!");
        AppMethodBeat.o(18397);
        break;
      }
      if (locald.jGe == 0)
      {
        ab.w("MicroMsg.exdevice.BluetoothLESession", "Remote device is connecting !!!");
        AppMethodBeat.o(18397);
        break;
      }
      locald.aVz();
      if (locald.jFT != null)
      {
        if (!locald.jFT.connect())
        {
          ab.e("MicroMsg.exdevice.BluetoothLESession", "mBluetoothGatt.connect() Failed!!!");
          if (locald.jFU != null)
            locald.jFU.jFz.l(locald.mSessionId, false);
          AppMethodBeat.o(18397);
          break;
        }
        locald.jGe = 0;
        locald.mHandler.postDelayed(locald.jGa, 10000L);
        AppMethodBeat.o(18397);
        break;
      }
      locald.jFT = locald.hGa.connectGatt(locald.jFS, false, locald.jGf);
      if (locald.jFT == null)
      {
        ab.e("MicroMsg.exdevice.BluetoothLESession", "mDevice.connectGatt Failed!!!");
        if (locald.jFU != null)
          locald.jFU.jFz.l(locald.mSessionId, false);
        AppMethodBeat.o(18397);
        break;
      }
      locald.jGe = 0;
      locald.mHandler.postDelayed(locald.jGa, 10000L);
      AppMethodBeat.o(18397);
      break;
      i = paramMessage.arg1;
      if (i == 2);
      for (paramMessage = "Connected"; ; paramMessage = "Disconnected")
      {
        ab.i("MicroMsg.exdevice.BluetoothLESession", "------onConnectionStateChangeImp------ aState = %s", new Object[] { paramMessage });
        if (i != 2)
          break label587;
        ab.i("MicroMsg.exdevice.BluetoothLESession", "PHY Connected is OK, mConnectState = %d", new Object[] { Integer.valueOf(locald.jGe) });
        if (3 != locald.jGe)
          break label462;
        ab.w("MicroMsg.exdevice.BluetoothLESession", "Close or disconnect is Called, Leave without discover Services");
        locald.mHandler.removeCallbacks(locald.jGa);
        AppMethodBeat.o(18397);
        break;
      }
      label462: if (1 == locald.jGe)
      {
        ab.w("MicroMsg.exdevice.BluetoothLESession", "Connected is done, Leave without discover Services");
        locald.mHandler.removeCallbacks(locald.jGa);
        AppMethodBeat.o(18397);
        break;
      }
      if (!locald.jFT.discoverServices())
      {
        ab.e("MicroMsg.exdevice.BluetoothLESession", "discover Services start failed!!!");
        locald.jGe = 2;
        locald.mHandler.removeCallbacks(locald.jGa);
        if (locald.jFU != null)
          locald.jFU.jFz.l(locald.mSessionId, false);
        AppMethodBeat.o(18397);
        break;
      }
      ab.i("MicroMsg.exdevice.BluetoothLESession", "start discoverServices...");
      AppMethodBeat.o(18397);
      break;
      label587: if (i == 0)
      {
        ab.w("MicroMsg.exdevice.BluetoothLESession", "Disconnected from GATT server.");
        locald.jGe = 2;
        locald.mHandler.removeCallbacks(locald.jGa);
        if (locald.jFU != null)
          locald.jFU.jFz.l(locald.mSessionId, false);
      }
      AppMethodBeat.o(18397);
      break;
      Object localObject = (BluetoothGatt)paramMessage.obj;
      int j = paramMessage.arg1;
      ab.i("MicroMsg.exdevice.BluetoothLESession", "onServicesDiscoveredImp, status = %d", new Object[] { Integer.valueOf(j) });
      if (3 == locald.jGe)
      {
        ab.w("MicroMsg.exdevice.BluetoothLESession", "Close or disconnect is Called, Just Leave");
        locald.mHandler.removeCallbacks(locald.jGa);
        AppMethodBeat.o(18397);
        break;
      }
      if (1 == locald.jGe)
      {
        ab.w("MicroMsg.exdevice.BluetoothLESession", "Connected is done, Just Leave");
        locald.mHandler.removeCallbacks(locald.jGa);
        AppMethodBeat.o(18397);
        break;
      }
      if (j != 0)
      {
        ab.e("MicroMsg.exdevice.BluetoothLESession", "Discover services error");
        locald.jGe = 2;
        locald.mHandler.removeCallbacks(locald.jGa);
        if (locald.jFU != null)
          locald.jFU.jFz.l(locald.mSessionId, false);
        AppMethodBeat.o(18397);
        break;
      }
      paramMessage = ((BluetoothGatt)localObject).getService(UUID.fromString(h.jGH));
      if (paramMessage == null)
      {
        ab.e("MicroMsg.exdevice.BluetoothLESession", "Can't not find service(with UUID 0xfee7)");
        locald.jGe = 2;
        locald.mHandler.removeCallbacks(locald.jGa);
        if (locald.jFU != null)
          locald.jFU.jFz.l(locald.mSessionId, false);
        AppMethodBeat.o(18397);
        break;
      }
      locald.jFV = paramMessage.getCharacteristic(UUID.fromString(h.jGJ));
      if (locald.jFV == null)
      {
        ab.e("MicroMsg.exdevice.BluetoothLESession", "Can't not find characteristic(with UUID 0xfec8)");
        locald.jGe = 2;
        locald.mHandler.removeCallbacks(locald.jGa);
        if (locald.jFU != null)
          locald.jFU.jFz.l(locald.mSessionId, false);
        AppMethodBeat.o(18397);
        break;
      }
      locald.jFW = paramMessage.getCharacteristic(UUID.fromString(h.jGI));
      if (locald.jFW == null)
      {
        ab.e("MicroMsg.exdevice.BluetoothLESession", "Can't not find characteristic(with UUID 0xfec7)");
        locald.jGe = 2;
        locald.mHandler.removeCallbacks(locald.jGa);
        if (locald.jFU != null)
          locald.jFU.jFz.l(locald.mSessionId, false);
        AppMethodBeat.o(18397);
        break;
      }
      j = locald.jFV.getProperties();
      ab.i("MicroMsg.exdevice.BluetoothLESession", "mRecvCharacteristic.getProperties = %d", new Object[] { Integer.valueOf(j) });
      if ((j & 0x20) == 0)
      {
        ab.e("MicroMsg.exdevice.BluetoothLESession", "Read characteristic can not be indicated");
        locald.jGe = 2;
        locald.mHandler.removeCallbacks(locald.jGa);
        if (locald.jFU != null)
          locald.jFU.jFz.l(locald.mSessionId, false);
        AppMethodBeat.o(18397);
        break;
      }
      ab.i("MicroMsg.exdevice.BluetoothLESession", "Set read characteristic indicator");
      paramMessage = locald.jGb;
      localObject = locald.jFV;
      if (!paramMessage.jFT.setCharacteristicNotification((BluetoothGattCharacteristic)localObject, true))
      {
        ab.e("MicroMsg.exdevice.BluetoothLESession", "Unable to set indicator for read characteristic");
        i = 0;
      }
      while (true)
      {
        if (i == 0)
        {
          ab.e("MicroMsg.exdevice.BluetoothLESession", "mSelfSession.setCharacteristicNotification Failed!!!");
          locald.jGe = 2;
          locald.mHandler.removeCallbacks(locald.jGa);
          if (locald.jFU != null)
            locald.jFU.jFz.l(locald.mSessionId, false);
        }
        AppMethodBeat.o(18397);
        break;
        localObject = ((BluetoothGattCharacteristic)localObject).getDescriptor(UUID.fromString(h.jGG));
        if (localObject == null)
        {
          ab.e("MicroMsg.exdevice.BluetoothLESession", "Can not get configure descriptor");
          i = 0;
        }
        else
        {
          ab.i("MicroMsg.exdevice.BluetoothLESession", "Configure descriptor permissions: " + ((BluetoothGattDescriptor)localObject).getPermissions());
          if (!((BluetoothGattDescriptor)localObject).setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE))
          {
            ab.e("MicroMsg.exdevice.BluetoothLESession", "Can not set configure descriptor value");
            i = 0;
          }
          else if (!paramMessage.jFT.writeDescriptor((BluetoothGattDescriptor)localObject))
          {
            ab.e("MicroMsg.exdevice.BluetoothLESession", "Can not write configure descriptor value");
            i = 0;
          }
          else
          {
            paramMessage.mHandler.postDelayed(paramMessage.jFZ, 5000L);
          }
        }
      }
      localObject = paramMessage.obj;
      i = paramMessage.arg1;
      ab.i("MicroMsg.exdevice.BluetoothLESession", "------onDescriptorWriteImp------ status = %d", new Object[] { Integer.valueOf(i) });
      locald.mHandler.removeCallbacks(locald.jFZ);
      locald.mHandler.removeCallbacks(locald.jGa);
      if (3 == locald.jGe)
      {
        ab.w("MicroMsg.exdevice.BluetoothLESession", "Close or disconnect is Called, Just Leave");
        AppMethodBeat.o(18397);
        break;
      }
      if (1 == locald.jGe)
      {
        ab.w("MicroMsg.exdevice.BluetoothLESession", "Connected is done, Just Leave");
        AppMethodBeat.o(18397);
        break;
      }
      if (i != 0)
      {
        ab.e("MicroMsg.exdevice.BluetoothLESession", "Write configure descriptor error");
        locald.jGe = 2;
        if (locald.jFU != null)
          locald.jFU.jFz.l(locald.mSessionId, false);
        AppMethodBeat.o(18397);
        break;
      }
      locald.jGe = 1;
      if (locald.jFU != null)
        locald.jFU.jFz.l(locald.mSessionId, true);
      ab.i("MicroMsg.exdevice.BluetoothLESession", "------BLE connect successfully------ mConnectState = %d", new Object[] { Integer.valueOf(locald.jGe) });
      AppMethodBeat.o(18397);
      break;
      ab.i("MicroMsg.exdevice.BluetoothLESession", "------disconnectImp------");
      if (3 == locald.jGe)
      {
        ab.w("MicroMsg.exdevice.BluetoothLESession", "diconnect or close is called aready, just leave");
        AppMethodBeat.o(18397);
        break;
      }
      locald.aVz();
      if (locald.jFT == null)
      {
        ab.e("MicroMsg.exdevice.BluetoothLESession", "disconnect:BluetoothGatt not found");
        AppMethodBeat.o(18397);
        break;
      }
      locald.jGe = 3;
      locald.mHandler.removeCallbacks(locald.jGa);
      locald.mHandler.removeCallbacks(locald.jFZ);
      locald.jFT.disconnect();
      AppMethodBeat.o(18397);
      break;
      paramMessage = (byte[])paramMessage.obj;
      ab.i("MicroMsg.exdevice.BluetoothLESession", "------writeDataAsync------ length = %d", new Object[] { Integer.valueOf(paramMessage.length) });
      if (1 != locald.jGe)
      {
        ab.e("MicroMsg.exdevice.BluetoothLESession", "Not ready for write data, connectstate = %d", new Object[] { Integer.valueOf(locald.jGe) });
        if (locald.jFU != null)
          locald.jFU.jFz.m(locald.mSessionId, false);
        AppMethodBeat.o(18397);
        break;
      }
      if ((locald.jFT != null) && (locald.jFW != null))
      {
        bool2 = true;
        label1842: Assert.assertTrue(bool2);
        locald.jGc.add(paramMessage);
        if (!locald.jGd)
          if (1 != locald.jGc.size())
            break label1905;
      }
      label1905: for (boolean bool2 = bool1; ; bool2 = false)
      {
        Assert.assertTrue(bool2);
        locald.aVA();
        AppMethodBeat.o(18397);
        break;
        bool2 = false;
        break label1842;
      }
      i = paramMessage.arg1;
      ab.i("MicroMsg.exdevice.BluetoothLESession", "------onDataWriteCallbackImp------ status = %d", new Object[] { Integer.valueOf(i) });
      locald.mHandler.removeCallbacks(locald.jFY);
      if (i != 0)
      {
        ab.e("MicroMsg.exdevice.BluetoothLESession", "write data error: ".concat(String.valueOf(i)));
        if (locald.jFU != null)
          locald.jFU.jFz.m(locald.mSessionId, false);
        locald.aVA();
        AppMethodBeat.o(18397);
        break;
      }
      paramMessage = locald.jFX.aVu();
      ab.d("MicroMsg.exdevice.BluetoothLESession", "Out data dump = %s", new Object[] { com.tencent.mm.plugin.exdevice.j.b.aN(paramMessage) });
      if (paramMessage == null)
      {
        ab.i("MicroMsg.exdevice.BluetoothLESession", "write data complete");
        if (locald.jFU != null)
          locald.jFU.jFz.m(locald.mSessionId, true);
        locald.aVA();
        AppMethodBeat.o(18397);
        break;
      }
      ab.i("MicroMsg.exdevice.BluetoothLESession", "write next chunk...");
      locald.jFW.setValue(paramMessage);
      locald.jFT.writeCharacteristic(locald.jFW);
      locald.mHandler.postDelayed(locald.jFY, 5000L);
      AppMethodBeat.o(18397);
      break;
      paramMessage = (byte[])paramMessage.obj;
      ab.i("MicroMsg.exdevice.BluetoothLESession", "------onDataReceiveImp------");
      if (bo.cb(paramMessage))
      {
        ab.e("MicroMsg.exdevice.BluetoothLESession", "Receive data is null or nil");
        AppMethodBeat.o(18397);
        break;
      }
      localObject = com.tencent.mm.plugin.exdevice.j.b.S(paramMessage, paramMessage.length);
      ab.i("MicroMsg.exdevice.BluetoothLESession", "data length = %d", new Object[] { Integer.valueOf(paramMessage.length) });
      ab.d("MicroMsg.exdevice.BluetoothLESession", "data dump = %s", new Object[] { localObject });
      if (locald.jFU != null)
        locald.jFU.jFz.b(locald.mSessionId, paramMessage);
      AppMethodBeat.o(18397);
      break;
      ab.i("MicroMsg.exdevice.BluetoothLESession", "------closeImp------");
      if (3 == locald.jGe)
      {
        ab.w("MicroMsg.exdevice.BluetoothLESession", "Close aready, Just leave");
        AppMethodBeat.o(18397);
        break;
      }
      locald.aVz();
      if (locald.jFT == null)
      {
        ab.w("MicroMsg.exdevice.BluetoothLESession", "close:BluetoothGatt not found");
        AppMethodBeat.o(18397);
        break;
      }
      locald.jGe = 3;
      locald.jFT.disconnect();
      locald.jFT.close();
      locald.jFT = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.d.a
 * JD-Core Version:    0.6.2
 */