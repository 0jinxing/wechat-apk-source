package com.tencent.mm.plugin.report.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.awz;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class b$a extends l.d
  implements l.b
{
  public awz pXm;

  public b$a()
  {
    AppMethodBeat.i(72669);
    this.pXm = new awz();
    AppMethodBeat.o(72669);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(72670);
    a(z.dmw());
    this.pXm.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.pXm.setBaseRequest(l.a(this));
    byte[] arrayOfByte = this.pXm.toByteArray();
    AppMethodBeat.o(72670);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 694;
  }

  public final int getCmdId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.b.b.a
 * JD-Core Version:    0.6.2
 */