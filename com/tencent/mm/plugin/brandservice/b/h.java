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
import com.tencent.mm.protocal.protobuf.buw;
import com.tencent.mm.protocal.protobuf.bux;
import com.tencent.mm.protocal.protobuf.mh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class h extends m
  implements k
{
  private String ctj;
  private f ehi;
  private String hlm;
  private com.tencent.mm.ai.b jKA;
  private bux jKB;
  private long jKC;
  private int offset;
  private int scene;

  public h(String paramString1, long paramLong, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(13846);
    this.ctj = paramString1;
    this.jKC = paramLong;
    this.offset = paramInt1;
    this.scene = paramInt2;
    this.hlm = paramString2;
    ab.i("MicroMsg.NetSceneSearchDetailPageNew", "Constructors: keyword = (%s) , LSB exist () , businessType is (%d) , offset is (%d) , scene is (%d), searchId(%s).", new Object[] { paramString1, Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
    AppMethodBeat.o(13846);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(13848);
    this.ehi = paramf;
    int i;
    if (!bo.isNullOrNil(this.ctj))
    {
      paramf = new b.a();
      paramf.fsI = 1071;
      paramf.uri = "/cgi-bin/mmbiz-bin/bizsearch/detailpage";
      paramf.fsJ = new buw();
      paramf.fsK = new bux();
      paramf.fsL = 0;
      paramf.fsM = 0;
      this.jKA = paramf.acD();
      paramf = (buw)this.jKA.fsG.fsP;
      paramf.wDI = b.abJ();
      paramf.wol = this.ctj;
      paramf.vQd = this.jKC;
      paramf.vOq = this.offset;
      paramf.wWo = this.scene;
      paramf.vQg = this.hlm;
      i = a(parame, this.jKA, this);
      AppMethodBeat.o(13848);
    }
    while (true)
    {
      return i;
      ab.e("MicroMsg.NetSceneSearchDetailPageNew", "keyword is unavailable.");
      i = -1;
      AppMethodBeat.o(13848);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13847);
    ab.i("MicroMsg.NetSceneSearchDetailPageNew", "netId (%d) , errType (%d) , errCode (%d) , errMsg (%s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0) && (this.jKA != null))
      this.jKB = ((bux)this.jKA.fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(13847);
  }

  public final mh aVX()
  {
    if (this.jKB == null);
    for (mh localmh = null; ; localmh = this.jKB.wWq)
      return localmh;
  }

  public final int getType()
  {
    return 1071;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b.h
 * JD-Core Version:    0.6.2
 */