package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bqx;
import com.tencent.mm.protocal.protobuf.bqy;
import com.tencent.mm.sdk.platformtools.ab;

public final class n extends m
  implements k, e
{
  private b ehh;
  private f ehi;
  private boolean lSP;
  private String lST;

  public n(long paramLong, String paramString1, String paramString2)
  {
    AppMethodBeat.i(85);
    this.lSP = false;
    this.lST = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bqx();
    ((b.a)localObject).fsK = new bqy();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/registerface";
    ((b.a)localObject).fsI = 918;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bqx)this.ehh.fsG.fsP;
    ((bqx)localObject).wmO = paramLong;
    ((bqx)localObject).wTm = paramString1;
    ((bqx)localObject).wTn = paramString2;
    AppMethodBeat.o(85);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(86);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(86);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87);
    paramq = (bqy)((b)paramq).fsH.fsP;
    boolean bool;
    if ((paramInt2 == 0) && (paramInt3 == 0))
      if (paramq.wTp == 0)
      {
        bool = true;
        this.lSP = bool;
        this.lST = paramq.wTo;
        paramInt1 = paramq.wTp;
        ab.i("MicroMsg.NetSceneFaceRegFace", "hy: is Verified: %b", new Object[] { Boolean.valueOf(this.lSP) });
      }
    while (true)
    {
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt1, paramString, this);
      AppMethodBeat.o(87);
      return;
      bool = false;
      break;
      paramInt1 = paramInt3;
      if (paramq != null)
      {
        paramInt1 = paramInt3;
        if (paramq.wTp != 0)
        {
          ab.i("MicroMsg.NetSceneFaceRegFace", "hy: has detail ret. use");
          paramInt1 = paramq.wTp;
        }
      }
    }
  }

  public final boolean bsg()
  {
    return true;
  }

  public final String bsh()
  {
    return this.lST;
  }

  public final int getType()
  {
    return 918;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.n
 * JD-Core Version:    0.6.2
 */