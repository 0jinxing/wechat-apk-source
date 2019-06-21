package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMWebView;

final class d$67
  implements Runnable
{
  d$67(d paramd, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8931);
    String str = d.a(this.uFI, "html");
    if (d.hl(str, this.uFQ))
      if ((d.n(this.uFI) == null) || (d.d(this.uFI) == null))
        break label113;
    while (true)
    {
      try
      {
        d.n(this.uFI).J(1, d.d(this.uFI).getUrl(), str);
        AppMethodBeat.o(8931);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        ab.e("MicroMsg.JsApiHandler", "uploadFileToCDN error ", new Object[] { localRemoteException.getMessage() });
        AppMethodBeat.o(8931);
        continue;
      }
      ab.e("MicroMsg.JsApiHandler", "failed to write Html file");
      label113: AppMethodBeat.o(8931);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.d.67
 * JD-Core Version:    0.6.2
 */