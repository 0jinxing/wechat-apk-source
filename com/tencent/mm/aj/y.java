package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bxp;
import com.tencent.mm.protocal.protobuf.bxq;
import com.tencent.mm.protocal.protobuf.km;
import com.tencent.mm.sdk.platformtools.ab;

public final class y extends m
  implements k
{
  Object data;
  public b ehh;
  private f ehi;

  public y(km paramkm, Object paramObject)
  {
    AppMethodBeat.i(11461);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bxp();
    ((b.a)localObject).fsK = new bxq();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/setbizenterpriseattr";
    ((b.a)localObject).fsI = 1228;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bxp)this.ehh.fsG.fsP;
    ((bxp)localObject).wmX = paramkm;
    ((bxp)localObject).mask = 1;
    ((bxp)localObject).wmV = 1;
    this.data = paramObject;
    AppMethodBeat.o(11461);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(11463);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneSetBizEnterpriseAttr", "do scene");
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(11463);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(11462);
    ab.d("MicroMsg.NetSceneSetBizEnterpriseAttr", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(11462);
  }

  public final int getType()
  {
    return 1228;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.y
 * JD-Core Version:    0.6.2
 */