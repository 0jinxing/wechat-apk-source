package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.n;

final class g$116
  implements n
{
  g$116(g paramg, i parami)
  {
  }

  public final void nZ(int paramInt)
  {
    AppMethodBeat.i(9193);
    switch (paramInt)
    {
    default:
      g.a(this.uHd, this.uqf, "quickly_add_contact:fail", null);
      AppMethodBeat.o(9193);
    case -2:
    case 0:
    case -1:
    case 1:
    }
    while (true)
    {
      return;
      g.a(this.uHd, this.uqf, "quickly_add_contact:added", null);
      AppMethodBeat.o(9193);
      continue;
      g.a(this.uHd, this.uqf, "quickly_add_contact:cancel", null);
      AppMethodBeat.o(9193);
      continue;
      g.a(this.uHd, this.uqf, "quickly_add_contact:fail", null);
      AppMethodBeat.o(9193);
      continue;
      g.a(this.uHd, this.uqf, "quickly_add_contact:ok", null);
      AppMethodBeat.o(9193);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.116
 * JD-Core Version:    0.6.2
 */