package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class n$51
  implements Runnable
{
  n$51(n paramn, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7768);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7768);
    while (true)
    {
      return;
      ((WebViewUI)n.a(this.uuo).get()).ac(this.cgJ);
      AppMethodBeat.o(7768);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.51
 * JD-Core Version:    0.6.2
 */