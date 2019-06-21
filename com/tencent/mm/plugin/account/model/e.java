package com.tencent.mm.plugin.account.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.blo;
import com.tencent.mm.protocal.protobuf.blp;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends m
  implements k
{
  private f ehi;
  private b gme;
  private blo gyM;

  public e(int paramInt, String paramString)
  {
    AppMethodBeat.i(124679);
    b.a locala = new b.a();
    locala.fsJ = new blo();
    locala.fsK = new blp();
    locala.fsI = 268;
    locala.fsL = 0;
    locala.fsM = 0;
    locala.uri = "/cgi-bin/micromsg-bin/privacypolicychoise";
    this.gme = locala.acD();
    this.gyM = ((blo)this.gme.fsG.fsP);
    this.gyM.wOC = paramInt;
    this.gyM.guW = paramString;
    AppMethodBeat.o(124679);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(124680);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(124680);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(124681);
    ab.i("MicroMsg.NetScenePrivacyPolicyChoice", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(124681);
  }

  public final int getType()
  {
    return 268;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.e
 * JD-Core Version:    0.6.2
 */