package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.afj;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class i$a extends l.d
  implements l.b
{
  public afj lSz;

  public i$a()
  {
    AppMethodBeat.i(66);
    this.lSz = new afj();
    AppMethodBeat.o(66);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(67);
    a(z.dmv());
    this.lSz.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.lSz.setBaseRequest(l.a(this));
    this.vyi = this.lSz.vLz.getBuffer().toByteArray();
    byte[] arrayOfByte = this.lSz.toByteArray();
    AppMethodBeat.o(67);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 733;
  }

  public final int getCmdId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.i.a
 * JD-Core Version:    0.6.2
 */