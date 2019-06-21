package com.tencent.mm.d.a;

import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Context;
import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class o$2
  implements JavaCallback
{
  o$2(o paramo, l paraml)
  {
  }

  public final Object invoke(V8Object paramV8Object, V8Array paramV8Array)
  {
    paramV8Object = null;
    AppMethodBeat.i(113858);
    if ((paramV8Array.length() <= 0) || (paramV8Array.getType(0) != 1))
    {
      ab.w("V8DirectApiBuffer", "getNativeBuffer invalid parameters");
      AppMethodBeat.o(113858);
    }
    while (true)
    {
      return paramV8Object;
      ab.i("V8DirectApiBuffer", "getNativeBuffer, id:%d", new Object[] { Integer.valueOf(paramV8Array.getInteger(0)) });
      paramV8Array = this.cih.chr.gq(paramV8Array.getInteger(0));
      if (paramV8Array == null)
      {
        ab.w("V8DirectApiBuffer", "getNativeBuffer bb null");
        AppMethodBeat.o(113858);
      }
      else
      {
        paramV8Object = this.cii.CB().newV8ArrayBuffer(paramV8Array);
        AppMethodBeat.o(113858);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.o.2
 * JD-Core Version:    0.6.2
 */