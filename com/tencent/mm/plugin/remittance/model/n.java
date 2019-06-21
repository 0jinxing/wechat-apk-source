package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.pk;
import com.tencent.mm.protocal.protobuf.pl;
import com.tencent.mm.sdk.platformtools.ab;

public final class n extends m
  implements k
{
  private f ehi;
  private b gme;
  private pk pPc;

  public n(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    AppMethodBeat.i(44752);
    b.a locala = new b.a();
    locala.fsJ = new pk();
    locala.fsK = new pl();
    locala.fsI = 1273;
    locala.uri = "/cgi-bin/mmpay-bin/f2fpaycheck";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.pPc = ((pk)this.gme.fsG.fsP);
    this.pPc.vFb = paramString1;
    this.pPc.vFc = paramString2;
    this.pPc.vWF = paramString3;
    this.pPc.vWG = paramString4;
    this.pPc.nUf = paramInt;
    ab.d("MicroMsg.NetSceneF2fPayCheck", "NetSceneF2fPayCheck, f2fId: %s, transId: %s, extendStr: %s, amount: %s", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt) });
    AppMethodBeat.o(44752);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44753);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(44753);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44754);
    ab.i("MicroMsg.NetSceneF2fPayCheck", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(44754);
  }

  public final int getType()
  {
    return 1273;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.n
 * JD-Core Version:    0.6.2
 */