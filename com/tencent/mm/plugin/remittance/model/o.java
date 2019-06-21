package com.tencent.mm.plugin.remittance.model;

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
import com.tencent.mm.protocal.protobuf.ov;
import com.tencent.mm.protocal.protobuf.ow;
import com.tencent.mm.sdk.platformtools.ab;

public final class o extends m
  implements k
{
  private f ehi;
  private b gme;
  private ov pPd;
  public ow pPe;

  public o(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, int paramInt2, int paramInt3, String paramString5, String paramString6)
  {
    AppMethodBeat.i(44755);
    b.a locala = new b.a();
    locala.fsJ = new ov();
    locala.fsK = new ow();
    locala.fsI = 2773;
    locala.uri = "/cgi-bin/mmpay-bin/f2fsucpage";
    locala.fsL = 0;
    locala.fsM = 0;
    this.gme = locala.acD();
    this.pPd = ((ov)this.gme.fsG.fsP);
    this.pPd.vFb = paramString1;
    this.pPd.vFc = paramString2;
    this.pPd.nUf = paramInt1;
    this.pPd.pPT = paramString3;
    this.pPd.pPS = paramString4;
    this.pPd.cIb = paramInt2;
    this.pPd.pOA = paramInt3;
    this.pPd.vVW = paramString5;
    this.pPd.vVX = paramString6;
    AppMethodBeat.o(44755);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(44756);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(44756);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(44757);
    ab.i("MicroMsg.NetSceneF2fSuccPage", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pPe = ((ow)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneF2fSuccPage", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.pPe.kCl), this.pPe.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(44757);
  }

  public final int getType()
  {
    return 2773;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.o
 * JD-Core Version:    0.6.2
 */