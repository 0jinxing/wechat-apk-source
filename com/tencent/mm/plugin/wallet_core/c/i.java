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
import com.tencent.mm.protocal.protobuf.akl;
import com.tencent.mm.protocal.protobuf.akm;
import com.tencent.mm.sdk.platformtools.ab;

public final class i extends m
  implements k
{
  private f ehi;
  private b gme;
  private boolean ttT;
  private akl ttX;
  public akm ttY;

  public i(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(46512);
    this.ttT = paramBoolean;
    b.a locala = new b.a();
    locala.fsJ = new akl();
    locala.fsK = new akm();
    if (paramBoolean)
      locala.fsI = 2803;
    for (locala.uri = "/cgi-bin/mmpay-bin/mktgetf2flottery"; ; locala.uri = "/cgi-bin/mmpay-bin/mktgetlottery")
    {
      locala.fsL = 0;
      locala.fsM = 0;
      this.gme = locala.acD();
      this.ttX = ((akl)this.gme.fsG.fsP);
      this.ttX.wqf = paramString;
      ab.i("MicroMsg.NetSceneMktGetLottery", "NetSceneMktGetLottery, getLotteryParams: %s, isF2f: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(46512);
      return;
      locala.fsI = 2508;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46513);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(46513);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(46514);
    ab.i("MicroMsg.NetSceneMktGetLottery", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ttY = ((akm)((b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(46514);
  }

  public final int getType()
  {
    if (this.ttT);
    for (int i = 2803; ; i = 2508)
      return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.i
 * JD-Core Version:    0.6.2
 */