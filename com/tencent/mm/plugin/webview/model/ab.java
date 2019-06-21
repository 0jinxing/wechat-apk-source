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
import com.tencent.mm.protocal.protobuf.bul;
import com.tencent.mm.protocal.protobuf.bum;
import java.util.LinkedList;

public final class ab extends m
  implements k
{
  private f eIc;
  private final b ehh;

  public ab(int paramInt, String paramString1, String paramString2, String paramString3, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(6646);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bul();
    ((b.a)localObject).fsK = new bum();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/sdk_oauth_authorize_confirm";
    ((b.a)localObject).fsI = 1346;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bul)this.ehh.fsG.fsP;
    ((bul)localObject).wII = paramInt;
    ((bul)localObject).csB = paramString1;
    ((bul)localObject).wIJ = paramLinkedList;
    ((bul)localObject).state = paramString2;
    ((bul)localObject).wWc = paramString3;
    AppMethodBeat.o(6646);
  }

  public ab(String paramString1, String paramString2, String paramString3, LinkedList<String> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(6647);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bul();
    ((b.a)localObject).fsK = new bum();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/sdk_oauth_authorize_confirm";
    ((b.a)localObject).fsI = 1346;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bul)this.ehh.fsG.fsP;
    ((bul)localObject).wII = 1;
    ((bul)localObject).csB = paramString1;
    ((bul)localObject).wIJ = paramLinkedList;
    ((bul)localObject).state = paramString2;
    ((bul)localObject).wWc = paramString3;
    ((bul)localObject).wcA = paramInt;
    AppMethodBeat.o(6647);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6649);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6649);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6648);
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6648);
  }

  public final bum cXC()
  {
    return (bum)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 1346;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.ab
 * JD-Core Version:    0.6.2
 */