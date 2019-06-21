package com.tencent.mm.plugin.qqmail.b;

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
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class r extends m
  implements k
{
  private b ehh;
  private f ehi;
  private ArrayList<Long> puy;

  public r(ArrayList<Long> paramArrayList)
  {
    AppMethodBeat.i(67978);
    this.puy = paramArrayList;
    paramArrayList = new b.a();
    paramArrayList.fsJ = new c();
    paramArrayList.fsK = new d();
    paramArrayList.uri = "/cgi-bin/micromsg-bin/checkconversationfile";
    paramArrayList.fsI = 483;
    paramArrayList.fsL = 0;
    paramArrayList.fsM = 0;
    this.ehh = paramArrayList.acD();
    AppMethodBeat.o(67978);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(67980);
    this.ehi = paramf;
    paramf = (c)this.ehh.fsG.fsP;
    paramf.jBv = this.puy.size();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.puy.iterator();
    while (localIterator.hasNext())
    {
      long l = ((Long)localIterator.next()).longValue();
      h localh = new h();
      localh.ptF = l;
      localLinkedList.add(localh);
      ab.i("MicroMsg.NetSceneCheckConversationFile", "MsgId: %d", new Object[] { Long.valueOf(l) });
    }
    paramf.ptt = localLinkedList;
    ab.i("MicroMsg.NetSceneCheckConversationFile", "Count = %d, MsgInfoList.size = %d", new Object[] { Integer.valueOf(paramf.jBv), Integer.valueOf(paramf.ptt.size()) });
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(67980);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(67979);
    ab.i("MicroMsg.NetSceneCheckConversationFile", "onGYNetEnd, netId: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (((paramInt2 != 0) || (paramInt3 != 0)) && (this.ehi != null))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(67979);
    }
    while (true)
    {
      return;
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(67979);
    }
  }

  public final LinkedList<g> ccu()
  {
    return ((d)this.ehh.fsH.fsP).ptu;
  }

  public final int getType()
  {
    return 483;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.r
 * JD-Core Version:    0.6.2
 */