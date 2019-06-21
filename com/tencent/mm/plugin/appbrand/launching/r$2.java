package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;

final class r$2 extends r.a
{
  r$2(r paramr, CountDownLatch paramCountDownLatch, String paramString)
  {
    super(paramr, (byte)0);
  }

  final long aHp()
  {
    AppMethodBeat.i(131847);
    long l = this.val$latch.getCount();
    AppMethodBeat.o(131847);
    return l;
  }

  final String aHq()
  {
    AppMethodBeat.i(131848);
    String str = "appId=" + this.ihs.appId + " provider=" + this.ihr;
    AppMethodBeat.o(131848);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.r.2
 * JD-Core Version:    0.6.2
 */