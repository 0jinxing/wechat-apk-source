package com.tencent.mm.plugin.card.sharecard.model;

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
import com.tencent.mm.protocal.protobuf.byv;
import com.tencent.mm.protocal.protobuf.byw;
import com.tencent.mm.protocal.protobuf.byx;
import com.tencent.mm.protocal.protobuf.bzm;
import com.tencent.mm.protocal.protobuf.cdc;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class g extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public String kdS;
  public int kdT;
  public String kdU;

  public g(int paramInt1, LinkedList<byx> paramLinkedList, String paramString1, String paramString2, bzm parambzm, int paramInt2, cdc paramcdc)
  {
    AppMethodBeat.i(88033);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new byv();
    ((b.a)localObject).fsK = new byw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sharecarditem";
    ((b.a)localObject).fsI = 902;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (byv)this.ehh.fsG.fsP;
    ((byv)localObject).wYd = paramInt1;
    ((byv)localObject).fjr = paramLinkedList;
    ((byv)localObject).wSq = paramString1;
    ((byv)localObject).wni = paramString2;
    ab.i("MicroMsg.NetSceneShareCardItem", "list length is " + paramLinkedList.size());
    ((byv)localObject).wYe = parambzm;
    ((byv)localObject).cME = paramInt2;
    ((byv)localObject).vBy = paramcdc;
    AppMethodBeat.o(88033);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(88035);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(88035);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(88034);
    ab.i("MicroMsg.NetSceneShareCardItem", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(902), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      ab.i("MicroMsg.NetSceneShareCardItem", "do ShareCardItem netscene success!");
      paramq = (byw)this.ehh.fsH.fsP;
      if (paramq != null)
      {
        this.kdS = paramq.kdS;
        this.kdT = paramq.kdT;
        this.kdU = paramq.kdU;
      }
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(88034);
      return;
      paramq = (byw)this.ehh.fsH.fsP;
      if (paramq != null)
      {
        this.kdS = paramq.kdS;
        this.kdT = paramq.kdT;
        this.kdU = paramq.kdU;
      }
    }
  }

  public final int getType()
  {
    return 902;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.model.g
 * JD-Core Version:    0.6.2
 */