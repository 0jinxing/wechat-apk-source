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
import com.tencent.mm.protocal.protobuf.ai;
import com.tencent.mm.protocal.protobuf.aj;
import com.tencent.mm.protocal.protobuf.cdc;
import com.tencent.mm.sdk.platformtools.ab;

public final class o extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public String kdS;
  public int kdT;
  public String kdU;

  public o(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, int paramInt3, cdc paramcdc)
  {
    AppMethodBeat.i(87857);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ai();
    ((b.a)localObject).fsK = new aj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/acceptcarditem";
    ((b.a)localObject).fsI = 651;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ai)this.ehh.fsG.fsP;
    ((ai)localObject).cMC = paramString1;
    ((ai)localObject).kde = paramString2;
    ((ai)localObject).cME = paramInt1;
    ((ai)localObject).cMD = paramString3;
    ((ai)localObject).vBv = paramString4;
    ((ai)localObject).vBu = paramString5;
    ((ai)localObject).vBw = paramInt2;
    ((ai)localObject).vBx = paramInt3;
    ((ai)localObject).vBy = paramcdc;
    AppMethodBeat.o(87857);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87858);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87858);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87859);
    ab.i("MicroMsg.NetSceneAcceptCardItem", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aj)this.ehh.fsH.fsP;
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
      AppMethodBeat.o(87859);
      return;
      paramq = (aj)this.ehh.fsH.fsP;
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
    return 651;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.o
 * JD-Core Version:    0.6.2
 */