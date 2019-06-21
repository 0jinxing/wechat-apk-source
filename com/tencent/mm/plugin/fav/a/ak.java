package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aix;
import com.tencent.mm.protocal.protobuf.aiy;
import com.tencent.mm.sdk.platformtools.ab;

public final class ak extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;

  public ak()
  {
    AppMethodBeat.i(102740);
    this.ehi = null;
    b.a locala = new b.a();
    locala.fsJ = new aix();
    locala.fsK = new aiy();
    locala.uri = "/cgi-bin/micromsg-bin/getfavinfo";
    locala.fsI = 438;
    locala.fsL = 217;
    locala.fsM = 1000000217;
    this.ehh = locala.acD();
    AppMethodBeat.o(102740);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(102741);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(102741);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(102742);
    ab.d("MicroMsg.NetSceneGetFavInfo", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aiy)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      ab.v("MicroMsg.NetSceneGetFavInfo", "used:%d  total:%d  mxDown:%d  mxUp:%d  mxFile:%d", new Object[] { Long.valueOf(paramq.vEw), Long.valueOf(paramq.jBS), Integer.valueOf(paramq.woT), Integer.valueOf(paramq.woS), Integer.valueOf(paramq.woR) });
      b.in(paramq.vEw);
      b.io(paramq.jBS);
      b.iq(paramq.woT);
      b.ir(paramq.woS);
      b.is(paramq.woR);
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(102742);
  }

  public final int getType()
  {
    return 438;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.ak
 * JD-Core Version:    0.6.2
 */