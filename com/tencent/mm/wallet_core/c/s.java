package com.tencent.mm.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bll;
import com.tencent.mm.protocal.protobuf.blm;
import com.tencent.mm.sdk.platformtools.ab;

public final class s extends u
{
  public final b ehh;
  private f ehi;
  public String kWz;
  public String tQX;
  public String tQY;

  public s(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    AppMethodBeat.i(49077);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bll();
    ((b.a)localObject).fsK = new blm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/preparepurchase";
    ((b.a)localObject).fsI = 422;
    ((b.a)localObject).fsL = 214;
    ((b.a)localObject).fsM = 1000000214;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bll)this.ehh.fsG.fsP;
    this.kWz = paramString1;
    ((bll)localObject).ProductID = paramString1;
    this.tQY = paramString2;
    ((bll)localObject).wOs = paramString2;
    this.tQX = paramString3;
    ((bll)localObject).wOt = paramString3;
    ((bll)localObject).pdc = paramInt2;
    ((bll)localObject).wOu = paramInt1;
    ((bll)localObject).ndT = paramString4;
    ab.d("MicroMsg.NetScenePreparePurchase", "productId:" + paramString1 + ",price:" + paramString2 + ",currencyType:" + paramString3 + ",payType:" + paramInt2);
    AppMethodBeat.o(49077);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(49079);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(49079);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(49078);
    ab.e("MicroMsg.NetScenePreparePurchase", "ErrType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg:" + paramString);
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
      AppMethodBeat.o(49078);
    }
    while (true)
    {
      return;
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
      AppMethodBeat.o(49078);
    }
  }

  public final int getType()
  {
    return 422;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.s
 * JD-Core Version:    0.6.2
 */