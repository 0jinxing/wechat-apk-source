package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
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
import com.tencent.mm.protocal.protobuf.avo;
import com.tencent.mm.protocal.protobuf.avp;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class r extends m
  implements k, c.b
{
  private f eIc;
  public final b ehh;
  public String iCz;
  public c.a ulV;
  private final int ulX;

  public r(c.a parama, String paramString1, String paramString2, LinkedList<String> paramLinkedList, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, String paramString7, int paramInt2)
  {
    AppMethodBeat.i(6616);
    ab.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "NetSceneJSAPIPreVerify doScene url[%s], appid[%s], [%s], [%s], [%s], [%s]", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6 });
    this.ulV = parama;
    this.iCz = paramString1;
    this.ulX = paramInt2;
    parama = new b.a();
    parama.fsJ = new avo();
    parama.fsK = new avp();
    parama.uri = "/cgi-bin/mmbiz-bin/jsapi-preverify";
    parama.fsI = 1093;
    parama.fsL = 0;
    parama.fsM = 0;
    this.ehh = parama.acD();
    parama = (avo)this.ehh.fsG.fsP;
    parama.url = paramString1;
    parama.csB = paramString2;
    parama.wzx = paramLinkedList;
    parama.cvO = paramString3;
    parama.wzf = paramString4;
    parama.signature = paramString5;
    parama.wzg = paramString6;
    parama.scene = paramInt1;
    parama.wzy = paramString7;
    AppMethodBeat.o(6616);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6618);
    ab.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6618);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6617);
    ab.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6617);
  }

  public final avp cXA()
  {
    if (this.ehh == null);
    for (avp localavp = null; ; localavp = (avp)this.ehh.fsH.fsP)
      return localavp;
  }

  public final int cXz()
  {
    return this.ulX;
  }

  public final int getType()
  {
    return 1093;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.r
 * JD-Core Version:    0.6.2
 */