package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.c;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.aor;

public final class t$b extends l.e
  implements l.c
{
  public aor gvJ;

  public t$b()
  {
    AppMethodBeat.i(108414);
    this.gvJ = new aor();
    AppMethodBeat.o(108414);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108415);
    this.gvJ = ((aor)new aor().parseFrom(paramArrayOfByte));
    l.a(this, this.gvJ.getBaseResponse());
    int i = this.gvJ.getBaseResponse().Ret;
    AppMethodBeat.o(108415);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.t.b
 * JD-Core Version:    0.6.2
 */