package com.tencent.mm.plugin.aa.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.l;
import com.tencent.mm.sdk.platformtools.ab;

public final class h extends com.tencent.mm.ai.m
  implements k
{
  private f ehi;
  private b gme;
  private l gml;
  public com.tencent.mm.protocal.protobuf.m gmm;

  public h()
  {
    AppMethodBeat.i(40654);
    b.a locala = new b.a();
    locala.fsJ = new l();
    locala.fsK = new com.tencent.mm.protocal.protobuf.m();
    locala.fsI = 1698;
    locala.uri = "/cgi-bin/mmpay-bin/newaaoperation";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.gml = ((l)this.gme.fsG.fsP);
    AppMethodBeat.o(40654);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(40655);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(40655);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(40656);
    ab.i("MicroMsg.NetSceneAAOperation", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.gmm = ((com.tencent.mm.protocal.protobuf.m)((b)paramq).fsH.fsP);
    if ((paramInt2 == 0) && (paramInt3 == 0))
      ab.i("MicroMsg.NetSceneAAOperation", "retCode: %s, retMsg: %s, max_payer_num: %s, max_receiver_num: %s, max_total_num: %s, max_total_amount: %s, max_per_amount: %s, notice: %s, notice_url: %s", new Object[] { Integer.valueOf(this.gmm.kCl), this.gmm.kCm, Integer.valueOf(this.gmm.vzZ), Integer.valueOf(this.gmm.vAa), Integer.valueOf(this.gmm.vAb), Long.valueOf(this.gmm.vAc), Long.valueOf(this.gmm.vAd), this.gmm.kCx, this.gmm.kCy });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(40656);
  }

  public final int getType()
  {
    return 1698;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.a.h
 * JD-Core Version:    0.6.2
 */