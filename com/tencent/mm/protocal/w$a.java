package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bwd;

public final class w$a extends l.d
  implements l.b
{
  public bwd vyK;

  public w$a()
  {
    AppMethodBeat.i(80000);
    this.vyK = new bwd();
    AppMethodBeat.o(80000);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(80001);
    this.vyK.setBaseRequest(l.a(this));
    byte[] arrayOfByte = this.vyK.toByteArray();
    AppMethodBeat.o(80001);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 131;
  }

  public final int getCmdId()
  {
    return 42;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.w.a
 * JD-Core Version:    0.6.2
 */