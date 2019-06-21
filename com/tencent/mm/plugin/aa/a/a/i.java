package com.tencent.mm.plugin.aa.a.a;

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
import com.tencent.mm.protocal.protobuf.n;
import com.tencent.mm.protocal.protobuf.o;
import com.tencent.mm.sdk.platformtools.ab;

public final class i extends m
  implements k, com.tencent.mm.wallet_core.c.i
{
  private f ehi;
  private b gme;
  private n gmn;
  public o gmo;

  public i(String paramString1, long paramLong, int paramInt, String paramString2)
  {
    AppMethodBeat.i(40657);
    b.a locala = new b.a();
    locala.fsJ = new n();
    locala.fsK = new o();
    locala.fsI = 1629;
    locala.uri = "/cgi-bin/mmpay-bin/newaapay";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.gmn = ((n)this.gme.fsG.fsP);
    this.gmn.vzL = paramString1;
    this.gmn.vAe = paramLong;
    this.gmn.scene = paramInt;
    this.gmn.vzM = paramString2;
    ab.i("MicroMsg.NetSceneAAPay", "NetSceneAAPay, bill_no: %s, pay_amount: %s, scene: %s, groupid: %s", new Object[] { this.gmn.vzL, Long.valueOf(this.gmn.vAe), Integer.valueOf(this.gmn.scene), this.gmn.vzM });
    AppMethodBeat.o(40657);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(40658);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(40658);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(40659);
    ab.i("MicroMsg.NetSceneAAPay", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.gmo = ((o)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneAAPay", "retcode: %s, retmsg: %s, paymsgid:%s", new Object[] { Integer.valueOf(this.gmo.kCl), this.gmo.kCm, this.gmo.cJF });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(40659);
  }

  public final int getType()
  {
    return 1629;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.a.i
 * JD-Core Version:    0.6.2
 */