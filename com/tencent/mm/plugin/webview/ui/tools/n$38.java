package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class n$38
  implements Runnable
{
  n$38(n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7751);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7751);
    while (true)
    {
      return;
      ((WebViewUI)n.a(this.uuo).get()).uwX.nM(true);
      AppMethodBeat.o(7751);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.38
 * JD-Core Version:    0.6.2
 */