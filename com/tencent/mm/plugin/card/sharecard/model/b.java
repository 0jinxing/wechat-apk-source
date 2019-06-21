package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.agt;
import com.tencent.mm.protocal.protobuf.agu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class b extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  public String kdS;
  public String kfA;

  public b(double paramDouble1, double paramDouble2, String paramString)
  {
    AppMethodBeat.i(88018);
    this.kfA = "";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new agt();
    ((b.a)localObject).fsK = new agu();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/getcardshomepage";
    ((b.a)localObject).fsI = 1164;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (agt)this.ehh.fsG.fsP;
    ((agt)localObject).latitude = paramDouble1;
    ((agt)localObject).longitude = paramDouble2;
    ((agt)localObject).kfA = paramString;
    ((agt)localObject).wnm = ((String)g.RP().Ry().get(ac.a.xKl, ""));
    ab.d("MicroMsg.NetSceneGetCardsHomePageLayout", "red_buff:" + ((agt)localObject).wnm);
    AppMethodBeat.o(88018);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(88020);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(88020);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(88019);
    ab.i("MicroMsg.NetSceneGetCardsHomePageLayout", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(1164), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (agu)this.ehh.fsH.fsP;
      ab.v("MicroMsg.NetSceneGetCardsHomePageLayout", "json:" + paramq.kdS);
      this.kdS = paramq.kdS;
      this.kfA = paramq.kfA;
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(88019);
  }

  public final int getType()
  {
    return 1164;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.model.b
 * JD-Core Version:    0.6.2
 */