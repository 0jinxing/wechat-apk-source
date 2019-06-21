package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ael;
import com.tencent.mm.protocal.protobuf.aem;
import com.tencent.mm.sdk.platformtools.ab;

public final class k extends m
  implements com.tencent.mm.network.k
{
  private f ehi;
  public final b lty;

  public k(String paramString1, String paramString2)
  {
    AppMethodBeat.i(6595);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ael();
    ((b.a)localObject).fsK = new aem();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/getappticket";
    ((b.a)localObject).fsI = 1097;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (ael)this.lty.fsG.fsP;
    ((ael)localObject).csB = paramString1;
    ((ael)localObject).signature = paramString2;
    AppMethodBeat.o(6595);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6596);
    this.ehi = paramf;
    int i = a(parame, this.lty, this);
    AppMethodBeat.o(6596);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6597);
    ab.i("MicroMsg.NetSceneGetAppTicket", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6597);
  }

  public final int getType()
  {
    return 1097;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.k
 * JD-Core Version:    0.6.2
 */