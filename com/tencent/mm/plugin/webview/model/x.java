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
import com.tencent.mm.protocal.protobuf.bep;
import com.tencent.mm.protocal.protobuf.beq;
import java.util.LinkedList;

public final class x extends m
  implements k
{
  private f eIc;
  public final b ehh;
  public Object tag;

  public x(String paramString, int paramInt, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(6634);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bep();
    ((b.a)localObject).fsK = new beq();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/oauth_authorize_confirm";
    ((b.a)localObject).fsI = 1373;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bep)this.ehh.fsG.fsP;
    ((bep)localObject).wIH = paramString;
    ((bep)localObject).wII = paramInt;
    ((bep)localObject).wIJ = paramLinkedList;
    AppMethodBeat.o(6634);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6636);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6636);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6635);
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6635);
  }

  public final int getType()
  {
    return 1373;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.x
 * JD-Core Version:    0.6.2
 */