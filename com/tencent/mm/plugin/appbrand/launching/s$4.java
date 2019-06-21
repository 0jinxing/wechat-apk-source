package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;

final class s$4 extends s.a
{
  s$4(s params, CountDownLatch paramCountDownLatch)
  {
    super(params, (byte)0);
  }

  final long aHp()
  {
    AppMethodBeat.i(131874);
    long l = this.val$latch.getCount();
    AppMethodBeat.o(131874);
    return l;
  }

  final String aHq()
  {
    AppMethodBeat.i(131875);
    String str = "appId=" + this.ihv.appId + " modulename= __APP__ module=__WITHOUT_CODELIB__";
    AppMethodBeat.o(131875);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.s.4
 * JD-Core Version:    0.6.2
 */