package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class n$41
  implements Runnable
{
  n$41(n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7754);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7754);
    while (true)
    {
      return;
      ((WebViewUI)n.a(this.uuo).get()).uwX.cZU();
      AppMethodBeat.o(7754);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.41
 * JD-Core Version:    0.6.2
 */