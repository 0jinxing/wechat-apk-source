package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;

final class n$36
  implements Runnable
{
  n$36(n paramn, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(7749);
    if ((n.a(this.uuo).get() == null) || (((WebViewUI)n.a(this.uuo).get()).isFinishing()))
      AppMethodBeat.o(7749);
    while (true)
    {
      return;
      if (!bo.isNullOrNil(((WebViewUI)n.a(this.uuo).get()).pzf.getUrl()))
      {
        ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "setPageOwner, userName = " + this.fwC);
        ((WebViewUI)n.a(this.uuo).get()).uwb.put(((WebViewUI)n.a(this.uuo).get()).pzf.getUrl(), this.fwC);
        AppMethodBeat.o(7749);
      }
      else
      {
        ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "setPageOwner, null url");
        AppMethodBeat.o(7749);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.36
 * JD-Core Version:    0.6.2
 */