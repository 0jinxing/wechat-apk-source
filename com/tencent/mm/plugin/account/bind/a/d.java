package com.tencent.mm.plugin.account.bind.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cja;
import com.tencent.mm.protocal.protobuf.cjb;

public final class d extends m
  implements k
{
  private b ehh;
  private f ehi;

  public d(String paramString)
  {
    AppMethodBeat.i(13327);
    b.a locala = new b.a();
    locala.fsJ = new cja();
    locala.fsK = new cjb();
    locala.uri = "/cgi-bin/micromsg-bin/unbindqq";
    locala.fsI = 253;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((cja)this.ehh.fsG.fsP).wdB = paramString;
    AppMethodBeat.o(13327);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(13328);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(13328);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13329);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(13329);
  }

  public final int getType()
  {
    return 253;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.a.d
 * JD-Core Version:    0.6.2
 */