package com.tencent.mm.modelmulti;

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
import com.tencent.mm.protocal.protobuf.ajx;
import com.tencent.mm.protocal.protobuf.ajy;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends m
  implements k
{
  public String content;
  private b ehh;
  private f ehi;
  public int fHT;
  public String title;

  public d(int paramInt)
  {
    AppMethodBeat.i(16497);
    this.title = "";
    this.content = "";
    this.fHT = 0;
    b.a locala = new b.a();
    locala.fsJ = new ajx();
    locala.fsK = new ajy();
    locala.uri = "/cgi-bin/micromsg-bin/getinvitefriendsmsg";
    locala.fsI = 1803;
    this.ehh = locala.acD();
    ((ajx)this.ehh.fsG.fsP).wpw = paramInt;
    this.fHT = paramInt;
    AppMethodBeat.o(16497);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16499);
    ab.d("MicroMsg.NetSceneGetInviteFriendsMsg", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16499);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16498);
    ab.d("MicroMsg.NetSceneGetInviteFriendsMsg", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ajy)this.ehh.fsH.fsP;
      this.title = paramq.wpx;
      this.content = paramq.wpy;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(16498);
    }
    while (true)
    {
      return;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(16498);
    }
  }

  public final int getType()
  {
    return 1803;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelmulti.d
 * JD-Core Version:    0.6.2
 */