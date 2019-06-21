package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.MMFalseProgressBar;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class TmplWebViewToolUI$b$i
  implements Runnable
{
  TmplWebViewToolUI$b$i(TmplWebViewToolUI.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(15057);
    if (TmplWebViewToolUI.h(this.jVf.jVe))
      AppMethodBeat.o(15057);
    while (true)
    {
      return;
      TmplWebViewToolUI.o(this.jVf.jVe).start();
      AppMethodBeat.o(15057);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI.b.i
 * JD-Core Version:    0.6.2
 */