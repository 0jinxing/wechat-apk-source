package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.agx;
import com.tencent.mm.protocal.protobuf.agy;
import com.tencent.mm.sdk.platformtools.bo;

public final class r
{
  public static final class a extends l.d
    implements l.b
  {
    public agx vyC;

    public a()
    {
      AppMethodBeat.i(58848);
      this.vyC = new agx();
      AppMethodBeat.o(58848);
    }

    public final byte[] ZT()
    {
      AppMethodBeat.i(58849);
      a(z.dmx());
      this.vyC.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
      this.vyC.wns = z.dmv().ver;
      this.vyC.setBaseRequest(l.a(this));
      byte[] arrayOfByte = this.vyC.toByteArray();
      AppMethodBeat.o(58849);
      return arrayOfByte;
    }

    public final int ZU()
    {
      return 381;
    }

    public final int getCmdId()
    {
      return 179;
    }
  }

  public static final class b extends l.e
    implements l.c
  {
    public agy vyD;

    public b()
    {
      AppMethodBeat.i(58850);
      this.vyD = new agy();
      AppMethodBeat.o(58850);
    }

    public final int P(byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(58851);
      this.vyD = ((agy)new agy().parseFrom(paramArrayOfByte));
      l.a(this, this.vyD.getBaseResponse());
      int i = this.vyD.getBaseResponse().Ret;
      AppMethodBeat.o(58851);
      return i;
    }

    public final int getCmdId()
    {
      return 1000000179;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.r
 * JD-Core Version:    0.6.2
 */