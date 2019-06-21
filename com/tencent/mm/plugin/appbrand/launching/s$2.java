package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;

final class s$2 extends s.a
{
  s$2(s params, CountDownLatch paramCountDownLatch, String paramString)
  {
    super(params, (byte)0);
  }

  final long aHp()
  {
    AppMethodBeat.i(131869);
    long l = this.val$latch.getCount();
    AppMethodBeat.o(131869);
    return l;
  }

  final String aHq()
  {
    AppMethodBeat.i(131870);
    String str = "appId=" + this.ihv.appId + " provider=" + this.ihr;
    AppMethodBeat.o(131870);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.s.2
 * JD-Core Version:    0.6.2
 */