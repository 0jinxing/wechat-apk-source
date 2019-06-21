package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class n$48
  implements Runnable
{
  n$48(n paramn, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7765);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7765);
    while (true)
    {
      return;
      boolean bool = this.cgJ.getBoolean("enable_fullscreen_params_enable", false);
      if (n.b(this.uuo) != null)
        n.b(this.uuo).removeExtra("show_full_screen");
      ((WebViewUI)n.a(this.uuo).get()).W(bool, false);
      AppMethodBeat.o(7765);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.48
 * JD-Core Version:    0.6.2
 */