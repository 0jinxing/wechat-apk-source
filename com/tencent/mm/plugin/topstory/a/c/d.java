package com.tencent.mm.plugin.topstory.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.apu;
import com.tencent.mm.protocal.protobuf.apv;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends m
  implements k
{
  public b ehh;
  private f ehi;

  public d(String paramString)
  {
    AppMethodBeat.i(65506);
    b.a locala = new b.a();
    locala.fsI = 2830;
    locala.uri = "/cgi-bin/mmsearch-bin/getuserattrbyopenid";
    locala.fsJ = new apu();
    locala.fsK = new apv();
    this.ehh = locala.acD();
    ((apu)this.ehh.fsG.fsP).vGs = paramString;
    AppMethodBeat.o(65506);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(65507);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(65507);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(65508);
    ab.i("MicroMsg.TopStory.NetSceneTopStoryGetUsername", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(65508);
  }

  public final int getType()
  {
    return 2830;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.c.d
 * JD-Core Version:    0.6.2
 */