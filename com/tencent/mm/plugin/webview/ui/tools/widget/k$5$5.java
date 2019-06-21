package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class k$5$5
  implements Runnable
{
  k$5$5(k.5 param5, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9929);
    if (this.uJG.uJE.uDd != null)
    {
      String str = this.cgJ.getString("webview_network_type");
      this.uJG.uJE.uDd.ags(str);
    }
    AppMethodBeat.o(9929);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.k.5.5
 * JD-Core Version:    0.6.2
 */