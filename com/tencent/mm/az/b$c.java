package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l.c;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.bhr;

public final class b$c extends l.e
  implements l.c
{
  public bhr fLw;

  public b$c()
  {
    AppMethodBeat.i(59989);
    this.fLw = new bhr();
    AppMethodBeat.o(59989);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(59990);
    this.fLw = ((bhr)new bhr().parseFrom(paramArrayOfByte));
    int i = this.fLw.Ret;
    AppMethodBeat.o(59990);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.b.c
 * JD-Core Version:    0.6.2
 */