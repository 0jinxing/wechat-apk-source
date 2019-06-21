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
import com.tencent.mm.protocal.protobuf.avw;
import com.tencent.mm.protocal.protobuf.avx;
import com.tencent.mm.protocal.protobuf.cxh;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class a extends m
  implements k
{
  private f eIc;
  private a<a> eId;
  private final b ehh;

  private a(String paramString, LinkedList<String> paramLinkedList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77754);
    ab.i("MicroMsg.webview.NetSceneJSAuthorize", "NetSceneJSLogin doScene appId [%s], versionType [%d], extScene[%d]", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new avw();
    ((b.a)localObject).fsK = new avx();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-authorize";
    ((b.a)localObject).fsI = 1157;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (avw)this.ehh.fsG.fsP;
    if (paramInt2 > 0)
    {
      ((avw)localObject).wzG = new cxh();
      ((avw)localObject).wzG.scene = paramInt2;
    }
    ((avw)localObject).fKh = paramString;
    ((avw)localObject).wzD = paramLinkedList;
    ((avw)localObject).wzF = paramInt1;
    AppMethodBeat.o(77754);
  }

  public a(String paramString, LinkedList<String> paramLinkedList, int paramInt1, int paramInt2, a<a> parama)
  {
    this(paramString, paramLinkedList, paramInt1, paramInt2);
    this.eId = parama;
  }

  public a(String paramString, LinkedList<String> paramLinkedList, a<a> parama)
  {
    this(paramString, paramLinkedList, 0, -1, parama);
  }

  public final avw Qq()
  {
    if (this.ehh == null);
    for (avw localavw = null; ; localavw = (avw)this.ehh.fsG.fsP)
      return localavw;
  }

  public final avx Qr()
  {
    return (avx)this.ehh.fsH.fsP;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(77756);
    ab.i("MicroMsg.webview.NetSceneJSAuthorize", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(77756);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(77755);
    ab.i("MicroMsg.webview.NetSceneJSAuthorize", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.eIc != null)
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if (this.eId != null)
      this.eId.a(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(77755);
  }

  public final int getType()
  {
    return 1157;
  }

  public static abstract interface a<T extends m>
  {
    public abstract void a(int paramInt1, int paramInt2, String paramString, T paramT);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.a.a
 * JD-Core Version:    0.6.2
 */