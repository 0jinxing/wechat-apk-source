package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bnt;
import com.tencent.mm.protocal.protobuf.bnu;
import com.tencent.mm.sdk.platformtools.ab;

public final class k extends m
  implements com.tencent.mm.network.k
{
  private f ehi;
  private b gme;
  public String ssr;
  private bnt tub;
  public bnu tuc;

  public k(String paramString1, String paramString2)
  {
    AppMethodBeat.i(46518);
    b.a locala = new b.a();
    locala.fsJ = new bnt();
    locala.fsK = new bnu();
    locala.fsI = 2710;
    locala.uri = "/cgi-bin/mmpay-bin/mktqueryawardstatus";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.tub = ((bnt)this.gme.fsG.fsP);
    this.tub.tIJ = paramString1;
    this.ssr = paramString2;
    ab.i("MicroMsg.NetSceneMtkQueryAwardStatus", "NetSceneMtkQueryAwardStatus, query_award_status_params: %s, activityId: %s", new Object[] { paramString1, paramString2 });
    AppMethodBeat.o(46518);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46519);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(46519);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(46520);
    ab.i("MicroMsg.NetSceneMtkQueryAwardStatus", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.tuc = ((bnu)((b)paramq).fsH.fsP);
    if ((paramInt2 == 0) || (paramInt3 == 0))
      ab.i("MicroMsg.NetSceneMtkQueryAwardStatus", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.tuc.kdT), this.tuc.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(46520);
  }

  public final int getType()
  {
    return 2710;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.k
 * JD-Core Version:    0.6.2
 */