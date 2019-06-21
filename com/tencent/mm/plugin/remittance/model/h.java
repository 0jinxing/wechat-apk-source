package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cz;
import com.tencent.mm.protocal.protobuf.ls;
import com.tencent.mm.protocal.protobuf.lt;
import com.tencent.mm.sdk.platformtools.ab;

public final class h extends m
  implements k
{
  private f ehi;
  private b gme;
  public lt pOS;

  public h(cz paramcz, String paramString)
  {
    AppMethodBeat.i(44735);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ls();
    ((b.a)localObject).fsK = new lt();
    ((b.a)localObject).fsI = 1241;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busif2fpaycheck";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.gme = ((b.a)localObject).acD();
    localObject = (ls)this.gme.fsG.fsP;
    ((ls)localObject).vPn = paramcz;
    ((ls)localObject).vPo = paramString;
    ab.i("MicroMsg.NetSceneBusiF2fPayCheck", "NetSceneBusiF2fPayCheck, f2fId: %s, transId: %s, amount: %s req: %s", new Object[] { paramcz.vFb, paramcz.vFc, Integer.valueOf(paramcz.vFg), a.a(paramcz) });
    AppMethodBeat.o(44735);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44736);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(44736);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44737);
    ab.i("MicroMsg.NetSceneBusiF2fPayCheck", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pOS = ((lt)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBusiF2fPayCheck", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.pOS.kdT), this.pOS.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(44737);
  }

  public final int getType()
  {
    return 1241;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.h
 * JD-Core Version:    0.6.2
 */