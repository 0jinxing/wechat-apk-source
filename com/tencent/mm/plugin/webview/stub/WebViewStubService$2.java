package com.tencent.mm.plugin.webview.stub;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.g.a.nr.a;
import com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class WebViewStubService$2 extends c<nr>
{
  WebViewStubService$2(WebViewStubService paramWebViewStubService)
  {
    AppMethodBeat.i(7191);
    this.xxI = nr.class.getName().hashCode();
    AppMethodBeat.o(7191);
  }

  private boolean a(nr paramnr)
  {
    AppMethodBeat.i(7192);
    if (!(paramnr instanceof nr))
      AppMethodBeat.o(7192);
    while (true)
    {
      return false;
      if ((WebViewStubService.i(this.uqB) != null) && (!WebViewStubService.i(this.uqB).containsKey(paramnr.cJX.filePath)))
      {
        AppMethodBeat.o(7192);
      }
      else
      {
        if (WebViewStubService.i(this.uqB) != null)
          WebViewStubService.i(this.uqB).remove(paramnr.cJX.filePath);
        ab.d("MicroMsg.WebViewStubService", "result: " + paramnr.cJX.result);
        try
        {
          Iterator localIterator = WebViewStubService.h(this.uqB).iterator();
          while (localIterator.hasNext())
            ((WebViewStubCallbackWrapper)localIterator.next()).uuT.e(paramnr.cJX.filePath, paramnr.cJX.result, paramnr.cJX.cvn, paramnr.cJX.cvo);
        }
        catch (RemoteException paramnr)
        {
          ab.printErrStackTrace("MicroMsg.WebViewStubService", paramnr, "", new Object[0]);
          AppMethodBeat.o(7192);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubService.2
 * JD-Core Version:    0.6.2
 */