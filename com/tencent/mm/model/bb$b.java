package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.c;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.aqg;

public final class bb$b extends l.e
  implements l.c
{
  public aqg flZ;

  public bb$b()
  {
    AppMethodBeat.i(16321);
    this.flZ = new aqg();
    AppMethodBeat.o(16321);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16322);
    this.flZ = ((aqg)new aqg().parseFrom(paramArrayOfByte));
    l.a(this, this.flZ.getBaseResponse());
    int i = this.flZ.getBaseResponse().Ret;
    AppMethodBeat.o(16322);
    return i;
  }

  public final int getCmdId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bb.b
 * JD-Core Version:    0.6.2
 */