package com.tencent.mm.plugin.exdevice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.e.n;
import com.tencent.mm.sdk.platformtools.ab;

public final class h extends j
{
  public h(int paramInt1, int paramInt2, long paramLong)
  {
    AppMethodBeat.i(19049);
    n localn = new n();
    localn.lvi = new c();
    localn.lvm = paramInt1;
    localn.lvn = paramInt2;
    this.lqD = localn;
    this.jJa = paramLong;
    this.lqB = ((short)30002);
    AppMethodBeat.o(19049);
  }

  public final byte[] bot()
  {
    AppMethodBeat.i(19050);
    Object localObject = null;
    try
    {
      byte[] arrayOfByte = this.lqD.toByteArray();
      localObject = arrayOfByte;
      AppMethodBeat.o(19050);
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.exdevice.ExDeviceCmdSwitchViewPush", "mResp.toByteArray() Failed!!! %s", new Object[] { localException.getMessage() });
    }
  }

  public final int bov()
  {
    AppMethodBeat.i(19051);
    n localn = (n)this.lqD;
    int i;
    if (localn == null)
    {
      ab.e("MicroMsg.exdevice.ExDeviceCmdSwitchViewPush", "null = pushReq");
      i = -1;
      AppMethodBeat.o(19051);
    }
    while (true)
    {
      return i;
      i = localn.lvm;
      AppMethodBeat.o(19051);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.h
 * JD-Core Version:    0.6.2
 */