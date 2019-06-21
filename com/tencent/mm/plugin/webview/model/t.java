package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.b;
import com.tencent.mm.protocal.protobuf.avf;
import com.tencent.mm.protocal.protobuf.avs;
import com.tencent.mm.protocal.protobuf.avt;
import com.tencent.mm.protocal.protobuf.awg;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class t extends m
  implements k, c.b
{
  private f eIc;
  public final com.tencent.mm.ai.b ehh;
  private final int ulX;
  public avf ulY;

  public t(avf paramavf, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, com.tencent.mm.bt.b paramb, int paramInt1, LinkedList<awg> paramLinkedList, int paramInt2)
  {
    AppMethodBeat.i(6622);
    ab.i("MicroMsg.webview.NetSceneJSAPISetAuth", "NetSceneJSAPISetAuth doScene url[%s], appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s], [%s]", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, Integer.valueOf(paramInt1) });
    this.ulY = paramavf;
    this.ulX = paramInt2;
    paramavf = new b.a();
    paramavf.fsJ = new avs();
    paramavf.fsK = new avt();
    paramavf.uri = "/cgi-bin/mmbiz-bin/jsapi-setauth";
    paramavf.fsI = 1096;
    paramavf.fsL = 0;
    paramavf.fsM = 0;
    this.ehh = paramavf.acD();
    paramavf = (avs)this.ehh.fsG.fsP;
    paramavf.url = paramString1;
    paramavf.csB = paramString2;
    paramavf.wzd = paramString3;
    paramavf.cvO = paramString4;
    paramavf.wzf = paramString5;
    paramavf.signature = paramString6;
    paramavf.wzg = paramString7;
    paramavf.wzi = paramInt1;
    paramavf.wzh = paramb;
    paramavf.wzm = paramLinkedList;
    AppMethodBeat.o(6622);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6624);
    ab.i("MicroMsg.webview.NetSceneJSAPISetAuth", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6624);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6623);
    ab.i("MicroMsg.webview.NetSceneJSAPISetAuth", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6623);
  }

  public final int cXz()
  {
    return this.ulX;
  }

  public final int getType()
  {
    return 1096;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.t
 * JD-Core Version:    0.6.2
 */