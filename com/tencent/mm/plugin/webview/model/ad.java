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
import com.tencent.mm.protocal.protobuf.azh;
import com.tencent.mm.protocal.protobuf.azm;
import com.tencent.mm.protocal.protobuf.azn;
import com.tencent.mm.sdk.platformtools.ab;

public final class ad extends m
  implements k
{
  String appId;
  String czD;
  private f eIc;
  final b ehh;

  public ad(String paramString1, String paramString2, azh paramazh)
  {
    AppMethodBeat.i(6653);
    this.appId = paramString1;
    this.czD = paramString2;
    paramString2 = new b.a();
    paramString2.fsJ = new azm();
    paramString2.fsK = new azn();
    paramString2.uri = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_uploadcdninfo";
    paramString2.fsI = 1034;
    paramString2.fsL = 0;
    paramString2.fsM = 0;
    this.ehh = paramString2.acD();
    paramString2 = (azm)this.ehh.fsG.fsP;
    paramString2.csB = paramString1;
    paramString2.wDv = paramazh;
    AppMethodBeat.o(6653);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6655);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6655);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6654);
    ab.i("MicroMsg.NetSceneUploadCdnInfo", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6654);
  }

  public final int getType()
  {
    return 1034;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.ad
 * JD-Core Version:    0.6.2
 */