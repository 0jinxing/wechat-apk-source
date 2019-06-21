package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.bwe;

public final class w$b extends l.e
  implements l.c
{
  public bwe vyL;

  public w$b()
  {
    AppMethodBeat.i(80002);
    this.vyL = new bwe();
    AppMethodBeat.o(80002);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(80003);
    this.vyL = ((bwe)new bwe().parseFrom(paramArrayOfByte));
    l.a(this, this.vyL.getBaseResponse());
    int i = this.vyL.getBaseResponse().Ret;
    AppMethodBeat.o(80003);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.w.b
 * JD-Core Version:    0.6.2
 */