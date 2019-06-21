package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.protocal.protobuf.cpn;
import com.tencent.mm.protocal.protobuf.cpo;

public final class f extends n<cpn, cpo>
{
  String TAG;

  public f(int paramInt1, long paramLong, int paramInt2)
  {
    AppMethodBeat.i(4714);
    this.TAG = "MicroMsg.NetSceneVoipHeartBeat";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cpn();
    ((b.a)localObject).fsK = new cpo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipheartbeat";
    ((b.a)localObject).fsI = 178;
    ((b.a)localObject).fsL = 81;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cpn)this.ehh.fsG.fsP;
    ((cpn)localObject).wem = paramInt1;
    ((cpn)localObject).wen = paramLong;
    ((cpn)localObject).xlQ = System.currentTimeMillis();
    ((cpn)localObject).xmV = paramInt2;
    AppMethodBeat.o(4714);
  }

  public final com.tencent.mm.ai.f cKt()
  {
    AppMethodBeat.i(4715);
    f.1 local1 = new f.1(this);
    AppMethodBeat.o(4715);
    return local1;
  }

  public final int getType()
  {
    return 178;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.f
 * JD-Core Version:    0.6.2
 */