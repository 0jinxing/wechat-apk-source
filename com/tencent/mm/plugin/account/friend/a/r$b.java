package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.c;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.xw;

public final class r$b extends l.e
  implements l.c
{
  public xw gvG;

  public r$b()
  {
    AppMethodBeat.i(108408);
    this.gvG = new xw();
    AppMethodBeat.o(108408);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108409);
    this.gvG = ((xw)new xw().parseFrom(paramArrayOfByte));
    l.a(this, this.gvG.getBaseResponse());
    int i = this.gvG.getBaseResponse().Ret;
    AppMethodBeat.o(108409);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.r.b
 * JD-Core Version:    0.6.2
 */