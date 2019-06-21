package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aah;
import com.tencent.mm.protocal.protobuf.aai;
import com.tencent.mm.sdk.platformtools.ab;

public final class m extends com.tencent.mm.ai.m
  implements k, e
{
  private b ehh;
  private f ehi;
  private boolean lSP;
  public String lSQ;
  public boolean lSR;
  private String lSS;

  public m(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, float paramFloat, int paramInt2)
  {
    AppMethodBeat.i(82);
    this.lSP = false;
    this.lSQ = null;
    this.lSR = false;
    this.lSS = "";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aah();
    ((b.a)localObject).fsK = new aai();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/faceidentify";
    ((b.a)localObject).fsI = 1080;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aah)this.ehh.fsG.fsP;
    ((aah)localObject).csB = paramString1;
    ((aah)localObject).wfw = paramLong;
    ((aah)localObject).wfo = paramString2;
    ((aah)localObject).wfy = paramString3;
    ((aah)localObject).wfx = paramString4;
    ((aah)localObject).lSN = paramInt1;
    ((aah)localObject).wfA = paramFloat;
    ((aah)localObject).wfB = paramInt2;
    ab.i("MicroMsg.NetSceneFaceVerifyFace", "create NetSceneFacePicThirdVerifyFace, checkAliveType: %s  ,light:%f ,upload_video:%d", new Object[] { Integer.valueOf(paramInt1), Float.valueOf(paramFloat), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(82);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(83);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(83);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(84);
    ab.d("MicroMsg.NetSceneFaceVerifyFace", "alvinluo NetSceneFacePicThirdVerifyFace errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (aai)((b)paramq).fsH.fsP;
    ab.i("MicroMsg.NetSceneFaceVerifyFace", "identity_id: %s", new Object[] { paramq.wfC });
    this.lSQ = paramq.wfC;
    this.lSR = paramq.wfD;
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(84);
  }

  public final boolean bsg()
  {
    return this.lSR;
  }

  public final String bsh()
  {
    return this.lSQ;
  }

  public final int getType()
  {
    return 1080;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.m
 * JD-Core Version:    0.6.2
 */