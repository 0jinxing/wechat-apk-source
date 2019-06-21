package com.tencent.mm.plugin.card.model;

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
import com.tencent.mm.protocal.protobuf.bkx;
import com.tencent.mm.protocal.protobuf.bky;
import com.tencent.mm.sdk.platformtools.ab;

public final class ag extends m
  implements k
{
  public String cKE;
  public String content;
  private final b ehh;
  private f ehi;
  public String hfo;
  public String ken;
  public String keo;
  public boolean kep;
  public String keq;
  public String ker;
  public String kes;
  public String ket;
  public int status;

  public ag(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(87913);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bkx();
    ((b.a)localObject).fsK = new bky();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/preacceptgiftcard";
    ((b.a)localObject).fsI = 1171;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bkx)this.ehh.fsG.fsP;
    ((bkx)localObject).vBA = paramInt;
    ((bkx)localObject).vBB = paramString1;
    ((bkx)localObject).vBC = paramString2;
    AppMethodBeat.o(87913);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87915);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87915);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87914);
    ab.i("MicroMsg.NetScenePreAcceptGiftCard", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bky)this.ehh.fsH.fsP;
      this.cKE = paramq.vBF;
      this.ken = paramq.vBG;
      this.status = paramq.status;
      this.content = paramq.content;
      this.keo = paramq.kdE;
      this.hfo = paramq.wNR;
      this.kep = paramq.kep;
      this.keq = paramq.wNS;
      this.ker = paramq.wNT;
      this.kes = paramq.wNU;
      this.ket = paramq.wNV;
      ab.d("MicroMsg.NetScenePreAcceptGiftCard", "fromUserName:%s, fromUserHeadImgUrl:%s, status:%d, content:%s,buttonWording:%s, backgroundColor:%s, ignore:%b", new Object[] { this.cKE, this.ken, Integer.valueOf(this.status), this.content, this.keo, this.hfo, Boolean.valueOf(this.kep) });
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(87914);
  }

  public final int getType()
  {
    return 1171;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.ag
 * JD-Core Version:    0.6.2
 */