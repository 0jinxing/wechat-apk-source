package com.tencent.mm.az;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.protobuf.bhq;

final class b$b extends l.d
  implements l.b
{
  public bhq fLv;

  b$b()
  {
    AppMethodBeat.i(59987);
    this.fLv = new bhq();
    AppMethodBeat.o(59987);
  }

  public final byte[] ZT()
  {
    AppMethodBeat.i(59988);
    byte[] arrayOfByte = this.fLv.toByteArray();
    AppMethodBeat.o(59988);
    return arrayOfByte;
  }

  public final int ZU()
  {
    return 681;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.az.b.b
 * JD-Core Version:    0.6.2
 */