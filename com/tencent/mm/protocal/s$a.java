package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.beb;

public final class s$a extends l.d
  implements l.b
{
  public beb vyE;

  public s$a()
  {
    AppMethodBeat.i(58852);
    this.vyE = new beb();
    AppMethodBeat.o(58852);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(58853);
    this.vyE.setBaseRequest(l.a(this));
    byte[] arrayOfByte = this.vyE.toByteArray();
    AppMethodBeat.o(58853);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 139;
  }

  public final int getCmdId()
  {
    return 27;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.s.a
 * JD-Core Version:    0.6.2
 */