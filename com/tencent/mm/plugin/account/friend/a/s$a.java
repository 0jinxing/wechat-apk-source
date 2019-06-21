package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ano;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class s$a extends l.d
  implements l.b
{
  public ano gvH;

  public s$a()
  {
    AppMethodBeat.i(108410);
    this.gvH = new ano();
    AppMethodBeat.o(108410);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(108411);
    a(z.dmx());
    this.gvH.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.gvH.setBaseRequest(l.a(this));
    byte[] arrayOfByte = this.gvH.toByteArray();
    AppMethodBeat.o(108411);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 572;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.s.a
 * JD-Core Version:    0.6.2
 */