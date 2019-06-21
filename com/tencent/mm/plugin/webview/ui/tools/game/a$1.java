package com.tencent.mm.plugin.webview.ui.tools.game;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.stub.d;

final class a$1 extends c
{
  a$1(a parama)
  {
  }

  protected final void I(Bundle paramBundle)
  {
    AppMethodBeat.i(8647);
    try
    {
      if ((this.uDk.uzS != null) && (paramBundle != null))
        this.uDk.uzS.g(96, paramBundle);
      AppMethodBeat.o(8647);
      return;
    }
    catch (RemoteException paramBundle)
    {
      while (true)
        AppMethodBeat.o(8647);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.game.a.1
 * JD-Core Version:    0.6.2
 */