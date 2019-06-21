package com.tencent.mm.plugin.exdevice.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.dt;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.c;
import com.tencent.mm.plugin.exdevice.model.d;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends q.a
{
  private static e lwH;

  static
  {
    AppMethodBeat.i(19580);
    lwH = new e();
    AppMethodBeat.o(19580);
  }

  public static e bpo()
  {
    return lwH;
  }

  public final void a(double paramDouble1, int paramInt1, int paramInt2, byte[] paramArrayOfByte, double paramDouble2, int paramInt3, String paramString)
  {
    AppMethodBeat.i(19579);
    ab.d("MicroMsg.exdevice.ExdeviceIBeaconManager", "onRangdingCallback, distance = %f, major = %d, minor = %d, uuid = %s, rssi = %f,aMac = %s,txPower = %d", new Object[] { Double.valueOf(paramDouble1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), b.aN(paramArrayOfByte), Double.valueOf(paramDouble2), paramString, Integer.valueOf(paramInt3) });
    dt localdt = new dt();
    String str = b.aN(paramArrayOfByte);
    paramArrayOfByte = str;
    if (str.length() >= 32)
      paramArrayOfByte = str.substring(0, 8) + "-" + str.substring(8, 12) + "-" + str.substring(12, 16) + "-" + str.substring(16, 20) + "-" + str.substring(20);
    localdt.cxk.cxi = paramArrayOfByte;
    localdt.cxk.cxn = paramDouble1;
    localdt.cxk.cxl = paramInt1;
    localdt.cxk.cxm = paramInt2;
    localdt.cxk.cxo = paramDouble2;
    localdt.cxk.cxp = paramString;
    localdt.cxk.cxq = paramInt3;
    a.xxA.m(localdt);
    AppMethodBeat.o(19579);
  }

  public final boolean aB(String paramString, boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(19578);
    ab.i("MicroMsg.exdevice.ExdeviceIBeaconManager", "ranging, uuid = %s, op = %s", new Object[] { paramString, String.valueOf(paramBoolean) });
    if (paramString == null)
    {
      ab.e("MicroMsg.exdevice.ExdeviceIBeaconManager", "uuid is null");
      AppMethodBeat.o(19578);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (u.bpy().lqX == null)
      {
        ab.e("MicroMsg.exdevice.ExdeviceIBeaconManager", "MMExDeviceCore.getTaskQueue().getDispatcher() is null !!!now retry invoke doTaskAfterServiceStarted!");
        ad.bpd().T(new e.1(this, paramString, paramBoolean));
        AppMethodBeat.o(19578);
        paramBoolean = bool;
      }
      else
      {
        paramBoolean = u.bpy().lqX.a(paramString, paramBoolean, this);
        AppMethodBeat.o(19578);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.e
 * JD-Core Version:    0.6.2
 */