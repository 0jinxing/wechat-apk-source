package com.tencent.mm.modelmulti;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.u.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class f extends m
  implements k
{
  private com.tencent.mm.ai.f ehi;
  public long fHM = -1L;
  private byte[] fIi;
  private q ftU;
  private int uin = 0;

  public f(long paramLong, byte[] paramArrayOfByte)
  {
    this.fHM = paramLong;
    this.fIi = paramArrayOfByte;
  }

  public f(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    this.fHM = paramLong;
    this.fIi = paramArrayOfByte;
    this.uin = paramInt;
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(58373);
    int i;
    if (bo.cb(this.fIi))
    {
      ab.e("MicroMsg.NetSceneNotifyData", "dkpush %s", new Object[] { "get keyBuf failed" });
      i = -1;
      AppMethodBeat.o(58373);
      return i;
    }
    if (this.uin == 0)
      this.ftU = new f.a();
    while (true)
    {
      ab.i("MicroMsg.NetSceneNotifyData", "doScene now:%d buf:%s", new Object[] { Long.valueOf(this.fHM), bo.bZ(this.fIi) });
      ((u.a)this.ftU.acF()).fJB = this.fHM;
      ((u.a)this.ftU.acF()).cAG = this.fIi;
      this.ehi = paramf;
      i = a(parame, this.ftU, this);
      AppMethodBeat.o(58373);
      break;
      this.ftU = new f.b();
      ((f.b)this.ftU).uin = this.uin;
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58374);
    ab.i("MicroMsg.NetSceneNotifyData", "onGYNetEnd [%d,%d] %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(58374);
  }

  public final int getType()
  {
    return 268369922;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.f
 * JD-Core Version:    0.6.2
 */