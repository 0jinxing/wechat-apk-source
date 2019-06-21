package com.tencent.mm.plugin.appbrand.debugger;

import com.eclipsesource.v8.V8Inspector.JsInspectorChannelServer;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class p$1
  implements V8Inspector.JsInspectorChannelServer
{
  p$1(p paramp)
  {
  }

  public final int notify(long paramLong1, long paramLong2, String paramString)
  {
    return 0;
  }

  public final int sendData(long paramLong, String paramString)
  {
    AppMethodBeat.i(101858);
    p.a(this.hks, paramLong, paramString);
    AppMethodBeat.o(101858);
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.p.1
 * JD-Core Version:    0.6.2
 */