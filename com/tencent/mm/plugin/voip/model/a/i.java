package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cpz;
import com.tencent.mm.protocal.protobuf.cqa;
import com.tencent.mm.protocal.protobuf.cqf;

public final class i extends n<cpz, cqa>
{
  String TAG;

  public i(int paramInt, long paramLong, String paramString)
  {
    AppMethodBeat.i(4724);
    this.TAG = "MicroMsg.NetSceneVoipShutDown";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cpz();
    ((b.a)localObject).fsK = new cqa();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipshutdown";
    ((b.a)localObject).fsI = 173;
    ((b.a)localObject).fsL = 66;
    ((b.a)localObject).fsM = 1000000066;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cpz)this.ehh.fsG.fsP;
    ((cpz)localObject).wem = paramInt;
    ((cpz)localObject).wen = paramLong;
    cqf localcqf = new cqf();
    bts localbts = new bts();
    localbts.alV(paramString);
    localcqf.xfu = localbts;
    ((cpz)localObject).xmK = localcqf;
    ((cpz)localObject).xlQ = System.currentTimeMillis();
    AppMethodBeat.o(4724);
  }

  public final f cKt()
  {
    AppMethodBeat.i(4725);
    i.1 local1 = new i.1(this);
    AppMethodBeat.o(4725);
    return local1;
  }

  public final int getType()
  {
    return 173;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.i
 * JD-Core Version:    0.6.2
 */