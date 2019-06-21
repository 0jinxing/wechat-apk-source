package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.abb;
import com.tencent.mm.protocal.protobuf.abc;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public String rdB;

  public b(String paramString)
  {
    AppMethodBeat.i(37658);
    this.rdB = "";
    this.rdB = paramString;
    b.a locala = new b.a();
    locala.fsJ = new abb();
    locala.fsK = new abc();
    locala.uri = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_favofficialitem";
    locala.fsI = 2874;
    this.ehh = locala.acD();
    ((abb)this.ehh.fsG.fsP).wio = paramString;
    ab.i("MicroMsg.NetSceneFavOfficialItem", "Req: item_buff[%s]", new Object[] { paramString });
    AppMethodBeat.o(37658);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(37659);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(37659);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(37660);
    ab.i("MicroMsg.NetSceneFavOfficialItem", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(37660);
  }

  public final int getType()
  {
    return 2874;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.b
 * JD-Core Version:    0.6.2
 */