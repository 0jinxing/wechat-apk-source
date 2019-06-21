package com.tencent.mm.plugin.voiceprint.model;

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
import com.tencent.mm.protocal.protobuf.cfv;
import com.tencent.mm.protocal.protobuf.cfw;
import com.tencent.mm.sdk.platformtools.ab;

public final class i extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public int mStatus;
  public int sLm;

  public i(int paramInt)
  {
    AppMethodBeat.i(26101);
    b.a locala = new b.a();
    locala.fsJ = new cfv();
    locala.fsK = new cfw();
    locala.uri = "/cgi-bin/micromsg-bin/switchopvoiceprint";
    locala.fsI = 615;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((cfv)this.ehh.fsG.fsP).cAd = paramInt;
    AppMethodBeat.o(26101);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(26102);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(26102);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26103);
    ab.d("MicroMsg.NetSceneSwitchOpVoicePrint", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (cfw)((b)paramq).fsH.fsP;
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(26103);
    }
    while (true)
    {
      return;
      this.mStatus = paramq.wPr;
      this.sLm = paramq.xeV;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(26103);
    }
  }

  public final int getType()
  {
    return 615;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.i
 * JD-Core Version:    0.6.2
 */