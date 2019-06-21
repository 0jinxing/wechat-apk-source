package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.beg;
import com.tencent.mm.protocal.protobuf.beh;
import com.tencent.mm.protocal.protobuf.xu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.g;

public final class v
{
  public static final class a extends l.d
    implements l.b
  {
    public byte[] vxU;
    public beg vyI;

    public a()
    {
      AppMethodBeat.i(58861);
      this.vyI = new beg();
      AppMethodBeat.o(58861);
    }

    public final byte[] ZT()
    {
      int i = -1;
      AppMethodBeat.i(58862);
      a(z.dmv());
      this.vyI.vLz = new SKBuiltinBuffer_t().setBuffer(bo.dpz());
      this.vyI.setBaseRequest(l.a(this));
      this.vyI.wHV = g.xya;
      xu localxu = new xu();
      localxu.wdx = 713;
      Object localObject1 = new PByteArray();
      Object localObject2 = new PByteArray();
      int j = MMProtocalJni.generateECKey(localxu.wdx, (PByteArray)localObject1, (PByteArray)localObject2);
      byte[] arrayOfByte = ((PByteArray)localObject1).value;
      localObject1 = ((PByteArray)localObject2).value;
      int k;
      int m;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        this.vxU = ((byte[])localObject2);
        k = localxu.wdx;
        if (arrayOfByte != null)
          break label250;
        m = -1;
        label139: if (localObject1 != null)
          break label258;
      }
      while (true)
      {
        ab.d("MicroMsg.MMReg2.Req", "summerecdh nid:%d ret:%d, pub len: %d, pri len:%d, pub:%s, pri:%s", new Object[] { Integer.valueOf(k), Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(i), bo.ca(arrayOfByte), bo.ca((byte[])localObject1) });
        localxu.vIn = new SKBuiltinBuffer_t().setBuffer(arrayOfByte);
        this.vyI.vIr = localxu;
        localObject2 = this.vyI.toByteArray();
        AppMethodBeat.o(58862);
        return localObject2;
        localObject2 = new byte[0];
        break;
        label250: m = arrayOfByte.length;
        break label139;
        label258: i = localObject1.length;
      }
    }

    public final int ZU()
    {
      return 126;
    }

    public final int getCmdId()
    {
      return 0;
    }
  }

  public static final class b extends l.e
    implements l.c
  {
    public int eCX;
    private byte[] gcB;
    private byte[] gcC;
    public byte[] vxW;
    private byte[] vxX;
    public beh vyJ;

    public b()
    {
      AppMethodBeat.i(58863);
      this.vyJ = new beh();
      this.eCX = 0;
      AppMethodBeat.o(58863);
    }

    public final byte[] LA(int paramInt)
    {
      byte[] arrayOfByte = new byte[0];
      switch (paramInt)
      {
      default:
      case 1:
      case 2:
      case 3:
      }
      while (true)
      {
        return arrayOfByte;
        arrayOfByte = this.vxX;
        continue;
        arrayOfByte = this.gcB;
        continue;
        arrayOfByte = this.gcC;
      }
    }

    public final int P(byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(58864);
      this.eCX = 0;
      this.vyJ = ((beh)new beh().parseFrom(paramArrayOfByte));
      l.a(this, this.vyJ.getBaseResponse());
      this.eCX = 0;
      int i = this.vyJ.getBaseResponse().Ret;
      AppMethodBeat.o(58864);
      return i;
    }

    public final void b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
    {
      AppMethodBeat.i(58865);
      this.vxX = paramArrayOfByte1;
      this.gcB = paramArrayOfByte2;
      this.gcC = paramArrayOfByte3;
      ab.i("MicroMsg.MMReg2.Resp", "summerauths setSession [%s] [%s] [%s]", new Object[] { bo.anv(bo.ca(this.vxX)), bo.anv(bo.ca(this.gcB)), bo.anv(bo.ca(this.gcC)) });
      AppMethodBeat.o(58865);
    }

    public final int getCmdId()
    {
      return 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.v
 * JD-Core Version:    0.6.2
 */