package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aaj;
import com.tencent.mm.protocal.protobuf.aak;
import com.tencent.mm.sdk.platformtools.ab;

public final class r extends m
  implements k
{
  private b ehh;
  private f ehi;
  public String mFileName;

  public r(String paramString1, long paramLong, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(98);
    this.mFileName = "";
    b.a locala = new b.a();
    locala.fsJ = new aaj();
    locala.fsK = new aak();
    locala.uri = "/cgi-bin/mmbiz-bin/usrmsg/facevideobindbioid";
    locala.fsI = 1197;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.mFileName = paramString1;
    paramString1 = (aaj)this.ehh.fsG.fsP;
    paramString1.csB = paramString2;
    paramString1.wfw = paramLong;
    paramString1.wfx = paramString4;
    paramString1.wfE = paramString3;
    AppMethodBeat.o(98);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(99);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(99);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(100);
    ab.d("MicroMsg.NetSceneFaceThirdBindVideo", "hy:  errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(100);
  }

  public final int getType()
  {
    return 1197;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.r
 * JD-Core Version:    0.6.2
 */