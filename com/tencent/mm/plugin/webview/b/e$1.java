package com.tencent.mm.plugin.webview.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e$1
  implements Runnable
{
  public e$1(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5646);
    this.ueP.hY("WebViewHistory", "delete from WebViewHistory where  timeStamp < ".concat(String.valueOf(System.currentTimeMillis() / 1000L - 604800L)));
    e.a(this.ueP);
    AppMethodBeat.o(5646);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.b.e.1
 * JD-Core Version:    0.6.2
 */