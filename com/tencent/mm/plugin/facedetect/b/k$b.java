package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.c;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.cmt;

public final class k$b extends l.e
  implements l.c
{
  public cmt lSE;

  public k$b()
  {
    AppMethodBeat.i(76);
    this.lSE = new cmt();
    AppMethodBeat.o(76);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(77);
    this.lSE = ((cmt)new cmt().parseFrom(paramArrayOfByte));
    l.a(this, this.lSE.getBaseResponse());
    int i = this.lSE.getBaseResponse().Ret;
    AppMethodBeat.o(77);
    return i;
  }

  public final int getCmdId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.k.b
 * JD-Core Version:    0.6.2
 */