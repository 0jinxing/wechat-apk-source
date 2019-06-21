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
import com.tencent.mm.protocal.protobuf.u;
import com.tencent.mm.protocal.protobuf.v;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends m
  implements k
{
  private f ehi;
  private b gme;
  private u gmp;
  public v gmq;

  public j(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(40660);
    b.a locala = new b.a();
    locala.fsJ = new u();
    locala.fsK = new v();
    locala.fsI = 1695;
    locala.uri = "/cgi-bin/mmpay-bin/newaaquerydetail";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.gmp = ((u)this.gme.fsG.fsP);
    this.gmp.vzL = paramString1;
    this.gmp.scene = paramInt1;
    this.gmp.vzM = paramString2;
    if (paramInt1 == 5)
    {
      ab.i("MicroMsg.NetSceneAAQueryDetail", "set sign and ver");
      this.gmp.sign = paramString3;
      this.gmp.ver = paramInt2;
    }
    ab.i("MicroMsg.NetSceneAAQueryDetail", "NetSceneAAQueryDetail, billNo: %s, scene: %s, groupId: %s", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2 });
    AppMethodBeat.o(40660);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(40662);
    ab.i("MicroMsg.NetSceneAAQueryDetail", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(40662);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(40661);
    ab.i("MicroMsg.NetSceneAAQueryDetail", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.gmq = ((v)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneAAQueryDetail", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.gmq.kCl), this.gmq.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(40661);
  }

  public final int getType()
  {
    return 1695;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.a.j
 * JD-Core Version:    0.6.2
 */