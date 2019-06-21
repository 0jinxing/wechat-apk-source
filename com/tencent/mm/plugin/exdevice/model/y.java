package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cjr;
import com.tencent.mm.protocal.protobuf.cjs;

public final class y extends m
  implements k
{
  private String ceI;
  private String cws;
  public String dFl;
  private b ehh;
  private f ehi;
  private int ltJ;

  public y(String paramString1, String paramString2, String paramString3)
  {
    this.dFl = paramString3;
    this.ceI = paramString1;
    this.cws = paramString2;
    this.ltJ = 0;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(19353);
    this.ehi = paramf;
    paramf = new b.a();
    paramf.fsJ = new cjr();
    paramf.fsK = new cjs();
    paramf.uri = "/cgi-bin/mmoc-bin/hardware/updatemydeviceattr";
    paramf.fsI = 1263;
    paramf.fsL = 0;
    paramf.fsM = 0;
    this.ehh = paramf.acD();
    paramf = (cjr)this.ehh.fsG.fsP;
    paramf.dFl = this.dFl;
    paramf.oYp = this.ceI;
    paramf.devicetype = this.cws;
    paramf.xij = this.ltJ;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(19353);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19354);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(19354);
  }

  public final int getType()
  {
    return 1263;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.y
 * JD-Core Version:    0.6.2
 */