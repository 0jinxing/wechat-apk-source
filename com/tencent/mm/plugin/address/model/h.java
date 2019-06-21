package com.tencent.mm.plugin.address.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
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
import com.tencent.mm.protocal.protobuf.bpk;
import com.tencent.mm.protocal.protobuf.bpr;
import com.tencent.mm.protocal.protobuf.bps;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class h extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;

  public h(com.tencent.mm.plugin.address.d.b paramb)
  {
    AppMethodBeat.i(16743);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bpr();
    ((b.a)localObject).fsK = new bps();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rcptinfoupdate";
    ((b.a)localObject).fsI = 418;
    ((b.a)localObject).fsL = 203;
    ((b.a)localObject).fsM = 1000000203;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bpr)this.ehh.fsG.fsP;
    ((bpr)localObject).wRJ = new bpk();
    ((bpr)localObject).wRJ.id = paramb.id;
    ((bpr)localObject).wRJ.wRQ = new bts().alV(bo.bc(paramb.gJb, ""));
    ((bpr)localObject).wRJ.wRO = new bts().alV(bo.bc(paramb.gIZ, ""));
    ((bpr)localObject).wRJ.wRT = new bts().alV(bo.bc(paramb.gJe, ""));
    ((bpr)localObject).wRJ.wRR = new bts().alV(bo.bc(paramb.gJc, ""));
    ((bpr)localObject).wRJ.wRU = new bts().alV(bo.bc(paramb.gJf, ""));
    ((bpr)localObject).wRJ.wRV = new bts().alV(bo.bc(paramb.gJg, ""));
    ((bpr)localObject).wRJ.wRP = new bts().alV(bo.bc(paramb.gJa, ""));
    ((bpr)localObject).wRJ.wRS = new bts().alV(bo.bc(paramb.gJd, ""));
    ((bpr)localObject).wRJ.wRW = new bts().alV(bo.bc(paramb.gJh, ""));
    AppMethodBeat.o(16743);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16745);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16745);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16744);
    ab.d("MicroMsg.NetSceneRcptInfoUpdate", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bps)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      if (paramq.wRK.wRN != null)
      {
        ab.d("MicroMsg.NetSceneRcptInfoUpdate", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.wRK.wRN.size());
        a.arQ();
        a.arS().s(paramq.wRK.wRN);
        a.arQ();
        a.arS().arU();
      }
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16744);
  }

  public final int getType()
  {
    return 418;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.model.h
 * JD-Core Version:    0.6.2
 */