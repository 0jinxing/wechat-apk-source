package com.tencent.mm.plugin.webview.luggage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d.a;

final class d$13
  implements Runnable
{
  d$13(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(6027);
    this.uiy.uhQ.evaluateJavascript("javascript:(function(){return window.getComputedStyle(document.body,null).backgroundColor})()", new d.13.1(this));
    AppMethodBeat.o(6027);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.13
 * JD-Core Version:    0.6.2
 */