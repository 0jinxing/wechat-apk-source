package com.tencent.mm.plugin.luckymoney.f2f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aw;
import com.tencent.mm.protocal.protobuf.bpt;
import com.tencent.mm.protocal.protobuf.zx;
import com.tencent.mm.protocal.protobuf.zy;
import com.tencent.mm.sdk.platformtools.ab;

public final class c extends m
  implements com.tencent.mm.network.k
{
  public int cRU;
  public int cvG;
  private f ehi;
  private b gme;
  public String nSX;
  private zx nUb;
  private zy nUc;
  public int nUd;
  public String nUe;
  public int nUf;
  public bpt nUg;
  public int nUh;
  public String nUi;
  public String nUj;
  public String nUk;
  public int nUl;

  public c(String paramString)
  {
    AppMethodBeat.i(42151);
    b.a locala = new b.a();
    locala.fsJ = new zx();
    locala.fsK = new zy();
    locala.fsI = 1997;
    locala.fsL = 0;
    locala.fsM = 0;
    locala.uri = "/cgi-bin/mmpay-bin/ftfhb/ffopenwxhb";
    this.gme = locala.acD();
    this.nUb = ((zx)this.gme.fsG.fsP);
    this.nUb.lvz = paramString;
    paramString = com.tencent.mm.plugin.wallet_core.model.k.cPy();
    if (paramString != null)
    {
      this.nUb.dud = paramString.dud;
      this.nUb.duc = paramString.duc;
      this.nUb.wfd = paramString.vCF;
      this.nUb.wfe = paramString.vCG;
      this.nUb.wff = paramString.vCE;
      this.nUb.wfg = paramString.latitude;
      this.nUb.wfh = paramString.longitude;
    }
    AppMethodBeat.o(42151);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(42153);
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(42153);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(42152);
    this.nUc = ((zy)((b)paramq).fsH.fsP);
    ab.i("NetSceneF2FLuckyMoneyOpen", "errType %d, retCode %d, retMsg %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(this.nUc.kCl), this.nUc.kCm });
    this.nSX = this.nUc.nSX;
    this.cRU = this.nUc.cRU;
    this.nUd = this.nUc.cRV;
    this.cvG = this.nUc.cvG;
    this.nUe = this.nUc.nXl;
    this.nUf = this.nUc.nUf;
    this.nUg = this.nUc.vWf;
    this.nUh = this.nUc.nUh;
    this.nUi = this.nUc.nUi;
    this.nUj = this.nUc.nUj;
    this.nUk = this.nUc.nUk;
    this.nUl = this.nUc.nUl;
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, this.nUc.kCl, this.nUc.kCm, this);
    AppMethodBeat.o(42152);
  }

  public final int getType()
  {
    return 1997;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.a.c
 * JD-Core Version:    0.6.2
 */