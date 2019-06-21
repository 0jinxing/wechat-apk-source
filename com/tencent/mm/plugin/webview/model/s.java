package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.b;
import com.tencent.mm.protocal.protobuf.avq;
import com.tencent.mm.protocal.protobuf.avr;
import com.tencent.mm.sdk.platformtools.ab;

public final class s extends m
  implements k, c.b
{
  private f eIc;
  private final com.tencent.mm.ai.b ehh;
  public c.a ulV;
  private final int ulX;

  public s(c.a parama, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(6619);
    ab.i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "NetSceneJSAPIRealtimeVerify doScene url[%s], appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s]", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7 });
    this.ulV = parama;
    this.ulX = paramInt;
    parama = new b.a();
    parama.fsJ = new avq();
    parama.fsK = new avr();
    parama.uri = "/cgi-bin/mmbiz-bin/jsapi-realtimeverify";
    parama.fsI = 1094;
    parama.fsL = 0;
    parama.fsM = 0;
    this.ehh = parama.acD();
    parama = (avq)this.ehh.fsG.fsP;
    parama.url = paramString1;
    parama.csB = paramString2;
    parama.wzd = paramString3;
    parama.cvO = paramString4;
    parama.wzf = paramString5;
    parama.signature = paramString6;
    parama.wzg = paramString7;
    parama.wzh = com.tencent.mm.bt.b.bI(paramArrayOfByte);
    AppMethodBeat.o(6619);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6621);
    ab.i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6621);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6620);
    ab.i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6620);
  }

  public final avr cXB()
  {
    if (this.ehh == null);
    for (avr localavr = null; ; localavr = (avr)this.ehh.fsH.fsP)
      return localavr;
  }

  public final int cXz()
  {
    return this.ulX;
  }

  public final int getType()
  {
    return 1094;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.s
 * JD-Core Version:    0.6.2
 */