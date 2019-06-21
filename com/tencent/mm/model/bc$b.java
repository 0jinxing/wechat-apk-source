package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.c;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.cnn;

public final class bc$b extends l.e
  implements l.c
{
  public cnn fmb;

  public bc$b()
  {
    AppMethodBeat.i(16325);
    this.fmb = new cnn();
    AppMethodBeat.o(16325);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16326);
    this.fmb = ((cnn)new cnn().parseFrom(paramArrayOfByte));
    l.a(this, this.fmb.getBaseResponse());
    int i = this.fmb.getBaseResponse().Ret;
    AppMethodBeat.o(16326);
    return i;
  }

  public final int getCmdId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bc.b
 * JD-Core Version:    0.6.2
 */