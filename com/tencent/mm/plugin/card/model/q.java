package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.protobuf.an;
import com.tencent.mm.protocal.protobuf.ao;
import com.tencent.mm.sdk.platformtools.ab;

public final class q extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public CardGiftInfo kdV;

  public q(int paramInt, String paramString1, String paramString2, Boolean paramBoolean)
  {
    AppMethodBeat.i(87863);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new an();
    ((b.a)localObject).fsK = new ao();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/acceptgiftcard";
    ((b.a)localObject).fsI = 1136;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (an)this.ehh.fsG.fsP;
    ((an)localObject).vBA = paramInt;
    ((an)localObject).vBB = paramString1;
    ((an)localObject).vBC = paramString2;
    ((an)localObject).vBD = paramBoolean.booleanValue();
    AppMethodBeat.o(87863);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87865);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87865);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87864);
    ab.i("MicroMsg.NetSceneAcceptGiftCard", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.kdV = CardGiftInfo.a((ao)this.ehh.fsH.fsP);
      ab.d("MicroMsg.NetSceneAcceptGiftCard", "%s", new Object[] { this.kdV.toString() });
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(87864);
  }

  public final int getType()
  {
    return 1136;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.q
 * JD-Core Version:    0.6.2
 */