package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.d;

final class j$14
  implements Runnable
{
  j$14(j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7655);
    if ((this.utN.cZv().isFinishing()) || (this.utN.cZv().uwA))
    {
      ab.i("MicroMsg.WebViewMenuHelper", "tryShow bottom sheet failed, the activity has been destroyed.");
      AppMethodBeat.o(7655);
    }
    while (true)
    {
      return;
      this.utN.iHZ.cpD();
      AppMethodBeat.o(7655);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.j.14
 * JD-Core Version:    0.6.2
 */