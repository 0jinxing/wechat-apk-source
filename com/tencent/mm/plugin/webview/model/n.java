package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.anc;
import com.tencent.mm.protocal.protobuf.and;

public final class n extends m
  implements k
{
  private f eIc;
  public final b ehh;

  public n(String paramString)
  {
    AppMethodBeat.i(6604);
    b.a locala = new b.a();
    locala.fsJ = new anc();
    locala.fsK = new and();
    locala.uri = "/cgi-bin/mmbiz-bin/oauth_getrandomavatar";
    locala.fsI = 2785;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((anc)this.ehh.fsG.fsP).csB = paramString;
    AppMethodBeat.o(6604);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6606);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6606);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6605);
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6605);
  }

  public final int getType()
  {
    return 2785;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.n
 * JD-Core Version:    0.6.2
 */