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
import com.tencent.mm.protocal.protobuf.ber;
import com.tencent.mm.protocal.protobuf.bes;

public final class w extends m
  implements k
{
  private f eIc;
  public final b ehh;
  public Object tag;
  public String umb;

  public w(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(6631);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ber();
    ((b.a)localObject).fsK = new bes();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/oauth_authorize";
    ((b.a)localObject).fsI = 1254;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.umb = paramString1;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ber)this.ehh.fsG.fsP;
    ((ber)localObject).wIH = paramString1;
    ((ber)localObject).vNN = paramString2;
    ((ber)localObject).scene = paramInt;
    AppMethodBeat.o(6631);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6633);
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6633);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6632);
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6632);
  }

  public final int getType()
  {
    return 1254;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.w
 * JD-Core Version:    0.6.2
 */