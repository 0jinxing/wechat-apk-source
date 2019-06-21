package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.gs;
import com.tencent.mm.sdk.platformtools.ab;

public final class k$b extends l.e
  implements l.c
{
  public gs vya;

  public k$b()
  {
    AppMethodBeat.i(28278);
    this.vya = new gs();
    AppMethodBeat.o(28278);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(28279);
    this.vya = ((gs)new gs().parseFrom(paramArrayOfByte));
    ab.d("MicroMsg.MMBakchatCreateQRcodeOffline.Resp", "Ret:%d, QRCodeBuffer:%s, QRCodeUrl:%s", new Object[] { Integer.valueOf(this.vya.Ret), this.vya.vIT, this.vya.vIU });
    int i = this.vya.Ret;
    AppMethodBeat.o(28279);
    return i;
  }

  public final int getCmdId()
  {
    return 1000;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.k.b
 * JD-Core Version:    0.6.2
 */