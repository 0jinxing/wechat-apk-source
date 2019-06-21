package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.xv;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class r$a extends l.d
  implements l.b
{
  public xv gvF;

  public r$a()
  {
    AppMethodBeat.i(108406);
    this.gvF = new xv();
    AppMethodBeat.o(108406);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(108407);
    a(z.dmx());
    this.gvF.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.gvF.setBaseRequest(l.a(this));
    byte[] arrayOfByte = this.gvF.toByteArray();
    AppMethodBeat.o(108407);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 481;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.r.a
 * JD-Core Version:    0.6.2
 */