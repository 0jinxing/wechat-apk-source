package com.tencent.mm.plugin.exdevice.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.eq;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.j.a;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.s.a;
import com.tencent.mm.plugin.exdevice.service.t;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class h extends s.a
{
  protected static final String TAG;
  private boolean lsZ;
  f lta;
  private j.a ltb;

  static
  {
    AppMethodBeat.i(19283);
    TAG = h.class.getName();
    AppMethodBeat.o(19283);
  }

  public h()
  {
    AppMethodBeat.i(19276);
    this.lsZ = false;
    this.lta = new f();
    this.ltb = new h.1(this);
    AppMethodBeat.o(19276);
  }

  public static boolean a(long paramLong, byte[] paramArrayOfByte, t paramt)
  {
    boolean bool = false;
    AppMethodBeat.i(19281);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      ab.e(TAG, "no data for transmit");
      AppMethodBeat.o(19281);
    }
    while (true)
    {
      return bool;
      if (u.bpy().lqX == null)
      {
        ab.e(TAG, "can not send data");
        AppMethodBeat.o(19281);
      }
      else
      {
        bool = u.bpy().lqX.b(paramLong, paramArrayOfByte, paramt);
        if (!bool)
          ab.e(TAG, "simpleBluetoothSendData error");
        AppMethodBeat.o(19281);
      }
    }
  }

  public static void hH(long paramLong)
  {
    AppMethodBeat.i(19280);
    d locald = ad.bpd();
    ab.d("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBTDisconnect");
    if (locald.lrc == null)
    {
      ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
      AppMethodBeat.o(19280);
    }
    while (true)
    {
      return;
      if (u.bpy().lqX == null)
      {
        ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
        AppMethodBeat.o(19280);
      }
      else
      {
        if (!u.bpy().lqX.ic(paramLong))
          ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBluetoothDisconnect failed!!!");
        AppMethodBeat.o(19280);
      }
    }
  }

  public final void a(long paramLong, h.a parama)
  {
    AppMethodBeat.i(19279);
    Object localObject = this.lta.hU(paramLong);
    if ((localObject != null) && (2 == ((f.a)localObject).cxs))
    {
      ab.d(TAG, "device(" + paramLong + ") has been connected");
      parama.a(paramLong, 2, 2, 0, ((f.a)localObject).jGw);
      AppMethodBeat.o(19279);
    }
    while (true)
    {
      return;
      localObject = ad.bpd();
      parama = new h.2(this, parama);
      ab.d("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBTConnect");
      if (((d)localObject).lrc == null)
      {
        ((d)localObject).lrc = new com.tencent.mm.plugin.exdevice.service.c();
        ((d)localObject).lrc.lwE = new d.3((d)localObject, paramLong, parama);
        ((d)localObject).lrc.dH(ah.getContext());
        AppMethodBeat.o(19279);
      }
      else
      {
        ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "try start connect");
        localObject = u.bpy().lqX;
        if ((localObject == null) || (!((m)localObject).a(paramLong, parama)))
          ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "connect failed!!!");
        AppMethodBeat.o(19279);
      }
    }
  }

  public final void boM()
  {
    AppMethodBeat.i(19277);
    if (this.lsZ)
    {
      ab.d(TAG, "still scanning. return");
      AppMethodBeat.o(19277);
      return;
    }
    d locald = ad.bpd();
    j.a locala = this.ltb;
    ab.d("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBTScan");
    if (locald.lrc == null)
    {
      locald.lrc = new com.tencent.mm.plugin.exdevice.service.c();
      locald.lrc.lwE = new d.2(locald, locala);
      locald.lrc.dH(ah.getContext());
    }
    while (true)
    {
      this.lsZ = true;
      AppMethodBeat.o(19277);
      break;
      if (u.bpy().lqX == null)
      {
        ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
      }
      else
      {
        ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "try start scan");
        if (!u.bpy().lqX.a(locala))
          ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "scan failed!!!");
      }
    }
  }

  public final void c(long paramLong, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19282);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      ab.e(TAG, "data is null or nil");
      AppMethodBeat.o(19282);
    }
    while (true)
    {
      return;
      ab.d(TAG, "onDataRecv. mac=%d, data=%s", new Object[] { Long.valueOf(paramLong), com.tencent.mm.plugin.exdevice.j.b.aN(paramArrayOfByte) });
      Object localObject1 = ad.bph();
      String str = com.tencent.mm.plugin.exdevice.j.b.ie(paramLong);
      LinkedList localLinkedList;
      synchronized (((e)localObject1).lrw)
      {
        localLinkedList = new java/util/LinkedList;
        localLinkedList.<init>(((e)localObject1).lrw);
        ??? = localLinkedList.iterator();
        if (((Iterator)???).hasNext())
          ((e.b)((Iterator)???).next()).b(str, paramArrayOfByte, true);
      }
      localLinkedList.clear();
      localObject1 = ((e)localObject1).lrx.values().iterator();
      while (((Iterator)localObject1).hasNext())
        ((e.b)((Iterator)localObject1).next()).b(str, paramArrayOfByte, true);
      localObject1 = new eq();
      ((eq)localObject1).cyh.mac = str;
      ((eq)localObject1).cyh.data = paramArrayOfByte;
      a.xxA.a((com.tencent.mm.sdk.b.b)localObject1, Looper.getMainLooper());
      AppMethodBeat.o(19282);
    }
  }

  public final void stopScan()
  {
    AppMethodBeat.i(19278);
    if (!this.lsZ)
    {
      ab.d(TAG, "not yet scan. return");
      AppMethodBeat.o(19278);
      return;
    }
    d locald = ad.bpd();
    j.a locala = this.ltb;
    ab.d("MicroMsg.exdevice.ExdeviceConnectManager", "simpleBTStopScan");
    if (locald.lrc == null)
      ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
    while (true)
    {
      this.lsZ = false;
      AppMethodBeat.o(19278);
      break;
      if (u.bpy().lqX == null)
        ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
      else if (!u.bpy().lqX.b(locala))
        ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "stopScan failed!!!");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.h
 * JD-Core Version:    0.6.2
 */