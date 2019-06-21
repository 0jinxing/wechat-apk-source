package com.tencent.mm.plugin.aa.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends m
  implements k
{
  private f ehi;
  private b gme;
  private d gmf;
  public com.tencent.mm.protocal.protobuf.e gmg;
  public int scene;

  public e(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(40644);
    b.a locala = new b.a();
    locala.fsJ = new d();
    locala.fsK = new com.tencent.mm.protocal.protobuf.e();
    locala.fsI = 1530;
    locala.uri = "/cgi-bin/mmpay-bin/newaaclose";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.gmf = ((d)this.gme.fsG.fsP);
    this.gmf.vzM = paramString2;
    this.gmf.vzL = paramString1;
    this.gmf.scene = paramInt;
    this.scene = paramInt;
    ab.d("MicroMsg.NetSceneAAClose", "NetSceneAAClose, billNo: %s, scene: %s", new Object[] { this.gmf.vzL, Integer.valueOf(paramInt) });
    AppMethodBeat.o(40644);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(40645);
    ab.i("MicroMsg.NetSceneAAClose", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(40645);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(40646);
    ab.i("MicroMsg.NetSceneAAClose", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.gmg = ((com.tencent.mm.protocal.protobuf.e)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneAAClose", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.gmg.kCl), this.gmg.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(40646);
  }

  public final int getType()
  {
    return 1530;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.a.e
 * JD-Core Version:    0.6.2
 */