package com.tencent.mm.plugin.appbrand.widget.desktop.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$1
  implements Runnable
{
  e$1(e parame, Runnable paramRunnable)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134226);
    if (this.jbr.jbg != null)
      this.jbr.jbg.a(this.jbr.coc, this.jbr.endPos, this.jbr.jbp, true);
    this.cfC.run();
    AppMethodBeat.o(134226);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.a.e.1
 * JD-Core Version:    0.6.2
 */