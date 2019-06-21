package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.apy;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class u$a extends l.d
  implements l.b
{
  public apy gvK;

  public u$a()
  {
    AppMethodBeat.i(108416);
    this.gvK = new apy();
    AppMethodBeat.o(108416);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(108417);
    a(z.dmx());
    this.gvK.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.gvK.setBaseRequest(l.a(this));
    byte[] arrayOfByte = this.gvK.toByteArray();
    AppMethodBeat.o(108417);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 107;
  }

  public final int getCmdId()
  {
    return 48;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.u.a
 * JD-Core Version:    0.6.2
 */