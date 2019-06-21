package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class k$5$8
  implements Runnable
{
  k$5$8(k.5 param5, int paramInt1, int paramInt2, int paramInt3, String paramString, Bundle paramBundle)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9932);
    try
    {
      k localk = this.uJG.uJE;
      int i = this.bVv;
      int j = this.crc;
      int k = this.crd;
      if (this.cgJ != null);
      for (Bundle localBundle = this.cgJ; ; localBundle = new Bundle())
      {
        k.a(localk, i, j, k, localBundle);
        AppMethodBeat.o(9932);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.MMWebViewClient", localException.getMessage());
        AppMethodBeat.o(9932);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.k.5.8
 * JD-Core Version:    0.6.2
 */