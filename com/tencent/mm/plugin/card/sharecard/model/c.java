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
import com.tencent.mm.protocal.protobuf.aog;
import com.tencent.mm.protocal.protobuf.aoh;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public String kdS;

  public c(String paramString)
  {
    AppMethodBeat.i(88021);
    b.a locala = new b.a();
    locala.fsJ = new aog();
    locala.fsK = new aoh();
    locala.uri = "/cgi-bin/micromsg-bin/getsharecard";
    locala.fsI = 904;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((aog)this.ehh.fsG.fsP).cMC = paramString;
    AppMethodBeat.o(88021);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(88023);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(88023);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(88022);
    ab.i("MicroMsg.NetSceneGetShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(904), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aoh)this.ehh.fsH.fsP;
      ab.v("MicroMsg.NetSceneGetShareCard", "json:" + paramq.kdS);
      this.kdS = paramq.kdS;
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(88022);
  }

  public final int getType()
  {
    return 904;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.model.c
 * JD-Core Version:    0.6.2
 */