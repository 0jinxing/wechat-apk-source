package com.tencent.mm.d.a;

import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class r$3
  implements JavaVoidCallback
{
  r$3(r paramr)
  {
  }

  public final void invoke(V8Object paramV8Object, V8Array paramV8Array)
  {
    AppMethodBeat.i(113872);
    if ((paramV8Array.length() <= 0) || (paramV8Array.getType(0) != 1))
      AppMethodBeat.o(113872);
    while (true)
    {
      return;
      r.a(this.cir, paramV8Array.getInteger(0));
      AppMethodBeat.o(113872);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.r.3
 * JD-Core Version:    0.6.2
 */