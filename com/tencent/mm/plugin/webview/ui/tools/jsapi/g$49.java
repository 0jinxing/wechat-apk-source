package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.cr;
import com.tencent.mm.g.a.cr.b;
import com.tencent.mm.sdk.platformtools.ab;

final class g$49
  implements Runnable
{
  g$49(g paramg, cr paramcr, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9105);
    ab.i("MicroMsg.MsgHandler", "run ecard jsapi check callback");
    if (this.tPz.cvN.retCode == 0)
    {
      g.a(this.uHd, this.uqf, "openECard:ok", null);
      AppMethodBeat.o(9105);
    }
    while (true)
    {
      return;
      g.a(this.uHd, this.uqf, "openECard:fail", null);
      AppMethodBeat.o(9105);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.49
 * JD-Core Version:    0.6.2
 */