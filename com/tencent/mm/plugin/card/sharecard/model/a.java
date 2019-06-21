package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.protocal.protobuf.wb;
import com.tencent.mm.protocal.protobuf.wc;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements com.tencent.mm.network.k
{
  private String cMC;
  private final b ehh;
  private f ehi;
  public int kdT;

  public a(String paramString)
  {
    AppMethodBeat.i(88015);
    this.cMC = "";
    b.a locala = new b.a();
    locala.fsJ = new wb();
    locala.fsK = new wc();
    locala.uri = "/cgi-bin/mmbiz-bin/card/delsharecard";
    locala.fsI = 1163;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((wb)this.ehh.fsG.fsP).cMC = paramString;
    this.cMC = paramString;
    AppMethodBeat.o(88015);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(88017);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(88017);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(88016);
    ab.i("MicroMsg.NetSceneDelShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(1163), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (wc)this.ehh.fsH.fsP;
      ab.i("MicroMsg.NetSceneDelShareCard", "ret_code:" + paramq.kdT);
      this.kdT = paramq.kdT;
      if (this.kdT == 0)
        am.bbe().GJ(this.cMC);
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(88016);
  }

  public final int getType()
  {
    return 1163;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.model.a
 * JD-Core Version:    0.6.2
 */