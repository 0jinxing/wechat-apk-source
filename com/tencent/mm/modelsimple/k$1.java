package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ak;
import com.tencent.mm.g.a.ak.b;
import com.tencent.mm.g.a.jk;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class k$1
  implements Runnable
{
  k$1(k paramk, String paramString, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(16581);
    int i;
    Object localObject1;
    String str;
    Object localObject2;
    if (this.fOH == null)
    {
      i = -1;
      ab.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo broadcastEvent content len[%d], cache[%b]", new Object[] { Integer.valueOf(i), Boolean.valueOf(this.fOI) });
      localObject1 = new ak();
      ((ak)localObject1).cto.type = 5;
      ((ak)localObject1).cto.ctq = this.fOH;
      a.xxA.m((b)localObject1);
      str = ((ak)localObject1).ctp.ctu;
      int j = ((ak)localObject1).ctp.position;
      i = ((ak)localObject1).ctp.cts;
      ab.i("MicroMsg.NetSceneGetDisasterInfo", "summerdiz NetSceneGetDisasterInfo onGYNetEnd event.result.Actionp[%d] noticeId[%s], position[%d], manualauthSucc[%b], noticeidTickMap[%s]", new Object[] { Integer.valueOf(i), str, Integer.valueOf(j), Boolean.valueOf(k.a(this.fOJ)), k.aje() });
      if ((j != 1) || (i != 6))
        break label354;
      if (this.fOI)
        k.aT(str, this.fOH);
      if (!k.a(this.fOJ))
        break label303;
      localObject2 = ((ak)localObject1).ctp.desc;
      localObject1 = ((ak)localObject1).ctp.url;
      ab.i("MicroMsg.NetSceneGetDisasterInfo", "summerdize NetSceneGetDisasterInfo onGYNetEnd manualauthSucc showtony after init[%b]", new Object[] { Boolean.valueOf(ah.dox()) });
      if (k.b(this.fOJ) == null)
        k.a(this.fOJ, new k.1.1(this, (String)localObject2, (String)localObject1));
      a.xxA.c(k.b(this.fOJ));
      label269: k.aje().put(str, Long.valueOf(bo.yz()));
      AppMethodBeat.o(16581);
    }
    while (true)
    {
      return;
      i = this.fOH.length();
      break;
      label303: localObject2 = new jk();
      ((jk)localObject2).cEJ.content = ((ak)localObject1).ctp.desc;
      ((jk)localObject2).cEJ.url = ((ak)localObject1).ctp.url;
      a.xxA.m((b)localObject2);
      break label269;
      label354: if (i == 2)
      {
        if (this.fOI)
          k.aT(str, this.fOH);
        k.aje().put(str, Long.valueOf(bo.yz()));
      }
      AppMethodBeat.o(16581);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.k.1
 * JD-Core Version:    0.6.2
 */