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
import com.tencent.mm.protocal.protobuf.any;
import com.tencent.mm.protocal.protobuf.anz;
import com.tencent.mm.sdk.platformtools.ab;

public final class p extends m
  implements k
{
  private f eIc;
  public final b fpJ;

  public p(int paramInt)
  {
    AppMethodBeat.i(93733);
    b.a locala = new b.a();
    locala.fsJ = new any();
    locala.fsK = new anz();
    locala.uri = "/cgi-bin/mmbiz-bin/wxausrevent/getservicenotifyoptions";
    locala.fsI = 1145;
    locala.fsL = 0;
    locala.fsM = 0;
    this.fpJ = locala.acD();
    ((any)this.fpJ.fsG.fsP).wsv = paramInt;
    AppMethodBeat.o(93733);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(93735);
    ab.i("MicroMsg.NetSceneGetServiceNotifyOptions", "doScene");
    this.eIc = paramf;
    int i = a(parame, this.fpJ, this);
    AppMethodBeat.o(93735);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(93734);
    ab.i("MicroMsg.NetSceneGetServiceNotifyOptions", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.eIc != null)
      this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(93734);
  }

  public final anz abG()
  {
    return (anz)this.fpJ.fsH.fsP;
  }

  public final int getType()
  {
    return 1145;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.p
 * JD-Core Version:    0.6.2
 */