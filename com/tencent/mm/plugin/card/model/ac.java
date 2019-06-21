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
import com.tencent.mm.protocal.protobuf.agr;
import com.tencent.mm.protocal.protobuf.ags;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class ac extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public LinkedList<String> kaF;
  public int kaH;
  public int kaI;
  public int kaJ;

  public ac(String paramString)
  {
    AppMethodBeat.i(87901);
    b.a locala = new b.a();
    locala.fsJ = new agr();
    locala.fsK = new ags();
    locala.uri = "/cgi-bin/micromsg-bin/getcardserial";
    locala.fsI = 577;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((agr)this.ehh.fsG.fsP).cMC = paramString;
    AppMethodBeat.o(87901);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87902);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87902);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87903);
    ab.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ags)this.ehh.fsH.fsP;
      this.kaF = paramq.kaF;
      this.kaH = paramq.kaH;
      this.kaI = paramq.kaI;
      this.kaJ = paramq.kaJ;
    }
    ab.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp request_time = %d, request_count = %d, refresh_interval = %d,", new Object[] { Integer.valueOf(this.kaH), Integer.valueOf(this.kaI), Integer.valueOf(this.kaJ) });
    if (this.kaF != null)
      ab.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp codes size is " + this.kaF.size());
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(87903);
  }

  public final int getType()
  {
    return 577;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.ac
 * JD-Core Version:    0.6.2
 */