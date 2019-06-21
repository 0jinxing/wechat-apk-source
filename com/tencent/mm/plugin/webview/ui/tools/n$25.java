package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.bag.h;

final class n$25
  implements Runnable
{
  n$25(n paramn, WebViewUI paramWebViewUI, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7737);
    if ((this.uul == null) || (this.uul.isFinishing()))
      AppMethodBeat.o(7737);
    while (true)
    {
      return;
      if (this.cgJ != null)
        this.uul.uie.afX(this.cgJ.getString("key_bag_icon"));
      AppMethodBeat.o(7737);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.25
 * JD-Core Version:    0.6.2
 */