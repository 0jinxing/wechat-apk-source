package com.tencent.mm.plugin.address.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.protobuf.bpj;
import com.tencent.mm.protocal.protobuf.bpn;
import com.tencent.mm.protocal.protobuf.bpo;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class f extends m
  implements k
{
  private b ehh;
  private com.tencent.mm.ai.f ehi;
  public int gIK;

  public f(int paramInt)
  {
    AppMethodBeat.i(16737);
    this.gIK = 0;
    b.a locala = new b.a();
    locala.fsJ = new bpn();
    locala.fsK = new bpo();
    locala.uri = "/cgi-bin/micromsg-bin/rcptinforemove";
    locala.fsI = 416;
    locala.fsL = 201;
    locala.fsM = 1000000201;
    this.ehh = locala.acD();
    this.gIK = paramInt;
    ab.d("MicroMsg.NetSceneRcptInfoRemove", "remove Id ".concat(String.valueOf(paramInt)));
    ((bpn)this.ehh.fsG.fsP).id = paramInt;
    AppMethodBeat.o(16737);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(16739);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16739);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16738);
    ab.d("MicroMsg.NetSceneRcptInfoRemove", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bpo)((b)paramq).fsH.fsP;
      if (paramq.wRK.wRN != null)
      {
        ab.d("MicroMsg.NetSceneRcptInfoRemove", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.wRK.wRN.size());
        a.arQ();
        a.arS().s(paramq.wRK.wRN);
        a.arQ();
        a.arS().arU();
      }
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16738);
  }

  public final int getType()
  {
    return 416;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.model.f
 * JD-Core Version:    0.6.2
 */