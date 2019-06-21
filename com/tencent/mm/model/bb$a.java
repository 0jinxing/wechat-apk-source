package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.aqf;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class bb$a extends l.d
  implements l.b
{
  public aqf flY;

  public bb$a()
  {
    AppMethodBeat.i(16319);
    this.flY = new aqf();
    AppMethodBeat.o(16319);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(16320);
    a(z.dmv());
    this.flY.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.flY.setBaseRequest(l.a(this));
    byte[] arrayOfByte = this.flY.toByteArray();
    AppMethodBeat.o(16320);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 618;
  }

  public final int getCmdId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bb.a
 * JD-Core Version:    0.6.2
 */