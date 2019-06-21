package com.tencent.mm.plugin.exdevice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public final class b extends d
{
  public b(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    super(paramLong, paramInt1, paramInt2, paramArrayOfByte);
    AppMethodBeat.i(19039);
    ab.i("MicroMsg.exdevice.ExDeviceCmdAuth", "ExDeviceCmdAuth deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
    AppMethodBeat.o(19039);
  }

  protected final com.tencent.mm.bt.a aL(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19041);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      ab.e("MicroMsg.exdevice.ExDeviceCmdAuth", "paras body is null");
      AppMethodBeat.o(19041);
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      com.tencent.mm.plugin.exdevice.e.a locala = new com.tencent.mm.plugin.exdevice.e.a();
      try
      {
        locala.parseFrom(paramArrayOfByte);
        this.lqE = locala;
        ab.i("MicroMsg.exdevice.ExDeviceCmdAuth", "------AuthRequest------ ClientVersion = " + locala.luK + " DeviceName = " + locala.jBF + " Language = " + locala.luQ + " TimeZone = " + locala.luP);
        AppMethodBeat.o(19041);
        paramArrayOfByte = locala;
      }
      catch (IOException paramArrayOfByte)
      {
        ab.e("MicroMsg.exdevice.ExDeviceCmdAuth", "AuthRequest.parseFrom Failed!!! %s", new Object[] { paramArrayOfByte.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdAuth", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(19041);
        paramArrayOfByte = null;
      }
    }
  }

  public final void e(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19040);
    ab.i("MicroMsg.exdevice.ExDeviceCmdAuth", "------setAuthResponse------ret = " + paramInt + "errMsg = " + paramString);
    com.tencent.mm.plugin.exdevice.e.b localb = new com.tencent.mm.plugin.exdevice.e.b();
    localb.lvk = as(paramInt, paramString);
    localb.luR = com.tencent.mm.bt.b.bI(paramArrayOfByte);
    this.lqD = localb;
    this.lqB = ((short)20001);
    AppMethodBeat.o(19040);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.b
 * JD-Core Version:    0.6.2
 */