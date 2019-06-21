package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.rq;
import com.tencent.mm.protocal.protobuf.yj;
import com.tencent.mm.protocal.protobuf.yk;
import com.tencent.mm.protocal.protobuf.yl;
import com.tencent.mm.sdk.platformtools.bo;

public final class q$a extends l.d
  implements l.b
{
  public final yk vyy;

  public q$a()
  {
    AppMethodBeat.i(79996);
    this.vyy = new yk();
    hB(0);
    this.vyy.wek = new yj();
    this.vyy.wek.wei = new rq();
    this.vyy.wej = new yl();
    AppMethodBeat.o(79996);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(79997);
    a(z.dmv());
    this.vyy.wek.setBaseRequest(l.a(this));
    this.vyy.wej.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.vyi = this.vyy.wej.vLz.getBuffer().toByteArray();
    this.vyh = new q.a.1(this, this);
    byte[] arrayOfByte = this.vyy.toByteArray();
    AppMethodBeat.o(79997);
    return arrayOfByte;
  }

  public final int ZU()
  {
    if (f.vxx);
    for (int i = 784; ; i = 722)
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.q.a
 * JD-Core Version:    0.6.2
 */