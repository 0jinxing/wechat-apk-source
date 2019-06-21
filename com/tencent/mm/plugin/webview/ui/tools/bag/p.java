package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.g;
import com.tencent.mm.sdk.platformtools.ab;

public final class p
  implements h.a
{
  private final d uzS;

  public p(d paramd)
  {
    this.uzS = paramd;
  }

  public final Bundle T(Bundle paramBundle)
  {
    Object localObject = null;
    AppMethodBeat.i(8274);
    if (this.uzS == null)
    {
      ab.e("MicroMsg.WebViewUIBagIPCDelegate", "doBagLogic mInvoker null");
      AppMethodBeat.o(8274);
      paramBundle = localObject;
    }
    while (true)
    {
      return paramBundle;
      try
      {
        paramBundle = this.uzS.g(103, paramBundle);
        AppMethodBeat.o(8274);
      }
      catch (RemoteException paramBundle)
      {
        ab.e("MicroMsg.WebViewUIBagIPCDelegate", "doBagLogic exp=%s", new Object[] { paramBundle.getLocalizedMessage() });
        AppMethodBeat.o(8274);
        paramBundle = localObject;
      }
    }
  }

  public final void y(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(8275);
    if (this.uzS != null)
      g.a(this.uzS, 11576, paramArrayOfObject);
    AppMethodBeat.o(8275);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.p
 * JD-Core Version:    0.6.2
 */