package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cms;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class k$a extends l.d
  implements l.b
{
  public cms lSD;

  public k$a()
  {
    AppMethodBeat.i(74);
    this.lSD = new cms();
    AppMethodBeat.o(74);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(75);
    a(z.dmv());
    this.lSD.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.lSD.setBaseRequest(l.a(this));
    this.vyi = this.lSD.vLz.getBuffer().toByteArray();
    byte[] arrayOfByte = this.lSD.toByteArray();
    AppMethodBeat.o(75);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 930;
  }

  public final int getCmdId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.k.a
 * JD-Core Version:    0.6.2
 */