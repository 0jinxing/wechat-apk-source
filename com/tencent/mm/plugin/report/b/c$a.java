package com.tencent.mm.plugin.report.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.awz;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class c$a extends l.d
  implements l.b
{
  public awz pXm;

  public c$a()
  {
    AppMethodBeat.i(72671);
    this.pXm = new awz();
    AppMethodBeat.o(72671);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(72672);
    a(z.dmw());
    this.pXm.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
    this.pXm.setBaseRequest(l.a(this));
    byte[] arrayOfByte = this.pXm.toByteArray();
    AppMethodBeat.o(72672);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 499;
  }

  public final int getCmdId()
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.b.c.a
 * JD-Core Version:    0.6.2
 */