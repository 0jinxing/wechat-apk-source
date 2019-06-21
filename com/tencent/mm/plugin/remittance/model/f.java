package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ln;
import com.tencent.mm.protocal.protobuf.lo;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends m
  implements k
{
  private com.tencent.mm.ai.f ehi;
  private com.tencent.mm.ai.b gme;
  public lo pOJ;

  public f(String paramString1, String paramString2, String paramString3, int paramInt, com.tencent.mm.bt.b paramb, String paramString4)
  {
    AppMethodBeat.i(44729);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ln();
    ((b.a)localObject).fsK = new lo();
    ((b.a)localObject).fsI = 1680;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busif2factqry";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.gme = ((b.a)localObject).acD();
    localObject = (ln)this.gme.fsG.fsP;
    ((ln)localObject).pPZ = paramString3;
    ((ln)localObject).vFb = paramString1;
    ((ln)localObject).vFc = paramString2;
    ((ln)localObject).vFg = paramInt;
    ((ln)localObject).vPe = paramb;
    ((ln)localObject).vFd = paramString4;
    ab.i("MicroMsg.NetSceneBusiF2fActQry", "NetSceneBusiF2fPayCheck, f2fId: %s, transId: %s, amount: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    AppMethodBeat.o(44729);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(44730);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(44730);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44731);
    ab.i("MicroMsg.NetSceneBusiF2fActQry", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pOJ = ((lo)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBusiF2fActQry", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.pOJ.kdT), this.pOJ.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(44731);
  }

  public final int getType()
  {
    return 1680;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.f
 * JD-Core Version:    0.6.2
 */