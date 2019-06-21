package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;

final class q$2 extends q.a
{
  q$2(q paramq, CountDownLatch paramCountDownLatch)
  {
    super(paramq, (byte)0);
  }

  final long aHp()
  {
    AppMethodBeat.i(131830);
    long l = this.fuC.getCount();
    AppMethodBeat.o(131830);
    return l;
  }

  final String aHq()
  {
    AppMethodBeat.i(131831);
    String str = "appId=" + this.ihl.appId + " module=__APP__";
    AppMethodBeat.o(131831);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.q.2
 * JD-Core Version:    0.6.2
 */