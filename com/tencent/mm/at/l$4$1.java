package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.al.c;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.i.d;
import com.tencent.mm.model.bf;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.clk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;

final class l$4$1
  implements Runnable
{
  l$4$1(l.4 param4, d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(78322);
    l.o(this.fFG.fFF);
    l.p(this.fFG.fFF);
    l.q(this.fFG.fFF);
    Object localObject = l.d(this.fFG.fFF);
    ((e)localObject).lr(0);
    l.r(this.fFG.fFF).eJ(bf.oC(l.r(this.fFG.fFF).field_talker));
    l.a(this.fFG.fFF, c.a("upimg", l.r(this.fFG.fFF).field_createTime, l.r(this.fFG.fFF).field_talker, l.r(this.fFG.fFF).field_msgId + "_" + l.c(this.fFG.fFF) + "_" + l.h(this.fFG.fFF)));
    boolean bool = l.a(this.fFG.fFF, (e)localObject, 0, 0L, 0, this.fyV);
    localObject = (clk)l.s(this.fFG.fFF).fsG.fsP;
    if (localObject == null)
      ab.w(l.f(this.fFG.fFF), "summersafecdn ERR_CDNCOM_SAFEPROTO_NOAESKEY doScene again but old req is null");
    while (true)
    {
      ab.i(l.f(this.fFG.fFF), "summersafecdn ERR_CDNCOM_SAFEPROTO_NOAESKEY doScene again enableHitcheck[%b], ret[%b] new clientid[%s] createtime[%d]", new Object[] { Boolean.valueOf(l.n(this.fFG.fFF)), Boolean.valueOf(bool), l.j(this.fFG.fFF), Long.valueOf(l.r(this.fFG.fFF).field_createTime) });
      this.fFG.fFF.a(l.t(this.fFG.fFF), l.g(this.fFG.fFF));
      AppMethodBeat.o(78322);
      return;
      ((clk)localObject).xja = new bts().alV(l.j(this.fFG.fFF));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.l.4.1
 * JD-Core Version:    0.6.2
 */