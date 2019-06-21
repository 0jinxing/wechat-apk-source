package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.bwz;
import com.tencent.mm.protocal.protobuf.bxa;

public final class aj extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public aj(String paramString)
  {
    AppMethodBeat.i(108481);
    b.a locala = new b.a();
    locala.fsJ = new bwz();
    locala.fsK = new bxa();
    locala.uri = "/cgi-bin/micromsg-bin/sendverifyemail";
    locala.fsI = 108;
    locala.fsL = 43;
    locala.fsM = 1000000043;
    this.ehh = locala.acD();
    ((bwz)this.ehh.fsG.fsP).wcB = new bts().alV(paramString);
    AppMethodBeat.o(108481);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(108482);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(108482);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108483);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(108483);
  }

  public final int getType()
  {
    return 108;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.aj
 * JD-Core Version:    0.6.2
 */