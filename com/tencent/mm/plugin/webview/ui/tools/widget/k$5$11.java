package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.protocal.JsapiPermissionWrapper;

final class k$5$11
  implements Runnable
{
  k$5$11(k.5 param5, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9935);
    if ((this.uJG.uJE.uDd != null) && (this.uJG.uJE.uFu != null) && (this.uJG.uJE.uFu.cZS() != null) && (this.uJG.uJE.uFu.cZS().jB(42)))
      this.uJG.uJE.uDd.i(this.cgJ, "download_removed");
    AppMethodBeat.o(9935);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.k.5.11
 * JD-Core Version:    0.6.2
 */