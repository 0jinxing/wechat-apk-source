package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.bec;

public final class s$b extends l.e
  implements l.c
{
  public bec vyF;

  public s$b()
  {
    AppMethodBeat.i(58854);
    this.vyF = new bec();
    AppMethodBeat.o(58854);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58855);
    this.vyF = ((bec)new bec().parseFrom(paramArrayOfByte));
    l.a(this, this.vyF.getBaseResponse());
    int i = this.vyF.getBaseResponse().Ret;
    AppMethodBeat.o(58855);
    return i;
  }

  public final int getCmdId()
  {
    return 1000000027;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.s.b
 * JD-Core Version:    0.6.2
 */