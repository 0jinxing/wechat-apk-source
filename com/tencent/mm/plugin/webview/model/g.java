package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bw;
import com.tencent.mm.protocal.protobuf.bx;

public final class g extends m
  implements k
{
  private f eIc;
  public final com.tencent.mm.ai.b ehh;

  public g(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(6583);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bw();
    ((b.a)localObject).fsK = new bx();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/oauth_addavatar";
    ((b.a)localObject).fsI = 2500;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bw)this.ehh.fsG.fsP;
    ((bw)localObject).csB = paramString1;
    ((bw)localObject).nickname = paramString2;
    ((bw)localObject).fileid = paramString3;
    ((bw)localObject).vEd = 1;
    AppMethodBeat.o(6583);
  }

  public g(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6582);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bw();
    ((b.a)localObject).fsK = new bx();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/oauth_addavatar";
    ((b.a)localObject).fsI = 2500;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bw)this.ehh.fsG.fsP;
    ((bw)localObject).csB = paramString1;
    ((bw)localObject).nickname = paramString2;
    ((bw)localObject).vEc = new com.tencent.mm.bt.b(paramArrayOfByte);
    ((bw)localObject).vEd = 0;
    AppMethodBeat.o(6582);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6585);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6585);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6584);
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6584);
  }

  public final int getType()
  {
    return 2500;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.g
 * JD-Core Version:    0.6.2
 */