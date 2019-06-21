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
import com.tencent.mm.protocal.protobuf.bun;
import com.tencent.mm.protocal.protobuf.buo;

public final class aa extends m
  implements k
{
  private f eIc;
  public final b ehh;

  public aa(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(6643);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bun();
    ((b.a)localObject).fsK = new buo();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/sdk_oauth_authorize";
    ((b.a)localObject).fsI = 1388;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bun)this.ehh.fsG.fsP;
    ((bun)localObject).csB = paramString1;
    ((bun)localObject).scope = paramString2;
    ((bun)localObject).state = paramString3;
    ((bun)localObject).wWd = paramString4;
    ((bun)localObject).wWe = paramString5;
    AppMethodBeat.o(6643);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6645);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6645);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6644);
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6644);
  }

  public final int getType()
  {
    return 1388;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.aa
 * JD-Core Version:    0.6.2
 */