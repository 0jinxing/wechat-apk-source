package com.tencent.mm.plugin.soter.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.c;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.ckc;

public final class c$b extends l.e
  implements l.c
{
  public ckc rNF;

  public c$b()
  {
    AppMethodBeat.i(59300);
    this.rNF = new ckc();
    AppMethodBeat.o(59300);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(59301);
    this.rNF = ((ckc)new ckc().parseFrom(paramArrayOfByte));
    l.a(this, this.rNF.getBaseResponse());
    int i = this.rNF.getBaseResponse().Ret;
    AppMethodBeat.o(59301);
    return i;
  }

  public final int getCmdId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.b.c.b
 * JD-Core Version:    0.6.2
 */