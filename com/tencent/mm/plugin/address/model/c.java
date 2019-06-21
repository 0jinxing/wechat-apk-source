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
import com.tencent.mm.protocal.protobuf.bpf;
import com.tencent.mm.protocal.protobuf.bpg;
import com.tencent.mm.protocal.protobuf.bpj;
import com.tencent.mm.protocal.protobuf.bpk;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public final class c extends m
  implements k
{
  private com.tencent.mm.ai.b ehh;
  private f ehi;

  public c(com.tencent.mm.plugin.address.d.b paramb)
  {
    AppMethodBeat.i(16728);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bpf();
    ((b.a)localObject).fsK = new bpg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rcptinfoadd";
    ((b.a)localObject).fsI = 415;
    ((b.a)localObject).fsL = 200;
    ((b.a)localObject).fsM = 1000000200;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bpf)this.ehh.fsG.fsP;
    ((bpf)localObject).wRJ = new bpk();
    ((bpf)localObject).wRJ.wRQ = new bts().alV(bo.bc(paramb.gJb, ""));
    ((bpf)localObject).wRJ.wRO = new bts().alV(bo.bc(paramb.gIZ, ""));
    ((bpf)localObject).wRJ.wRT = new bts().alV(bo.bc(paramb.gJe, ""));
    ((bpf)localObject).wRJ.wRR = new bts().alV(bo.bc(paramb.gJc, ""));
    ((bpf)localObject).wRJ.wRU = new bts().alV(bo.bc(paramb.gJf, ""));
    ((bpf)localObject).wRJ.wRV = new bts().alV(bo.bc(paramb.gJg, ""));
    ((bpf)localObject).wRJ.wRP = new bts().alV(bo.bc(paramb.gJa, ""));
    ((bpf)localObject).wRJ.wRS = new bts().alV(bo.bc(paramb.gJd, ""));
    ((bpf)localObject).wRJ.wRW = new bts().alV(bo.bc(paramb.gJh, ""));
    AppMethodBeat.o(16728);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16730);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(16730);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16729);
    ab.d("MicroMsg.NetSceneRcptInfoAdd", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bpg)((com.tencent.mm.ai.b)paramq).fsH.fsP;
      if (paramq.wRK.wRN != null)
      {
        ab.d("MicroMsg.NetSceneRcptInfoAdd", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.wRK.wRN.size());
        a.arQ();
        a.arS().s(paramq.wRK.wRN);
        a.arQ();
        a.arS().arU();
      }
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(16729);
  }

  public final int getType()
  {
    return 415;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.model.c
 * JD-Core Version:    0.6.2
 */