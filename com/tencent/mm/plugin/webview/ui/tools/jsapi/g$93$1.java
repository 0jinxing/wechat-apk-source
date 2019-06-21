package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h.a;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.sdk.platformtools.ab;

final class g$93$1
  implements h.a
{
  g$93$1(g.93 param93)
  {
  }

  public final void EA()
  {
    AppMethodBeat.i(9159);
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("playResult", "onVoicePlayEnd:ok");
      localBundle.putString("localId", this.uIg.riM);
      g.k(this.uIg.uHd).c(2002, localBundle);
      AppMethodBeat.o(9159);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MsgHandler", "notify voice play end failed : %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(9159);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.93.1
 * JD-Core Version:    0.6.2
 */