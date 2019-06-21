package com.tencent.mm.plugin.wallet_core.c;

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
import com.tencent.mm.protocal.protobuf.aep;
import com.tencent.mm.protocal.protobuf.aeq;
import com.tencent.mm.sdk.platformtools.ab;

public final class h extends m
  implements k
{
  private f ehi;
  private b gme;
  private aep ttU;
  public aeq ttV;
  public long ttW;

  public h(String paramString, long paramLong)
  {
    AppMethodBeat.i(46509);
    b.a locala = new b.a();
    locala.fsJ = new aep();
    locala.fsK = new aeq();
    locala.uri = "/cgi-bin/mmpay-bin/mktgetaward";
    locala.fsI = 2948;
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.ttU = ((aep)this.gme.fsG.fsP);
    this.ttU.wmr = paramString;
    this.ttW = paramLong;
    ab.i("MicroMsg.NetSceneMktGetAward", "NetSceneMktGetAward, get_award_params: %s, activityId: %s", new Object[] { paramString, Long.valueOf(paramLong) });
    AppMethodBeat.o(46509);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46510);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(46510);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(46511);
    ab.i("MicroMsg.NetSceneMktGetAward", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ttV = ((aeq)((b)paramq).fsH.fsP);
    if ((paramInt2 == 0) || (paramInt3 == 0))
      ab.i("MicroMsg.NetSceneMktGetAward", "ret_code: %s, ret_msg: %s, result_code: %s, alert_wording: %s, btn_wording: %s", new Object[] { Integer.valueOf(this.ttV.kdT), this.ttV.kdU, Integer.valueOf(this.ttV.wms), this.ttV.wmt, this.ttV.wmu });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(46511);
  }

  public final int getType()
  {
    return 2948;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.h
 * JD-Core Version:    0.6.2
 */