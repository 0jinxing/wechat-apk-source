package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bek;

public final class t$b extends l.e
  implements l.c
{
  public bek vyH;

  public t$b()
  {
    AppMethodBeat.i(58858);
    this.vyH = new bek();
    AppMethodBeat.o(58858);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58859);
    this.vyH = ((bek)new bek().parseFrom(paramArrayOfByte));
    int i = this.vyH.Ret;
    AppMethodBeat.o(58859);
    return i;
  }

  public final int getCmdId()
  {
    return 1000000121;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.t.b
 * JD-Core Version:    0.6.2
 */