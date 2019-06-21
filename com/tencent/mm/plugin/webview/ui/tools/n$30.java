package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;

final class n$30
  implements Runnable
{
  n$30(n paramn, boolean paramBoolean1, boolean paramBoolean2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7742);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7742);
    while (true)
    {
      return;
      if (this.uuI)
      {
        if ((((WebViewUI)n.a(this.uuo).get()).pzf != null) && (!bo.isNullOrNil(((WebViewUI)n.a(this.uuo).get()).pzf.getUrl())))
          ((WebViewUI)n.a(this.uuo).get()).uwa.put(((WebViewUI)n.a(this.uuo).get()).pzf.getUrl(), Boolean.FALSE);
        ((WebViewUI)n.a(this.uuo).get()).nO(false);
        AppMethodBeat.o(7742);
      }
      else
      {
        if ((((WebViewUI)n.a(this.uuo).get()).pzf != null) && (!bo.isNullOrNil(((WebViewUI)n.a(this.uuo).get()).pzf.getUrl())))
          ((WebViewUI)n.a(this.uuo).get()).uwa.put(((WebViewUI)n.a(this.uuo).get()).pzf.getUrl(), Boolean.valueOf(this.itg));
        ((WebViewUI)n.a(this.uuo).get()).nO(this.itg);
        AppMethodBeat.o(7742);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.30
 * JD-Core Version:    0.6.2
 */