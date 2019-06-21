package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class n$31
  implements Runnable
{
  n$31(n paramn, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7743);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7743);
    while (true)
    {
      return;
      ((WebViewUI)n.a(this.uuo).get()).nP(this.itg);
      AppMethodBeat.o(7743);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.31
 * JD-Core Version:    0.6.2
 */