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
import com.tencent.mm.protocal.protobuf.cms;
import com.tencent.mm.protocal.protobuf.cmt;
import com.tencent.mm.sdk.platformtools.ab;

public final class s extends m
  implements k, e
{
  private b ehh;
  private f ehi;
  private boolean lSP;

  public s(long paramLong, String paramString1, String paramString2)
  {
    AppMethodBeat.i(101);
    this.lSP = false;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cms();
    ((b.a)localObject).fsK = new cmt();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/verifyface";
    ((b.a)localObject).fsI = 797;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cms)this.ehh.fsG.fsP;
    ((cms)localObject).wmO = paramLong;
    ((cms)localObject).wTm = paramString1;
    ((cms)localObject).wTn = paramString2;
    AppMethodBeat.o(101);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(102);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(102);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(103);
    paramq = (cmt)((b)paramq).fsH.fsP;
    boolean bool;
    if ((paramInt2 == 0) && (paramInt3 == 0))
      if (paramq.wTp == 0)
      {
        bool = true;
        this.lSP = bool;
        paramInt1 = paramq.wTp;
        ab.i("MicroMsg.NetSceneFaceVerifyFace", "hy: is Verified: %b", new Object[] { Boolean.valueOf(this.lSP) });
      }
    while (true)
    {
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt1, paramString, this);
      AppMethodBeat.o(103);
      return;
      bool = false;
      break;
      paramInt1 = paramInt3;
      if (paramq != null)
      {
        paramInt1 = paramInt3;
        if (paramq.wTp != 0)
        {
          ab.i("MicroMsg.NetSceneFaceVerifyFace", "hy: has DetailRet, use it");
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
    return null;
  }

  public final int getType()
  {
    return 797;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.s
 * JD-Core Version:    0.6.2
 */