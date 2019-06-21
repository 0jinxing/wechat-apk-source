package com.tencent.mm.d.a;

import com.eclipsesource.v8.V8Object;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class o extends n
{
  f chr;

  o(f paramf)
  {
    this.chr = paramf;
  }

  protected final void a(l paraml, V8Object paramV8Object)
  {
    AppMethodBeat.i(113860);
    paramV8Object.registerJavaMethod(new o.1(this), "getNativeBufferId");
    paramV8Object.registerJavaMethod(new o.2(this, paraml), "getNativeBuffer");
    paramV8Object.registerJavaMethod(new o.3(this), "setNativeBuffer");
    AppMethodBeat.o(113860);
  }

  public final void cleanup()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.o
 * JD-Core Version:    0.6.2
 */