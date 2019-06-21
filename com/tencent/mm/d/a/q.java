package com.tencent.mm.d.a;

import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class q extends n
{
  final e chP;

  public q(e parame)
  {
    super("WeixinArrayBuffer");
    this.chP = parame;
  }

  protected final void a(l paraml, V8Object paramV8Object)
  {
    AppMethodBeat.i(113869);
    paramV8Object.registerJavaMethod(new q.1(this), "get");
    AppMethodBeat.o(113869);
  }

  final void cleanup()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.q
 * JD-Core Version:    0.6.2
 */