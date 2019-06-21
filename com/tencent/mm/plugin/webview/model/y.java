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
import com.tencent.mm.protocal.protobuf.bna;
import com.tencent.mm.protocal.protobuf.bnb;

public final class y extends m
  implements k
{
  private f eIc;
  public final b ehh;

  public y(String paramString)
  {
    AppMethodBeat.i(6637);
    b.a locala = new b.a();
    locala.fsJ = new bna();
    locala.fsK = new bnb();
    locala.uri = "/cgi-bin/mmbiz-bin/qrconnect_authorize";
    locala.fsI = 2543;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((bna)this.ehh.fsG.fsP).wIH = paramString;
    AppMethodBeat.o(6637);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6639);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6639);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6638);
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6638);
  }

  public final int getType()
  {
    return 2543;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.y
 * JD-Core Version:    0.6.2
 */