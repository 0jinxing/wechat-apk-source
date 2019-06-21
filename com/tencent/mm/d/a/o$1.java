package com.tencent.mm.d.a;

import com.eclipsesource.v8.JavaCallback;
import com.eclipsesource.v8.V8Array;
import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class o$1
  implements JavaCallback
{
  o$1(o paramo)
  {
  }

  public final Object invoke(V8Object paramV8Object, V8Array paramV8Array)
  {
    AppMethodBeat.i(113857);
    paramV8Object = Integer.valueOf(this.cih.chr.Cv());
    ab.i("V8DirectApiBuffer", "generateId:%d", new Object[] { paramV8Object });
    AppMethodBeat.o(113857);
    return paramV8Object;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.o.1
 * JD-Core Version:    0.6.2
 */