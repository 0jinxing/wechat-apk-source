package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.l;
import com.tencent.mm.ui.widget.MMWebView;

final class a$1
  implements Runnable
{
  a$1(String paramString, MMWebView paramMMWebView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6562);
    l.q(new a.1.1(this, a.cW(this.uez)));
    AppMethodBeat.o(6562);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.a.1
 * JD-Core Version:    0.6.2
 */