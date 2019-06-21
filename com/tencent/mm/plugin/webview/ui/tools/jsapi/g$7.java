package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$7
  implements Runnable
{
  g$7(g paramg, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9048);
    if (this.uqf.uIJ.equals("login"))
    {
      g.a(this.uHd, this.uqf, g.dcM());
      AppMethodBeat.o(9048);
    }
    while (true)
    {
      return;
      if (this.uqf.uIJ.equals("authorize"))
        g.b(this.uHd, this.uqf, g.dcM());
      AppMethodBeat.o(9048);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.7
 * JD-Core Version:    0.6.2
 */