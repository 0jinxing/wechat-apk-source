package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.d;

final class j$15
  implements Runnable
{
  j$15(j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7656);
    if ((this.utN.cZv().isFinishing()) || (this.utN.cZv().uwA))
    {
      ab.i("MicroMsg.WebViewMenuHelper", "tryShow bottom sheet failed, the activity has been destroyed.");
      AppMethodBeat.o(7656);
    }
    while (true)
    {
      return;
      this.utN.iHZ.cpD();
      AppMethodBeat.o(7656);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.j.15
 * JD-Core Version:    0.6.2
 */