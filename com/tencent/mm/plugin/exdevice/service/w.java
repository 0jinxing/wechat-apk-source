package com.tencent.mm.plugin.exdevice.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;

public class w extends k.a
{
  public void a(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2)
  {
    AppMethodBeat.i(19632);
    ab.i("MicroMsg.exdevice.OnStateChangeCallBack", "onStateChange, deviceId = %s, oldSate = %d, newState = %d, errCode = %d, profileType = %d", new Object[] { b.ie(paramLong1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Long.valueOf(paramLong2) });
    AppMethodBeat.o(19632);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.w
 * JD-Core Version:    0.6.2
 */