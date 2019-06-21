package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cqf;
import com.tencent.mm.protocal.protobuf.cqg;
import com.tencent.mm.protocal.protobuf.cqh;
import java.util.LinkedList;

public final class l extends n<cqg, cqh>
{
  public l(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String[] paramArrayOfString)
  {
    AppMethodBeat.i(4733);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cqg();
    ((b.a)localObject).fsK = new cqh();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipstatreport";
    ((b.a)localObject).fsI = 320;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cqg)this.ehh.fsG.fsP;
    cqf localcqf = new cqf();
    bts localbts = new bts();
    localbts.alV(paramString1);
    localcqf.xfu = localbts;
    paramString1 = new cqf();
    localbts = new bts();
    localbts.alV(paramString2);
    paramString1.xfu = localbts;
    paramString2 = new cqf();
    localbts = new bts();
    localbts.alV(paramString3);
    paramString2.xfu = localbts;
    paramString3 = new cqf();
    localbts = new bts();
    localbts.alV(paramString4);
    paramString3.xfu = localbts;
    paramString4 = new cqf();
    localbts = new bts();
    localbts.alV(paramString5);
    paramString4.xfu = localbts;
    ((cqg)localObject).xmK = localcqf;
    ((cqg)localObject).xol = paramString1;
    ((cqg)localObject).xok = paramString2;
    ((cqg)localObject).xom = paramString3;
    ((cqg)localObject).xon = paramString4;
    a.Logd("MicroMsg.NetSceneVoipStatReport", "natReportList length:" + paramArrayOfString.length);
    paramString1 = new LinkedList();
    while (i < paramArrayOfString.length)
    {
      paramString1.add(new bts().alV(paramArrayOfString[i]));
      i++;
    }
    ((cqg)localObject).xoo = paramString1.size();
    ((cqg)localObject).xop = paramString1;
    AppMethodBeat.o(4733);
  }

  public final f cKt()
  {
    AppMethodBeat.i(4734);
    l.1 local1 = new l.1(this);
    AppMethodBeat.o(4734);
    return local1;
  }

  public final int getType()
  {
    return 320;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.l
 * JD-Core Version:    0.6.2
 */