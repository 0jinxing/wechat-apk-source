package com.tencent.mm.plugin.wallet.balance.a.a;

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
import com.tencent.mm.protocal.protobuf.bhc;
import com.tencent.mm.protocal.protobuf.bhd;

public final class ad extends m
  implements k
{
  private f ehi;
  private b gme;
  private bhc tgv;
  public bhd tgw;

  public ad(String paramString1, String paramString2)
  {
    AppMethodBeat.i(45332);
    b.a locala = new b.a();
    locala.fsJ = new bhc();
    locala.fsK = new bhd();
    locala.fsI = 2996;
    locala.uri = "/cgi-bin/mmpay-bin/openlqbaccount";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.tgv = ((bhc)this.gme.fsG.fsP);
    this.tgv.vKZ = paramString1;
    this.tgv.wKu = paramString2;
    this.tgv.tgu = ab.cMM();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneOpenLqbAccount", "NetSceneOpenLqbAccount, eCardType: %s, extraData: %s", new Object[] { paramString1, paramString2 });
    AppMethodBeat.o(45332);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(45333);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(45333);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(45334);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneOpenLqbAccount", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.tgw = ((bhd)((b)paramq).fsH.fsP);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.NetSceneOpenLqbAccount", "onGYNetEnd, retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.tgw.kdT), this.tgw.kdU });
    if (this.tgw.kdT == 0)
      ab.ach(this.tgw.tgu);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(45334);
  }

  public final int getType()
  {
    return 2996;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.balance.a.a.ad
 * JD-Core Version:    0.6.2
 */