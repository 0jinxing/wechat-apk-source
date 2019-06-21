package com.tencent.mm.z.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.avu;
import com.tencent.mm.protocal.protobuf.avv;
import com.tencent.mm.protocal.protobuf.cxh;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class b extends m
  implements k
{
  private f eIc;
  private b.a<b> eIe;
  private final com.tencent.mm.ai.b ehh;

  private b(String paramString, LinkedList<String> paramLinkedList, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(77757);
    ab.i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "NetSceneJSLogin doScene appId [%s], versionType [%d], opt [%d], extScene [%d]", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    Object localObject = new com.tencent.mm.ai.b.a();
    ((com.tencent.mm.ai.b.a)localObject).fsJ = new avu();
    ((com.tencent.mm.ai.b.a)localObject).fsK = new avv();
    ((com.tencent.mm.ai.b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-authorize-confirm";
    ((com.tencent.mm.ai.b.a)localObject).fsI = 1158;
    ((com.tencent.mm.ai.b.a)localObject).fsL = 0;
    ((com.tencent.mm.ai.b.a)localObject).fsM = 0;
    this.ehh = ((com.tencent.mm.ai.b.a)localObject).acD();
    localObject = (avu)this.ehh.fsG.fsP;
    if (paramInt3 > 0)
    {
      ((avu)localObject).wzG = new cxh();
      ((avu)localObject).wzG.scene = paramInt3;
    }
    ((avu)localObject).fKh = paramString;
    ((avu)localObject).wzD = paramLinkedList;
    ((avu)localObject).wzF = paramInt1;
    ((avu)localObject).wzE = paramInt2;
    AppMethodBeat.o(77757);
  }

  public b(String paramString, LinkedList<String> paramLinkedList, int paramInt1, int paramInt2, int paramInt3, b.a<b> parama)
  {
    this(paramString, paramLinkedList, paramInt1, paramInt2, paramInt3);
    this.eIe = parama;
  }

  public b(String paramString, LinkedList<String> paramLinkedList, int paramInt, b.a<b> parama)
  {
    this(paramString, paramLinkedList, 0, paramInt, -1, parama);
  }

  public final avu Qs()
  {
    if (this.ehh == null);
    for (avu localavu = null; ; localavu = (avu)this.ehh.fsG.fsP)
      return localavu;
  }

  public final avv Qt()
  {
    return (avv)this.ehh.fsH.fsP;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(77759);
    ab.i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(77759);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(77758);
    ab.i("MicroMsg.webview.NetSceneJSAuthorizeConfirm", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.eIc != null)
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if (this.eIe != null)
      this.eIe.a(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(77758);
  }

  public final int getType()
  {
    return 1158;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.a.b
 * JD-Core Version:    0.6.2
 */