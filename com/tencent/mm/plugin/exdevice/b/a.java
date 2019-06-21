package com.tencent.mm.plugin.exdevice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.i.e;
import com.tencent.mm.plugin.exdevice.i.f;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.model.c;
import com.tencent.mm.plugin.exdevice.service.i.a;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends i.a
{
  private static a lqw = null;

  public static a bop()
  {
    AppMethodBeat.i(19037);
    a locala;
    if (lqw == null)
    {
      locala = new a();
      lqw = locala;
      AppMethodBeat.o(19037);
    }
    while (true)
    {
      return locala;
      locala = lqw;
      AppMethodBeat.o(19037);
    }
  }

  public final void a(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19038);
    int i;
    label70: String str;
    if (paramArrayOfByte == null)
    {
      i = -1;
      ab.i("MicroMsg.exdevice.DeviceRequestManager", "------onDeviceRequest------ errorCode = %d, deviceId = %d, seq = %d, cmdId = %d, datalength = %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(i) });
      if (paramInt1 != 0)
        break label110;
      i = 1;
      com.tencent.mm.plugin.exdevice.g.a.n(paramLong, i);
      str = b.aN(paramArrayOfByte);
      if (str != null)
        break label116;
      ab.e("MicroMsg.exdevice.DeviceRequestManager", "dataIn is null!!! Just leave without process data");
      AppMethodBeat.o(19038);
    }
    while (true)
    {
      return;
      i = paramArrayOfByte.length;
      break;
      label110: i = 0;
      break label70;
      label116: ab.d("MicroMsg.exdevice.DeviceRequestManager", "data dump = %s", new Object[] { str });
      new a(paramInt1, paramLong, paramInt2, paramInt3, paramArrayOfByte).boq();
      AppMethodBeat.o(19038);
    }
  }

  static final class a
    implements Runnable
  {
    private long jJa = -1L;
    private byte[] lqA = null;
    private int lqx = -1;
    private int lqy = -1;
    private int lqz;

    public a(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
    {
      this.jJa = paramLong;
      this.lqx = paramInt2;
      this.lqy = paramInt3;
      this.lqA = paramArrayOfByte;
      this.lqz = paramInt1;
    }

    public final void boq()
    {
      AppMethodBeat.i(19035);
      if ((this.jJa == -1L) || (this.lqx == -1) || (this.lqy == -1))
      {
        ab.e("MicroMsg.RequestProcessThread", "invalid arguments, do nothing");
        AppMethodBeat.o(19035);
      }
      while (true)
      {
        return;
        Object localObject;
        switch (this.lqy)
        {
        default:
          ab.e("MicroMsg.RequestProcessThread", "unknown cmdId = %d, do nothing", new Object[] { Integer.valueOf(this.lqy) });
          AppMethodBeat.o(19035);
          break;
        case 10001:
          localObject = new e(this.lqz, this.jJa, this.lqx, this.lqy, this.lqA);
          u.bpy().a((ae)localObject);
          AppMethodBeat.o(19035);
          break;
        case 10002:
          k.bow().b(this.lqz, this.jJa, this.lqx, this.lqy, this.lqA);
          AppMethodBeat.o(19035);
          break;
        case 10003:
          localObject = new f(this.lqz, this.jJa, this.lqx, this.lqy, this.lqA);
          u.bpy().a((ae)localObject);
          AppMethodBeat.o(19035);
        }
      }
    }

    public final void run()
    {
      AppMethodBeat.i(19036);
      boq();
      AppMethodBeat.o(19036);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.a
 * JD-Core Version:    0.6.2
 */