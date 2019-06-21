package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.tools.j;
import java.lang.ref.WeakReference;

final class n$33
  implements Runnable
{
  n$33(n paramn, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7746);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()) || (((WebViewUI)n.a(this.uuo).get()).pzf == null))
      AppMethodBeat.o(7746);
    while (true)
    {
      return;
      ((WebViewUI)n.a(this.uuo).get()).uwH.icB = this.icN;
      ((WebViewUI)n.a(this.uuo).get()).icA.b(((WebViewUI)n.a(this.uuo).get()).pzf, new n.33.1(this), null);
      ((WebViewUI)n.a(this.uuo).get()).icA.cuu();
      AppMethodBeat.o(7746);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.33
 * JD-Core Version:    0.6.2
 */