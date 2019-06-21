package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.protocal.protobuf.cdc;
import com.tencent.mm.protocal.protobuf.ia;
import com.tencent.mm.protocal.protobuf.ib;
import com.tencent.mm.protocal.protobuf.oj;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class t extends m
  implements k
{
  public String cardId;
  private final b ehh;
  private com.tencent.mm.ai.f ehi;
  public LinkedList<CardInfo> kdZ;

  public t(LinkedList<oj> paramLinkedList, cdc paramcdc, int paramInt)
  {
    this(paramLinkedList, paramcdc, paramInt, "");
  }

  public t(LinkedList<oj> paramLinkedList, cdc paramcdc, int paramInt, String paramString)
  {
    AppMethodBeat.i(87873);
    this.kdZ = new LinkedList();
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ia();
    ((b.a)localObject).fsK = new ib();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/batchgetcarditembytpinfo";
    ((b.a)localObject).fsI = 699;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ia)this.ehh.fsG.fsP;
    ((ia)localObject).fjr = paramLinkedList;
    ((ia)localObject).vBy = paramcdc;
    ((ia)localObject).cME = paramInt;
    this.cardId = paramString;
    AppMethodBeat.o(87873);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(87874);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87874);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87875);
    ab.i("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(87875);
    }
    while (true)
    {
      return;
      paramq = ((ib)this.ehh.fsH.fsP).kdS;
      if (TextUtils.isEmpty(paramq))
      {
        ab.e("MicroMsg.NetSceneBatchGetCardItem", "onGYNetEnd fail, resp json_ret is null");
        this.ehi.onSceneEnd(4, -1, null, this);
        AppMethodBeat.o(87875);
      }
      else
      {
        paramq = com.tencent.mm.plugin.card.d.f.Hg(paramq);
        if (paramq != null)
        {
          l.beB();
          this.kdZ.addAll(paramq);
        }
        this.ehi.onSceneEnd(0, 0, paramString, this);
        AppMethodBeat.o(87875);
      }
    }
  }

  public final int getType()
  {
    return 699;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.t
 * JD-Core Version:    0.6.2
 */