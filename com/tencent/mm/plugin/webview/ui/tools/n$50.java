package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class n$50
  implements Runnable
{
  n$50(n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7767);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7767);
    while (true)
    {
      return;
      ((WebViewUI)n.a(this.uuo).get()).uwe = null;
      AppMethodBeat.o(7767);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.50
 * JD-Core Version:    0.6.2
 */