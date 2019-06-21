package com.tencent.mm.d.a;

import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8ArrayBuffer;
import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class o$3
  implements JavaVoidCallback
{
  o$3(o paramo)
  {
  }

  public final void invoke(V8Object paramV8Object, V8Array paramV8Array)
  {
    AppMethodBeat.i(113859);
    if ((paramV8Array.length() < 2) || (paramV8Array.getType(0) != 1) || (paramV8Array.getType(1) != 10))
    {
      ab.w("V8DirectApiBuffer", "setNativeBuffer invalid parameters");
      AppMethodBeat.o(113859);
    }
    while (true)
    {
      return;
      ab.w("V8DirectApiBuffer", "setNativeBuffer, id:%d", new Object[] { Integer.valueOf(paramV8Array.getInteger(0)) });
      paramV8Object = (V8ArrayBuffer)paramV8Array.get(1);
      if (paramV8Object != null)
      {
        this.cih.chr.a(paramV8Array.getInteger(0), paramV8Object.getBackingStore());
        paramV8Object.release();
        AppMethodBeat.o(113859);
      }
      else
      {
        ab.w("V8DirectApiBuffer", "setNativeBuffer buffer null");
        AppMethodBeat.o(113859);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.o.3
 * JD-Core Version:    0.6.2
 */