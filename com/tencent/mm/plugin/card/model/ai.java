package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.brz;
import com.tencent.mm.protocal.protobuf.bsa;
import com.tencent.mm.sdk.platformtools.ab;

public final class ai extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;

  public ai(String paramString, byte[] paramArrayOfByte, float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(87919);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new brz();
    ((b.a)localObject).fsK = new bsa();
    ((b.a)localObject).uri = "/cgi-bin/card/reportlotionorbluetoothinfo";
    ((b.a)localObject).fsI = 2574;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (brz)this.ehh.fsG.fsP;
    ((brz)localObject).cMC = paramString;
    ((brz)localObject).wUb = com.tencent.mm.bt.b.bI(paramArrayOfByte);
    ((brz)localObject).cGm = paramFloat1;
    ((brz)localObject).cEB = paramFloat2;
    ((brz)localObject).wUa = paramFloat3;
    ((brz)localObject).wUc = paramBoolean1;
    ((brz)localObject).wUd = paramBoolean2;
    AppMethodBeat.o(87919);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87920);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87920);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87921);
    ab.i("MicroMsg.NetSceneReportLotionOrBluetoothInfo", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(87921);
  }

  public final int getType()
  {
    return 2574;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.ai
 * JD-Core Version:    0.6.2
 */