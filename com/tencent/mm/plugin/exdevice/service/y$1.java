package com.tencent.mm.plugin.exdevice.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.b.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class y$1 extends e.a
{
  y$1(y paramy)
  {
  }

  public final void a(long paramLong1, boolean paramBoolean, long paramLong2)
  {
    AppMethodBeat.i(19649);
    Object localObject;
    if (paramBoolean)
    {
      localObject = "true";
      ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onConnected. seesionId=%d, connected=%s, profileType=%d", new Object[] { Long.valueOf(paramLong1), localObject, Long.valueOf(paramLong2) });
      localObject = new y.c((byte)0);
      ((y.c)localObject).jJa = paramLong1;
      if (!paramBoolean)
        break label154;
    }
    label154: for (int i = 2; ; i = 4)
    {
      ((y.c)localObject).lwn = i;
      ((y.c)localObject).lwm = 1;
      ((y.c)localObject).lqz = 0;
      ((y.c)localObject).jGw = paramLong2;
      if (!y.a(this.lxl).sendMessage(y.a(this.lxl).obtainMessage(9, localObject)))
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(9) });
      AppMethodBeat.o(19649);
      return;
      localObject = "false";
      break;
    }
  }

  public final void a(String paramString1, String paramString2, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19652);
    ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onDiscover. deviceMac=%s, deviceName=%s", new Object[] { paramString1, paramString2 });
    y.g localg = new y.g((byte)0);
    localg.lxp = false;
    localg.jJe = paramString1;
    localg.mDeviceName = paramString2;
    localg.hGc = paramInt;
    localg.lxq = paramArrayOfByte;
    if (!y.a(this.lxl).sendMessage(y.a(this.lxl).obtainMessage(13, localg)))
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(13) });
    AppMethodBeat.o(19652);
  }

  public final void aVx()
  {
    AppMethodBeat.i(19653);
    ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onDiscoverFinished");
    y.g localg = new y.g((byte)0);
    localg.lxp = true;
    localg.jJe = null;
    localg.mDeviceName = null;
    localg.hGc = 0;
    localg.lxq = null;
    if (!y.a(this.lxl).sendMessage(y.a(this.lxl).obtainMessage(13, localg)))
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(13) });
    AppMethodBeat.o(19653);
  }

  public final void b(long paramLong, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19650);
    y.f localf = new y.f((byte)0);
    localf.ltB = paramLong;
    localf.mData = paramArrayOfByte;
    if (!y.a(this.lxl).sendMessage(y.a(this.lxl).obtainMessage(12, localf)))
      ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(12) });
    AppMethodBeat.o(19650);
  }

  public final void m(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(19651);
    Object localObject;
    if (paramBoolean)
    {
      localObject = "true";
      ab.d("MicroMsg.exdevice.RemoteBTDeviceAdapter", "onSend. sessionId=%d, success=%s", new Object[] { Long.valueOf(paramLong), localObject });
      localObject = new y.h((byte)0);
      ((y.h)localObject).ltB = paramLong;
      if (!paramBoolean)
        break label136;
      ((y.h)localObject).lqL = 0;
    }
    for (((y.h)localObject).lqz = 0; ; ((y.h)localObject).lqz = -1)
    {
      ((y.h)localObject).hxN = "";
      if (!y.a(this.lxl).sendMessage(y.a(this.lxl).obtainMessage(11, localObject)))
        ab.e("MicroMsg.exdevice.RemoteBTDeviceAdapter", "mHandler.sendMessage failed!!!, message what = %d", new Object[] { Integer.valueOf(11) });
      AppMethodBeat.o(19651);
      return;
      localObject = "false";
      break;
      label136: ((y.h)localObject).lqL = -1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.y.1
 * JD-Core Version:    0.6.2
 */