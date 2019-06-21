package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.protocal.JsapiPermissionWrapper;

final class k$5$10
  implements Runnable
{
  k$5$10(k.5 param5, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9934);
    if ((this.uJG.uJE.uDd != null) && (this.uJG.uJE.uFu != null) && (this.uJG.uJE.uFu.cZS() != null) && (this.uJG.uJE.uFu.cZS().jB(42)))
      this.uJG.uJE.uDd.i(this.cgJ, "download_fail");
    AppMethodBeat.o(9934);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.k.5.10
 * JD-Core Version:    0.6.2
 */