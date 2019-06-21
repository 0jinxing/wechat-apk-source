package com.tencent.mm.ah;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.compatible.util.g;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.auk;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.ii;
import com.tencent.mm.protocal.protobuf.ij;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class j extends m
  implements k
{
  private f ehi;
  LinkedList<bts> fsa = null;
  LinkedList<auk> fsb = null;

  public j(LinkedList<bts> paramLinkedList)
  {
    this.fsa = paramLinkedList;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(77930);
    int i;
    if ((this.fsa == null) || (this.fsa.size() <= 0))
    {
      ab.e("MicroMsg.NetSceneBatchGetHeadImg", g.Mq() + "doScene ReqSize==0");
      i = -1;
      AppMethodBeat.o(77930);
    }
    while (true)
    {
      return i;
      this.ehi = paramf;
      paramf = new b.a();
      paramf.fsJ = new ii();
      paramf.fsK = new ij();
      paramf.uri = "/cgi-bin/micromsg-bin/batchgetheadimg";
      paramf.fsI = 123;
      paramf.fsL = 15;
      paramf.fsM = 1000000015;
      b localb = paramf.acD();
      paramf = (ii)localb.fsG.fsP;
      paramf.vEg = this.fsa;
      paramf.jBv = this.fsa.size();
      i = a(parame, localb, this);
      AppMethodBeat.o(77930);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(77931);
    ab.d("MicroMsg.NetSceneBatchGetHeadImg", "errType:" + paramInt2 + " errCode:" + paramInt3);
    this.fsb = ((ij)((b)paramq).fsH.fsP).vKC;
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(77931);
  }

  public final int acn()
  {
    return 20;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 123;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.j
 * JD-Core Version:    0.6.2
 */