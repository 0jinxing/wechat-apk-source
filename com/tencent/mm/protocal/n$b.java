package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.jp;

public final class n$b extends l.e
  implements l.c
{
  public jp vyr;

  public n$b()
  {
    AppMethodBeat.i(123504);
    this.vyr = new jp();
    AppMethodBeat.o(123504);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(123505);
    this.vyr = ((jp)new jp().parseFrom(paramArrayOfByte));
    l.a(this, this.vyr.getBaseResponse());
    int i = this.vyr.getBaseResponse().Ret;
    AppMethodBeat.o(123505);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.n.b
 * JD-Core Version:    0.6.2
 */