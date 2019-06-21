package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class n$46
  implements Runnable
{
  n$46(n paramn, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7759);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7759);
    while (true)
    {
      return;
      if (!((WebViewUI)n.a(this.uuo).get()).rpm)
      {
        AppMethodBeat.o(7759);
      }
      else
      {
        if (this.chV != null)
          ((WebViewUI)n.a(this.uuo).get()).setMMTitle(this.chV);
        AppMethodBeat.o(7759);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.46
 * JD-Core Version:    0.6.2
 */