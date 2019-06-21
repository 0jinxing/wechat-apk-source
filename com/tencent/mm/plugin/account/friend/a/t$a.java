package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.aoq;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class t$a extends l.d
  implements l.b
{
  public aoq gvI;

  public t$a()
  {
    AppMethodBeat.i(108412);
    this.gvI = new aoq();
    AppMethodBeat.o(108412);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(108413);
    a(z.dmv());
    this.gvI.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.gvI.setBaseRequest(l.a(this));
    byte[] arrayOfByte = this.gvI.toByteArray();
    AppMethodBeat.o(108413);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 429;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.t.a
 * JD-Core Version:    0.6.2
 */