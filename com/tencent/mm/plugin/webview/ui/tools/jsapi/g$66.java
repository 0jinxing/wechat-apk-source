package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.permission.a;

final class g$66
  implements a
{
  g$66(g paramg, i parami)
  {
  }

  public final void dT(boolean paramBoolean)
  {
    AppMethodBeat.i(9127);
    if (paramBoolean)
    {
      g.a(this.uHd, this.uqf, "install_download_task:ok", null);
      AppMethodBeat.o(9127);
    }
    while (true)
    {
      return;
      g.a(this.uHd, this.uqf, "install_download_task:fail", null);
      AppMethodBeat.o(9127);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.66
 * JD-Core Version:    0.6.2
 */