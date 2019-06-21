package com.tencent.mm.plugin.product.b;

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
import com.tencent.mm.protocal.protobuf.akb;
import com.tencent.mm.protocal.protobuf.akc;
import com.tencent.mm.protocal.protobuf.cx;
import com.tencent.mm.protocal.protobuf.ze;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class g extends m
  implements k
{
  private b ehh;
  private f ehi;
  public LinkedList<ze> phb;
  public String phj;

  public g(String paramString1, String paramString2, cx paramcx)
  {
    AppMethodBeat.i(43985);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new akb();
    ((b.a)localObject).fsK = new akc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getlastestexpressinfo";
    ((b.a)localObject).fsI = 578;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (akb)this.ehh.fsG.fsP;
    this.phj = paramString1;
    ((akb)localObject).vQq = paramString1;
    ab.d("MicroMsg.NetSceneMallGetLastestExpressInfo", "pid ".concat(String.valueOf(paramString1)));
    ((akb)localObject).vRN = paramString2;
    ((akb)localObject).wpB = paramcx;
    AppMethodBeat.o(43985);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(43987);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(43987);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(43986);
    paramArrayOfByte = (akc)((b)paramq).fsH.fsP;
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramArrayOfByte.vKp == 0))
    {
      ab.d("MicroMsg.NetSceneMallGetLastestExpressInfo", "resp.ExpressCount " + paramArrayOfByte.wpD);
      this.phb = paramArrayOfByte.wpC;
    }
    paramInt1 = paramInt3;
    paramq = paramString;
    if (paramInt3 == 0)
    {
      paramInt1 = paramInt3;
      paramq = paramString;
      if (paramArrayOfByte.vKp != 0)
      {
        paramInt1 = paramArrayOfByte.vKp;
        paramq = paramArrayOfByte.vKq;
      }
    }
    ab.d("MicroMsg.NetSceneMallGetLastestExpressInfo", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.ehi.onSceneEnd(paramInt2, paramInt1, paramq, this);
    AppMethodBeat.o(43986);
  }

  public final int getType()
  {
    return 578;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.b.g
 * JD-Core Version:    0.6.2
 */