package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class n$32
  implements Runnable
{
  n$32(n paramn, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7744);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7744);
    while (true)
    {
      return;
      ((WebViewUI)n.a(this.uuo).get()).Jw(this.uuJ);
      AppMethodBeat.o(7744);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.32
 * JD-Core Version:    0.6.2
 */