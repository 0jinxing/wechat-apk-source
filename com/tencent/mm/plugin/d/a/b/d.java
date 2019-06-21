package com.tencent.mm.plugin.d.a.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.LinkedList;

@TargetApi(18)
public final class d
{
  private int aBR;
  BluetoothDevice hGa;
  private BluetoothAdapter jEU;
  Context jFS;
  BluetoothGatt jFT;
  b jFU;
  BluetoothGattCharacteristic jFV;
  BluetoothGattCharacteristic jFW;
  a jFX;
  Runnable jFY;
  Runnable jFZ;
  Runnable jGa;
  d jGb;
  final LinkedList<byte[]> jGc;
  volatile boolean jGd;
  int jGe;
  final BluetoothGattCallback jGf;
  public ak mHandler;
  long mSessionId;
  private HandlerThread mThread;

  @TargetApi(18)
  public d(long paramLong, Context paramContext, b paramb)
  {
    AppMethodBeat.i(18398);
    this.jGc = new LinkedList();
    this.jGd = false;
    this.jGf = new d.1(this);
    this.aBR = -1;
    this.aBR = hashCode();
    this.jGb = this;
    this.jFU = paramb;
    this.jFS = paramContext;
    this.jEU = ((BluetoothManager)this.jFS.getSystemService("bluetooth")).getAdapter();
    this.mSessionId = paramLong;
    this.jGe = 3;
    this.hGa = this.jEU.getRemoteDevice(com.tencent.mm.plugin.d.a.e.a.gC(paramLong));
    this.jFV = null;
    this.jFW = null;
    this.jFX = new a();
    this.mThread = com.tencent.mm.sdk.g.d.anM("BluetoothLESession_handlerThread");
    this.mThread.start();
    this.mHandler = new d.a(this.mThread.getLooper(), this);
    this.jFY = new d.2(this);
    this.jFZ = new d.3(this);
    this.jGa = new d.4(this);
    AppMethodBeat.o(18398);
  }

  final void aVA()
  {
    AppMethodBeat.i(18402);
    if (this.jGc.isEmpty())
    {
      this.jGd = false;
      AppMethodBeat.o(18402);
    }
    while (true)
    {
      return;
      byte[] arrayOfByte = (byte[])this.jGc.pop();
      this.jFX.setData(arrayOfByte);
      arrayOfByte = this.jFX.aVu();
      ab.d("MicroMsg.exdevice.BluetoothLESession", "Out data dump = %s", new Object[] { com.tencent.mm.plugin.exdevice.j.b.aN(arrayOfByte) });
      this.jFW.setValue(arrayOfByte);
      this.mHandler.postDelayed(this.jFY, 5000L);
      if (!this.jFT.writeCharacteristic(this.jFW))
        ab.e("MicroMsg.exdevice.BluetoothLESession", "mBluetoothGatt.writeCharacteristic Failed!!!");
      this.jGd = true;
      AppMethodBeat.o(18402);
    }
  }

  final void aVz()
  {
    AppMethodBeat.i(18401);
    this.jGd = false;
    this.jGc.clear();
    AppMethodBeat.o(18401);
  }

  public final void close()
  {
    AppMethodBeat.i(18400);
    ab.i("MicroMsg.exdevice.BluetoothLESession", "------close------");
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(2)))
      ab.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(2) });
    this.mThread.quitSafely();
    AppMethodBeat.o(18400);
  }

  public final boolean connect()
  {
    AppMethodBeat.i(18399);
    ab.i("MicroMsg.exdevice.BluetoothLESession", "------connect------");
    boolean bool = this.mHandler.sendMessage(this.mHandler.obtainMessage(0));
    AppMethodBeat.o(18399);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.d
 * JD-Core Version:    0.6.2
 */