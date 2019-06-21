package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bhl;
import com.tencent.mm.protocal.protobuf.brs;
import com.tencent.mm.protocal.protobuf.brt;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

public final class ah extends m
  implements k
{
  private final b ehh;
  private f ehi;

  public ah(LinkedList<bhl> paramLinkedList)
  {
    AppMethodBeat.i(87916);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new brs();
    ((b.a)localObject).fsK = new brt();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/reportdynamiccardcodeaction";
    ((b.a)localObject).fsI = 1275;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    ((brs)this.ehh.fsG.fsP).wTU = paramLinkedList;
    if (paramLinkedList != null)
    {
      localObject = paramLinkedList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramLinkedList = (bhl)((Iterator)localObject).next();
        ab.d("MicroMsg.NetSceneReportDynamicCardCodeAction", "ReportDynamicCardCodeActionReq operate card_id=%s,code_id=%s,operate_timestamp=%d,operate_type=%d", new Object[] { paramLinkedList.cMC, paramLinkedList.kdG, Integer.valueOf(paramLinkedList.wKK), Integer.valueOf(paramLinkedList.wKL) });
      }
    }
    AppMethodBeat.o(87916);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87918);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87918);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87917);
    ab.i("MicroMsg.NetSceneReportDynamicCardCodeAction", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(87917);
  }

  public final int getType()
  {
    return 1275;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.ah
 * JD-Core Version:    0.6.2
 */