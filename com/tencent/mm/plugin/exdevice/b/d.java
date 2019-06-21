package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.bt.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public abstract class d extends c
{
  protected a lqE = null;
  private short lqF = (short)-1;
  private short lqG = (short)-1;

  public d(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    ab.i("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", "onDeviceRequest deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
    this.jJa = paramLong;
    this.lqF = ((short)(short)paramInt2);
    this.lqG = ((short)(short)paramInt1);
    aL(paramArrayOfByte);
  }

  protected abstract a aL(byte[] paramArrayOfByte);

  public final short bor()
  {
    return this.lqF;
  }

  public final short bos()
  {
    return this.lqG;
  }

  public final byte[] bot()
  {
    try
    {
      byte[] arrayOfByte = this.lqD.toByteArray();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", "mResp.toByteArray() Failed!!! %s", new Object[] { localIOException.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", localIOException, "", new Object[0]);
        Object localObject = null;
      }
    }
  }

  public final a bou()
  {
    return this.lqE;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.d
 * JD-Core Version:    0.6.2
 */