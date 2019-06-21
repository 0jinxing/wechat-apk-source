package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cpd;
import com.tencent.mm.protocal.protobuf.cpe;
import com.tencent.mm.protocal.protobuf.cqf;

public final class c extends n<cpd, cpe>
{
  public c(int paramInt1, long paramLong, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(4702);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cpd();
    ((b.a)localObject).fsK = new cpe();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipcancelinvite";
    ((b.a)localObject).fsI = 171;
    ((b.a)localObject).fsL = 64;
    ((b.a)localObject).fsM = 1000000064;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cpd)this.ehh.fsG.fsP;
    ((cpd)localObject).wem = paramInt1;
    ((cpd)localObject).wen = paramLong;
    ((cpd)localObject).ndF = paramString1;
    ((cpd)localObject).wOQ = paramInt2;
    paramString1 = new cqf();
    bts localbts = new bts();
    localbts.alV(paramString2);
    paramString1.xfu = localbts;
    ((cpd)localObject).xmK = paramString1;
    ((cpd)localObject).xlQ = System.currentTimeMillis();
    AppMethodBeat.o(4702);
  }

  public final f cKt()
  {
    AppMethodBeat.i(4704);
    c.1 local1 = new c.1(this);
    AppMethodBeat.o(4704);
    return local1;
  }

  public final int cKu()
  {
    AppMethodBeat.i(4703);
    cpd localcpd = (cpd)cKy();
    int i;
    if ((localcpd.wem == 0) && (localcpd.wOQ == 0))
    {
      i = -1;
      AppMethodBeat.o(4703);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(4703);
    }
  }

  public final int getType()
  {
    return 171;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.c
 * JD-Core Version:    0.6.2
 */