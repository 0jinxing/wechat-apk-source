package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.brx;
import com.tencent.mm.protocal.protobuf.bry;
import com.tencent.mm.sdk.platformtools.ab;

public final class u extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public u(float paramFloat1, float paramFloat2, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(87876);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new brx();
    ((b.a)localObject).fsK = new bry();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/reportlocation";
    ((b.a)localObject).fsI = 1253;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (brx)this.ehh.fsG.fsP;
    ((brx)localObject).latitude = paramFloat1;
    ((brx)localObject).longitude = paramFloat2;
    ((brx)localObject).cMC = paramString1;
    ((brx)localObject).kbU = paramString2;
    ((brx)localObject).wTZ = paramInt;
    AppMethodBeat.o(87876);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87877);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87877);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87878);
    ab.i("MicroMsg.NetSceneCardReportLocation", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(87878);
  }

  public final int getType()
  {
    return 1253;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.u
 * JD-Core Version:    0.6.2
 */