package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.cz;
import com.tencent.mm.protocal.protobuf.ly;
import com.tencent.mm.protocal.protobuf.lz;
import com.tencent.mm.sdk.platformtools.ab;

public final class k extends m
  implements com.tencent.mm.network.k
{
  private f ehi;
  private b gme;
  public lz pOX;

  public k(cz paramcz, String paramString)
  {
    AppMethodBeat.i(44744);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ly();
    ((b.a)localObject).fsK = new lz();
    ((b.a)localObject).fsI = 2702;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busif2funlockfavor";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.gme = ((b.a)localObject).acD();
    localObject = (ly)this.gme.fsG.fsP;
    ((ly)localObject).vPn = paramcz;
    ((ly)localObject).vPD = paramString;
    h.pYm.k(886L, 0L, 1L);
    ab.i("MicroMsg.NetSceneBusiF2fUnlockFavor", "NetSceneBusiF2fUnlockFavor, f2fId: %s, transId: %s, amount: %s", new Object[] { paramcz.vFb, paramcz.vFc, Integer.valueOf(paramcz.vFg) });
    AppMethodBeat.o(44744);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44745);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(44745);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44746);
    ab.i("MicroMsg.NetSceneBusiF2fUnlockFavor", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pOX = ((lz)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBusiF2fUnlockFavor", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.pOX.kdT), this.pOX.kdU });
    h.pYm.k(886L, 1L, 1L);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(44746);
  }

  public final int getType()
  {
    return 2702;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.k
 * JD-Core Version:    0.6.2
 */