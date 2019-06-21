package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aqn;
import com.tencent.mm.protocal.protobuf.aqo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class f extends m
  implements k
{
  private b ehh;
  private com.tencent.mm.ai.f ehi;
  private aqn nyp;
  public aqo nyq;
  public boolean nyr;

  public f(String paramString1, String paramString2)
  {
    AppMethodBeat.i(21851);
    this.ehh = null;
    this.nyp = null;
    this.nyq = null;
    this.nyr = true;
    if (bo.isNullOrNil(paramString2))
    {
      this.nyr = true;
      paramString2 = "";
    }
    while (true)
    {
      b.a locala = new b.a();
      locala.fsJ = new aqn();
      locala.fsK = new aqo();
      locala.fsI = 929;
      locala.uri = "/cgi-bin/micromsg-bin/getwcoproductlist";
      locala.fsL = 0;
      locala.fsM = 0;
      this.ehh = locala.acD();
      this.nyp = ((aqn)this.ehh.fsG.fsP);
      this.nyp.wuk = paramString1;
      this.nyp.wul = paramString2;
      ab.i("MicroMsg.NetSceneIPCallGetProductList", "NetSceneIPCallGetProductList");
      AppMethodBeat.o(21851);
      return;
      this.nyr = false;
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(21852);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21852);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21853);
    ab.i("MicroMsg.NetSceneIPCallGetProductList", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyq = ((aqo)((b)paramq).fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(21853);
  }

  public final int getType()
  {
    return 929;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.f
 * JD-Core Version:    0.6.2
 */