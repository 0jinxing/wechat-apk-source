package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class n$44
  implements Runnable
{
  n$44(n paramn, String paramString, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7757);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7757);
    while (true)
    {
      return;
      ((WebViewUI)n.a(this.uuo).get()).dE(this.uuM, this.uuN);
      AppMethodBeat.o(7757);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.44
 * JD-Core Version:    0.6.2
 */