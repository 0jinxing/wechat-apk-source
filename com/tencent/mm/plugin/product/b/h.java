package com.tencent.mm.plugin.product.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.amo;
import com.tencent.mm.protocal.protobuf.amp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public final class h extends com.tencent.mm.ai.m
  implements k
{
  private b ehh;
  private f ehi;
  public String phj;
  public m phk;
  public List<n> phl;

  public h(m paramm, String paramString)
  {
    AppMethodBeat.i(43988);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new amo();
    ((b.a)localObject).fsK = new amp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getproductdetail";
    ((b.a)localObject).fsI = 553;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (amo)this.ehh.fsG.fsP;
    this.phj = paramString;
    ((amo)localObject).wrm = paramString;
    ab.d("MicroMsg.NetSceneMallGetProductDetail", "pid ".concat(String.valueOf(paramString)));
    ((amo)localObject).Version = 0;
    this.phk = paramm;
    AppMethodBeat.o(43988);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(43990);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(43990);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(43989);
    paramArrayOfByte = (amp)((b)paramq).fsH.fsP;
    if (!bo.isNullOrNil(paramArrayOfByte.wro))
    {
      ab.d("MicroMsg.NetSceneMallGetProductDetail", "resp.ProductInfo " + paramArrayOfByte.wro);
      this.phk = m.a(this.phk, paramArrayOfByte.wro);
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
    if (!bo.isNullOrNil(paramArrayOfByte.wrp))
    {
      ab.d("MicroMsg.NetSceneMallGetProductDetail", "resp.RecommendInfo " + paramArrayOfByte.wrp);
      this.phl = n.parse(paramArrayOfByte.wrp);
    }
    ab.d("MicroMsg.NetSceneMallGetProductDetail", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.ehi.onSceneEnd(paramInt2, paramInt1, paramq, this);
    AppMethodBeat.o(43989);
  }

  public final int getType()
  {
    return 553;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.b.h
 * JD-Core Version:    0.6.2
 */