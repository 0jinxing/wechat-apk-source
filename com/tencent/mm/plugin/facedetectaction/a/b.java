package com.tencent.mm.plugin.facedetectaction.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ait;
import com.tencent.mm.protocal.protobuf.aiu;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private ait mbU;
  public aiu mbV;

  public b(String paramString1, String paramString2, float paramFloat, String paramString3, String paramString4, int paramInt, String paramString5, String paramString6)
  {
    AppMethodBeat.i(673);
    b.a locala = new b.a();
    locala.fsJ = new ait();
    locala.fsK = new aiu();
    locala.fsI = 2726;
    locala.uri = "/cgi-bin/mmpay-bin/getfacecheckresult";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.mbU = ((ait)this.ehh.fsG.fsP);
    this.mbU.person_id = paramString1;
    this.mbU.woJ = paramString2;
    this.mbU.woM = ((int)paramFloat);
    this.mbU.woN = paramString3;
    this.mbU.woO = paramString4;
    this.mbU.scene = paramInt;
    this.mbU.vYl = paramString5;
    this.mbU.kKO = paramString6;
    this.mbU.woh = ((com.tencent.mm.pluginsdk.wallet.b)g.K(com.tencent.mm.pluginsdk.wallet.b.class)).bQO();
    ab.i("MicroMsg.NetSceneGetFaceCheckResult", "create GetFaceCheckResult, personId: %s, actionData: %s, reductionRatio: %s, videoFileid: %s, scene: %s, takeMessage: %s, packageName: %s", new Object[] { paramString1, paramString2, Float.valueOf(paramFloat), paramString3, Integer.valueOf(paramInt), paramString5, paramString6 });
    AppMethodBeat.o(673);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(674);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(674);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(675);
    ab.i("MicroMsg.NetSceneGetFaceCheckResult", "onGYNetEnd, errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramArrayOfByte = h.pYm;
    if (paramInt3 == 0);
    for (long l = 54L; ; l = 55L)
    {
      paramArrayOfByte.a(917L, l, 1L, false);
      this.mbV = ((aiu)((com.tencent.mm.ai.b)paramq).fsH.fsP);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(675);
      return;
    }
  }

  public final int getType()
  {
    return 2726;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.a.b
 * JD-Core Version:    0.6.2
 */