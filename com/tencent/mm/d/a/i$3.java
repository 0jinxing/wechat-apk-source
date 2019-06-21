package com.tencent.mm.d.a;

import com.eclipsesource.v8.MultiContextNodeJS;
import com.eclipsesource.v8.V8Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class i$3
  implements l.a
{
  public i$3(i parami)
  {
  }

  public final V8Context Cu()
  {
    AppMethodBeat.i(113816);
    if (i.a(this.chE) == null)
    {
      localObject = new IllegalStateException("getMainContext mNodeJS not ready!");
      AppMethodBeat.o(113816);
      throw ((Throwable)localObject);
    }
    ab.i("MicroMsg.NodeJSRuntime", "getMainContext %s", new Object[] { Integer.valueOf(i.a(this.chE).getMainContext().hashCode()) });
    Object localObject = i.a(this.chE).getMainContext();
    AppMethodBeat.o(113816);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.i.3
 * JD-Core Version:    0.6.2
 */