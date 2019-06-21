package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.boi;
import com.tencent.mm.protocal.protobuf.boj;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends m
  implements k
{
  private final b ehh;
  private com.tencent.mm.ai.f ehi;
  private boj tqy;

  public f()
  {
    AppMethodBeat.i(46172);
    b.a locala = new b.a();
    boi localboi = new boi();
    localboi.vzS = System.currentTimeMillis();
    locala.fsJ = localboi;
    locala.fsK = new boj();
    locala.uri = "/cgi-bin/mmpay-bin/querywalletentrancebalanceswitchstate";
    locala.fsI = 2635;
    this.ehh = locala.acD();
    AppMethodBeat.o(46172);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(46173);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(46173);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(46174);
    ab.w("MicroMsg.NetSceneQueryWalletEntranceBalanceSwitchState", "errType = %s errCode = %s errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
      this.tqy = ((boj)((b)paramq).fsH.fsP);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(46174);
  }

  public final boj cOm()
  {
    AppMethodBeat.i(46175);
    boj localboj;
    if (this.tqy == null)
    {
      localboj = new boj();
      AppMethodBeat.o(46175);
    }
    while (true)
    {
      return localboj;
      localboj = this.tqy;
      AppMethodBeat.o(46175);
    }
  }

  public final int getType()
  {
    return 2635;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.f
 * JD-Core Version:    0.6.2
 */