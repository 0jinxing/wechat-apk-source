package com.tencent.mm.plugin.webview.ui.tools;

import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.modeltools.h.c;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;

final class i$1
  implements h.c
{
  i$1(i parami)
  {
  }

  public final void BY(String paramString)
  {
    AppMethodBeat.i(7626);
    if (this.utx.cZu())
      AppMethodBeat.o(7626);
    while (true)
    {
      return;
      try
      {
        if (this.utx.cZv().icy == null)
          break label99;
        this.utx.cZv().icy.a(paramString, null, this.utx.cZv().jLX, this.utx.cZv().jLY);
        AppMethodBeat.o(7626);
      }
      catch (RemoteException paramString)
      {
        ab.e("MicroMsg.WebViewLongClickHelper", "recog failed");
        AppMethodBeat.o(7626);
      }
      continue;
      label99: ab.i("MicroMsg.WebViewLongClickHelper", "viewCaptureCallback, invoker is null");
      AppMethodBeat.o(7626);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.i.1
 * JD-Core Version:    0.6.2
 */