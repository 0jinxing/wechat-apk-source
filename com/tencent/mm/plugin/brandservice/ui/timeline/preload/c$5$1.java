package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class c$5$1
  implements Runnable
{
  c$5$1(c.5 param5, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14366);
    c.f(this.jQY.jQX).clear();
    c.f(this.jQY.jQX).addAll(this.ibp);
    AppMethodBeat.o(14366);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.c.5.1
 * JD-Core Version:    0.6.2
 */