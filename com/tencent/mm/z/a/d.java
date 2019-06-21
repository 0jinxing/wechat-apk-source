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
import com.tencent.mm.protocal.protobuf.avy;
import com.tencent.mm.protocal.protobuf.avz;
import com.tencent.mm.protocal.protobuf.cxh;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class d extends m
  implements k
{
  private f eIc;
  private d.a<d> eIg;
  private final b ehh;

  private d(String paramString1, LinkedList<String> paramLinkedList, int paramInt1, String paramString2, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(77763);
    ab.i("MicroMsg.webview.NetSceneJSLoginConfirm", "NetSceneJSLogin doScene appId [%s], login_type [%d], state [%s], versionType [%d], opt [%d], extScene [%d]", new Object[] { paramString1, Integer.valueOf(paramInt1), paramString2, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new avy();
    ((b.a)localObject).fsK = new avz();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/js-login-confirm";
    ((b.a)localObject).fsI = 1117;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (avy)this.ehh.fsG.fsP;
    if (paramInt4 > 0)
    {
      ((avy)localObject).wzG = new cxh();
      ((avy)localObject).wzG.scene = paramInt4;
    }
    ((avy)localObject).fKh = paramString1;
    ((avy)localObject).wzD = paramLinkedList;
    ((avy)localObject).wzM = paramInt1;
    ((avy)localObject).wzN = paramString2;
    ((avy)localObject).wzF = paramInt2;
    ((avy)localObject).wzE = paramInt3;
    AppMethodBeat.o(77763);
  }

  public d(String paramString1, LinkedList<String> paramLinkedList, int paramInt1, String paramString2, int paramInt2, int paramInt3, int paramInt4, d.a<d> parama)
  {
    this(paramString1, paramLinkedList, paramInt1, paramString2, paramInt2, paramInt3, paramInt4);
    this.eIg = parama;
  }

  public d(String paramString1, LinkedList<String> paramLinkedList, String paramString2, int paramInt, d.a<d> parama)
  {
    this(paramString1, paramLinkedList, 0, paramString2, 0, paramInt, -1, parama);
  }

  public final avy Qw()
  {
    if (this.ehh == null);
    for (avy localavy = null; ; localavy = (avy)this.ehh.fsG.fsP)
      return localavy;
  }

  public final avz Qx()
  {
    return (avz)this.ehh.fsH.fsP;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(77765);
    ab.i("MicroMsg.webview.NetSceneJSLoginConfirm", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(77765);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(77764);
    ab.i("MicroMsg.webview.NetSceneJSLoginConfirm", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.eIc != null)
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    if (this.eIg != null)
      this.eIg.a(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(77764);
  }

  public final int getType()
  {
    return 1117;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.z.a.d
 * JD-Core Version:    0.6.2
 */