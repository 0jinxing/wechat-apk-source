package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.ja;
import com.tencent.mm.sdk.platformtools.ab;

public final class m$b extends l.e
  implements l.c
{
  public ja vyp;

  public m$b()
  {
    AppMethodBeat.i(28281);
    this.vyp = new ja();
    AppMethodBeat.o(28281);
  }

  public final int P(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(28282);
    this.vyp = ((ja)new ja().parseFrom(paramArrayOfByte));
    ab.d("MicroMsg.MMBgFg", "retcode:" + this.vyp.kCl);
    int i = this.vyp.kCl;
    AppMethodBeat.o(28282);
    return i;
  }

  public final boolean dms()
  {
    return true;
  }

  public final int getCmdId()
  {
    return 1000000312;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.m.b
 * JD-Core Version:    0.6.2
 */