package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;

final class r$4 extends r.a
{
  r$4(r paramr, CountDownLatch paramCountDownLatch)
  {
    super(paramr, (byte)0);
  }

  final long aHp()
  {
    AppMethodBeat.i(131852);
    long l = this.val$latch.getCount();
    AppMethodBeat.o(131852);
    return l;
  }

  final String aHq()
  {
    AppMethodBeat.i(131853);
    String str = "appId=" + this.ihs.appId + " module=__WITHOUT_CODELIB__";
    AppMethodBeat.o(131853);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.r.4
 * JD-Core Version:    0.6.2
 */