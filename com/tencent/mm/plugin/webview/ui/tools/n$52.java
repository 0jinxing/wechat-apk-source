package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

final class n$52
  implements Runnable
{
  n$52(n paramn, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7769);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7769);
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.val$url))
      {
        if (!bo.isNullOrNil(this.uuQ))
          n.b(this.uuo).putExtra("view_port_code", this.uuQ);
        ((WebViewUI)n.a(this.uuo).get()).loadUrl(this.val$url);
      }
      AppMethodBeat.o(7769);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.52
 * JD-Core Version:    0.6.2
 */