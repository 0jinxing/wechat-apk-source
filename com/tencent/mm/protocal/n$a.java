package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.jo;
import com.tencent.mm.sdk.platformtools.bo;

public final class n$a extends l.d
  implements l.b
{
  public jo vyq;

  public n$a()
  {
    AppMethodBeat.i(123502);
    this.vyq = new jo();
    AppMethodBeat.o(123502);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(123503);
    a(z.dmv());
    this.vyq.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.vyq.setBaseRequest(l.a(this));
    byte[] arrayOfByte = this.vyq.toByteArray();
    AppMethodBeat.o(123503);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 145;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.n.a
 * JD-Core Version:    0.6.2
 */