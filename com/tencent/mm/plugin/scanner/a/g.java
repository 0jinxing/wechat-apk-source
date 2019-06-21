package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.kw;
import com.tencent.mm.protocal.protobuf.kx;
import com.tencent.mm.sdk.platformtools.ab;

public final class g extends m
  implements k
{
  public int cvn;
  public int cvo;
  private b ehh;
  private f ehi;
  public boolean pZG;

  public g(int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(80843);
    this.pZG = false;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new kw();
    ((b.a)localObject).fsK = new kx();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/bizscanbarcode";
    ((b.a)localObject).fsI = 1061;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (kw)this.ehh.fsG.fsP;
    ((kw)localObject).jCt = paramInt1;
    ((kw)localObject).vOm = paramString;
    ((kw)localObject).Scene = 1;
    this.cvn = paramInt2;
    this.cvo = paramInt3;
    ab.d("MicroMsg.scanner.NetSceneScanBarcode", "NetSceneScanBarcode, type: %s, barcode: %s, scene: %s, codetype: %s, codeVersion: %s", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    AppMethodBeat.o(80843);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(80844);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(80844);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(80846);
    ab.d("MicroMsg.scanner.NetSceneScanBarcode", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(80846);
  }

  public final m.b b(q paramq)
  {
    AppMethodBeat.i(80845);
    paramq = (kw)((b)paramq).fsG.fsP;
    if ((paramq.jCt < 0) || (paramq.vOm == null) || (paramq.vOm.length() <= 0))
    {
      ab.e("MicroMsg.scanner.NetSceneScanBarcode", "securityVerificationChecked failed, Type = " + paramq.jCt + ", Barcode = %s" + paramq.vOm);
      paramq = m.b.ftv;
      AppMethodBeat.o(80845);
    }
    while (true)
    {
      return paramq;
      paramq = m.b.ftu;
      AppMethodBeat.o(80845);
    }
  }

  public final kx cgG()
  {
    if ((this.ehh != null) && (this.ehh.fsH.fsP != null));
    for (kx localkx = (kx)this.ehh.fsH.fsP; ; localkx = null)
      return localkx;
  }

  public final int getType()
  {
    return 1061;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.g
 * JD-Core Version:    0.6.2
 */