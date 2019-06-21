package com.tencent.mm.plugin.brandservice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bvg;
import com.tencent.mm.protocal.protobuf.bvh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class i extends m
  implements k
{
  private String ctj;
  private f ehi;
  private com.tencent.mm.ai.b jKA;
  private long jKC;
  public bvh jKD;
  private int scene;

  public i(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(13849);
    this.ctj = paramString;
    this.jKC = paramLong;
    this.scene = paramInt;
    ab.i("MicroMsg.NetSceneSearchHomePageNew", "Constructors: keyword (%s) , businessType (%d), scene (%d)", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
    AppMethodBeat.o(13849);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(13851);
    ab.i("MicroMsg.NetSceneSearchHomePageNew", "doScene");
    this.ehi = paramf;
    int i;
    if (!bo.isNullOrNil(this.ctj))
    {
      paramf = new b.a();
      paramf.fsI = 1070;
      paramf.uri = "/cgi-bin/mmbiz-bin/bizsearch/homepage";
      paramf.fsJ = new bvg();
      paramf.fsK = new bvh();
      paramf.fsL = 0;
      paramf.fsM = 0;
      this.jKA = paramf.acD();
      paramf = (bvg)this.jKA.fsG.fsP;
      paramf.wol = this.ctj;
      paramf.wDI = b.abJ();
      paramf.vQd = this.jKC;
      paramf.wWo = this.scene;
      ab.i("MicroMsg.NetSceneSearchHomePageNew", "businessTypeList is %d", new Object[] { Long.valueOf(this.jKC) });
      i = a(parame, this.jKA, this);
      AppMethodBeat.o(13851);
    }
    while (true)
    {
      return i;
      ab.e("MicroMsg.NetSceneSearchHomePageNew", "keyword is unavailable");
      i = -1;
      AppMethodBeat.o(13851);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13850);
    ab.i("MicroMsg.NetSceneSearchHomePageNew", "netId (%d) , errType (%d) , errCode (%d) , errMsg (%s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0) && (this.jKA != null))
      this.jKD = ((bvh)this.jKA.fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(13850);
  }

  public final int getType()
  {
    return 1070;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b.i
 * JD-Core Version:    0.6.2
 */