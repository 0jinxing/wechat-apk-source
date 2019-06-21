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
import com.tencent.mm.protocal.protobuf.cih;
import com.tencent.mm.protocal.protobuf.cii;
import com.tencent.mm.sdk.platformtools.ab;

public final class ac extends m
  implements k
{
  private f eIc;
  public final b ehh;

  public ac(String paramString1, String paramString2)
  {
    AppMethodBeat.i(6650);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cih();
    ((b.a)localObject).fsK = new cii();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/transid";
    ((b.a)localObject).fsI = 1142;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cih)this.ehh.fsG.fsP;
    ((cih)localObject).csB = paramString1;
    ((cih)localObject).vGs = paramString2;
    AppMethodBeat.o(6650);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(6652);
    ab.i("MicroMsg.NetSceneSendAppMsgToSpecifiedContact", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(6652);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(6651);
    ab.i("MicroMsg.NetSceneSendAppMsgToSpecifiedContact", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(6651);
  }

  public final int getType()
  {
    return 1142;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.ac
 * JD-Core Version:    0.6.2
 */