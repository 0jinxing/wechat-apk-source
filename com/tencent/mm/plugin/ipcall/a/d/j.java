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
import com.tencent.mm.protocal.protobuf.crz;
import com.tencent.mm.protocal.protobuf.csa;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends m
  implements k
{
  private b ehh;
  private f ehi;
  public crz nyy;
  public csa nyz;

  public j(String paramString)
  {
    AppMethodBeat.i(21863);
    this.ehh = null;
    this.nyy = null;
    this.nyz = null;
    this.ehi = null;
    b.a locala = new b.a();
    locala.fsJ = new crz();
    locala.fsK = new csa();
    locala.fsI = 277;
    locala.uri = "/cgi-bin/micromsg-bin/wcopurchasepackage";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.nyy = ((crz)this.ehh.fsG.fsP);
    this.nyy.ProductID = paramString;
    ab.i("MicroMsg.NetSceneIPCallPurchasePackage", "NetSceneIPCallPurchasePackage ProductID:%s", new Object[] { this.nyy.ProductID });
    AppMethodBeat.o(21863);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(21864);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21864);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21865);
    ab.i("MicroMsg.NetSceneIPCallPurchasePackage", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyz = ((csa)((b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(21865);
  }

  public final int getType()
  {
    return 277;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.j
 * JD-Core Version:    0.6.2
 */