package com.tencent.mm.plugin.d.a.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.b.a.c;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

@TargetApi(18)
public final class f
{
  static int jGz = 0;
  private int aBR;
  public BluetoothDevice hGa;
  private BluetoothAdapter jEU;
  private Context jFS;
  private BluetoothGatt jFT;
  private a jFX;
  private Runnable jFY;
  private Runnable jGa;
  private final LinkedList<byte[]> jGc;
  private volatile boolean jGd;
  private volatile int jGe;
  private final BluetoothGattCallback jGf;
  private f.a jGs;
  private Runnable jGt;
  private f jGu;
  private HashMap<String, HashMap<String, BluetoothGattCharacteristic>> jGv;
  private long jGw;
  private ArrayList<BluetoothGattCharacteristic> jGx;
  private boolean jGy;
  public ak mHandler;
  public long mSessionId;
  private HandlerThread mThread;

  @TargetApi(18)
  public f(long paramLong, Context paramContext, f.a parama)
  {
    AppMethodBeat.i(18427);
    this.jGc = new LinkedList();
    this.jGd = false;
    this.jGv = new HashMap();
    this.jGw = 0L;
    this.jGx = new ArrayList();
    this.jGf = new BluetoothGattCallback()
    {
      public final void onCharacteristicChanged(BluetoothGatt paramAnonymousBluetoothGatt, BluetoothGattCharacteristic paramAnonymousBluetoothGattCharacteristic)
      {
        AppMethodBeat.i(18418);
        ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDataReceive------");
        if (!f.f(f.this).sendMessage(f.f(f.this).obtainMessage(8, paramAnonymousBluetoothGattCharacteristic)))
          ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(8) });
        AppMethodBeat.o(18418);
      }

      public final void onCharacteristicRead(BluetoothGatt paramAnonymousBluetoothGatt, BluetoothGattCharacteristic paramAnonymousBluetoothGattCharacteristic, int paramAnonymousInt)
      {
        AppMethodBeat.i(18419);
        ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onCharacteristicRead------ status = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if ((paramAnonymousInt == 0) && (!f.f(f.this).sendMessage(f.f(f.this).obtainMessage(8, paramAnonymousBluetoothGattCharacteristic))))
          ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(8) });
        AppMethodBeat.o(18419);
      }

      public final void onCharacteristicWrite(BluetoothGatt paramAnonymousBluetoothGatt, BluetoothGattCharacteristic paramAnonymousBluetoothGattCharacteristic, int paramAnonymousInt)
      {
        AppMethodBeat.i(18420);
        ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDataWriteCallback------ status = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (!f.f(f.this).sendMessage(f.f(f.this).obtainMessage(7, paramAnonymousInt, 0)))
          ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(7) });
        AppMethodBeat.o(18420);
      }

      public final void onConnectionStateChange(BluetoothGatt paramAnonymousBluetoothGatt, int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(18415);
        ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onConnectionStateChange------ connect newState = %d, op status = %d, mConnectState = %d", new Object[] { Integer.valueOf(paramAnonymousInt2), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(f.e(f.this)) });
        if (!f.f(f.this).sendMessage(f.f(f.this).obtainMessage(4, paramAnonymousInt2, 0)))
          ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(4) });
        AppMethodBeat.o(18415);
      }

      public final void onDescriptorWrite(BluetoothGatt paramAnonymousBluetoothGatt, BluetoothGattDescriptor paramAnonymousBluetoothGattDescriptor, int paramAnonymousInt)
      {
        AppMethodBeat.i(18417);
        ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onDescriptorWrite------ status = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (!f.f(f.this).sendMessage(f.f(f.this).obtainMessage(6, paramAnonymousInt, 0, paramAnonymousBluetoothGatt)))
          ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(6) });
        AppMethodBeat.o(18417);
      }

      public final void onServicesDiscovered(BluetoothGatt paramAnonymousBluetoothGatt, int paramAnonymousInt)
      {
        AppMethodBeat.i(18416);
        ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------onServicesDiscovered------ status = %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
        if (!f.f(f.this).sendMessage(f.f(f.this).obtainMessage(5, paramAnonymousInt, 0, paramAnonymousBluetoothGatt)))
          ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(5) });
        AppMethodBeat.o(18416);
      }
    };
    this.aBR = -1;
    this.aBR = hashCode();
    this.jGu = this;
    this.jGs = parama;
    this.jFS = paramContext;
    this.jEU = ((BluetoothManager)this.jFS.getSystemService("bluetooth")).getAdapter();
    this.mSessionId = paramLong;
    this.jGe = 3;
    this.hGa = this.jEU.getRemoteDevice(com.tencent.mm.plugin.d.a.e.a.gC(paramLong));
    this.jFX = new a();
    this.jGy = false;
    this.mThread = d.anM("BluetoothLESimpleSession_handlerThread");
    this.mThread.start();
    this.mHandler = new f.b(this.mThread.getLooper(), this);
    this.jFY = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(18421);
        ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "Write data timeout, mac=%s, name=%s", new Object[] { b.ie(f.g(f.this)), f.h(f.this).getName() });
        if (f.i(f.this) != null)
          f.i(f.this).m(f.g(f.this), false);
        f.j(f.this);
        AppMethodBeat.o(18421);
      }
    };
    this.jGa = new f.3(this);
    this.jGt = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(18423);
        if (f.k(f.this))
        {
          if (f.i(f.this) != null)
            f.i(f.this).a(f.g(f.this), false, f.l(f.this));
          ab.d("MicroMsg.exdevice.BluetoothLESimpleSession", "close timeout!!! stop handle thread.");
          f.m(f.this);
        }
        AppMethodBeat.o(18423);
      }
    };
    AppMethodBeat.o(18427);
  }

  private void aVA()
  {
    AppMethodBeat.i(18432);
    if (this.jGc.isEmpty())
    {
      this.jGd = false;
      AppMethodBeat.o(18432);
    }
    while (true)
    {
      return;
      Object localObject = com.tencent.mm.plugin.d.a.b.a.a.at((byte[])this.jGc.pop());
      byte[] arrayOfByte = ((com.tencent.mm.plugin.d.a.b.a.a)localObject).aVE();
      String str = ((com.tencent.mm.plugin.d.a.b.a.a)localObject).jHc;
      int i = ((com.tencent.mm.plugin.d.a.b.a.a)localObject).jHd;
      localObject = c.gA(((com.tencent.mm.plugin.d.a.b.a.a)localObject).jGw);
      HashMap localHashMap = (HashMap)this.jGv.get(localObject);
      if (localHashMap == null)
      {
        ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "service(%s) not found, mac=%s, name=%s", new Object[] { localObject, b.ie(this.mSessionId), this.hGa.getName() });
        if (this.jGs != null)
          this.jGs.m(this.mSessionId, false);
        AppMethodBeat.o(18432);
      }
      else
      {
        localObject = (BluetoothGattCharacteristic)localHashMap.get(str);
        if (localObject == null)
        {
          if (str == null)
            str = "null";
          while (true)
          {
            ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "characteristic(%s) not found, mac=%s, name=%s", new Object[] { str, b.ie(this.mSessionId), this.hGa.getName() });
            if (this.jGs != null)
              this.jGs.m(this.mSessionId, false);
            AppMethodBeat.o(18432);
            break;
          }
        }
        if (i == 8)
        {
          this.jFX.jFy = ((BluetoothGattCharacteristic)localObject);
          this.jFX.setData(arrayOfByte);
          arrayOfByte = this.jFX.aVu();
          ab.d("MicroMsg.exdevice.BluetoothLESimpleSession", "write data to character, dump = %s, characteristicUuid=%s, mac=%s, name=%s", new Object[] { b.aN(arrayOfByte), str, b.ie(this.mSessionId), this.hGa.getName() });
          ((BluetoothGattCharacteristic)localObject).setValue(arrayOfByte);
          this.mHandler.postDelayed(this.jFY, 5000L);
          if (!this.jFT.writeCharacteristic((BluetoothGattCharacteristic)localObject))
          {
            ab.e("MicroMsg.exdevice.BluetoothLESimpleSession", "mBluetoothGatt.writeCharacteristic Failed!!!, mac=%s, name=%s", new Object[] { b.ie(this.mSessionId), this.hGa.getName() });
            if (this.jGs != null)
              this.jGs.m(this.mSessionId, false);
            AppMethodBeat.o(18432);
          }
          else
          {
            this.jGd = true;
            AppMethodBeat.o(18432);
          }
        }
        else
        {
          ab.d("MicroMsg.exdevice.BluetoothLESimpleSession", "write property is needed. but current property is %d, mac=%s, name=%s", new Object[] { Integer.valueOf(i), b.ie(this.mSessionId), this.hGa.getName() });
          if (this.jGs != null)
            this.jGs.m(this.mSessionId, false);
          AppMethodBeat.o(18432);
        }
      }
    }
  }

  private void aVC()
  {
    AppMethodBeat.i(18431);
    if (this.jGs == null)
    {
      ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------notifySessionClose------ don't need to notify, mac=%s, name=%s", new Object[] { b.ie(this.mSessionId), this.hGa.getName() });
      AppMethodBeat.o(18431);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------notifySessionClose------, mac=%s, name=%s", new Object[] { b.ie(this.mSessionId), this.hGa.getName() });
      if (this.jGs != null)
        this.jGs.a(this.mSessionId, false, this.jGw);
      this.jGs = null;
      AppMethodBeat.o(18431);
    }
  }

  private void aVz()
  {
    AppMethodBeat.i(18430);
    this.jGd = false;
    this.jGc.clear();
    AppMethodBeat.o(18430);
  }

  private void releaseResources()
  {
    AppMethodBeat.i(18428);
    if (this.jFT == null)
    {
      ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------releaseResources------ nothing to release, objid=%d, mac=%s, name=%s", new Object[] { Integer.valueOf(hashCode()), b.ie(this.mSessionId), this.hGa.getName() });
      AppMethodBeat.o(18428);
    }
    while (true)
    {
      return;
      jGz -= 1;
      ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------releaseResources------, objid=%d, resourceCount=%d, mac=%s, name=%s", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(jGz), b.ie(this.mSessionId), this.hGa.getName() });
      this.jGy = false;
      this.jFT.close();
      this.mThread.quitSafely();
      this.jFT = null;
      this.mThread = null;
      AppMethodBeat.o(18428);
    }
  }

  final void aVB()
  {
    AppMethodBeat.i(18426);
    ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "markSessionDisconnected, mac=%s, name=%s", new Object[] { b.ie(this.mSessionId), this.hGa.getName() });
    this.jGe = 2;
    this.mHandler.removeCallbacks(this.jGa);
    this.mHandler.removeCallbacks(this.jGt);
    aVC();
    releaseResources();
    AppMethodBeat.o(18426);
  }

  public final boolean connect()
  {
    AppMethodBeat.i(18429);
    ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------connect------, mac=%s, name=%s", new Object[] { b.ie(this.mSessionId), this.hGa.getName() });
    boolean bool = this.mHandler.sendMessage(this.mHandler.obtainMessage(0));
    AppMethodBeat.o(18429);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.f
 * JD-Core Version:    0.6.2
 */