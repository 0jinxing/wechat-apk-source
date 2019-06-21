package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ayg;
import com.tencent.mm.protocal.protobuf.ayh;
import com.tencent.mm.sdk.platformtools.ab;

public final class l extends m
  implements k
{
  public int cKJ;
  private b ehh;
  private f ehi;
  public String fhH;
  public String lvL;

  public l(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    AppMethodBeat.i(19466);
    this.ehi = null;
    this.ehh = null;
    this.lvL = paramString3;
    this.fhH = paramString2;
    this.cKJ = paramInt;
    this.lvL = paramString3;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ayg();
    ((b.a)localObject).fsK = new ayh();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/rank/addlike";
    ((b.a)localObject).fsI = 1041;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ayg)this.ehh.fsG.fsP;
    ((ayg)localObject).lCH = paramString2;
    ((ayg)localObject).username = paramString1;
    ((ayg)localObject).cKJ = paramInt;
    ((ayg)localObject).fha = paramString3;
    AppMethodBeat.o(19466);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(19467);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19467);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19468);
    ab.d("MicroMsg.NetSceneUpdateLikeStatus", "hy: end. errType: %d, errCode: %d, errMsg: %s, ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19468);
  }

  public final int getType()
  {
    return 1041;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.a.l
 * JD-Core Version:    0.6.2
 */