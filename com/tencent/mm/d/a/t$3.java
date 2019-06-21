package com.tencent.mm.d.a;

import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Context;
import com.eclipsesource.v8.V8Function;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class t$3
  implements Runnable
{
  public t$3(t paramt, l paraml, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113893);
    l locall = this.ciI;
    String str = this.bOC;
    if (locall.CB().getType("onmessage") == 7)
    {
      V8Function localV8Function = (V8Function)locall.CB().get("onmessage");
      V8Array localV8Array = locall.CB().newV8Array();
      localV8Array.push(str);
      localV8Function.call(locall.CB().getGlobalObject(), localV8Array);
      localV8Function.release();
      localV8Array.release();
    }
    AppMethodBeat.o(113893);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.t.3
 * JD-Core Version:    0.6.2
 */