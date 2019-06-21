package com.tencent.mm.plugin.sport.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cku;
import com.tencent.mm.protocal.protobuf.ckv;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends m
  implements k
{
  private b ehh;
  private com.tencent.mm.ai.f ehi;
  private cku rPv;

  public f(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, int paramInt4)
  {
    AppMethodBeat.i(93663);
    this.ehi = null;
    this.ehh = null;
    ab.i("MicroMsg.Sport.NetSceneUploadDeviceStep", "NetSceneUploadDeviceStep %s, %s, %s, %s, %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    b.a locala = new b.a();
    locala.fsJ = new cku();
    locala.fsK = new ckv();
    locala.uri = "/cgi-bin/mmoc-bin/hardware/uploaddevicestep";
    locala.fsI = 1261;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.rPv = ((cku)this.ehh.fsG.fsP);
    this.rPv.ceI = paramString1;
    this.rPv.cws = paramString2;
    this.rPv.xiu = paramInt1;
    this.rPv.xiv = paramInt2;
    this.rPv.bIb = paramInt3;
    this.rPv.xiw = String.valueOf(n.cwD());
    this.rPv.xiy = paramString3;
    this.rPv.xiB = paramInt4;
    AppMethodBeat.o(93663);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(93664);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(93664);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93665);
    ab.i("MicroMsg.Sport.NetSceneUploadDeviceStep", "NetSceneUploadDeviceStep end: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(93665);
  }

  public final int getType()
  {
    return 1261;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.f
 * JD-Core Version:    0.6.2
 */