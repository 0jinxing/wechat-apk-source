package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.b;
import com.tencent.mm.protocal.protobuf.avg;
import com.tencent.mm.protocal.protobuf.avh;
import com.tencent.mm.sdk.platformtools.ab;

public final class q extends m
  implements k, c.b
{
  private f eIc;
  private final com.tencent.mm.ai.b ehh;
  public c.a ulV;
  public String ulW;
  private final int ulX;
  public String url;

  public q(c.a parama, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, byte[] paramArrayOfByte, int paramInt1, String paramString8, int paramInt2)
  {
    AppMethodBeat.i(6613);
    ab.i("MicroMsg.webview.NetSceneJSAPIAuth", "NetSceneJSAPIAuth doScene appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s], [%s], [%s]", new Object[] { paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, Integer.valueOf(paramInt1), paramString8 });
    this.ulV = parama;
    this.ulW = paramString3;
    this.url = paramString1;
    this.ulX = paramInt2;
    parama = new b.a();
    parama.fsJ = new avg();
    parama.fsK = new avh();
    parama.uri = "/cgi-bin/mmbiz-bin/jsapi-auth";
    parama.fsI = 1095;
    parama.fsL = 0;
    parama.fsM = 0;
    this.ehh = parama.acD();
    parama = (avg)this.ehh.fsG.fsP;
    parama.url = paramString1;
    parama.mZr = paramString2;
    parama.wzd = paramString3;
    parama.cvO = paramString4;
    parama.wzf = paramString5;
    parama.signature = paramString6;
    parama.wzg = paramString7;
    parama.wzh = com.tencent.mm.bt.b.bI(paramArrayOfByte);
    parama.wzi = paramInt1;
    parama.scope = paramString8;
    AppMethodBeat.o(6613);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6615);
    ab.i("MicroMsg.webview.NetSceneJSAPIAuth", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6615);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6614);
    ab.i("MicroMsg.webview.NetSceneJSAPIAuth", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6614);
  }

  public final avg cXx()
  {
    if (this.ehh == null);
    for (avg localavg = null; ; localavg = (avg)this.ehh.fsG.fsP)
      return localavg;
  }

  public final avh cXy()
  {
    if (this.ehh == null);
    for (avh localavh = null; ; localavh = (avh)this.ehh.fsH.fsP)
      return localavh;
  }

  public final int cXz()
  {
    return this.ulX;
  }

  public final int getType()
  {
    return 1095;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.q
 * JD-Core Version:    0.6.2
 */