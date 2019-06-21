package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aql;
import com.tencent.mm.protocal.protobuf.aqm;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends m
  implements k
{
  private b ehh;
  private f ehi;
  private aql nyn;
  public aqm nyo;

  public e()
  {
    AppMethodBeat.i(21848);
    this.ehh = null;
    this.nyn = null;
    this.nyo = null;
    this.ehi = null;
    b.a locala = new b.a();
    locala.fsJ = new aql();
    locala.fsK = new aqm();
    locala.fsI = 831;
    locala.uri = "/cgi-bin/micromsg-bin/getwcopackageproductlist";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.nyn = ((aql)this.ehh.fsG.fsP);
    ab.i("MicroMsg.NetSceneIPCallGetPackageProductList", "NetSceneIPCallGetPackageProductList");
    AppMethodBeat.o(21848);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(21849);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21849);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21850);
    ab.i("MicroMsg.NetSceneIPCallGetPackageProductList", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyo = ((aqm)((b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(21850);
  }

  public final int getType()
  {
    return 831;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.e
 * JD-Core Version:    0.6.2
 */