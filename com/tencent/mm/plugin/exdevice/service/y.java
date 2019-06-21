package com.tencent.mm.plugin.exdevice.service;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.a.f.6;
import com.tencent.mm.plugin.d.a.a.f.7;
import com.tencent.mm.plugin.d.a.a.h;
import com.tencent.mm.plugin.d.a.b.e.4;
import com.tencent.mm.plugin.d.a.b.e.a;
import com.tencent.mm.plugin.d.a.d.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;
import junit.framework.Assert;

public final class y extends h.a
  implements com.tencent.mm.plugin.d.a.a.b, a.a, g
{
  private a lwU;
  private RemoteCallbackList<k> lwV;
  private RemoteCallbackList<p> lwW;
  private RemoteCallbackList<j> lwX;
  private RemoteCallbackList<i> lwY;
  private RemoteCallbackList<q> lwZ;
  private RemoteCallbackList<n> lxa;
  private final y.l lxb;
  private int lxc;
  private final com.tencent.mm.plugin.d.a.a.f lxd;
  private final com.tencent.mm.plugin.d.a.d.a lxe;
  private RemoteCallbackList<j> lxf;
  private RemoteCallbackList<k> lxg;
  private RemoteCallbackList<s> lxh;
  private RemoteCallbackList<t> lxi;
  com.tencent.mm.plugin.d.a.b.e lxj;
  private e.a lxk;
  private final ak mHandler;

  public y()
  {
    AppMethodBeat.i(19658);
    this.lwU = null;
    this.lwV = new RemoteCallbackList();
    this.lwW = new RemoteCallbackList();
    this.lwX = new RemoteCallbackList();
    this.lwY = new RemoteCallbackList();
    this.lwZ = new RemoteCallbackList();
    this.lxa = new RemoteCallbackList();
    this.lxb = new y.l((byte)0);
    this.lxc = 0;
    this.lxf = new RemoteCallbackList();
    this.lxg = new RemoteCallbackList();
    this.lxh = new RemoteCallbackList();
    this.lxi = new RemoteCallbackList();
    this.lwU = new a(this);
    this.mHandler = new y.a(this, v.bpz().fPG.oAl.getLooper());
    if (Build.VERSION.SDK_INT >= 18);
    for (this.lxd = new com.tencent.mm.plugin.d.a.a.f(this); ; this.lxd = null)
    {
      this.lxe = new com.tencent.mm.plugin.d.a.d.a(this);
      this.lxk = new y.1(this);
      com.tencent.mm.compatible.a.a.a(18, new y.2(this));
      AppMethodBeat.o(19658);
      return;
    }
  }

  private static IInterface a(long paramLong, RemoteCallbackList paramRemoteCallbackList, int paramInt)
  {
    AppMethodBeat.i(19659);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "findCallbackbyId, Id = %d, count = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    int i = 0;
    if (i < paramInt)
    {
      HashMap localHashMap = (HashMap)paramRemoteCallbackList.getBroadcastCookie(i);
      if (localHashMap.containsKey(Long.valueOf(paramLong)))
      {
        paramRemoteCallbackList = (IInterface)localHashMap.get(Long.valueOf(paramLong));
        AppMethodBeat.o(19659);
      }
    }
    while (true)
    {
      return paramRemoteCallbackList;
      i++;
      break;
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Can not find id in the callback list");
      paramRemoteCallbackList = null;
      AppMethodBeat.o(19659);
    }
  }

  private static boolean a(RemoteCallbackList paramRemoteCallbackList, long paramLong, IInterface paramIInterface)
  {
    AppMethodBeat.i(19666);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registerRemoteCB, ID = %d", new Object[] { Long.valueOf(paramLong) });
    boolean bool;
    if ((paramRemoteCallbackList == null) || (paramIInterface == null))
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == aCallbackList || null == aCallback");
      AppMethodBeat.o(19666);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i = paramRemoteCallbackList.beginBroadcast();
      int j;
      do
      {
        j = i - 1;
        if (j < 0)
          break;
        i = j;
      }
      while (!paramRemoteCallbackList.getBroadcastItem(j).asBinder().equals(paramIInterface.asBinder()));
      HashMap localHashMap;
      if (j < 0)
      {
        ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Register a new process in callback list.");
        localHashMap = new HashMap();
        localHashMap.put(Long.valueOf(paramLong), paramIInterface);
        paramRemoteCallbackList.register(paramIInterface, localHashMap);
        paramRemoteCallbackList.finishBroadcast();
        AppMethodBeat.o(19666);
        bool = true;
      }
      else
      {
        localHashMap = (HashMap)paramRemoteCallbackList.getBroadcastCookie(j);
        if (localHashMap == null)
        {
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == map");
          paramRemoteCallbackList.finishBroadcast();
          AppMethodBeat.o(19666);
          bool = false;
        }
        else
        {
          localHashMap.put(Long.valueOf(paramLong), paramIInterface);
          paramRemoteCallbackList.finishBroadcast();
          AppMethodBeat.o(19666);
          bool = true;
        }
      }
    }
  }

  private static boolean a(RemoteCallbackList paramRemoteCallbackList, long paramLong, IInterface paramIInterface, int paramInt)
  {
    AppMethodBeat.i(19667);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegisterRemoteCB, device id = %d, aCount = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    boolean bool;
    if ((paramRemoteCallbackList == null) || (paramIInterface == null))
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == aCallbackList || null == aCallback");
      AppMethodBeat.o(19667);
      bool = false;
    }
    while (true)
    {
      return bool;
      int i;
      do
      {
        i = paramInt - 1;
        if (i < 0)
          break;
        paramInt = i;
      }
      while (!paramRemoteCallbackList.getBroadcastItem(i).asBinder().equals(paramIInterface.asBinder()));
      if (i < 0)
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Can not find callback in callback list");
        AppMethodBeat.o(19667);
        bool = false;
      }
      else
      {
        HashMap localHashMap = (HashMap)paramRemoteCallbackList.getBroadcastCookie(i);
        if (localHashMap == null)
        {
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == map");
          AppMethodBeat.o(19667);
          bool = false;
        }
        else if ((IInterface)localHashMap.remove(Long.valueOf(paramLong)) == null)
        {
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Cannot find id in the map");
          AppMethodBeat.o(19667);
          bool = false;
        }
        else if (!localHashMap.isEmpty())
        {
          AppMethodBeat.o(19667);
          bool = true;
        }
        else
        {
          ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "No id is in the map, unregister this process");
          bool = paramRemoteCallbackList.unregister(paramIInterface);
          if (!bool)
            ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aCallbackList.unregister failed!!!");
          AppMethodBeat.o(19667);
        }
      }
    }
  }

  private boolean b(long paramLong, p paramp)
  {
    boolean bool = false;
    AppMethodBeat.i(19670);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startTaskImp, task Id = %d", new Object[] { Long.valueOf(paramLong) });
    if (paramp == null)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == aTask");
      d(paramLong, -1, -1, "null == aTask");
      AppMethodBeat.o(19670);
    }
    while (true)
    {
      return bool;
      a locala = this.lwU;
      ab.i("MicroMsg.exdevice.BTDeviceManager", "startTask, taskId = %d", new Object[] { Long.valueOf(paramLong) });
      Assert.assertNotNull(paramp);
      a.g localg = new a.g(paramLong, paramp);
      if (locala.mHandler.sendMessage(locala.mHandler.obtainMessage(8, localg)));
      for (int i = 0; ; i = -1)
      {
        if (i == 0)
          break label164;
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.startTask Failed ret = -1");
        d(paramLong, -1, -1, "mBTDeviceMrg.startTask Failed!!!");
        AppMethodBeat.o(19670);
        break;
      }
      label164: if (!a(this.lwW, paramLong, paramp))
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registerRemoteCB Fail!!!");
        d(paramLong, -1, -1, "registerRemoteCB Fail!!!");
        AppMethodBeat.o(19670);
      }
      else
      {
        AppMethodBeat.o(19670);
        bool = true;
      }
    }
  }

  private boolean c(j paramj)
  {
    AppMethodBeat.i(19660);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistOnscanCallback");
    boolean bool = this.lwX.unregister(paramj);
    if (!bool)
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.unregister Failed!!!");
    while (true)
    {
      AppMethodBeat.o(19660);
      return bool;
      this.lxc -= 1;
    }
  }

  private void d(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(19676);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onTaskEndImp taskId = %d, errType = %d, errCode =%d, errMsg = %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    int i = this.lwW.beginBroadcast();
    p localp = (p)a(paramLong, this.lwW, i);
    if (localp == null)
    {
      ab.w("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Cannot find Callback By taskId = ".concat(String.valueOf(paramLong)));
      this.lwW.finishBroadcast();
      AppMethodBeat.o(19676);
    }
    while (true)
    {
      return;
      try
      {
        localp.bpv().a(paramLong, paramInt1, paramInt2, paramString, localp);
        if (!a(this.lwW, paramLong, localp, i))
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegisterRemoteCB failed!!!");
        this.lwW.finishBroadcast();
        AppMethodBeat.o(19676);
      }
      catch (RemoteException paramString)
      {
        while (true)
        {
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback.onTaskEnd Error!!!");
          ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramString, "", new Object[0]);
        }
      }
    }
  }

  private boolean f(int paramInt, j paramj)
  {
    AppMethodBeat.i(19662);
    if (paramj == null)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
      paramj = new IllegalArgumentException("scanImp: null == aCallback");
      AppMethodBeat.o(19662);
      throw paramj;
    }
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registOnscanCallback");
    boolean bool = this.lwX.register(paramj);
    if (!bool)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnScanCallback.register Failed!!!");
      if (bool)
        break label148;
    }
    while (true)
    {
      try
      {
        paramj.a(0, -1, "scanImp: registScanCallback failed!!!", "", "", 0, null);
        AppMethodBeat.o(19662);
        bool = false;
        return bool;
        this.lxc += 1;
      }
      catch (RemoteException paramj)
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aCallback.onScanCallback failed!!! %s", new Object[] { paramj.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramj, "", new Object[0]);
        continue;
      }
      label148: a locala = this.lwU;
      ab.i("MicroMsg.exdevice.BTDeviceManager", "------scan------ bluetooth version = %d", new Object[] { Integer.valueOf(paramInt) });
      if (!b.a(paramInt, locala, new int[0]))
      {
        ab.e("MicroMsg.exdevice.BTDeviceManager", "BluetoothSDKAdapter.scan Failed!!!");
        bool = false;
        if (!bool)
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.scan Failed!!!");
      }
      try
      {
        paramj.a(0, -1, "scanImp: mBTDeviceMrg.scan failed!!!", "", "", 0, null);
        if (!c(paramj))
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistScanCallback failed!!!");
        AppMethodBeat.o(19662);
        continue;
        bool = true;
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
        {
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aCallback.onScanCallback failed!!! %s", new Object[] { localRemoteException.getMessage() });
          ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
        }
      }
    }
  }

  private boolean g(int paramInt, j paramj)
  {
    AppMethodBeat.i(19664);
    boolean bool;
    if (paramj == null)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
      AppMethodBeat.o(19664);
      bool = false;
    }
    while (true)
    {
      return bool;
      bool = a.uL(paramInt);
      if (!bool)
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.stopScan Failed!!!");
      try
      {
        paramj.a(0, -1, "stopScanImp: mBTDeviceMrg.stopScan failed!!!", "", "", 0, null);
        if (!c(paramj))
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistScanCallback failed!!!");
        AppMethodBeat.o(19664);
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
        {
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScanImp: aCallback.onScanCallback failed!!!, %s", new Object[] { localRemoteException.getMessage() });
          ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
        }
      }
    }
  }

  public final long a(p paramp)
  {
    long l1 = -1L;
    AppMethodBeat.i(19671);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startTask");
    if (paramp == null)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == aTask");
      AppMethodBeat.o(19671);
    }
    while (true)
    {
      return l1;
      y.l locall = this.lxb;
      if (9223372036854775807L == locall.lwo)
      {
        ab.w("MicroMsg.TaskId", "TaskId Data-overrun!!!");
        locall.lwo = 0L;
      }
      long l2 = locall.lwo;
      locall.lwo = (1L + l2);
      paramp = new y.k(l2, paramp);
      if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(0, paramp)))
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!! messsage what  = %d", new Object[] { Integer.valueOf(0) });
        AppMethodBeat.o(19671);
      }
      else
      {
        AppMethodBeat.o(19671);
        l1 = l2;
      }
    }
  }

  public final void a(double paramDouble, com.tencent.mm.plugin.d.a.a.c paramc)
  {
    AppMethodBeat.i(19682);
    if (paramc == null)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "aContext is null");
      AppMethodBeat.o(19682);
    }
    while (true)
    {
      return;
      h localh = paramc.jEK.jEO;
      ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onRangingCallback, distance = %f, uuid = %s, major = %d, minor = %d ,minor&0xFFFF = %d", new Object[] { Double.valueOf(paramDouble), com.tencent.mm.plugin.exdevice.j.b.aN(localh.jFp), Short.valueOf(localh.jFq), Short.valueOf(localh.jFr), Integer.valueOf(localh.jFr & 0xFFFF) });
      try
      {
        int i = this.lwZ.beginBroadcast();
        int j = 0;
        while (true)
          if (j < i)
            try
            {
              ((q)this.lwZ.getBroadcastItem(j)).a(paramDouble, localh.jFq, localh.jFr, localh.jFp, paramc.jEL, paramc.jEK.jEO.jFs, paramc.cbq);
              j++;
            }
            catch (RemoteException localRemoteException)
            {
              while (true)
              {
                ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIBeaconCallback.getBroadcastItem failed!!!, i = %d, (%s)", new Object[] { Integer.valueOf(j), localRemoteException.toString() });
                ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
              }
            }
        this.lwZ.finishBroadcast();
        AppMethodBeat.o(19682);
      }
      catch (Exception paramc)
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "[shakezb] beginBroadcast fail!", new Object[] { paramc.toString() });
        ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramc, "", new Object[0]);
        this.lwZ.finishBroadcast();
        AppMethodBeat.o(19682);
      }
      finally
      {
        this.lwZ.finishBroadcast();
        AppMethodBeat.o(19682);
      }
    }
    throw paramc;
  }

  public final void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19675);
    int i = this.lwX.beginBroadcast();
    int j = 0;
    while (true)
      if (j < i)
        try
        {
          ((j)this.lwX.getBroadcastItem(j)).a(paramInt1, paramInt2, paramString1, paramString2, paramString3, paramInt3, paramArrayOfByte);
          if ((2 == paramInt1) && (!this.lwX.unregister(this.lwX.getBroadcastItem(j))))
            ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onScanCallback: mCBListOnScanCallback.unregister failed!!!");
          j++;
        }
        catch (RemoteException localRemoteException)
        {
          while (true)
          {
            ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onScanCallback Exception i = ".concat(String.valueOf(j)));
            ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
          }
        }
    this.lwX.finishBroadcast();
    AppMethodBeat.o(19675);
  }

  public final void a(int paramInt, long paramLong, short paramShort1, short paramShort2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19678);
    if (paramArrayOfByte == null);
    for (int i = 0; ; i = paramArrayOfByte.length)
    {
      ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onDeviceRequest errorCode = %d, deviceId = %d, seq = %d, cmdId = %d, data length = %d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong), Short.valueOf(paramShort1), Short.valueOf(paramShort2), Integer.valueOf(i) });
      b localb = new b((byte)0);
      localb.lwl = paramShort2;
      localb.lqA = paramArrayOfByte;
      localb.jJa = paramLong;
      localb.lqG = paramShort1;
      localb.mErrorCode = paramInt;
      if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(6, localb)))
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(6) });
      AppMethodBeat.o(19678);
      return;
    }
  }

  public final void a(n paramn)
  {
    AppMethodBeat.i(19684);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registExDeviceInvokerHandler");
    if (!this.lxa.register(paramn))
      ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIExDeviceInvoker.register failed!!!");
    AppMethodBeat.o(19684);
  }

  public final boolean a(long paramLong, int paramInt, k paramk)
  {
    boolean bool = false;
    AppMethodBeat.i(19668);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "startChannel deviceId = %d, bluetoothVersion = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    if (paramk == null)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "null == callback");
      AppMethodBeat.o(19668);
    }
    while (true)
    {
      return bool;
      if (paramLong < 0L)
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", new Object[] { Long.valueOf(paramLong) });
        AppMethodBeat.o(19668);
      }
      else if ((1 != paramInt) && (paramInt != 0))
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid bluetooth version = %d", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(19668);
      }
      else
      {
        paramk = new y.j(paramLong, paramInt, paramk);
        if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(3, paramk)))
        {
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!! message what = %d", new Object[] { Integer.valueOf(3) });
          AppMethodBeat.o(19668);
        }
        else
        {
          AppMethodBeat.o(19668);
          bool = true;
        }
      }
    }
  }

  public final boolean a(i parami)
  {
    AppMethodBeat.i(19673);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "registOnDeviceRequest");
    boolean bool = this.lwY.register(parami);
    if (!bool)
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnDeviceReq.register Failed!!!");
    AppMethodBeat.o(19673);
    return bool;
  }

  public final boolean a(s params)
  {
    AppMethodBeat.i(19689);
    boolean bool;
    if (params == null)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback is null");
      bool = false;
      AppMethodBeat.o(19689);
    }
    while (true)
    {
      return bool;
      bool = this.lxh.register(params);
      if (!bool)
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBluetoothRegistOnRecv error");
      AppMethodBeat.o(19689);
    }
  }

  public final boolean a(String paramString, boolean paramBoolean, q paramq)
  {
    AppMethodBeat.i(19681);
    if ((Build.VERSION.SDK_INT < 18) || (this.lxd == null))
    {
      AppMethodBeat.o(19681);
      paramBoolean = false;
    }
    while (true)
    {
      return paramBoolean;
      boolean bool = ah.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
      Object localObject = BluetoothAdapter.getDefaultAdapter();
      if ((!bool) || (localObject == null))
      {
        AppMethodBeat.o(19681);
        paramBoolean = false;
      }
      else
      {
        ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "ranging, uuid = %s, op = %s", new Object[] { paramString, String.valueOf(paramBoolean) });
        if (!this.lwZ.register(paramq))
        {
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIBeaconCallback.register failed!!!");
          AppMethodBeat.o(19681);
          paramBoolean = false;
        }
        else
        {
          while (true)
          {
            com.tencent.mm.plugin.d.a.a.f localf;
            try
            {
              localObject = UUID.fromString(paramString);
              localf = this.lxd;
              com.tencent.mm.plugin.d.a.a.f.jET = ah.getContext().getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).getBoolean("isNewScanning", false);
              if (localObject != null)
                break label253;
              paramString = "";
              ab.d("MicroMsg.exdevice.IBeaconServer", "Ranging, uuid = %s, op = %s", new Object[] { paramString, String.valueOf(paramBoolean) });
              if (localObject != null)
                break label262;
              ab.e("MicroMsg.exdevice.IBeaconServer", "error parameter: aUUID is null");
              paramBoolean = false;
              if (!paramBoolean)
                break label312;
              AppMethodBeat.o(19681);
              paramBoolean = true;
            }
            catch (Exception paramString)
            {
              ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "UUID.fromString failed!!!, (%s)", new Object[] { paramString.getMessage() });
              AppMethodBeat.o(19681);
              paramBoolean = false;
            }
            break;
            label253: paramString = ((UUID)localObject).toString();
            continue;
            label262: if (paramBoolean)
              paramBoolean = localf.mHandler.post(new f.6(localf, (UUID)localObject));
            else
              paramBoolean = localf.mHandler.post(new f.7(localf, (UUID)localObject));
          }
          label312: ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mIBeaconServer.ranging failed!!!");
          if (!this.lwZ.unregister(paramq))
            ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIBeaconCallback.unregister failed!!!");
          AppMethodBeat.o(19681);
          paramBoolean = false;
        }
      }
    }
  }

  public final void b(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(19679);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onStateChange deviceId = " + paramLong + " oldState" + paramInt1 + " newState = " + paramInt2 + " errCode = " + paramInt3);
    y.c localc = new y.c((byte)0);
    localc.jJa = paramLong;
    localc.lwm = paramInt1;
    localc.lwn = paramInt2;
    localc.lqz = paramInt3;
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(5, localc)))
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, messagewhat = %d", new Object[] { Integer.valueOf(5) });
    AppMethodBeat.o(19679);
  }

  public final boolean b(int paramInt, j paramj)
  {
    AppMethodBeat.i(19661);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "---scan--- aBluetoothVersion = ".concat(String.valueOf(paramInt)));
    boolean bool;
    if (paramj == null)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback !!!");
      bool = false;
      AppMethodBeat.o(19661);
    }
    while (true)
    {
      return bool;
      bool = this.mHandler.post(new y.3(this, paramInt, paramj));
      if (!bool)
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "scan: mHandler.post failed!!!");
      AppMethodBeat.o(19661);
    }
  }

  public final boolean b(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2)
  {
    AppMethodBeat.i(19693);
    ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTOnSateChangeImpl. mac=%d, oldstate = %d, newsate=%d, errcode=%d", new Object[] { Long.valueOf(paramLong1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    int i = this.lxg.beginBroadcast();
    k localk = (k)a(paramLong1, this.lxg, i);
    boolean bool;
    if (localk == null)
    {
      ab.w("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Cannot find Callback By deviceId = ".concat(String.valueOf(paramLong1)));
      this.lxg.finishBroadcast();
      bool = false;
      AppMethodBeat.o(19693);
    }
    while (true)
    {
      return bool;
      try
      {
        localk.a(paramLong1, paramInt1, paramInt2, paramInt3, paramLong2);
        this.lxg.finishBroadcast();
        bool = true;
        AppMethodBeat.o(19693);
      }
      catch (RemoteException localRemoteException)
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback.onStateChange Failed!!!");
        ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
        this.lxg.finishBroadcast();
        bool = false;
        AppMethodBeat.o(19693);
      }
      finally
      {
        this.lxg.finishBroadcast();
        AppMethodBeat.o(19693);
      }
    }
  }

  public final boolean b(long paramLong, int paramInt, k paramk)
  {
    boolean bool = false;
    AppMethodBeat.i(19687);
    if (paramk == null)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback is null");
      AppMethodBeat.o(19687);
    }
    while (true)
    {
      return bool;
      if (paramLong < 0L)
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", new Object[] { Long.valueOf(paramLong) });
        AppMethodBeat.o(19687);
      }
      else if (paramInt != 0)
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid bluetooth version = %d", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(19687);
      }
      else
      {
        y.e locale = new y.e((byte)0);
        locale.ltB = paramLong;
        locale.lxn = paramInt;
        locale.lxo = paramk;
        if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(7, locale)))
        {
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(7) });
          AppMethodBeat.o(19687);
        }
        else
        {
          AppMethodBeat.o(19687);
          bool = true;
        }
      }
    }
  }

  public final boolean b(long paramLong, byte[] paramArrayOfByte, t paramt)
  {
    boolean bool = false;
    AppMethodBeat.i(19690);
    if (0L > paramLong)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mac < 0");
      AppMethodBeat.o(19690);
    }
    while (true)
    {
      return bool;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "data is empty");
        AppMethodBeat.o(19690);
      }
      else if (paramt == null)
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback is null");
        AppMethodBeat.o(19690);
      }
      else
      {
        y.i locali = new y.i((byte)0);
        locali.ltB = paramLong;
        locali.mData = paramArrayOfByte;
        locali.lxr = paramt;
        if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(10, locali)))
        {
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(10) });
          AppMethodBeat.o(19690);
        }
        else
        {
          AppMethodBeat.o(19690);
          bool = true;
        }
      }
    }
  }

  public final boolean b(i parami)
  {
    AppMethodBeat.i(19674);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "unRegistOnDeviceRequest");
    boolean bool = this.lwY.unregister(parami);
    if (!bool)
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListOnDeviceReq.unregister Failed!!!");
    AppMethodBeat.o(19674);
    return bool;
  }

  public final long[] bpl()
  {
    AppMethodBeat.i(19665);
    long[] arrayOfLong = a.bpl();
    AppMethodBeat.o(19665);
    return arrayOfLong;
  }

  public final void c(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(19677);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onTaskEnd taskId = %d, errTpye = %d, errCode = %d, errMsg = %s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    y.d locald = new y.d();
    locald.lwo = paramLong;
    locald.lqL = paramInt1;
    locald.lqz = paramInt2;
    locald.hxN = paramString;
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(2, locald)))
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, MessageWhat = %d", new Object[] { Integer.valueOf(2) });
    AppMethodBeat.o(19677);
  }

  public final boolean c(int paramInt, j paramj)
  {
    AppMethodBeat.i(19663);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "---stopScan--- aBluetoothVersion = ".concat(String.valueOf(paramInt)));
    boolean bool;
    if (paramj == null)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Error parameter: null == aCallback");
      bool = false;
      AppMethodBeat.o(19663);
    }
    while (true)
    {
      return bool;
      bool = this.mHandler.post(new y.4(this, paramInt, paramj));
      if (!bool)
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopScan: mHandler.post failed!!!");
      AppMethodBeat.o(19663);
    }
  }

  public final boolean c(long paramLong, int paramInt, k paramk)
  {
    AppMethodBeat.i(19691);
    ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTConnectImpl. mac=%d, bTVersion=%d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    if (!a(this.lxg, paramLong, paramk))
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "register connect callback error");
    while (true)
    {
      boolean bool;
      try
      {
        paramk.a(paramLong, -1, 4, -1, 0L);
        AppMethodBeat.o(19691);
        bool = false;
        return bool;
      }
      catch (RemoteException paramk)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramk, "", new Object[0]);
        continue;
      }
      try
      {
        paramk.a(paramLong, -1, 1, -1, 0L);
        if (this.lxj != null)
        {
          com.tencent.mm.plugin.d.a.b.e locale = this.lxj;
          ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "connect. mac = %d", new Object[] { Long.valueOf(paramLong) });
          if (!locale.aVw())
          {
            ab.e("MicroMsg.exdevice.BluetoothLESimpleManager", "BLE Unsupport");
            bool = false;
            if (bool)
              break label359;
            ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "connect device(mac=%d) error", new Object[] { Long.valueOf(paramLong) });
            if (paramk == null);
          }
        }
      }
      catch (RemoteException localRemoteException)
      {
        try
        {
          while (true)
          {
            paramk.a(paramLong, 1, 4, -1, 0L);
            AppMethodBeat.o(19691);
            bool = false;
            break;
            localRemoteException = localRemoteException;
            ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
            continue;
            com.tencent.mm.plugin.d.a.b.f localf = (com.tencent.mm.plugin.d.a.b.f)localRemoteException.jFA.get(Long.valueOf(paramLong));
            if (localf != null)
            {
              ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "session(mac=%s) has been in map");
              bool = localf.connect();
            }
            else
            {
              localf = new com.tencent.mm.plugin.d.a.b.f(paramLong, localRemoteException.Gn, localRemoteException.jGl);
              if (!localf.connect())
                break label325;
              localRemoteException.Q(new e.4(localRemoteException, paramLong, localf));
              bool = true;
            }
          }
          label325: ab.e("MicroMsg.exdevice.BluetoothLESimpleManager", "tmpConnectForScan error");
          bool = false;
        }
        catch (RemoteException paramk)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramk, "", new Object[0]);
        }
        label359: AppMethodBeat.o(19691);
        bool = true;
      }
    }
  }

  public final boolean c(long paramLong, byte[] paramArrayOfByte, t paramt)
  {
    AppMethodBeat.i(19692);
    ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTSendDataImpl. mac=%d, data=%s", new Object[] { Long.valueOf(paramLong), com.tencent.mm.plugin.exdevice.j.b.aN(paramArrayOfByte) });
    Object localObject;
    boolean bool;
    if (this.lxj != null)
    {
      localObject = this.lxj;
      ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "writeData. mac = %d", new Object[] { Long.valueOf(paramLong) });
      if (!((com.tencent.mm.plugin.d.a.b.e)localObject).aVw())
      {
        ab.e("MicroMsg.exdevice.BluetoothLESimpleManager", "BLE Unsupport");
        bool = false;
        if (bool)
          break label248;
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "writeData error");
        if (paramt == null);
      }
    }
    while (true)
    {
      try
      {
        paramt.b(paramLong, -1, -1, "start write data error");
        AppMethodBeat.o(19692);
        bool = false;
        return bool;
        localObject = (com.tencent.mm.plugin.d.a.b.f)((com.tencent.mm.plugin.d.a.b.e)localObject).jFA.get(Long.valueOf(paramLong));
        if (localObject == null)
        {
          ab.w("MicroMsg.exdevice.BluetoothLESimpleManager", "session is null, may be this session is closed");
          bool = false;
          break;
        }
        ab.i("MicroMsg.exdevice.BluetoothLESimpleSession", "------writeData------parserobj, length = %d, mac=%s, name=%s", new Object[] { Integer.valueOf(paramArrayOfByte.length), com.tencent.mm.plugin.exdevice.j.b.ie(((com.tencent.mm.plugin.d.a.b.f)localObject).mSessionId), ((com.tencent.mm.plugin.d.a.b.f)localObject).hGa.getName() });
        bool = ((com.tencent.mm.plugin.d.a.b.f)localObject).mHandler.sendMessage(((com.tencent.mm.plugin.d.a.b.f)localObject).mHandler.obtainMessage(3, paramArrayOfByte));
      }
      catch (RemoteException paramArrayOfByte)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramArrayOfByte, "", new Object[0]);
        continue;
      }
      label248: if (!a(this.lxi, paramLong, paramt))
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "register on send end callback error");
        AppMethodBeat.o(19692);
        bool = false;
      }
      else
      {
        AppMethodBeat.o(19692);
        bool = true;
      }
    }
  }

  public final boolean d(int paramInt, j paramj)
  {
    boolean bool1 = false;
    AppMethodBeat.i(19685);
    ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBlutoothScan. bluetoothVersion=%d", new Object[] { Integer.valueOf(paramInt) });
    boolean bool2;
    if (paramj == null)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "scan callback is null. just return");
      AppMethodBeat.o(19685);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      if (paramInt != 0)
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "this is not ble scan cmd");
        AppMethodBeat.o(19685);
        bool2 = bool1;
      }
      else
      {
        boolean bool3 = this.lxf.register(paramj);
        label98: com.tencent.mm.plugin.d.a.b.e locale;
        if (bool3)
        {
          ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "regist simple ble scan callback ok");
          if (this.lxj == null)
            break label310;
          locale = this.lxj;
          ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "simple ble scan");
          if (locale.jFC == null)
            break label225;
          bool2 = true;
          label131: Assert.assertTrue(bool2);
          if (locale.aVw())
            break label231;
          ab.e("MicroMsg.exdevice.BluetoothLESimpleManager", "BLE Unsupport");
          bool2 = false;
          label156: if (bool2)
            break label310;
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simple ble scan fail");
        }
        try
        {
          paramj.a(0, -1, "simpleBLE.scan failed!!!", "", "", 0, null);
          if (bool3)
            this.lxf.unregister(paramj);
          AppMethodBeat.o(19685);
          bool2 = bool1;
          continue;
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "regist simple ble scan callback fail");
          break label98;
          label225: bool2 = false;
          break label131;
          label231: boolean bool4 = locale.jFC.a(true, locale.jFF);
          bool2 = bool4;
          if (!bool4)
            break label156;
          locale.jGj.clear();
          bool2 = bool4;
        }
        catch (RemoteException localRemoteException)
        {
          while (true)
          {
            ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBLE.scan callback failed!!!, %s", new Object[] { localRemoteException.getMessage() });
            ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
          }
        }
        label310: AppMethodBeat.o(19685);
        bool2 = true;
      }
    }
  }

  public final boolean d(long paramLong, byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(19695);
    Object localObject;
    if (paramArrayOfByte == null)
      localObject = "null";
    while (true)
    {
      ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTOnRecvImpl. mac=%d, data = %s", new Object[] { Long.valueOf(paramLong), localObject });
      int j = this.lxh.beginBroadcast();
      ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "SimpleOnRecvList size = %d", new Object[] { Integer.valueOf(j) });
      label71: if (i < j);
      try
      {
        localObject = (s)this.lxh.getBroadcastItem(i);
        if (localObject != null)
          ((s)localObject).c(paramLong, paramArrayOfByte);
        while (true)
        {
          i++;
          break label71;
          localObject = com.tencent.mm.plugin.exdevice.j.b.aN(paramArrayOfByte);
          break;
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "ISimpleBTOnRecv_AIDL callback is null");
        }
      }
      catch (RemoteException paramArrayOfByte)
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback.onDataRecv Failed!!!");
        ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramArrayOfByte, "", new Object[0]);
        while (true)
        {
          return true;
          this.lxh.finishBroadcast();
        }
      }
      finally
      {
        this.lxh.finishBroadcast();
        AppMethodBeat.o(19695);
      }
    }
    throw paramArrayOfByte;
  }

  public final boolean e(int paramInt, j paramj)
  {
    boolean bool = false;
    AppMethodBeat.i(19686);
    ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBlutoothStopScan. bluetoothVersion=%d", new Object[] { Integer.valueOf(paramInt) });
    if (paramj == null)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stop scan callback is null. just return");
      AppMethodBeat.o(19686);
    }
    while (true)
    {
      return bool;
      if (this.lxj == null)
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stop scan mBLESimpleMgr is null. just return");
        AppMethodBeat.o(19686);
        continue;
      }
      com.tencent.mm.plugin.d.a.b.e locale = this.lxj;
      ab.d("MicroMsg.exdevice.BluetoothLESimpleManager", "simple ble stop scan");
      if (locale.jFC != null)
      {
        bool = true;
        label96: Assert.assertTrue(bool);
        if (locale.aVw())
          break label164;
        ab.e("MicroMsg.exdevice.BluetoothLESimpleManager", "BLE Unsupport");
        bool = false;
        if (!bool)
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mBTDeviceMrg.stopScan Failed!!!");
      }
      try
      {
        paramj.a(0, -1, "simpleBLE.stopScan failed!!!", "", "", 0, null);
        AppMethodBeat.o(19686);
        continue;
        bool = false;
        break label96;
        label164: locale.mHandler.removeCallbacks(locale.mRunnable);
        bool = locale.jFC.a(false, locale.jFF);
      }
      catch (RemoteException paramj)
      {
        while (true)
        {
          ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBLE.onScanCallback failed!!!, %s", new Object[] { paramj.getMessage() });
          ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramj, "", new Object[0]);
        }
      }
    }
  }

  public final boolean e(long paramLong, int paramInt1, int paramInt2, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(19694);
    ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "simpleBTOnSendEndImpl. mac=%d, errType = %d, errCode=%d, errMsg=%s", new Object[] { Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    int i = this.lxi.beginBroadcast();
    t localt = (t)a(paramLong, this.lxi, i);
    if (localt == null)
    {
      ab.w("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Cannot find Callback By deviceId = ".concat(String.valueOf(paramLong)));
      this.lxi.finishBroadcast();
      AppMethodBeat.o(19694);
    }
    while (true)
    {
      return bool;
      try
      {
        localt.b(paramLong, paramInt1, paramInt2, paramString);
        this.lxi.finishBroadcast();
        AppMethodBeat.o(19694);
        bool = true;
      }
      catch (RemoteException paramString)
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "callback.onSendEnd Failed!!!");
        ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", paramString, "", new Object[0]);
        this.lxi.finishBroadcast();
        AppMethodBeat.o(19694);
      }
      finally
      {
        this.lxi.finishBroadcast();
        AppMethodBeat.o(19694);
      }
    }
    throw paramString;
  }

  public final boolean hZ(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(19669);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopChannel deviceId = %d", new Object[] { Long.valueOf(paramLong) });
    if (paramLong < 0L)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", new Object[] { Long.valueOf(paramLong) });
      AppMethodBeat.o(19669);
    }
    while (true)
    {
      return bool;
      if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(4, Long.valueOf(paramLong))))
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!! message what = %d", new Object[] { Integer.valueOf(4) });
        AppMethodBeat.o(19669);
      }
      else
      {
        AppMethodBeat.o(19669);
        bool = true;
      }
    }
  }

  public final boolean ia(long paramLong)
  {
    return false;
  }

  public final boolean ib(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(19672);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "stopTask, task Id = %d", new Object[] { Long.valueOf(paramLong) });
    if (paramLong < 0L)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "taskId < 0");
      AppMethodBeat.o(19672);
    }
    while (true)
    {
      return bool;
      if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(1, Long.valueOf(paramLong))))
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage, message what = %d", new Object[] { Integer.valueOf(1) });
        AppMethodBeat.o(19672);
      }
      else
      {
        AppMethodBeat.o(19672);
        bool = true;
      }
    }
  }

  public final boolean ic(long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(19688);
    if (paramLong < 0L)
    {
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "Invalid device id = %d", new Object[] { Long.valueOf(paramLong) });
      AppMethodBeat.o(19688);
    }
    while (true)
    {
      return bool;
      if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(8, Long.valueOf(paramLong))))
      {
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(8) });
        AppMethodBeat.o(19688);
      }
      else
      {
        AppMethodBeat.o(19688);
        bool = true;
      }
    }
  }

  public final void rS(int paramInt)
  {
    AppMethodBeat.i(19683);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "OnBluetoothStateChange, state = %d", new Object[] { Integer.valueOf(paramInt) });
    int i = this.lxa.beginBroadcast() - 1;
    while (true)
      if (i >= 0)
      {
        Bundle localBundle = new Bundle();
        localBundle.putInt("key_state", paramInt);
        try
        {
          ((n)this.lxa.getBroadcastItem(i)).k(0, localBundle);
          i--;
        }
        catch (RemoteException localRemoteException)
        {
          while (true)
          {
            ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mCBListIExDeviceInvoker.getBroadcastItem(%d).onExdeviceInvoke failed!!!", new Object[] { Integer.valueOf(i) });
            ab.printErrStackTrace("MicroMsg.exdevice.RemoteBTDeviceAdapter", localRemoteException, "", new Object[0]);
          }
        }
      }
    this.lxa.finishBroadcast();
    AppMethodBeat.o(19683);
  }

  public final void setChannelSessionKey(long paramLong, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19680);
    ab.i("MicroMsg.exdevice.RemoteBTDeviceAdapter", "---setChannelSessionKey--- deviceId = %d", new Object[] { Long.valueOf(paramLong) });
    a locala = this.lwU;
    ab.i("MicroMsg.exdevice.BTDeviceManager", "------setChannelSessionKey------ deviceId = %d", new Object[] { Long.valueOf(paramLong) });
    paramArrayOfByte = new a.f(paramLong, paramArrayOfByte);
    if (!locala.mHandler.sendMessage(locala.mHandler.obtainMessage(10, paramArrayOfByte)))
      ab.e("MicroMsg.exdevice.BTDeviceManager", "mHandler.sendMessage failed!!! messageWhat = %d", new Object[] { Integer.valueOf(10) });
    AppMethodBeat.o(19680);
  }

  static final class b
  {
    long jJa = 0L;
    byte[] lqA = null;
    short lqG = (short)0;
    short lwl = (short)0;
    int mErrorCode = 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.y
 * JD-Core Version:    0.6.2
 */