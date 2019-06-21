package com.tencent.mm.plugin.brandservice;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class c$c
  implements Runnable
{
  c$c(List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14764);
    PreloadLogic.j(this.jKn, this.jKl);
    AppMethodBeat.o(14764);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.c.c
 * JD-Core Version:    0.6.2
 */