package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class n$42
  implements Runnable
{
  n$42(n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7755);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7755);
    while (true)
    {
      return;
      ((WebViewUI)n.a(this.uuo).get()).uwX.startLoading();
      AppMethodBeat.o(7755);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.42
 * JD-Core Version:    0.6.2
 */