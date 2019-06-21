package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.l;
import com.tencent.mm.protocal.l.b;
import com.tencent.mm.protocal.l.c;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.l.e;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bqx;
import com.tencent.mm.protocal.protobuf.bqy;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.platformtools.bo;

public final class j
{
  public static final class a extends l.d
    implements l.b
  {
    public bqx lSB;

    public a()
    {
      AppMethodBeat.i(70);
      this.lSB = new bqx();
      AppMethodBeat.o(70);
    }

    public final byte[] ZT()
    {
      AppMethodBeat.i(71);
      a(z.dmv());
      this.lSB.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
      this.lSB.setBaseRequest(l.a(this));
      this.vyi = this.lSB.vLz.getBuffer().toByteArray();
      byte[] arrayOfByte = this.lSB.toByteArray();
      AppMethodBeat.o(71);
      return arrayOfByte;
    }

    public final int ZU()
    {
      return 931;
    }

    public final int getCmdId()
    {
      return 0;
    }
  }

  public static final class b extends l.e
    implements l.c
  {
    public bqy lSC;

    public b()
    {
      AppMethodBeat.i(72);
      this.lSC = new bqy();
      AppMethodBeat.o(72);
    }

    public final int P(byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(73);
      this.lSC = ((bqy)new bqy().parseFrom(paramArrayOfByte));
      l.a(this, this.lSC.getBaseResponse());
      int i = this.lSC.getBaseResponse().Ret;
      AppMethodBeat.o(73);
      return i;
    }

    public final int getCmdId()
    {
      return 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.j
 * JD-Core Version:    0.6.2
 */