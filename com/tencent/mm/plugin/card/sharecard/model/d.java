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
import com.tencent.mm.protocal.protobuf.aoc;
import com.tencent.mm.protocal.protobuf.aod;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public String kdS;
  public int kdT;
  public String kdU;

  public d(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(88024);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aoc();
    ((b.a)localObject).fsK = new aod();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/getsharecardconsumedinfo";
    ((b.a)localObject).fsI = 910;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aoc)this.ehh.fsG.fsP;
    ((aoc)localObject).cMC = paramString1;
    ((aoc)localObject).scene = 20;
    ((aoc)localObject).kbU = paramString2;
    ((aoc)localObject).code = paramString3;
    AppMethodBeat.o(88024);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(88026);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(88026);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(88025);
    ab.i("MicroMsg.NetSceneGetShareCardConsumedInfo", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(910), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aod)this.ehh.fsH.fsP;
      ab.v("MicroMsg.NetSceneGetShareCardConsumedInfo", "json:" + paramq.kdS);
      this.kdS = paramq.kdS;
      this.kdU = paramq.kdU;
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(88025);
  }

  public final int getType()
  {
    return 910;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.model.d
 * JD-Core Version:    0.6.2
 */