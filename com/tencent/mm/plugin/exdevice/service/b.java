package com.tencent.mm.plugin.exdevice.service;

import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.d.c;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import junit.framework.Assert;

public final class b
  implements c
{
  private static b lwu = null;
  private CountDownLatch countDownLatch;
  private com.tencent.mm.plugin.d.a.d.b lwq;
  private final Vector<r> lwr;
  private final HashMap<Long, Integer> lws;
  private final HashMap<Long, Integer> lwt;
  private ak mHandler;

  public b()
  {
    AppMethodBeat.i(19546);
    this.lwq = null;
    this.lwr = new Vector();
    this.lws = new HashMap();
    this.lwt = new HashMap();
    this.mHandler = new ak(v.bpz().fPG.oAl.getLooper());
    long l1 = Thread.currentThread().getId();
    long l2 = Looper.getMainLooper().getThread().getId();
    ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "now thread id : %d, main thread is : %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
    if ((Build.VERSION.SDK_INT == 14) || (Build.VERSION.SDK_INT == 15))
      if (l1 == l2)
      {
        ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "it is main thread now, init the bluetoothadapter directly");
        this.lwq = new com.tencent.mm.plugin.d.a.d.b(ah.getContext(), this, v.bpz().fPG);
        AppMethodBeat.o(19546);
      }
    while (true)
    {
      return;
      new ak(Looper.getMainLooper()).postAtFrontOfQueueV2(new b.1(this));
      this.countDownLatch = new CountDownLatch(1);
      try
      {
        this.countDownLatch.await();
        label211: ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "now has init the sdk adapter");
        AppMethodBeat.o(19546);
        continue;
        this.lwq = new com.tencent.mm.plugin.d.a.d.b(ah.getContext(), this, v.bpz().fPG);
        AppMethodBeat.o(19546);
      }
      catch (InterruptedException localInterruptedException)
      {
        break label211;
      }
    }
  }

  public static boolean a(int paramInt, r paramr, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(19548);
    b localb = bpm();
    boolean bool = localb.mHandler.post(new b.2(localb, paramInt, paramr, paramArrayOfInt));
    if (!bool)
      ab.e("MicroMsg.exdevice.BluetoothSDKAdapter", "scan: instance.mHandler.post failed!!!");
    AppMethodBeat.o(19548);
    return bool;
  }

  private static b bpm()
  {
    AppMethodBeat.i(19547);
    b localb;
    if (lwu != null)
    {
      localb = lwu;
      AppMethodBeat.o(19547);
    }
    while (true)
    {
      return localb;
      localb = new b();
      lwu = localb;
      AppMethodBeat.o(19547);
    }
  }

  public static boolean connect(long paramLong)
  {
    AppMethodBeat.i(19552);
    ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---connect--- aSessionId = %d", new Object[] { Long.valueOf(paramLong) });
    b localb = bpm();
    boolean bool = localb.mHandler.post(new b.6(localb, paramLong));
    if (!bool)
      ab.e("MicroMsg.exdevice.BluetoothSDKAdapter", "connect: instance.mHandler.post failed!!!");
    AppMethodBeat.o(19552);
    return bool;
  }

  public static void createSession(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(19550);
    ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---createSession--- aDeviceId = %d, aChannelId = %d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    b localb = bpm();
    if (!localb.mHandler.post(new b.4(localb, paramLong1, paramLong2)))
      ab.e("MicroMsg.exdevice.BluetoothSDKAdapter", "createSession: instance.mHandler.post failed!!!");
    AppMethodBeat.o(19550);
  }

  public static void destroySession(long paramLong)
  {
    AppMethodBeat.i(19553);
    ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---destroySession--- aSessionId = %d", new Object[] { Long.valueOf(paramLong) });
    b localb = bpm();
    if (!localb.mHandler.post(new b.7(localb, paramLong)))
      ab.e("MicroMsg.exdevice.BluetoothSDKAdapter", "destroySession: instance.mHandler.post failed!!!");
    AppMethodBeat.o(19553);
  }

  public static boolean sendData(long paramLong, byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(19551);
    if (paramArrayOfByte == null);
    while (true)
    {
      ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "----sendData---- aSessionId = %d, datalength = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(i) });
      Assert.assertNotNull(paramArrayOfByte);
      b localb = bpm();
      boolean bool = localb.mHandler.post(new b.5(localb, paramLong, paramArrayOfByte));
      if (!bool)
        ab.e("MicroMsg.exdevice.BluetoothSDKAdapter", "sendData: instance.mHandler.post failed!!!");
      AppMethodBeat.o(19551);
      return bool;
      i = paramArrayOfByte.length;
    }
  }

  public static boolean uL(int paramInt)
  {
    AppMethodBeat.i(19549);
    ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---stopScan--- aBluetoothVersion = %d", new Object[] { Integer.valueOf(paramInt) });
    b localb = bpm();
    boolean bool = localb.mHandler.post(new b.3(localb, paramInt));
    if (!bool)
      ab.e("MicroMsg.exdevice.BluetoothSDKAdapter", "stopScan: instance.mHandler.post failed!!!");
    AppMethodBeat.o(19549);
    return bool;
  }

  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19556);
    int i;
    if (paramArrayOfByte == null)
    {
      i = -1;
      ab.d("MicroMsg.exdevice.BluetoothSDKAdapter", "---onScanFound--- deviceMac = %s, deviceName = %s, BTversion = %d, rssi = %d, advertisment length = %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if (!this.lwr.isEmpty())
        break label90;
      ab.w("MicroMsg.exdevice.BluetoothSDKAdapter", "mScanCallbackList is empty");
      AppMethodBeat.o(19556);
    }
    while (true)
    {
      return;
      i = paramArrayOfByte.length;
      break;
      label90: Iterator localIterator = this.lwr.iterator();
      while (localIterator.hasNext())
        ((r)localIterator.next()).a(paramString1, paramString2, paramInt1, paramInt2, paramArrayOfByte);
      AppMethodBeat.o(19556);
    }
  }

  public final void b(long paramLong, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19558);
    ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onRecv--- sessionId = ".concat(String.valueOf(paramLong)));
    Java2CExDevice.onBluetoothRecvData(paramLong, paramArrayOfByte);
    AppMethodBeat.o(19558);
  }

  public final void g(long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(19554);
    ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onSessionCreate--- aSessionId = " + paramLong1 + " aDeviceID = " + paramLong2);
    Assert.assertTrue(this.lws.containsKey(Long.valueOf(paramLong2)));
    if (!this.lwt.containsKey(Long.valueOf(paramLong1)))
      this.lwt.put(Long.valueOf(paramLong1), this.lws.get(Long.valueOf(paramLong2)));
    Java2CExDevice.onBluetoothSessionCreated(paramLong2, paramLong3, paramLong1);
    AppMethodBeat.o(19554);
  }

  public final void gB(long paramLong)
  {
    AppMethodBeat.i(19560);
    Java2CExDevice.onBluetoothError(paramLong, 0);
    AppMethodBeat.o(19560);
  }

  public final void l(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(19557);
    ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onConnected--- sessionId = " + paramLong + "Connected = " + paramBoolean);
    if (paramBoolean)
    {
      Java2CExDevice.onBluetoothConnected(paramLong);
      AppMethodBeat.o(19557);
    }
    while (true)
    {
      return;
      Java2CExDevice.onBluetoothDisconnected(paramLong);
      AppMethodBeat.o(19557);
    }
  }

  public final void m(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(19559);
    ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onSend--- sessionId = " + paramLong + "success = " + paramBoolean);
    if (paramBoolean)
    {
      Java2CExDevice.onBluetoothSendDataCompleted(paramLong);
      AppMethodBeat.o(19559);
    }
    while (true)
    {
      return;
      Java2CExDevice.onBluetoothError(paramLong, 0);
      AppMethodBeat.o(19559);
    }
  }

  public final void rQ(int paramInt)
  {
    AppMethodBeat.i(19555);
    ab.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onScanFinished--- aBluetoothVersion =%d", new Object[] { Integer.valueOf(paramInt) });
    if (this.lwr.isEmpty())
    {
      ab.w("MicroMsg.exdevice.BluetoothSDKAdapter", "mScanCallbackList is empty");
      AppMethodBeat.o(19555);
    }
    while (true)
    {
      return;
      Iterator localIterator = this.lwr.iterator();
      while (localIterator.hasNext())
      {
        r localr = (r)localIterator.next();
        if (localr != null)
          localr.rQ(paramInt);
      }
      this.lwr.clear();
      AppMethodBeat.o(19555);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.b
 * JD-Core Version:    0.6.2
 */