package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a;

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
import com.tencent.mm.protocal.protobuf.ajf;
import com.tencent.mm.protocal.protobuf.ajg;
import com.tencent.mm.protocal.protobuf.bex;
import com.tencent.mm.protocal.protobuf.bey;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  private b ehh;
  private f ehi;
  public String jsonString;

  public c(String paramString)
  {
    AppMethodBeat.i(37662);
    b.a locala = new b.a();
    locala.fsJ = new bex();
    locala.fsK = new bey();
    locala.uri = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_officialsync";
    locala.fsI = 2721;
    this.ehh = locala.acD();
    ((bex)this.ehh.fsG.fsP).wIS = paramString;
    ab.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "Req: syncBuffer:".concat(String.valueOf(paramString)));
    AppMethodBeat.o(37662);
  }

  public c(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(37661);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ajf();
    ((b.a)localObject).fsK = new ajg();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getgamecanvasinfo";
    ((b.a)localObject).fsI = 1337;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ajf)this.ehh.fsG.fsP;
    ((ajf)localObject).fKh = paramString1;
    ((ajf)localObject).wpc = paramString2;
    ((ajf)localObject).wpd = paramString3;
    ab.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "Req: shareType:" + paramString2 + " sharedAppId :" + paramString1);
    AppMethodBeat.o(37661);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(37663);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(37663);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(37664);
    ab.i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString + " sceneType: " + this.ehh.fsI);
    if (this.ehh.fsI == 1337)
      this.jsonString = ((ajg)((b)paramq).fsH.fsP).wlX;
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(37664);
      return;
      if (this.ehh.fsI == 2721)
        this.jsonString = ((bey)((b)paramq).fsH.fsP).wIT;
    }
  }

  public final int getType()
  {
    return this.ehh.fsI;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.a.c
 * JD-Core Version:    0.6.2
 */