package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;
import java.lang.ref.WeakReference;

final class n$49
  implements Runnable
{
  n$49(n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7766);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7766);
    while (true)
    {
      return;
      if ((((WebViewUI)n.a(this.uuo).get()).uwf != null) && (((WebViewUI)n.a(this.uuo).get()).uwf.isShowing()))
        ((WebViewUI)n.a(this.uuo).get()).uwf.dismiss();
      AppMethodBeat.o(7766);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.49
 * JD-Core Version:    0.6.2
 */