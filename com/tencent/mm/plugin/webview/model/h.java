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
import com.tencent.mm.protocal.protobuf.bu;
import com.tencent.mm.protocal.protobuf.bv;
import com.tencent.mm.sdk.platformtools.ab;

public final class h extends m
  implements k
{
  private f eIc;
  public final b ehh;
  public String mnu;

  public h(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(6586);
    this.mnu = paramString3;
    paramString3 = new b.a();
    paramString3.fsJ = new bu();
    paramString3.fsK = new bv();
    paramString3.uri = "/cgi-bin/mmbiz-bin/oauth_addavatarheadimg";
    paramString3.fsI = 2667;
    paramString3.fsL = 2667;
    paramString3.fsM = 0;
    this.ehh = paramString3.acD();
    paramString3 = (bu)this.ehh.fsG.fsP;
    paramString3.vEb = paramString1;
    paramString3.csB = paramString2;
    AppMethodBeat.o(6586);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6587);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6587);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6588);
    ab.i("MicroMsg.NetSceneCreateAvatar", "NetSceneCreateAvatar:  netId = %d, errType = %d,errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.eIc != null)
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6588);
  }

  public final int getType()
  {
    return 2667;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.h
 * JD-Core Version:    0.6.2
 */