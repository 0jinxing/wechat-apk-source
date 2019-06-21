package com.tencent.mm.plugin.freewifi.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b;
import com.tencent.mm.sdk.platformtools.ab;

final class c$2
  implements Runnable
{
  c$2(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20994);
    c.d(this.mzr);
    if (c.a(this.mzr) != null)
      c.a(this.mzr).c(c.b(this.mzr));
    if (c.b(this.mzr) == null)
    {
      ab.w(c.access$200(), "already callback");
      AppMethodBeat.o(20994);
    }
    while (true)
    {
      return;
      c.c(this.mzr);
      AppMethodBeat.o(20994);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.c.2
 * JD-Core Version:    0.6.2
 */