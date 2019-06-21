package com.tencent.mm.plugin.exdevice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.bt.b;
import com.tencent.mm.plugin.exdevice.e.k;
import com.tencent.mm.plugin.exdevice.e.l;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public final class f extends d
{
  public f(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    super(paramLong, paramInt1, paramInt2, paramArrayOfByte);
    AppMethodBeat.i(19045);
    ab.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "ExDeviceCmdSendDataToManufacturer deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
    AppMethodBeat.o(19045);
  }

  protected final a aL(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19047);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      ab.e("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "data is null");
      AppMethodBeat.o(19047);
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      k localk = new k();
      try
      {
        localk.parseFrom(paramArrayOfByte);
        this.lqE = localk;
        ab.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "SendDataToManufacturerSvrRequest cmd has been received");
        AppMethodBeat.o(19047);
        paramArrayOfByte = localk;
      }
      catch (IOException paramArrayOfByte)
      {
        ab.e("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "SendDataToManufacturerSvrRequest.parseFrom Failed!!! %s", new Object[] { paramArrayOfByte.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(19047);
        paramArrayOfByte = null;
      }
    }
  }

  public final void f(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19046);
    ab.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "setSendDataToManufacturerResponse ret = " + paramInt + paramString);
    l locall = new l();
    locall.lvk = as(paramInt, paramString);
    paramString = paramArrayOfByte;
    if (paramArrayOfByte == null)
      paramString = new byte[0];
    locall.jBi = new b(paramString);
    this.lqD = locall;
    this.lqB = ((short)20002);
    AppMethodBeat.o(19046);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.f
 * JD-Core Version:    0.6.2
 */