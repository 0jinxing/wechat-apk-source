package com.tencent.mm.plugin.ext.c.a;

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
import com.tencent.mm.protocal.protobuf.qr;
import com.tencent.mm.protocal.protobuf.qs;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  private b ehh;
  public f ehi;
  public int lRf;
  public String mUrl;

  public a(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(20431);
    this.lRf = -1;
    this.mUrl = null;
    this.mUrl = paramString;
    b.a locala = new b.a();
    locala.fsJ = new qr();
    locala.fsK = new qs();
    locala.uri = "/cgi-bin/micromsg-bin/checkcamerascan";
    locala.fsI = 782;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ab.i("MicroMsg.NetSceneCheckUrlAvailableInWx", "hy: checking url: %s", new Object[] { paramString });
    paramString = (qr)this.ehh.fsG.fsP;
    paramString.URL = this.mUrl;
    paramString.vXI = paramInt1;
    paramString.vXJ = paramInt2;
    AppMethodBeat.o(20431);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(20432);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(20432);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(20433);
    ab.d("MicroMsg.NetSceneCheckUrlAvailableInWx", "hy: on get camera url end. errType; %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (qs)((b)paramq).fsH.fsP;
    if ((paramInt2 == 0) && (paramInt3 == 0))
      this.lRf = paramq.jCt;
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(20433);
  }

  public final int getType()
  {
    return 782;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.c.a.a
 * JD-Core Version:    0.6.2
 */