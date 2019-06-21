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
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.agj;
import com.tencent.mm.protocal.protobuf.agk;
import com.tencent.mm.sdk.platformtools.ab;

public final class z extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public CardGiftInfo kdV;

  public z(int paramInt, String paramString)
  {
    AppMethodBeat.i(87892);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new agj();
    ((b.a)localObject).fsK = new agk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcardgiftinfo";
    ((b.a)localObject).fsI = 1165;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (agj)this.ehh.fsG.fsP;
    ((agj)localObject).vBA = paramInt;
    ((agj)localObject).vBB = paramString;
    AppMethodBeat.o(87892);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87894);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87894);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87893);
    ab.i("MicroMsg.NetSceneGetCardGiftInfo", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.kdV = CardGiftInfo.a((agk)this.ehh.fsH.fsP);
      ab.d("MicroMsg.NetSceneGetCardGiftInfo", "%s", new Object[] { this.kdV.toString() });
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(87893);
  }

  public final int getType()
  {
    return 1165;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.z
 * JD-Core Version:    0.6.2
 */