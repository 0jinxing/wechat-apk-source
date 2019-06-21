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
import com.tencent.mm.protocal.protobuf.ve;
import com.tencent.mm.protocal.protobuf.vf;

public final class i extends m
  implements k
{
  private f eIc;
  private final b ehh;

  public i(int paramInt)
  {
    AppMethodBeat.i(6589);
    b.a locala = new b.a();
    locala.fsJ = new ve();
    locala.fsK = new vf();
    locala.uri = "/cgi-bin/mmbiz-bin/oauth_delavatar";
    locala.fsI = 2700;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((ve)this.ehh.fsG.fsP).wcA = paramInt;
    AppMethodBeat.o(6589);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6591);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6591);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6590);
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6590);
  }

  public final int getType()
  {
    return 2700;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.i
 * JD-Core Version:    0.6.2
 */