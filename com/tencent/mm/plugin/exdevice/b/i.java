package com.tencent.mm.plugin.exdevice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.bt.b;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.e.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import junit.framework.Assert;

public final class i extends j
{
  public i(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    AppMethodBeat.i(19052);
    h localh = new h();
    localh.lvi = new c();
    localh.jBi = new b(paramArrayOfByte);
    localh.jCt = paramInt;
    this.lqD = localh;
    this.jJa = paramLong;
    this.lqB = ((short)30001);
    AppMethodBeat.o(19052);
  }

  public final byte[] bot()
  {
    AppMethodBeat.i(19053);
    Assert.assertNotNull(this.lqD);
    try
    {
      byte[] arrayOfByte = this.lqD.toByteArray();
      AppMethodBeat.o(19053);
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.ExDevicePushManufacturerSvrSendData", "mResp.toByteArray() Failed!!! %s", new Object[] { localIOException.getMessage() });
        Object localObject = null;
        AppMethodBeat.o(19053);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.i
 * JD-Core Version:    0.6.2
 */