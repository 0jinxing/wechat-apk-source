package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cnm;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class bc$a extends l.d
  implements l.b
{
  public cnm fma;

  public bc$a()
  {
    AppMethodBeat.i(16323);
    this.fma = new cnm();
    AppMethodBeat.o(16323);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(16324);
    a(z.dmv());
    this.fma.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.fma.setBaseRequest(l.a(this));
    byte[] arrayOfByte = this.fma.toByteArray();
    AppMethodBeat.o(16324);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 617;
  }

  public final int getCmdId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bc.a
 * JD-Core Version:    0.6.2
 */