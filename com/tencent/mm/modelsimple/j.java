package com.tencent.mm.modelsimple;

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
import com.tencent.mm.protocal.protobuf.ahx;
import com.tencent.mm.protocal.protobuf.ahy;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends m
  implements k
{
  public String country;
  public String duc;
  public String dud;
  private b ehh;
  private f ehi;

  public j(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(16575);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ahx();
    ((b.a)localObject).fsK = new ahy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcurlocation";
    ((b.a)localObject).fsI = 665;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ahx)this.ehh.fsG.fsP;
    ((ahx)localObject).vNI = paramDouble1;
    ((ahx)localObject).vNH = paramDouble2;
    ab.d("MicroMsg.NetSceneGetCurLocation", "latitude:" + paramDouble1 + ", longitude:" + paramDouble2);
    AppMethodBeat.o(16575);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16576);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16576);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16577);
    ab.d("MicroMsg.NetSceneGetCurLocation", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ahy)this.ehh.fsH.fsP;
      this.dud = paramq.guP;
      this.country = paramq.guW;
      this.duc = paramq.guO;
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16577);
  }

  public final int getType()
  {
    return 665;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.j
 * JD-Core Version:    0.6.2
 */