package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.gq;
import com.tencent.mm.sdk.platformtools.ab;

public final class k
{
  public static final class a extends l.d
    implements l.b
  {
    public gq vxY;
    public byte[] vxZ;

    public a()
    {
      AppMethodBeat.i(28276);
      this.vxY = new gq();
      AppMethodBeat.o(28276);
    }

    public final byte[] ZT()
    {
      AppMethodBeat.i(28277);
      this.vxY.setBaseRequest(l.a(this));
      ab.d("MicroMsg.MMBakchatCreateQRcodeOffline.Req", "key:%s  AddrCount:%s  AddrList:%s, PCName:%s, PCAcctName:%s, Scene:%s, DataSize:%s, WifiName:%s, Tickit:%s", new Object[] { this.vxZ, Integer.valueOf(this.vxY.vIN), this.vxY.vIO, this.vxY.vIP, this.vxY.vIQ, Integer.valueOf(this.vxY.Scene), Long.valueOf(this.vxY.jBP), this.vxY.vIR, this.vxY.vIS });
      byte[] arrayOfByte = this.vxY.toByteArray();
      AppMethodBeat.o(28277);
      return arrayOfByte;
    }

    public final int ZU()
    {
      return 1000;
    }

    public final int getCmdId()
    {
      return 1000;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.k
 * JD-Core Version:    0.6.2
 */