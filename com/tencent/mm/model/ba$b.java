package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.c;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.aqc;

public final class ba$b extends l.e
  implements l.c
{
  public aqc flX;

  public ba$b()
  {
    AppMethodBeat.i(16317);
    this.flX = new aqc();
    AppMethodBeat.o(16317);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16318);
    this.flX = ((aqc)new aqc().parseFrom(paramArrayOfByte));
    l.a(this, this.flX.getBaseResponse());
    int i = this.flX.getBaseResponse().Ret;
    AppMethodBeat.o(16318);
    return i;
  }

  public final int getCmdId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ba.b
 * JD-Core Version:    0.6.2
 */