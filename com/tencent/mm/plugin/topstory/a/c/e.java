package com.tencent.mm.plugin.topstory.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bqf;
import com.tencent.mm.protocal.protobuf.bqg;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.ue;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e extends m
  implements k
{
  public b ehh;
  private f ehi;
  private chv sBa;

  public e(chv paramchv, List<String> paramList)
  {
    AppMethodBeat.i(96389);
    ab.i("MicroMsg.TopStory.NetSceneTopStory", "Create NetSceneTopStoryGetVideoUrl Video");
    this.sBa = paramchv;
    paramchv = new b.a();
    paramchv.fsI = 2579;
    paramchv.uri = "/cgi-bin/mmsearch-bin/recommendgetvideourl";
    paramchv.fsJ = new bqf();
    paramchv.fsK = new bqg();
    this.ehh = paramchv.acD();
    paramchv = (bqf)this.ehh.fsG.fsP;
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      paramList = (String)localIterator.next();
      ue localue = new ue();
      localue.wbI = paramList;
      paramchv.wSy.add(localue);
    }
    AppMethodBeat.o(96389);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(96390);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(96390);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96391);
    ab.i("MicroMsg.TopStory.NetSceneTopStory", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(96391);
  }

  public final int getType()
  {
    return 2579;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.c.e
 * JD-Core Version:    0.6.2
 */