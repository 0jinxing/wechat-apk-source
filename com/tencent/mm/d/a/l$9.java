package com.tencent.mm.d.a;

import com.eclipsesource.v8.JavaVoidCallback;
import com.eclipsesource.v8.V8Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class l$9
  implements Runnable
{
  l$9(l paraml, JavaVoidCallback paramJavaVoidCallback, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(113843);
    this.chT.CB().registerJavaMethod(this.cib, this.val$name);
    AppMethodBeat.o(113843);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.l.9
 * JD-Core Version:    0.6.2
 */