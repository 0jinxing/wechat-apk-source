package com.tencent.mm.plugin.brandservice.ui.timeline;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.s;

final class c$1
  implements Runnable
{
  c$1(c paramc, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14142);
    Runnable localRunnable = this.eGq;
    if (c.aWu())
    {
      if (localRunnable != null)
        al.d(localRunnable);
      AppMethodBeat.o(14142);
    }
    while (true)
    {
      return;
      s.pp(false);
      if (localRunnable != null)
        al.d(localRunnable);
      AppMethodBeat.o(14142);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.c.1
 * JD-Core Version:    0.6.2
 */