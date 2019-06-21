package com.tencent.mm.plugin.appbrand.dynamic.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;

final class b$2
  implements Runnable
{
  b$2(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(10733);
    if (!com.tencent.mm.ipcinvoker.b.PL().le("com.tencent.mm:support"))
      AppMethodBeat.o(10733);
    while (true)
    {
      return;
      f.a("com.tencent.mm:support", null, b.a.class, new b.2.1(this));
      AppMethodBeat.o(10733);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.a.b.2
 * JD-Core Version:    0.6.2
 */