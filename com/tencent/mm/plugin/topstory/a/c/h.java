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
import com.tencent.mm.protocal.protobuf.tf;
import com.tencent.mm.protocal.protobuf.tg;
import com.tencent.mm.protocal.protobuf.th;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public final class h extends m
  implements k
{
  public b ehh;
  private f ehi;
  public int fLW;
  private long sAZ;
  private List<String> sBb;
  private List<Integer> sBc;

  public h(h paramh)
  {
    AppMethodBeat.i(96395);
    this.fLW = 0;
    ab.i("MicroMsg.TopStory.NetSceneTopStorySetBlockList", "copy NetSceneTopStorySetBlockList", new Object[] { Integer.valueOf(paramh.sBb.size()), Integer.valueOf(paramh.sBc.size()) });
    this.fLW = paramh.fLW;
    n(paramh.sBb, paramh.sBc);
    AppMethodBeat.o(96395);
  }

  public h(List<String> paramList, List<Integer> paramList1)
  {
    AppMethodBeat.i(96396);
    this.fLW = 0;
    ab.i("MicroMsg.TopStory.NetSceneTopStorySetBlockList", "create NetSceneTopStorySetBlockList, users size:%s, type size:%s", new Object[] { Integer.valueOf(paramList.size()), Integer.valueOf(paramList1.size()) });
    n(paramList, paramList1);
    AppMethodBeat.o(96396);
  }

  private void n(List<String> paramList, List<Integer> paramList1)
  {
    AppMethodBeat.i(96397);
    this.sAZ = System.currentTimeMillis();
    this.sBb = paramList;
    this.sBc = paramList1;
    Object localObject = new b.a();
    ((b.a)localObject).fsI = 2859;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/colikeblock";
    ((b.a)localObject).fsJ = new tf();
    ((b.a)localObject).fsK = new th();
    this.ehh = ((b.a)localObject).acD();
    tf localtf = (tf)this.ehh.fsG.fsP;
    for (int i = 0; i < paramList.size(); i++)
    {
      localObject = new tg();
      ((tg)localObject).cts = ((Integer)paramList1.get(i)).intValue();
      ((tg)localObject).vHl = ((String)paramList.get(i));
      localtf.vHk.add(localObject);
    }
    AppMethodBeat.o(96397);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(96398);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(96398);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96399);
    ab.i("MicroMsg.TopStory.NetSceneTopStorySetBlockList", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(System.currentTimeMillis() - this.sAZ) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(96399);
  }

  public final int getType()
  {
    return 2859;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.c.h
 * JD-Core Version:    0.6.2
 */