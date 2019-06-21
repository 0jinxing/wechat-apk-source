package com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class TmplWebViewToolUI$b$c
  implements Runnable
{
  TmplWebViewToolUI$b$c(TmplWebViewToolUI.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(15049);
    if (TmplWebViewToolUI.h(this.jVf.jVe))
      AppMethodBeat.o(15049);
    while (true)
    {
      return;
      boolean bool = TmplWebViewToolUI.a(this.jVf.jVe).jUk;
      ab.i(TmplWebViewToolUI.b(this.jVf.jVe), "isInjectDataSuccess:".concat(String.valueOf(bool)));
      if (!bool)
      {
        this.jVf.jUY.jSt = true;
        TmplWebViewToolUI.f(this.jVf.jVe);
      }
      this.jVf.aYg();
      TmplWebViewToolUI.b.a(this.jVf);
      AppMethodBeat.o(15049);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI.b.c
 * JD-Core Version:    0.6.2
 */