package com.tencent.mm.z.a;

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
import com.tencent.mm.protocal.protobuf.awa;
import com.tencent.mm.protocal.protobuf.awb;
import com.tencent.mm.protocal.protobuf.cxh;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class c extends m
  implements k
{
  private f eIc;
  private c.a<c> eIf;
  private final b ehh;

  private c(String paramString1, LinkedList<String> paramLinkedList, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(77760);
    ab.i("MicroMsg.webview.NetSceneJSLogin", "NetSceneJSLogin doScene appId [%s], loginType [%d], url [%s], state [%s], versionType [%d], extScene [%d]", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2, paramString3, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new awa();
    ((b.a)localObject).fsK = new awb();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-login";
    ((b.a)localObject).fsI = 1029;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (awa)this.ehh.fsG.fsP;
    ((awa)localObject).fKh = paramString1;
    ((awa)localObject).wzD = paramLinkedList;
    ((awa)localObject).wzM = paramInt1;
    ((awa)localObject).Url = paramString2;
    ((awa)localObject).wzN = paramString3;
    ((awa)localObject).wzF = paramInt2;
    if (paramInt3 > 0)
    {
      ((awa)localObject).wzG = new cxh();
      ((awa)localObject).wzG.scene = paramInt3;
    }
    AppMethodBeat.o(77760);
  }

  public c(String paramString1, LinkedList<String> paramLinkedList, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, c.a<c> parama)
  {
    this(paramString1, paramLinkedList, paramInt1, paramString2, paramString3, paramInt2, paramInt3);
    this.eIf = parama;
  }

  public c(String paramString1, LinkedList<String> paramLinkedList, String paramString2, String paramString3, c.a<c> parama)
  {
    this(paramString1, paramLinkedList, 0, paramString2, paramString3, 0, -1, parama);
  }

  public final awa Qu()
  {
    if (this.ehh == null);
    for (awa localawa = null; ; localawa = (awa)this.ehh.fsG.fsP)
      return localawa;
  }

  public final awb Qv()
  {
    return (awb)this.ehh.fsH.fsP;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(77762);
    ab.i("MicroMsg.webview.NetSceneJSLogin", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(77762);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(77761);
    ab.i("MicroMsg.webview.NetSceneJSLogin", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.eIc != null)
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if (this.eIf != null)
      this.eIf.a(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(77761);
  }

  public final int getType()
  {
    return 1029;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.a.c
 * JD-Core Version:    0.6.2
 */