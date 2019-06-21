package com.tencent.mm.plugin.exdevice.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.h.a;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.j;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.plugin.exdevice.service.w;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.HashMap;

public final class d
{
  private static int lrh = 0;
  com.tencent.mm.plugin.exdevice.service.c lrc;
  private w lrd;
  HashMap<Long, ap> lre;
  HashMap<Long, ap> lrf;
  HashMap<Long, Integer> lrg;
  private j lri;
  private Object lrj;

  public d()
  {
    AppMethodBeat.i(19111);
    this.lri = null;
    this.lrj = new Object();
    u.bpy().lqY = new d.1(this);
    if (this.lrd == null)
      this.lrd = new d.10(this);
    this.lre = new HashMap();
    this.lrf = new HashMap();
    this.lrg = new HashMap();
    AppMethodBeat.o(19111);
  }

  public static int boE()
  {
    return lrh;
  }

  private boolean c(String paramString, long paramLong, int paramInt)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(19119);
        int i = aw.Rg().acS();
        if ((i != 4) && (i != 6))
        {
          ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "now network is not avaiable, notify directly");
          AppMethodBeat.o(19119);
          bool = false;
          return bool;
        }
        if (this.lrf.containsKey(Long.valueOf(paramLong)))
        {
          ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "now the device is syncing data : %s, %d, Just leave!!!", new Object[] { paramString, Long.valueOf(paramLong) });
          AppMethodBeat.o(19119);
          bool = false;
          continue;
        }
        ap localap = new com/tencent/mm/sdk/platformtools/ap;
        Looper localLooper = Looper.getMainLooper();
        d.8 local8 = new com/tencent/mm/plugin/exdevice/model/d$8;
        local8.<init>(this, paramLong, paramString, paramInt);
        localap.<init>(localLooper, local8, false);
        long l = com.tencent.mm.plugin.exdevice.j.b.bqi();
        ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "now sync time out is : %d", new Object[] { Long.valueOf(l) });
        localap.ae(l, l);
        this.lrf.put(Long.valueOf(paramLong), localap);
        if (u.bpy().lqX != null)
        {
          ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "start channel now : %s, %d", new Object[] { paramString, Long.valueOf(paramLong) });
          bool = u.bpy().lqX.a(paramLong, paramInt, this.lrd);
          AppMethodBeat.o(19119);
          continue;
        }
      }
      finally
      {
      }
      ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher() == null");
      AppMethodBeat.o(19119);
      boolean bool = false;
    }
  }

  private boolean d(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(19120);
    boolean bool;
    if (aw.Rg().acS() != 4)
    {
      ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "now network is not avaiable, notify directly");
      bool = false;
      AppMethodBeat.o(19120);
    }
    while (true)
    {
      return bool;
      ap localap;
      if (this.lre.containsKey(Long.valueOf(paramLong)))
      {
        ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "now the device is connecting, reset timer : brand name = %s, deviceid = %d, bluetooth version = %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
        localap = (ap)this.lre.get(Long.valueOf(paramLong));
        localap.stopTimer();
        localap.ae(30000L, 30000L);
      }
      while (true)
      {
        if (u.bpy().lqX != null)
          break label245;
        ab.w("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher() == null, Just leave, brand name is %s, device id is %d, bluetooth version is %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
        bool = false;
        AppMethodBeat.o(19120);
        break;
        ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "the device is not connecting, brand name = %s, deviceid = %d, bluetooth version = %d", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
        localap = new ap(Looper.getMainLooper(), new d.9(this, paramLong, paramString, paramInt), false);
        localap.ae(30000L, 30000L);
        this.lre.put(Long.valueOf(paramLong), localap);
      }
      label245: paramString = u.bpx().hT(paramLong);
      if (paramString == null)
      {
        ab.w("MicroMsg.exdevice.ExdeviceConnectManager", "Device unbond: %s", new Object[] { Long.valueOf(paramLong) });
        bool = false;
        AppMethodBeat.o(19120);
      }
      else
      {
        ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "onStateChange, connectState = %d ", new Object[] { Integer.valueOf(paramString.cxs) });
        if ((paramString.cxs != 2) && (paramString.cxs != 1))
          u.bpy().lqX.a(paramLong, paramInt, this.lrd);
        bool = true;
        AppMethodBeat.o(19120);
      }
    }
  }

  public static boolean gL(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(19121);
    long[] arrayOfLong;
    if (u.bpy().lqX != null)
    {
      arrayOfLong = u.bpy().lqX.bpl();
      if ((arrayOfLong == null) || (arrayOfLong.length <= 0))
      {
        ab.w("MicroMsg.exdevice.ExdeviceConnectManager", "connectedDevices = null or connectedDevices.length = 0");
        AppMethodBeat.o(19121);
        paramBoolean = false;
      }
    }
    while (true)
    {
      return paramBoolean;
      int i = arrayOfLong.length;
      int j = 0;
      if (j < i)
      {
        long l = arrayOfLong[j];
        ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "deviceId = %s", new Object[] { Long.valueOf(l) });
        com.tencent.mm.plugin.exdevice.h.b localb = ad.boW().id(l);
        if (localb == null)
          ab.w("MicroMsg.exdevice.ExdeviceConnectManager", "Get device info failed, deviceId = %s", new Object[] { Long.valueOf(l) });
        while (true)
        {
          j++;
          break;
          if ((paramBoolean) && ((localb.field_closeStrategy & 0x1) == 0))
          {
            ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "Device is not close after exit chatting, deviceId = %s", new Object[] { Long.valueOf(l) });
          }
          else
          {
            ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "Stop channel, deviceId = %s", new Object[] { Long.valueOf(l) });
            u.bpy().lqX.hZ(l);
          }
        }
        ab.w("MicroMsg.exdevice.ExdeviceConnectManager", "MMExDeviceCore.getTaskQueue().getDispatcher is null!");
        AppMethodBeat.o(19121);
        paramBoolean = false;
      }
      else
      {
        AppMethodBeat.o(19121);
        paramBoolean = bool;
      }
    }
  }

  public static void hH(long paramLong)
  {
    AppMethodBeat.i(19117);
    if (u.bpy().lqX != null)
      ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "now stop the devide channel : %d, result : %b", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(u.bpy().lqX.hZ(paramLong)) });
    AppMethodBeat.o(19117);
  }

  public final void T(Runnable paramRunnable)
  {
    AppMethodBeat.i(19124);
    ab.d("MicroMsg.exdevice.ExdeviceConnectManager", "doTaskAfterServiceStarted");
    if (this.lrc == null)
    {
      this.lrc = new com.tencent.mm.plugin.exdevice.service.c();
      this.lrc.lwE = new d.4(this, paramRunnable);
      this.lrc.dH(ah.getContext());
      AppMethodBeat.o(19124);
    }
    while (true)
    {
      return;
      this.lrc.U(paramRunnable);
      AppMethodBeat.o(19124);
    }
  }

  public final void a(int paramInt, j paramj)
  {
    AppMethodBeat.i(19122);
    ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "scanLogic, bluetooth version = %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramj == null)
    {
      ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "null == aCallback");
      AppMethodBeat.o(19122);
    }
    while (true)
    {
      return;
      this.lri = paramj;
      if (this.lrc == null)
      {
        this.lrc = new com.tencent.mm.plugin.exdevice.service.c();
        this.lrc.lwE = new d.12(this, paramInt, paramInt);
        this.lrc.dH(ah.getContext());
        AppMethodBeat.o(19122);
      }
      else
      {
        ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "try start scan");
        if (u.bpy().lqX == null)
        {
          ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
          AppMethodBeat.o(19122);
        }
        else
        {
          if (!u.bpy().lqX.b(paramInt, this.lri))
            ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
          AppMethodBeat.o(19122);
        }
      }
    }
  }

  public final void a(Long paramLong, int paramInt)
  {
    try
    {
      AppMethodBeat.i(19113);
      this.lrg.put(paramLong, Integer.valueOf(paramInt));
      AppMethodBeat.o(19113);
      return;
    }
    finally
    {
      paramLong = finally;
    }
    throw paramLong;
  }

  public final void a(String paramString, long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(19115);
    a.E("shut_down_device", paramLong);
    if (this.lrc == null)
    {
      ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "Bind exdeviceService");
      this.lrc = new com.tencent.mm.plugin.exdevice.service.c();
      this.lrc.lwE = new d.6(this, paramInt, paramString, paramLong, paramBoolean);
      this.lrc.dH(ah.getContext());
      AppMethodBeat.o(19115);
    }
    while (true)
    {
      return;
      if ((this.lrc != null) && (!this.lrc.lwF))
      {
        ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "ExdeviceService setConnected");
        this.lrc.lwE = new d.7(this, paramInt, paramString, paramLong, paramBoolean);
        this.lrc.dH(ah.getContext());
        AppMethodBeat.o(19115);
      }
      else
      {
        b(paramString, paramLong, paramInt, paramBoolean);
        AppMethodBeat.o(19115);
      }
    }
  }

  public final void b(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(19114);
    a(paramString, paramLong, paramInt, false);
    AppMethodBeat.o(19114);
  }

  public final void b(String paramString, long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(19116);
    ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "doConnect");
    if (paramBoolean);
    for (paramBoolean = c(paramString, paramLong, paramInt); ; paramBoolean = d(paramString, paramLong, paramInt))
    {
      ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "startChannel Ret = %s", new Object[] { Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(19116);
      return;
    }
  }

  public final void boF()
  {
    AppMethodBeat.i(19118);
    if ((this.lrc != null) && (this.lrc.lwF));
    while (true)
    {
      try
      {
        com.tencent.mm.bp.d.a(this.lrc, "exdevice");
        AppMethodBeat.o(19118);
        return;
      }
      catch (Exception localException)
      {
      }
      AppMethodBeat.o(19118);
    }
  }

  public final void uI(int paramInt)
  {
    try
    {
      AppMethodBeat.i(19112);
      ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "setConnectMode, mode = %d", new Object[] { Integer.valueOf(paramInt) });
      lrh = paramInt;
      AppMethodBeat.o(19112);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void uJ(int paramInt)
  {
    AppMethodBeat.i(19123);
    ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "stopScanLogic, bluetooth version = %d", new Object[] { Integer.valueOf(paramInt) });
    if (this.lrc == null)
    {
      ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
      AppMethodBeat.o(19123);
    }
    while (true)
    {
      return;
      if (u.bpy().lqX == null)
      {
        ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
        AppMethodBeat.o(19123);
      }
      else
      {
        if (!u.bpy().lqX.c(paramInt, this.lri))
          ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "stopScan failed!!!");
        AppMethodBeat.o(19123);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.d
 * JD-Core Version:    0.6.2
 */