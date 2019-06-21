package com.tencent.mm.modelappbrand;

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
import com.tencent.mm.protocal.protobuf.cxz;
import com.tencent.mm.protocal.protobuf.cya;
import com.tencent.mm.sdk.platformtools.ab;

public final class s extends m
  implements k
{
  private f eIc;
  private final b fpJ;

  public s(String paramString)
  {
    AppMethodBeat.i(93743);
    b.a locala = new b.a();
    locala.fsJ = new cxz();
    locala.fsK = new cya();
    locala.uri = "/cgi-bin/mmbiz-bin/wxausrevent/wxatmplcomplaint";
    locala.fsI = 1198;
    locala.fsL = 0;
    locala.fsM = 0;
    this.fpJ = locala.acD();
    ((cxz)this.fpJ.fsG.fsP).xtu = paramString;
    AppMethodBeat.o(93743);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(93745);
    ab.i("MicroMsg.NetSceneGetServiceNotifyOptions", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.fpJ, this);
    AppMethodBeat.o(93745);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93744);
    ab.i("MicroMsg.NetSceneGetServiceNotifyOptions", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.eIc != null)
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(93744);
  }

  public final cya abK()
  {
    if (this.fpJ != null);
    for (cya localcya = (cya)this.fpJ.fsH.fsP; ; localcya = null)
      return localcya;
  }

  public final int getType()
  {
    return 1198;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.s
 * JD-Core Version:    0.6.2
 */