package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bej;

public final class t$a extends l.d
  implements l.b
{
  public bej vyG;

  public t$a()
  {
    AppMethodBeat.i(58856);
    this.vyG = new bej();
    AppMethodBeat.o(58856);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(58857);
    byte[] arrayOfByte = this.vyG.toByteArray();
    AppMethodBeat.o(58857);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 138;
  }

  public final int getCmdId()
  {
    return 121;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.t.a
 * JD-Core Version:    0.6.2
 */