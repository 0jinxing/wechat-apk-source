package com.tencent.mm.plugin.webview.luggage;

import com.tencent.luggage.d.k;
import com.tencent.luggage.d.n;
import com.tencent.luggage.webview.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$16$2
  implements Runnable
{
  d$16$2(d.16 param16, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6031);
    d locald = this.uiG.uiy;
    String str = this.fOH;
    locald.bPN.bPA.loadData(str, "text/html", "utf-8");
    AppMethodBeat.o(6031);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.16.2
 * JD-Core Version:    0.6.2
 */