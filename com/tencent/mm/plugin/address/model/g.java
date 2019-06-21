package com.tencent.mm.plugin.address.model;

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
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.protobuf.bpj;
import com.tencent.mm.protocal.protobuf.bpp;
import com.tencent.mm.protocal.protobuf.bpq;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class g extends m
  implements k
{
  private b ehh;
  private f ehi;

  public g(int paramInt)
  {
    AppMethodBeat.i(16740);
    b.a locala = new b.a();
    locala.fsJ = new bpp();
    locala.fsK = new bpq();
    locala.uri = "/cgi-bin/micromsg-bin/rcptinfotouch";
    locala.fsI = 419;
    locala.fsL = 204;
    locala.fsM = 1000000204;
    this.ehh = locala.acD();
    ((bpp)this.ehh.fsG.fsP).id = paramInt;
    AppMethodBeat.o(16740);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16742);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16742);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16741);
    ab.d("MicroMsg.NetSceneRcptInfoTouch", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bpq)((b)paramq).fsH.fsP;
      if (paramq.wRK.wRN != null)
      {
        ab.d("MicroMsg.NetSceneRcptInfoTouch", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.wRK.wRN.size());
        a.arQ();
        a.arS().s(paramq.wRK.wRN);
        a.arQ();
        a.arS().arU();
      }
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16741);
  }

  public final int getType()
  {
    return 419;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.model.g
 * JD-Core Version:    0.6.2
 */