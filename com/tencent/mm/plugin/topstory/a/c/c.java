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
import com.tencent.mm.protocal.protobuf.ahm;
import com.tencent.mm.protocal.protobuf.ahn;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  public b ehh;
  private f ehi;
  private long sAZ;
  public int type;

  public c(int paramInt)
  {
    AppMethodBeat.i(96386);
    this.type = paramInt;
    this.sAZ = System.currentTimeMillis();
    b.a locala = new b.a();
    locala.fsI = 2748;
    locala.uri = "/cgi-bin/mmsearch-bin/getcolikeblocklist";
    locala.fsJ = new ahm();
    locala.fsK = new ahn();
    this.ehh = locala.acD();
    ((ahm)this.ehh.fsG.fsP).jCt = paramInt;
    ab.i("MicroMsg.TopStory.NetSceneTopStoryGetBlockList", "request NetSceneTopStoryGetBlockList: %d", new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(96386);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(96387);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(96387);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96388);
    ab.i("MicroMsg.TopStory.NetSceneTopStoryGetBlockList", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(System.currentTimeMillis() - this.sAZ) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(96388);
  }

  public final int getType()
  {
    return 2748;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.c.c
 * JD-Core Version:    0.6.2
 */