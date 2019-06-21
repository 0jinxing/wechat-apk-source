package com.tencent.mm.plugin.brandservice.ui.timeline.preload.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.d;
import com.tencent.mm.sdk.platformtools.as;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class b$d
  implements Runnable
{
  b$d(int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14986);
    as localas = com.tencent.mm.plugin.brandservice.ui.timeline.preload.l.aXy();
    b localb = b.jTH;
    d.a(localas, b.sy(this.jTL));
    if (this.jTL == 0)
      PreloadLogic.aXo();
    AppMethodBeat.o(14986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.d
 * JD-Core Version:    0.6.2
 */