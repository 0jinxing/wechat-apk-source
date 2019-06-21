package com.tencent.mm.pluginsdk.model.app;

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
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.dl;
import com.tencent.mm.protocal.protobuf.dm;
import com.tencent.mm.sdk.platformtools.ab;

public final class y extends m
  implements k
{
  private b ehh;
  private f ehi;
  int vco;
  x vcp;

  public y(int paramInt, x paramx)
  {
    AppMethodBeat.i(79366);
    this.vco = paramInt;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new dl();
    ((b.a)localObject).fsK = new dm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/appcenter";
    ((b.a)localObject).fsI = 452;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    dl localdl = (dl)this.ehh.fsG.fsP;
    localObject = paramx.dhj();
    if (localObject != null)
      localdl.ReqBuf = new SKBuiltinBuffer_t().setBuffer((byte[])localObject);
    localdl.jCt = paramInt;
    this.vcp = paramx;
    AppMethodBeat.o(79366);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(79368);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(79368);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79367);
    ab.d("MicroMsg.NetSceneAppCenter", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneAppCenter", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(79367);
    }
    while (true)
    {
      return;
      this.vcp.bG(aa.a(((dm)this.ehh.fsH.fsP).vFq));
      this.vcp.a(paramInt1, paramInt2, paramInt3, paramString, this.ehh, paramArrayOfByte);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(79367);
    }
  }

  public final int getType()
  {
    return 452;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.y
 * JD-Core Version:    0.6.2
 */