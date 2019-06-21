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
import com.tencent.mm.protocal.protobuf.xp;
import com.tencent.mm.protocal.protobuf.xq;
import com.tencent.mm.sdk.platformtools.ab;

public final class g extends m
  implements k
{
  private f ehi;
  private b gme;
  private xp ttR;
  public xq ttS;
  private boolean ttT;

  public g(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(46506);
    this.ttT = paramBoolean;
    b.a locala = new b.a();
    locala.fsJ = new xp();
    locala.fsK = new xq();
    if (paramBoolean)
      locala.fsI = 1859;
    for (locala.uri = "/cgi-bin/mmpay-bin/mktdrawf2flottery"; ; locala.uri = "/cgi-bin/mmpay-bin/mktdrawlottery")
    {
      locala.fsL = 0;
      locala.fsM = 0;
      this.gme = locala.acD();
      this.ttR = ((xp)this.gme.fsG.fsP);
      this.ttR.wdr = paramString;
      this.ttR.wds = paramInt;
      ab.i("MicroMsg.NetSceneMktDrawLottery", "NetSceneMktDrawLottery, drawLotteryParams: %s, drawLotteryType: %s, isF2f: %s", new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(46506);
      return;
      locala.fsI = 2547;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46507);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(46507);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(46508);
    ab.i("MicroMsg.NetSceneMktDrawLottery", "onGYNetEnd netId: %s, errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ttS = ((xq)((b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(46508);
  }

  public final int getType()
  {
    if (this.ttT);
    for (int i = 1859; ; i = 2547)
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.g
 * JD-Core Version:    0.6.2
 */