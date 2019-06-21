package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vs;
import com.tencent.mm.g.a.vs.a;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

final class g$104 extends c<vs>
{
  g$104(g paramg)
  {
    AppMethodBeat.i(9174);
    this.xxI = vs.class.getName().hashCode();
    AppMethodBeat.o(9174);
  }

  private boolean a(vs paramvs)
  {
    boolean bool = true;
    AppMethodBeat.i(9175);
    ab.d("TAG", "webViewWillCloseWindowEvent callback");
    if (g.k(this.uHd) != null);
    while (true)
    {
      try
      {
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putInt("closeWindow. result: %d", paramvs.cSF.result);
        g.k(this.uHd).cZb();
        g.k(this.uHd).W(localBundle);
        ab.d("MicroMsg.MsgHandler", "closeWindow. result: %d", new Object[] { Integer.valueOf(paramvs.cSF.result) });
        if (paramvs.cSF.result == -1)
        {
          g.a(this.uHd, g.j(this.uHd), "get_h5_transaction_request:ok", null);
          a.xxA.d(this);
          AppMethodBeat.o(9175);
          return bool;
        }
      }
      catch (RemoteException localRemoteException)
      {
        ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
        continue;
        g.a(this.uHd, g.j(this.uHd), "get_h5_transaction_request:cancel", null);
        continue;
      }
      AppMethodBeat.o(9175);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.104
 * JD-Core Version:    0.6.2
 */