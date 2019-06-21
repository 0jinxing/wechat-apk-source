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
import com.tencent.mm.protocal.protobuf.agl;
import com.tencent.mm.protocal.protobuf.agm;
import com.tencent.mm.protocal.protobuf.cdc;
import com.tencent.mm.sdk.platformtools.ab;

public final class aa extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public String kdS;

  public aa(String paramString1, int paramInt1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, cdc paramcdc)
  {
    AppMethodBeat.i(87895);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new agl();
    ((b.a)localObject).fsK = new agm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcarditeminfo";
    ((b.a)localObject).fsI = 645;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (agl)this.ehh.fsG.fsP;
    ((agl)localObject).cMC = paramString1;
    ((agl)localObject).cME = paramInt1;
    ((agl)localObject).kde = paramString2;
    ((agl)localObject).cMD = paramString3;
    ((agl)localObject).vBv = paramString4;
    ((agl)localObject).vBu = paramString5;
    ((agl)localObject).vBw = paramInt2;
    ((agl)localObject).wni = paramString6;
    ((agl)localObject).vBy = paramcdc;
    AppMethodBeat.o(87895);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87896);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87896);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87897);
    ab.i("MicroMsg.NetSceneGetCardItemInfo", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
      this.kdS = ((agm)this.ehh.fsH.fsP).kdS;
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(87897);
  }

  public final int getType()
  {
    return 645;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.aa
 * JD-Core Version:    0.6.2
 */