package com.tencent.mm.plugin.soter.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ckb;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class c$a extends l.d
  implements l.b
{
  public ckb rNE;

  public c$a()
  {
    AppMethodBeat.i(59298);
    this.rNE = new ckb();
    AppMethodBeat.o(59298);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(59299);
    a(z.dmv());
    this.rNE.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.rNE.setBaseRequest(l.a(this));
    this.vyi = this.rNE.vLz.getBuffer().toByteArray();
    byte[] arrayOfByte = this.rNE.toByteArray();
    AppMethodBeat.o(59299);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 627;
  }

  public final int getCmdId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.b.c.a
 * JD-Core Version:    0.6.2
 */