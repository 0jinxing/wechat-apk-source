package com.tencent.mm.plugin.wallet.pwd.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.byh;
import com.tencent.mm.protocal.protobuf.byi;
import com.tencent.mm.sdk.platformtools.ab;

public final class h extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private byi tqA;
  public byh tqz;

  public h(boolean paramBoolean)
  {
    AppMethodBeat.i(46178);
    b.a locala = new b.a();
    byh localbyh = new byh();
    localbyh.vzS = System.currentTimeMillis();
    if (paramBoolean);
    for (localbyh.wXF = 1; ; localbyh.wXF = 0)
    {
      this.tqz = localbyh;
      locala.fsJ = localbyh;
      locala.fsK = new byi();
      locala.uri = "/cgi-bin/mmpay-bin/setwalletentrancebalanceswitchstate";
      locala.fsI = 2554;
      this.ehh = locala.acD();
      AppMethodBeat.o(46178);
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(46179);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(46179);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(46180);
    ab.w("MicroMsg.NetSceneSetWalletEntranceBalanceSwitchState", "errType = %s errCode = %s errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
      this.tqA = ((byi)((b)paramq).fsH.fsP);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(46180);
  }

  public final byi cOn()
  {
    AppMethodBeat.i(46181);
    byi localbyi;
    if (this.tqA == null)
    {
      localbyi = new byi();
      AppMethodBeat.o(46181);
    }
    while (true)
    {
      return localbyi;
      localbyi = this.tqA;
      AppMethodBeat.o(46181);
    }
  }

  public final int getType()
  {
    return 2554;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.a.h
 * JD-Core Version:    0.6.2
 */