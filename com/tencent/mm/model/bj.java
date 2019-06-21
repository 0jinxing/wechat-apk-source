package com.tencent.mm.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.rj;
import com.tencent.mm.protocal.protobuf.rk;
import com.tencent.mm.sdk.platformtools.ab;

public final class bj extends m
  implements k
{
  private f ehi;
  private final b fmP;
  public int fmQ;
  public int fmR;
  public int fmS;
  public int type;

  public bj(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(50498);
    this.fmQ = 0;
    this.fmR = 0;
    this.fmS = 0;
    this.type = 0;
    rj localrj = new rj();
    localrj.Scene = paramInt;
    localrj.vYA = paramString1;
    localrj.nqc = paramString2;
    localrj.vYB = paramString3;
    paramString1 = new b.a();
    paramString1.fsJ = localrj;
    paramString1.fsK = new rk();
    paramString1.uri = "/cgi-bin/micromsg-bin/checkmobilesimtype";
    paramString1.fsI = 813;
    paramString1.fsL = 0;
    paramString1.fsM = 0;
    this.fmP = paramString1.acD();
    this.fmP.cQh = 1;
    ab.i("MicroMsg.NetSceneGetMobileSIMType", "Check scene[%d] IP[%s] IMEI[%s] IMSI[%s]", new Object[] { Integer.valueOf(paramInt), localrj.vYA, localrj.nqc, localrj.vYB });
    AppMethodBeat.o(50498);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(50499);
    this.ehi = paramf;
    int i = a(parame, this.fmP, this);
    AppMethodBeat.o(50499);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(50500);
    ab.i("MicroMsg.NetSceneGetMobileSIMType", "summerdiz NetSceneGetMobileSIMType onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (rk)this.fmP.fsH.fsP;
      this.fmQ = paramq.vYG;
      this.fmR = paramq.vYF;
      this.type = paramq.jCt;
      this.fmS = paramq.vYE;
      ab.i("MicroMsg.NetSceneGetMobileSIMType", "CheckMobileSIMTypeResp ProductType[%d] expiredTime[%d] flag[%d]", new Object[] { Integer.valueOf(paramq.vYF), Integer.valueOf(paramq.vYE), Integer.valueOf(paramq.vYG) });
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(50500);
  }

  public final int getType()
  {
    return 813;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bj
 * JD-Core Version:    0.6.2
 */