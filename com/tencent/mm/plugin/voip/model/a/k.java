package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.protocal.protobuf.ccx;
import com.tencent.mm.protocal.protobuf.cqd;
import com.tencent.mm.protocal.protobuf.cqe;

public final class k extends n<cqd, cqe>
{
  public k(ccx paramccx)
  {
    AppMethodBeat.i(4730);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cqd();
    ((b.a)localObject).fsK = new cqe();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipspeedtest";
    ((b.a)localObject).fsI = 765;
    ((b.a)localObject).fsL = 765;
    ((b.a)localObject).fsM = 1000000765;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cqd)this.ehh.fsG.fsP;
    ((cqd)localObject).wem = paramccx.wem;
    ((cqd)localObject).xcr = paramccx.xcr;
    ((cqd)localObject).vZF = paramccx.vZF;
    ((cqd)localObject).xcs = paramccx.xcs;
    ((cqd)localObject).xct = paramccx.xct;
    ((cqd)localObject).xcu = paramccx.xcu;
    ((cqd)localObject).xcv = paramccx.xcv;
    ((cqd)localObject).xcw = paramccx.xcw;
    ((cqd)localObject).xcx = paramccx.xcx;
    ((cqd)localObject).xcy = paramccx.xcy;
    ((cqd)localObject).xcz = paramccx.xcz;
    ((cqd)localObject).xcA = paramccx.xcA;
    ((cqd)localObject).xcB = paramccx.xcB;
    AppMethodBeat.o(4730);
  }

  public final f cKt()
  {
    AppMethodBeat.i(4731);
    k.1 local1 = new k.1(this);
    AppMethodBeat.o(4731);
    return local1;
  }

  public final int getType()
  {
    return 765;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.k
 * JD-Core Version:    0.6.2
 */