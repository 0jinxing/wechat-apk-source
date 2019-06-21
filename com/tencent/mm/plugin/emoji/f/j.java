package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aih;
import com.tencent.mm.protocal.protobuf.aii;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends m
  implements k
{
  private f eIc;
  public final b ehh;
  public String kWN;
  private String kWO;

  public j(String paramString1, String paramString2)
  {
    AppMethodBeat.i(53120);
    b.a locala = new b.a();
    locala.fsJ = new aih();
    locala.fsK = new aii();
    locala.uri = "/cgi-bin/micromsg-bin/getemotionactivity";
    locala.fsI = 368;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.kWN = paramString1;
    this.kWO = paramString2;
    AppMethodBeat.o(53120);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(53121);
    this.eIc = paramf;
    paramf = (aih)this.ehh.fsG.fsP;
    paramf.wot = this.kWN;
    paramf.Md5 = this.kWO;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(53121);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53122);
    ab.i("MicroMsg.emoji.NetSceneGetEmotionActivity", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(53122);
  }

  public final int getType()
  {
    return 368;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.j
 * JD-Core Version:    0.6.2
 */