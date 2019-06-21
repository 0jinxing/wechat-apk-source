package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.c;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.afk;

public final class i
{
  public static final class b extends l.e
    implements l.c
  {
    public afk lSA;

    public b()
    {
      AppMethodBeat.i(68);
      this.lSA = new afk();
      AppMethodBeat.o(68);
    }

    public final int P(byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(69);
      this.lSA = ((afk)new afk().parseFrom(paramArrayOfByte));
      l.a(this, this.lSA.getBaseResponse());
      int i = this.lSA.getBaseResponse().Ret;
      AppMethodBeat.o(69);
      return i;
    }

    public final int getCmdId()
    {
      return 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.i
 * JD-Core Version:    0.6.2
 */