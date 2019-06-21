package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.aqb;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class ba$a extends l.d
  implements l.b
{
  public aqb flW;

  public ba$a()
  {
    AppMethodBeat.i(16315);
    this.flW = new aqb();
    AppMethodBeat.o(16315);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(16316);
    a(z.dmv());
    this.flW.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.flW.setBaseRequest(l.a(this));
    byte[] arrayOfByte = this.flW.toByteArray();
    AppMethodBeat.o(16316);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 616;
  }

  public final int getCmdId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ba.a
 * JD-Core Version:    0.6.2
 */