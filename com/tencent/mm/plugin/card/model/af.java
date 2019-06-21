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
import com.tencent.mm.protocal.protobuf.arl;
import com.tencent.mm.protocal.protobuf.arm;
import com.tencent.mm.sdk.platformtools.ab;

public final class af extends m
  implements k
{
  public String cMD;
  private final b ehh;
  private f ehi;
  public int kdT;
  public String kdU;

  public af(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(87910);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new arl();
    ((b.a)localObject).fsK = new arm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/giftcarditem";
    ((b.a)localObject).fsI = 652;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (arl)this.ehh.fsG.fsP;
    ((arl)localObject).cMC = paramString1;
    ((arl)localObject).wvx = paramString2;
    ((arl)localObject).wvy = paramInt;
    AppMethodBeat.o(87910);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87911);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87911);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87912);
    ab.i("MicroMsg.NetSceneGiftCardItem", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (arm)this.ehh.fsH.fsP;
      if (paramq != null)
      {
        this.cMD = paramq.cMD;
        this.kdU = paramq.kdU;
        this.kdT = paramq.kdT;
      }
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(87912);
      return;
      paramq = (arm)this.ehh.fsH.fsP;
      if (paramq != null)
      {
        this.cMD = paramq.cMD;
        this.kdU = paramq.kdU;
        this.kdT = paramq.kdT;
      }
    }
  }

  public final int getType()
  {
    return 652;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.af
 * JD-Core Version:    0.6.2
 */