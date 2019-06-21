package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.rr;

public final class q$b extends l.e
  implements l.c
{
  public final rr vyB;

  public q$b()
  {
    AppMethodBeat.i(79998);
    this.vyB = new rr();
    AppMethodBeat.o(79998);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79999);
    this.vyB.parseFrom(paramArrayOfByte);
    int i = this.vyB.BaseResponse.Ret;
    AppMethodBeat.o(79999);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.q.b
 * JD-Core Version:    0.6.2
 */