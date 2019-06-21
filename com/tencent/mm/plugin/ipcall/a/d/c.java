package com.tencent.mm.plugin.ipcall.a.d;

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
import com.tencent.mm.protocal.protobuf.aqh;
import com.tencent.mm.protocal.protobuf.aqi;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements k
{
  private b ehh;
  private f ehi;
  private aqh nyj;
  public aqi nyk;

  public c()
  {
    AppMethodBeat.i(21842);
    this.ehh = null;
    this.nyj = null;
    this.nyk = null;
    this.ehi = null;
    b.a locala = new b.a();
    locala.fsJ = new aqh();
    locala.fsK = new aqi();
    locala.fsI = 746;
    locala.uri = "/cgi-bin/micromsg-bin/getwcocallinfo";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.nyj = ((aqh)this.ehh.fsG.fsP);
    ab.i("MicroMsg.NetSceneIPCallGetCallInfo", "NetSceneIPCallGetCallInfo");
    AppMethodBeat.o(21842);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(21843);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21843);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21844);
    ab.i("MicroMsg.NetSceneIPCallGetCallInfo", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyk = ((aqi)((b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(21844);
  }

  public final int getType()
  {
    return 746;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.c
 * JD-Core Version:    0.6.2
 */