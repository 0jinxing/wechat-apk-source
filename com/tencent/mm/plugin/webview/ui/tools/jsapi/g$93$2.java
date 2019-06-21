package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h.b;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.sdk.platformtools.ab;

final class g$93$2
  implements h.b
{
  g$93$2(g.93 param93)
  {
  }

  public final void onError()
  {
    AppMethodBeat.i(9160);
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("playResult", "onVoicePlayEnd:fail");
      localBundle.putString("localId", this.uIg.riM);
      g.k(this.uIg.uHd).c(2002, localBundle);
      AppMethodBeat.o(9160);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MsgHandler", "notify voice play end failed : %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(9160);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.93.2
 * JD-Core Version:    0.6.2
 */