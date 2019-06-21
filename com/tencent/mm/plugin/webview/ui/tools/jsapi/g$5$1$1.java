package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$5$1$1
  implements g.d.a
{
  g$5$1$1(g.5.1 param1)
  {
  }

  public final void r(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(9043);
    ab.i("MicroMsg.MsgHandler", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    if (paramBoolean1)
    {
      g.a(this.uHg.uHf.uHd, this.uHg.uHf.uqf, "launchApplication:ok", null);
      AppMethodBeat.o(9043);
    }
    while (true)
    {
      return;
      g.a(this.uHg.uHf.uHd, this.uHg.uHf.uqf, "launchApplication:fail", null);
      AppMethodBeat.o(9043);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.5.1.1
 * JD-Core Version:    0.6.2
 */